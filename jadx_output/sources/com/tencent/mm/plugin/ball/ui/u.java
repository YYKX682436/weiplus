package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes8.dex */
public class u implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.FloatBallProxyUI f93357d;

    public u(com.tencent.mm.plugin.ball.ui.FloatBallProxyUI floatBallProxyUI) {
        this.f93357d = floatBallProxyUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallProxyUI", "dismiss bottom sheet");
        com.tencent.mm.plugin.ball.ui.FloatBallProxyUI floatBallProxyUI = this.f93357d;
        com.tencent.mm.plugin.ball.ui.FloatBallProxyUI.T6(floatBallProxyUI, 2);
        floatBallProxyUI.finish();
    }
}
