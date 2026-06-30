package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class w0 extends com.tencent.mm.plugin.ball.service.s4 implements com.tencent.mm.plugin.appbrand.jsapi.h0 {

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f78167v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.backgroundrunning.v0 f78168w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.backgroundrunning.u0 f78169x;

    public w0(dp1.x xVar, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(xVar);
        this.f78169x = new com.tencent.mm.plugin.appbrand.floatball.u0(this);
        this.f78167v = o6Var;
        o6Var.l(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "create, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        this.f78168w = (com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onReceivedBallInfoRemovedEvent, runtime:%s", java.lang.Integer.valueOf(this.f78167v.hashCode()));
        n0();
        y0();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, runtime:%s", java.lang.Integer.valueOf(this.f78167v.hashCode()));
        this.f93239n.q(true);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        Q(2);
        com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = this.f78168w;
        if (v0Var != null) {
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var).wi(this.f78169x);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public boolean m0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onClose, runtime:%s", java.lang.Integer.valueOf(this.f78167v.hashCode()));
        if (!u()) {
            return false;
        }
        if (!w0()) {
            u0(i17);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onClose, should show voip tip");
        x0(this.f93239n.getActivity(), new com.tencent.mm.plugin.appbrand.floatball.q0(this, i17));
        return false;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void o0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onDestroy, runtime:%s", java.lang.Integer.valueOf(this.f78167v.hashCode()));
        super.o0();
        com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = this.f78168w;
        if (v0Var != null) {
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var).Bi(this.f78169x);
        }
    }

    public final int t0() {
        xf1.i iVar;
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78167v;
        if (o6Var == null || (iVar = (xf1.i) o6Var.k(xf1.i.class)) == null) {
            return 32;
        }
        boolean z17 = iVar.f454238e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "getCurrentVOIPState, enableMic:%s", java.lang.Boolean.valueOf(z17));
        return z17 ? 32 : 64;
    }

    public final void u0(int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        dp1.x xVar = this.f93239n;
        if (((sb0.f) jVar).Ui(xVar.getActivity())) {
            v0(i17);
        } else {
            com.tencent.mm.plugin.appbrand.floatball.t.a(xVar.getActivity(), 17, new com.tencent.mm.plugin.appbrand.floatball.s0(this, i17));
        }
    }

    public final void v0(int i17) {
        t().f93090m = f0(i17);
        g();
        com.tencent.mm.plugin.ball.ui.e0.b(this.f93239n, this.f93136h.G(), new com.tencent.mm.plugin.appbrand.floatball.t0(this));
    }

    public boolean w0() {
        return u() && !com.tencent.mm.sdk.platformtools.o4.L().i("has_shown_appbrand_voip_tip", false);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onEnterPage, runtime:%s", java.lang.Integer.valueOf(this.f78167v.hashCode()));
        if (s() != null) {
            d0(false);
        }
    }

    public void x0(android.content.Context context, com.tencent.mm.plugin.appbrand.floatball.v0 v0Var) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getString(com.tencent.mm.R.string.a5l));
        u1Var.m(com.tencent.mm.R.string.a5m);
        u1Var.l(new com.tencent.mm.plugin.appbrand.floatball.r0(this, v0Var));
        u1Var.q(false);
    }

    public final void y0() {
        if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class) != null) {
            com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = new com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel();
            mMBackgroundRunningOperationParcel.f76945d = this.f78167v.f74803n;
            mMBackgroundRunningOperationParcel.f76946e = 4;
            mMBackgroundRunningOperationParcel.f76947f = 2;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "stopVOIP, appId:%s", this.f78167v.f74803n);
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) ((com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class))).Ai(mMBackgroundRunningOperationParcel);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void z() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78167v;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onExitPage, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        if (s() != null) {
            d0(true);
            db5.t7.makeText(o6Var.r0(), com.tencent.mm.R.string.a5n, 0).show();
        }
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.i(this.f93132d);
        }
    }
}
