package kz5;

/* loaded from: classes14.dex */
public final class k1 implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ListIterator f395514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kz5.l1 f395515e;

    public k1(kz5.l1 l1Var, int i17) {
        this.f395515e = l1Var;
        this.f395514d = l1Var.f395517e.listIterator(kz5.i0.G(l1Var, i17));
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f395514d.hasPrevious();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f395514d.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        return this.f395514d.previous();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return kz5.c0.h(this.f395515e) - this.f395514d.previousIndex();
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        return this.f395514d.next();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return kz5.c0.h(this.f395515e) - this.f395514d.nextIndex();
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
