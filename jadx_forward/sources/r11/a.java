package r11;

/* loaded from: classes16.dex */
public class a extends java.util.concurrent.LinkedBlockingDeque {
    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
    public boolean offer(java.lang.Object obj) {
        return offerFirst(obj);
    }

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.AbstractQueue, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.Deque
    public java.lang.Object remove() {
        return removeFirst();
    }
}
