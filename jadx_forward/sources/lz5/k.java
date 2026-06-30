package lz5;

/* loaded from: classes14.dex */
public final class k extends lz5.j implements java.util.Iterator, zz5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(lz5.m map) {
        super(map);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        b();
        int i17 = this.f403934e;
        lz5.m mVar = this.f403933d;
        if (i17 >= mVar.f403943i) {
            throw new java.util.NoSuchElementException();
        }
        this.f403934e = i17 + 1;
        this.f403935f = i17;
        java.lang.Object obj = mVar.f403938d[i17];
        c();
        return obj;
    }
}
