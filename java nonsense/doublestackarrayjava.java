//Java (JDK 7)
//Tgrice
//Double int stack in one array implementation, made on Ideone

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone {
	public static void main (String[] args) throws java.lang.Exception {
		int Box[] = new int[20];
		Box[0] = 5;
		Box[1] = 6;
		Box[2] = 7;
		push1(Box,8);
		System.out.println(Box[3]);
		System.out.println(checkNull(Box,0));
		System.out.println(pop1(Box));
		System.out.println(pop1(Box));
		push2(Box,1);
		push2(Box,2);
		push2(Box,3);
		System.out.println(pop2(Box));
	}
	public static void push1(int[] array, int value) {
		int n = array.length;
		Integer firstEmpty = checkNull(array, 0);
		if(firstEmpty!=null && firstEmpty<(n/2)){
			array[firstEmpty] = value;
		}
		else{
			System.out.println("sorry, but the first stack is full");
		}
	}
	public static void push2(int[] array, int value) {
		int n = array.length;
		Integer firstEmpty = checkNull(array, (n/2));
		if(firstEmpty!=null && firstEmpty<n){
			array[firstEmpty] = value;
		}
		else{
			System.out.println("sorry, but the second stack is full");
		}
	}
	
	public static Integer pop1 (int[] array) {
		int n = array.length;
		Integer nullAt = checkNull(array, 0);		
		if(nullAt<(n/2)){
			int foundValue = array[nullAt-1];
			array[nullAt-1] = 0;
			return foundValue;
		}
		else{
			return null;
		}
	}
	
	public static Integer pop2(int[] array) {
		int n = array.length;
		Integer nullAt = checkNull(array, (n/2));		
		if(nullAt<n){
			int foundValue = array[nullAt-1];
			array[nullAt-1] = 0;
			return foundValue;
		}
		else{
			return null;
		}
	}
	
	public static Integer checkNull(int[] array, int startAt){
		if(array[startAt]==0){
			return startAt;
		}
		else if(startAt+1<array.length){
			return checkNull(array, startAt+1);
		}
		else{
			return null;
		}
	}
}
