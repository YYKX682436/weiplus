package r0;

/* loaded from: classes14.dex */
public final class i implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final r0.g f449512d;

    public i(r0.f builder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        r0.v[] vVarArr = new r0.v[8];
        for (int i17 = 0; i17 < 8; i17++) {
            vVarArr[i17] = new r0.z(this);
        }
        this.f449512d = new r0.g(builder, vVarArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f449512d.f449500f;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return (java.util.Map.Entry) this.f449512d.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f449512d.remove();
    }
}
