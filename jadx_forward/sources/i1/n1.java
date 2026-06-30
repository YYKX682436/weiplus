package i1;

/* loaded from: classes14.dex */
public final class n1 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f368513d;

    public n1(i1.o1 o1Var) {
        this.f368513d = o1Var.f368529p.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368513d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return (i1.q1) this.f368513d.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
