package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes8.dex */
public class v implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.FloatBallProxyUI f93370a;

    public v(com.tencent.mm.plugin.ball.ui.FloatBallProxyUI floatBallProxyUI) {
        this.f93370a = floatBallProxyUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallProxyUI", "dismiss dialog");
        com.tencent.mm.plugin.ball.ui.FloatBallProxyUI floatBallProxyUI = this.f93370a;
        com.tencent.mm.plugin.ball.ui.FloatBallProxyUI.T6(floatBallProxyUI, 2);
        floatBallProxyUI.finish();
    }
}
