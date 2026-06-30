package r0;

/* loaded from: classes14.dex */
public final class r extends kz5.b {

    /* renamed from: d, reason: collision with root package name */
    public final r0.d f449517d;

    public r(r0.d map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        this.f449517d = map;
    }

    @Override // kz5.b, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f449517d.containsValue(obj);
    }

    @Override // kz5.b
    public int d() {
        r0.d dVar = this.f449517d;
        dVar.getClass();
        return dVar.f449497e;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new r0.s(this.f449517d.f449496d);
    }
}
