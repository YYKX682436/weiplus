package kz5;

/* loaded from: classes14.dex */
public final class i1 implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ListIterator f395510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kz5.j1 f395511e;

    public i1(kz5.j1 j1Var, int i17) {
        this.f395511e = j1Var;
        this.f395510d = j1Var.f395512d.listIterator(kz5.i0.G(j1Var, i17));
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        java.util.ListIterator listIterator = this.f395510d;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f395510d.hasPrevious();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f395510d.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        return this.f395510d.previous();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return kz5.c0.h(this.f395511e) - this.f395510d.previousIndex();
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        return this.f395510d.next();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return kz5.c0.h(this.f395511e) - this.f395510d.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        this.f395510d.remove();
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        this.f395510d.set(obj);
    }
}
