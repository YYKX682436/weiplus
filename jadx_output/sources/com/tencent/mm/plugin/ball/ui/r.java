package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes8.dex */
public class r implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.v0 f93350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93351b;

    public r(com.tencent.mm.plugin.ball.ui.v0 v0Var, int i17) {
        this.f93350a = v0Var;
        this.f93351b = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallProxyUI", "click ok");
            this.f93350a.a(this.f93351b, 1);
        }
    }
}
