package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class p0 extends com.tencent.mm.plugin.ball.service.s4 {

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f78129v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.backgroundrunning.v0 f78130w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.backgroundrunning.u0 f78131x;

    public p0(dp1.x xVar, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(xVar);
        this.f78131x = new com.tencent.mm.plugin.appbrand.floatball.o0(this);
        this.f78129v = o6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "create, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        this.f78130w = (com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onReceivedBallInfoRemovedEvent, runtime:%s", java.lang.Integer.valueOf(this.f78129v.hashCode()));
        n0();
        u0();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, runtime:%s", java.lang.Integer.valueOf(this.f78129v.hashCode()));
        this.f93239n.q(true);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        Q(2);
        com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = this.f78130w;
        if (v0Var != null) {
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var).wi(this.f78131x);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public boolean m0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onClose, runtime:%s", java.lang.Integer.valueOf(this.f78129v.hashCode()));
        if (!u()) {
            return false;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        dp1.x xVar = this.f93239n;
        if (((sb0.f) jVar).Ui(xVar.getActivity())) {
            t0(i17);
            return true;
        }
        com.tencent.mm.plugin.appbrand.floatball.t.a(xVar.getActivity(), 7, new com.tencent.mm.plugin.appbrand.floatball.m0(this, i17));
        return true;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void o0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onDestroy, runtime:%s", java.lang.Integer.valueOf(this.f78129v.hashCode()));
        super.o0();
        com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = this.f78130w;
        if (v0Var != null) {
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var).Bi(this.f78131x);
        }
    }

    public final void t0(int i17) {
        t().f93090m = f0(i17);
        g();
        com.tencent.mm.plugin.ball.ui.e0.b(this.f93239n, this.f93136h.G(), new com.tencent.mm.plugin.appbrand.floatball.n0(this));
    }

    public final void u0() {
        if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class) != null) {
            com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = new com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel();
            mMBackgroundRunningOperationParcel.f76945d = this.f78129v.f74803n;
            mMBackgroundRunningOperationParcel.f76946e = 2;
            mMBackgroundRunningOperationParcel.f76947f = 2;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "stopLocationBackground, appId:%s", this.f78129v.f74803n);
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) ((com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class))).Ai(mMBackgroundRunningOperationParcel);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onEnterPage, runtime:%s", java.lang.Integer.valueOf(this.f78129v.hashCode()));
        if (s() != null) {
            d0(false);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onExitPage, runtime:%s", java.lang.Integer.valueOf(this.f78129v.hashCode()));
        if (s() != null) {
            d0(true);
        }
    }
}
