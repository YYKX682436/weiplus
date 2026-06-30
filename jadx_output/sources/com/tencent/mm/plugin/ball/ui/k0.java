package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f93306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.q0 f93307e;

    public k0(com.tencent.mm.plugin.ball.ui.q0 q0Var, float f17) {
        this.f93307e = q0Var;
        this.f93306d = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView;
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93307e.f93346d;
        if (nVar == null || (floatBallView = nVar.f93318c) == null || !nVar.f93325j) {
            return;
        }
        floatBallView.setFloatBallAlpha(this.f93306d);
    }
}
