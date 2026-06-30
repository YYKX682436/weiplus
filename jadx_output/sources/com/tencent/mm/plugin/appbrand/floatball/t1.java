package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class t1 extends com.tencent.mm.plugin.ball.service.s4 implements com.tencent.mm.plugin.appbrand.jsapi.h0 {

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f78143v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.backgroundrunning.v0 f78144w;

    /* renamed from: x, reason: collision with root package name */
    public final android.os.Handler f78145x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.backgroundrunning.u0 f78146y;

    public t1(dp1.x xVar, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(xVar);
        this.f78146y = new com.tencent.mm.plugin.appbrand.floatball.r1(this);
        this.f78143v = o6Var;
        o6Var.l(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "create, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        this.f78144w = (com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class);
        this.f78145x = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onReceivedBallInfoRemovedEvent, runtime:%s", java.lang.Integer.valueOf(this.f78143v.hashCode()));
        n0();
        x0();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, runtime:%s", java.lang.Integer.valueOf(this.f78143v.hashCode()));
        this.f93239n.q(true);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        Q(2);
        com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = this.f78144w;
        if (v0Var != null) {
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var).wi(this.f78146y);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public boolean m0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onClose, runtime:%s", java.lang.Integer.valueOf(this.f78143v.hashCode()));
        if (u()) {
            if (u() && !com.tencent.mm.sdk.platformtools.o4.L().i("has_shown_appbrand_voip_1v1_tip", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onClose, should show voip tip");
                w0(this.f93239n.getActivity(), new com.tencent.mm.plugin.appbrand.floatball.l1(this, i17));
            } else {
                u0(i17);
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void o0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onDestroy, runtime:%s", java.lang.Integer.valueOf(this.f78143v.hashCode()));
        super.o0();
        com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = this.f78144w;
        if (v0Var != null) {
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var).Bi(this.f78146y);
        }
    }

    public final int t0() {
        boolean z17;
        if (this.f78143v == null) {
            return 32;
        }
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        if (p0Var.f96024o == com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.InRoom) {
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o oVar = p0Var.f96018g;
            z17 = oVar.f95970b == null ? true : oVar.f95980l;
        } else {
            z17 = false;
        }
        boolean z18 = !z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "getCurrentVOIPState, enableMic:%s", java.lang.Boolean.valueOf(z18));
        return z18 ? 32 : 64;
    }

    public final void u0(int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        dp1.x xVar = this.f93239n;
        if (((sb0.f) jVar).Ui(xVar.getActivity())) {
            v0(i17);
        } else {
            com.tencent.mm.plugin.appbrand.floatball.t.a(xVar.getActivity(), 19, new com.tencent.mm.plugin.appbrand.floatball.n1(this, i17));
        }
    }

    public final void v0(int i17) {
        t().f93090m = f0(i17);
        g();
        com.tencent.mm.plugin.ball.ui.e0.b(this.f93239n, this.f93136h.G(), new com.tencent.mm.plugin.appbrand.floatball.o1(this));
    }

    public void w0(android.content.Context context, com.tencent.mm.plugin.appbrand.floatball.s1 s1Var) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getString(com.tencent.mm.R.string.a5l));
        u1Var.m(com.tencent.mm.R.string.a5m);
        u1Var.l(new com.tencent.mm.plugin.appbrand.floatball.m1(this, s1Var));
        u1Var.q(false);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onEnterPage, runtime:%s", java.lang.Integer.valueOf(this.f78143v.hashCode()));
        if (s() != null) {
            d0(false);
        }
    }

    public final void x0() {
        if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class) != null) {
            com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = new com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel();
            mMBackgroundRunningOperationParcel.f76945d = this.f78143v.f74803n;
            mMBackgroundRunningOperationParcel.f76946e = 16;
            mMBackgroundRunningOperationParcel.f76947f = 2;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "stopVOIP, appId:%s", this.f78143v.f74803n);
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) ((com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class))).Ai(mMBackgroundRunningOperationParcel);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void z() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78143v;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onExitPage, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        if (s() != null) {
            d0(true);
            db5.t7.makeText(o6Var.r0(), com.tencent.mm.R.string.a5n, 0).show();
        }
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.i(this.f93132d);
        }
        s75.d.b(new com.tencent.mm.plugin.appbrand.floatball.q1(this), "");
    }
}
