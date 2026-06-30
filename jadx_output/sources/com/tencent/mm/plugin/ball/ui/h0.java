package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f93297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.q0 f93298e;

    public h0(com.tencent.mm.plugin.ball.ui.q0 q0Var, boolean z17) {
        this.f93298e = q0Var;
        this.f93297d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView;
        if (this.f93298e.f()) {
            com.tencent.mm.plugin.ball.ui.n nVar = this.f93298e.f93346d;
            boolean z17 = this.f93297d;
            com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
            if (floatBallView != null && nVar.f93325j) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "markWechatInForeground, visibility:%s, inForeground:%s, otherContentViewNotShow: %s", java.lang.Integer.valueOf(floatBallView.getVisibility()), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(floatBallView.M));
                if (z17) {
                    floatBallView.f93524d |= 32;
                    floatBallView.setVisibility(0);
                    if (floatBallView.M) {
                        floatBallView.i0(true);
                    }
                } else {
                    int i17 = floatBallView.f93524d & (-33);
                    floatBallView.f93524d = i17;
                    if (floatBallView.E(i17) || floatBallView.D(floatBallView.f93524d)) {
                        floatBallView.l0(false, null);
                        if (((int) floatBallView.getAlpha()) == 0) {
                            floatBallView.setAlpha(1.0f);
                        }
                    }
                }
                floatBallView.Q0(floatBallView.f93535i2, floatBallView.f93536j2, floatBallView.f93533h2, false);
            }
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = nVar.f93320e;
            if (contentFloatBallView != null && nVar.f93326k) {
                boolean s17 = contentFloatBallView.s();
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "markWechatInForeground, visibility:%s, inForeground:%s, hasFloatBallShow: %s", java.lang.Integer.valueOf(contentFloatBallView.getVisibility()), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(s17));
                if (z17) {
                    contentFloatBallView.f93419d |= 32;
                    if (s17) {
                        if (contentFloatBallView.w()) {
                            com.tencent.mm.plugin.ball.view.ContentFloatBallView.L(contentFloatBallView, true, contentFloatBallView.A, 0.0f, false, null, 28, null);
                        } else {
                            contentFloatBallView.J(false, false, null);
                        }
                    }
                } else {
                    contentFloatBallView.f93419d &= -33;
                    if (s17) {
                        com.tencent.mm.plugin.ball.view.ContentFloatBallView.I(contentFloatBallView, false, contentFloatBallView.A, contentFloatBallView.F, false, null, false, null, 112, null);
                        contentFloatBallView.t(false, null);
                    }
                    com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = contentFloatBallView.f93433u;
                    if (floatBackgroundView != null) {
                        floatBackgroundView.a(false);
                    }
                }
            }
            if (!z17 && (floatMenuView = nVar.f93319d) != null) {
                floatMenuView.c(null);
            }
            if (this.f93297d) {
                com.tencent.mm.plugin.ball.ui.q0 q0Var = this.f93298e;
                if (q0Var.f93348f) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallUIManager", "checkFloatBallViewWhenForeground forceHideAllFloatBall and hide");
                    if (q0Var.f()) {
                        q0Var.f93346d.h(false, null);
                    }
                }
            }
        }
    }
}
