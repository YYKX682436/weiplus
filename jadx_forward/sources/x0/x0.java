package x0;

/* loaded from: classes14.dex */
public final class x0 extends x0.v0 implements java.util.Iterator, zz5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(x0.l0 map, java.util.Iterator iterator) {
        super(map, iterator);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iterator, "iterator");
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.util.Map.Entry entry = this.f532489h;
        if (entry == null) {
            throw new java.lang.IllegalStateException();
        }
        b();
        return entry.getValue();
    }
}
