package u81;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final long f506963e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f506964f;

    /* renamed from: a, reason: collision with root package name */
    public final u81.f0 f506965a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f506966b;

    /* renamed from: c, reason: collision with root package name */
    public final x.b f506967c = new x.b();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.b f506968d = new u81.c(this);

    static {
        long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(10L);
        f506963e = millis;
        f506964f = millis;
    }

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f506966b = c11510xdd90c2f2;
        this.f506965a = new u81.e(this, c11510xdd90c2f2, c11510xdd90c2f2);
    }

    public void a(u81.f fVar) {
        if (fVar == null || this.f506965a.f506960y.get()) {
            return;
        }
        synchronized (this.f506967c) {
            this.f506967c.put(fVar, this);
        }
    }

    public u81.b b() {
        return this.f506965a.t();
    }

    public void c(u81.f fVar) {
        if (fVar == null || u81.b.DESTROYED == b()) {
            return;
        }
        synchronized (this.f506967c) {
            this.f506967c.m174754xc84af884(fVar);
        }
    }

    public boolean d() {
        u81.f0 f0Var = this.f506965a;
        k75.j jVar = f0Var.f386380e;
        if (jVar == null) {
            return false;
        }
        return ((java.lang.Boolean) new u81.q(f0Var, 1000L, java.lang.Boolean.FALSE).a(new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(jVar.getLooper()))).booleanValue();
    }
}
