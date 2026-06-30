package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f67692a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.feature.performance.scheduler.z f67693b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f67694c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Class f67695d;

    /* renamed from: e, reason: collision with root package name */
    public long f67696e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f67697f;

    /* renamed from: g, reason: collision with root package name */
    public volatile wu5.c f67698g;

    public i0(java.lang.String jobTag) {
        kotlin.jvm.internal.o.g(jobTag, "jobTag");
        this.f67692a = jobTag;
        this.f67694c = true;
        new java.util.ArrayList();
    }

    public static final boolean a(com.tencent.mm.feature.performance.scheduler.i0 i0Var) {
        if (i0Var.f67697f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "skip, already scheduling");
            return false;
        }
        i0Var.f67697f = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "schedule task run " + i0Var.f67692a);
        aq1.q0 q0Var = (aq1.q0) ((a25.q) i95.n0.c(a25.q.class));
        if (!q0Var.Ri(com.tencent.mm.sdk.platformtools.w9.f193053a)) {
            q0Var.bj("schedule_bg_task");
        } else if (com.tencent.mm.sdk.platformtools.x2.f193077g) {
            ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
            dr0.p1.f242489d.a().k(false);
        }
        java.lang.Class cls = i0Var.f67695d;
        boolean a17 = cls != null ? com.tencent.mm.feature.performance.scheduler.f0.f67684a.a(cls, false) : true;
        if (a17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "schedule task finish " + i0Var.f67692a);
        }
        i0Var.f67697f = false;
        return a17;
    }

    public final void b(yz5.l collect) {
        kotlin.jvm.internal.o.g(collect, "collect");
        com.tencent.mm.feature.performance.scheduler.z zVar = new com.tencent.mm.feature.performance.scheduler.z(this.f67692a);
        collect.invoke(zVar);
        this.f67693b = zVar;
    }
}
