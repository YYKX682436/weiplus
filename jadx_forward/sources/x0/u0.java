package x0;

/* loaded from: classes14.dex */
public final class u0 extends x0.v0 implements java.util.Iterator, zz5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(x0.l0 map, java.util.Iterator iterator) {
        super(map, iterator);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iterator, "iterator");
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        b();
        if (this.f532488g != null) {
            return new x0.t0(this);
        }
        throw new java.lang.IllegalStateException();
    }
}
