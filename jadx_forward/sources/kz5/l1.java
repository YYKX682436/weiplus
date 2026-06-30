package kz5;

/* loaded from: classes14.dex */
public class l1 extends kz5.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f395517e;

    public l1(java.util.List delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f395517e = delegate;
    }

    @Override // kz5.b
    public int d() {
        return this.f395517e.size();
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        return this.f395517e.get(kz5.i0.F(this, i17));
    }

    @Override // kz5.h, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new kz5.k1(this, 0);
    }

    @Override // kz5.h, java.util.List
    public java.util.ListIterator listIterator() {
        return new kz5.k1(this, 0);
    }

    @Override // kz5.h, java.util.List
    public java.util.ListIterator listIterator(int i17) {
        return new kz5.k1(this, i17);
    }
}
