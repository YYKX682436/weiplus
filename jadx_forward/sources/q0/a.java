package q0;

/* loaded from: classes14.dex */
public abstract class a implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f440749d;

    /* renamed from: e, reason: collision with root package name */
    public int f440750e;

    public a(int i17, int i18) {
        this.f440749d = i17;
        this.f440750e = i18;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f440749d < this.f440750e;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f440749d > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f440749d;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f440749d - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
