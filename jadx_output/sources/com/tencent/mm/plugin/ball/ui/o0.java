package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f93335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f93336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f93337f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.q0 f93338g;

    public o0(com.tencent.mm.plugin.ball.ui.q0 q0Var, boolean z17, boolean z18, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f93338g = q0Var;
        this.f93335d = z17;
        this.f93336e = z18;
        this.f93337f = animatorListenerAdapter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93338g.f93346d;
        if (nVar != null) {
            com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
            android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f93337f;
            if (floatBallView != null) {
                boolean z17 = this.f93335d;
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "resume FloatBallView, animation:%s", java.lang.Boolean.valueOf(z17));
                nVar.f93318c.m0(z17, this.f93336e, animatorListenerAdapter);
            }
            if (nVar.f93319d != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "quickHide FloatMenuView");
                nVar.f93319d.c(animatorListenerAdapter);
            }
        }
    }
}
