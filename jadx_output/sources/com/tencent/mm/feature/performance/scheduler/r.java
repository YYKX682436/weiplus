package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class r implements com.tencent.mm.feature.performance.scheduler.n, yz5.l {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.ArrayList f67708g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f67709h;

    /* renamed from: d, reason: collision with root package name */
    public final long f67710d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f67711e;

    /* renamed from: f, reason: collision with root package name */
    public volatile wu5.c f67712f;

    static {
        com.tencent.mm.feature.performance.scheduler.q qVar = new com.tencent.mm.feature.performance.scheduler.q(null);
        f67708g = new java.util.ArrayList();
        f67709h = new java.util.HashMap();
        try {
            if (ph.t.f354283k == null) {
                synchronized ("Matrix.battery.LifeCycle") {
                    if (ph.t.f354283k == null) {
                        throw new java.lang.IllegalStateException("Call #init() first!".toString());
                    }
                }
            }
            ph.t tVar = ph.t.f354283k;
            kotlin.jvm.internal.o.d(tVar);
            tVar.b(new com.tencent.mm.feature.performance.scheduler.o(qVar));
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.BgScheduler", th6, "", new java.lang.Object[0]);
        }
    }

    public r(long j17) {
        this.f67710d = j17;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f67711e = wh.m.w(context);
        f67709h.put(java.lang.Long.valueOf(j17), null);
        f67708g.add(this);
    }

    @Override // com.tencent.mm.feature.performance.scheduler.n
    public boolean R0() {
        return this.f67711e;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f67711e = ((java.lang.Boolean) obj).booleanValue();
        return jz5.f0.f302826a;
    }
}
