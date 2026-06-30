package kz5;

/* loaded from: classes14.dex */
public final class j1 extends kz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f395512d;

    public j1(java.util.List delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f395512d = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        this.f395512d.add(kz5.i0.G(this, i17), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f395512d.clear();
    }

    @Override // kz5.l
    public int d() {
        return this.f395512d.size();
    }

    @Override // kz5.l
    public java.lang.Object e(int i17) {
        return this.f395512d.remove(kz5.i0.F(this, i17));
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        return this.f395512d.get(kz5.i0.F(this, i17));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new kz5.i1(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator() {
        return new kz5.i1(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        return this.f395512d.set(kz5.i0.F(this, i17), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i17) {
        return new kz5.i1(this, i17);
    }
}
