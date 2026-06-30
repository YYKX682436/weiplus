package r0;

/* loaded from: classes14.dex */
public final class p extends kz5.o implements p0.c {

    /* renamed from: d, reason: collision with root package name */
    public final r0.d f449516d;

    public p(r0.d map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        this.f449516d = map;
    }

    @Override // kz5.b, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f449516d.containsKey(obj);
    }

    @Override // kz5.b
    public int d() {
        r0.d dVar = this.f449516d;
        dVar.getClass();
        return dVar.f449497e;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new r0.q(this.f449516d.f449496d);
    }
}
