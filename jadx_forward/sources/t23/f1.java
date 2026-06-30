package t23;

/* loaded from: classes10.dex */
public class f1 extends java.util.LinkedList {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f496679d = new byte[0];

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(java.lang.Object obj) {
        boolean add;
        synchronized (this.f496679d) {
            add = super.add(obj);
        }
        return add;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        synchronized (this.f496679d) {
            super.clear();
        }
    }

    public java.lang.Object d() {
        synchronized (this.f496679d) {
            if (size() <= 0) {
                return null;
            }
            return poll();
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public int size() {
        int size;
        synchronized (this.f496679d) {
            size = super.size();
        }
        return size;
    }
}
