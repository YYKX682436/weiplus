package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class u4 implements com.tencent.mm.plugin.ball.service.f5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.s4 f93257b;

    public u4(com.tencent.mm.plugin.ball.service.s4 s4Var, int i17) {
        this.f93257b = s4Var;
        this.f93256a = i17;
    }

    public void a() {
        if (!this.f93257b.k()) {
            pv.e0 e0Var = (pv.e0) i95.n0.c(pv.e0.class);
            android.app.Activity activity = this.f93257b.f93239n.getActivity();
            com.tencent.mm.plugin.ball.service.s4 s4Var = this.f93257b;
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = s4Var.f93132d;
            boolean l17 = s4Var.l();
            com.tencent.mm.plugin.ball.ui.v0 v0Var = this.f93257b.f93137i;
            ((ov.i0) e0Var).getClass();
            com.tencent.mm.plugin.ball.ui.FloatBallProxyUI.U6(activity, 1, ballInfo, l17, v0Var);
            return;
        }
        com.tencent.mm.plugin.ball.service.s4 s4Var2 = this.f93257b;
        if (s4Var2.f93136h != null) {
            s4Var2.t().f93084d = this.f93256a;
            this.f93257b.e();
            com.tencent.mm.plugin.ball.service.s4 s4Var3 = this.f93257b;
            s4Var3.f93246u = false;
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = s4Var3.f93132d;
            ballInfo2.f93058s = false;
            s4Var3.f93136h.B0(ballInfo2, s4Var3.f93239n.getBitmap());
            this.f93257b.r0();
            if (!this.f93257b.f93239n.r()) {
                this.f93257b.f93239n.q(false);
                return;
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.ball.service.u4$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.ball.service.u4 u4Var = com.tencent.mm.plugin.ball.service.u4.this;
                    u4Var.getClass();
                    u4Var.f93257b.h0(new com.tencent.mm.plugin.ball.service.v4(u4Var), false);
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 200L, false);
        }
    }
}
