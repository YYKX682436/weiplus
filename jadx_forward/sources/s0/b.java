package s0;

/* loaded from: classes14.dex */
public final class b extends kz5.o implements p0.g {

    /* renamed from: g, reason: collision with root package name */
    public static final s0.b f483374g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f483375d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f483376e;

    /* renamed from: f, reason: collision with root package name */
    public final r0.d f483377f;

    static {
        t0.b bVar = t0.b.f495794a;
        f483374g = new s0.b(bVar, bVar, r0.d.f449495f);
    }

    public b(java.lang.Object obj, java.lang.Object obj2, r0.d hashMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashMap, "hashMap");
        this.f483375d = obj;
        this.f483376e = obj2;
        this.f483377f = hashMap;
    }

    @Override // kz5.b, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f483377f.containsKey(obj);
    }

    @Override // kz5.b
    public int d() {
        r0.d dVar = this.f483377f;
        dVar.getClass();
        return dVar.f449497e;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new s0.c(this.f483375d, this.f483377f);
    }
}
