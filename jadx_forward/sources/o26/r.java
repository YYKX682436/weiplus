package o26;

/* loaded from: classes7.dex */
public final class r implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f424144d;

    public r(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        this.f424144d = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(array);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return ((p3321xbce91901.jvm.p3324x21ffc6bd.b) this.f424144d).hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return ((p3321xbce91901.jvm.p3324x21ffc6bd.b) this.f424144d).next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
