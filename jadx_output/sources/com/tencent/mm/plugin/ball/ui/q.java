package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes8.dex */
public class q implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.v0 f93343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93344b;

    public q(com.tencent.mm.plugin.ball.ui.v0 v0Var, int i17) {
        this.f93343a = v0Var;
        this.f93344b = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallProxyUI", "dismiss dialog");
        this.f93343a.a(this.f93344b, 2);
    }
}
