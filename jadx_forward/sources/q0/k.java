package q0;

/* loaded from: classes14.dex */
public final class k extends q0.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f440773f;

    public k(java.lang.Object obj, int i17) {
        super(i17, 1);
        this.f440773f = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f440749d++;
        return this.f440773f;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        this.f440749d--;
        return this.f440773f;
    }
}
