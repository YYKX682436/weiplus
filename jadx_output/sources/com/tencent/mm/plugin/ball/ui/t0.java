package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.u0 f93356d;

    public t0(com.tencent.mm.plugin.ball.ui.u0 u0Var) {
        this.f93356d = u0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.ui.u0 u0Var = this.f93356d;
        com.tencent.mm.plugin.ball.view.FloatIndicatorView floatIndicatorView = u0Var.f93360c;
        if (floatIndicatorView != null) {
            try {
                if (floatIndicatorView.getParent() != null) {
                    ((android.view.ViewGroup) u0Var.f93360c.getParent()).removeView(u0Var.f93360c);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatIndicatorController", e17, "detachFloatIndicatorView exception:%s", e17);
            }
        }
    }
}
