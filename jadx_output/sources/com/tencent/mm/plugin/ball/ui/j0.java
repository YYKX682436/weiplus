package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f93303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.q0 f93304e;

    public j0(com.tencent.mm.plugin.ball.ui.q0 q0Var, boolean z17) {
        this.f93304e = q0Var;
        this.f93303d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView;
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93304e.f93346d;
        if (nVar == null || (floatBallView = nVar.f93318c) == null) {
            return;
        }
        floatBallView.n(this.f93303d, true, 2);
    }
}
