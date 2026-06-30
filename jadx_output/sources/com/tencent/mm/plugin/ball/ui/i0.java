package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f93300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.q0 f93301e;

    public i0(com.tencent.mm.plugin.ball.ui.q0 q0Var, int i17) {
        this.f93301e = q0Var;
        this.f93300d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93301e.f93346d;
        if (nVar != null) {
            int i17 = this.f93300d;
            com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
            if (floatBallView == null || !nVar.f93325j) {
                return;
            }
            if (floatBallView.f93539l2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "collapseFloatBall isDragging and ignore");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "collapseFloatBall collapseState: %s, collapseReason: %d", java.lang.Integer.valueOf(floatBallView.T1), java.lang.Integer.valueOf(i17));
            if (i17 == 1 || i17 == 2) {
                qp1.i.a();
            }
            if (!floatBallView.V1 || floatBallView.W()) {
                return;
            }
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) floatBallView.getLayoutParams();
            boolean z17 = floatBallView.f93563x1;
            int i18 = layoutParams.x;
            floatBallView.t0(z17, true, i18, layoutParams.y, floatBallView.y(floatBallView.Z(i18), true), layoutParams.y, false, i17, -1);
        }
    }
}
