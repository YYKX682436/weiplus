package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.plugin.ball.service.s4 {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f78077v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f78078w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.backgroundrunning.v0 f78079x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f78080y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.backgroundrunning.u0 f78081z;

    public d(dp1.x xVar, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(xVar);
        java.lang.String str = "MicroMsg.AppBrand.AppBrandAudioOfVideoBackgroundPlayFloatBallHelper#" + hashCode();
        this.f78077v = str;
        this.f78080y = false;
        this.f78081z = new com.tencent.mm.plugin.appbrand.floatball.a(this);
        this.f78078w = o6Var;
        com.tencent.mars.xlog.Log.i(str, "create, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        this.f78079x = (com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class);
    }

    public static void t0(com.tencent.mm.plugin.appbrand.floatball.d dVar, boolean z17) {
        java.lang.String str = dVar.f78077v;
        com.tencent.mars.xlog.Log.i(str, "ignoreRuntimeResumePauseOnce");
        tf1.f fVar = (tf1.f) dVar.f78078w.k(tf1.f.class);
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w(str, "ignoreRuntimeResumePauseOnce, audioOfVideoBackgroundPlayManager is null");
        } else {
            fVar.k(!z17);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void B(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f78077v, "onReceivedBallInfoAddedEvent, runtime:%s, type: %d, key: %s", java.lang.Integer.valueOf(this.f78078w.hashCode()), java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo != null) {
            com.tencent.mars.xlog.Log.i(this.f78077v, "onReceivedBallInfoAddedEvent, myType: %d, myKey: %s", java.lang.Integer.valueOf(ballInfo.f93046d), this.f93132d.f93049g);
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = this.f93132d;
        if (ballInfo2 != null && i17 == ballInfo2.f93046d && java.util.Objects.equals(str, ballInfo2.f93049g)) {
            com.tencent.mars.xlog.Log.i(this.f78077v, "onReceivedBallInfoAddedEvent, myself");
            return;
        }
        if (6 == i17 || 18 == i17 || 9 == i17 || 17 == i17) {
            d();
            this.f78080y = false;
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void H() {
        com.tencent.mars.xlog.Log.i(this.f78077v, "onReceivedBallInfoRemovedEvent, runtime:%s", java.lang.Integer.valueOf(this.f78078w.hashCode()));
        n0();
        this.f78080y = false;
        v0();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        com.tencent.mars.xlog.Log.i(this.f78077v, "onReceivedFinishWhenSwitchBallEvent, runtime:%s", java.lang.Integer.valueOf(this.f78078w.hashCode()));
        this.f93239n.q(true);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f78077v, "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        Q(2);
        com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = this.f78079x;
        if (v0Var != null) {
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var).wi(this.f78081z);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public boolean m0(int i17) {
        com.tencent.mars.xlog.Log.i(this.f78077v, "onClose, runtime:%s", java.lang.Integer.valueOf(this.f78078w.hashCode()));
        com.tencent.mm.plugin.appbrand.w0 d17 = com.tencent.mm.plugin.appbrand.x0.d(this.f78078w.f74803n);
        java.lang.String str = this.f78077v;
        com.tencent.mars.xlog.Log.i(str, "onRuntimeBackground, type: " + d17);
        tf1.f fVar = (tf1.f) this.f78078w.k(tf1.f.class);
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w(str, "onRuntimeBackground, audioOfVideoBackgroundPlayManager is null");
        } else {
            fVar.s(d17);
        }
        if (!u() && !this.f78080y) {
            return false;
        }
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(this.f93239n.getActivity())) {
            w0(i17);
            return true;
        }
        com.tencent.mm.plugin.appbrand.floatball.t.a(this.f93239n.getActivity(), 18, new com.tencent.mm.plugin.appbrand.floatball.b(this, i17));
        return true;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void o0() {
        com.tencent.mars.xlog.Log.i(this.f78077v, "onDestroy, runtime:%s", java.lang.Integer.valueOf(this.f78078w.hashCode()));
        super.o0();
        com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = this.f78079x;
        if (v0Var != null) {
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var).Bi(this.f78081z);
        }
    }

    public final java.lang.String u0() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78078w;
        tf1.f fVar = (tf1.f) o6Var.k(tf1.f.class);
        java.lang.String i17 = fVar != null ? fVar.i() : null;
        return com.tencent.mm.sdk.platformtools.t8.K0(i17) ? o6Var.u0().f77279e : i17;
    }

    public final void v0() {
        if (this.f78079x == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = new com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel();
        mMBackgroundRunningOperationParcel.f76945d = this.f78078w.f74803n;
        mMBackgroundRunningOperationParcel.f76946e = 8;
        mMBackgroundRunningOperationParcel.f76947f = 2;
        com.tencent.mars.xlog.Log.i(this.f78077v, "maybeStopBackgroundPlayAudio, appId:%s", this.f78078w.f74803n);
        ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) this.f78079x).Ai(mMBackgroundRunningOperationParcel);
    }

    public final void w0(int i17) {
        t().f93090m = f0(i17);
        g();
        com.tencent.mm.plugin.ball.ui.e0.b(this.f93239n, this.f93136h.G(), new com.tencent.mm.plugin.appbrand.floatball.c(this));
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void x() {
        com.tencent.mars.xlog.Log.i(this.f78077v, "onEnterPage, runtime:%s", java.lang.Integer.valueOf(this.f78078w.hashCode()));
        if (s() != null) {
            d0(false);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void z() {
        com.tencent.mars.xlog.Log.i(this.f78077v, "onExitPage, runtime:%s", java.lang.Integer.valueOf(this.f78078w.hashCode()));
        if (s() != null) {
            d0(true);
        }
    }
}
