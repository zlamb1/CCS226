package structures.chapter2;

public interface IStack<T> {
    void push(T t);
    void pop();
    T top();
    T peek();

    boolean isEmpty();
    boolean isFull();
}
