package zd1;

/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f553054a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f553055b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f553056c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f553057d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f553058e;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 rt6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        this.f553054a = rt6;
        this.f553055b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f553056c = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f553057d = new java.util.concurrent.atomic.AtomicReference(null);
        this.f553058e = new java.util.concurrent.atomic.AtomicReference(null);
        rt6.N.a(new zd1.w(this));
    }

    public final void a(long j17, int i17) {
        b(true);
        this.f553055b.set(true);
        this.f553058e.set(new zd1.x(j17, i17));
        p3325xe03a0797.p3326xc267989b.l.d(this.f553056c, null, null, new zd1.z(this, j17, i17, null), 3, null);
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SecuritySnapshotContext", "stop(terminate:" + z17 + ") for " + this.f553054a.f156336n);
        try {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) this.f553057d.get();
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f553057d.set(null);
            this.f553055b.set(false);
            if (z17) {
                this.f553058e.set(null);
            }
        } catch (java.lang.Throwable th6) {
            this.f553057d.set(null);
            throw th6;
        }
    }
}
