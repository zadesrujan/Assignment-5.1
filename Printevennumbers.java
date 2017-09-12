package evennumbers;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
//package is even numbers
public class Printevennumbers {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.
			//declares a class called Printevennumbers.
	public static void main(String[] args) {
				//public : it can be called from anywhere.
				//static : doesn't belong to a specific object.
				//void : returns to no value.
				//main : is special because it will start the program.
		// TODO Auto-generated method stub
		int a=10;//here we are intilizing the value a is 10
		int k[] = new int[a];//declaring an array of int type and set its size
		for (int i=1;i<=k.length;i++){//using for loop so that it repeats until the given condition is true
			//i equals to 1,i less than a,i increment
			if(i%2==0){
//When we divide the value with 2 and the answer will be equal to 0 then the logical will be for even number
				System.out.println(i);
				//system : is a class in java language pacakge.
				//out : static member of the system class.
				//println : to print what is output.

			}
			}
		
	}


	}


