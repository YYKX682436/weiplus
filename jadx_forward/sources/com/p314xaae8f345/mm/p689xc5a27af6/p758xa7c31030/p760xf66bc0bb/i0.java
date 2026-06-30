package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

/* loaded from: classes9.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f149225a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.z f149226b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f149227c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Class f149228d;

    /* renamed from: e, reason: collision with root package name */
    public long f149229e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f149230f;

    /* renamed from: g, reason: collision with root package name */
    public volatile wu5.c f149231g;

    public i0(java.lang.String jobTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jobTag, "jobTag");
        this.f149225a = jobTag;
        this.f149227c = true;
        new java.util.ArrayList();
    }

    public static final boolean a(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.i0 i0Var) {
        if (i0Var.f149230f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "skip, already scheduling");
            return false;
        }
        i0Var.f149230f = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "schedule task run " + i0Var.f149225a);
        aq1.q0 q0Var = (aq1.q0) ((a25.q) i95.n0.c(a25.q.class));
        if (!q0Var.Ri(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a)) {
            q0Var.bj("schedule_bg_task");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
            dr0.p1.f324022d.a().k(false);
        }
        java.lang.Class cls = i0Var.f149228d;
        boolean a17 = cls != null ? com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.f0.f149217a.a(cls, false) : true;
        if (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "schedule task finish " + i0Var.f149225a);
        }
        i0Var.f149230f = false;
        return a17;
    }

    public final void b(yz5.l collect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collect, "collect");
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.z zVar = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.z(this.f149225a);
        collect.mo146xb9724478(zVar);
        this.f149226b = zVar;
    }
}
