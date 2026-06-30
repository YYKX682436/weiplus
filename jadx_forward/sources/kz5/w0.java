package kz5;

/* loaded from: classes12.dex */
public final class w0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f395552d;

    /* renamed from: e, reason: collision with root package name */
    public int f395553e;

    public w0(java.util.Iterator iterator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iterator, "iterator");
        this.f395552d = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f395552d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f395553e;
        this.f395553e = i17 + 1;
        if (i17 >= 0) {
            return new kz5.u0(i17, this.f395552d.next());
        }
        kz5.c0.p();
        throw null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
