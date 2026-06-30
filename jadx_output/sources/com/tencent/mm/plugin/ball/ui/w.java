package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes8.dex */
public class w implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.FloatBallProxyUI f93371a;

    public w(com.tencent.mm.plugin.ball.ui.FloatBallProxyUI floatBallProxyUI) {
        this.f93371a = floatBallProxyUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallProxyUI", "click ok");
            com.tencent.mm.plugin.ball.ui.FloatBallProxyUI floatBallProxyUI = this.f93371a;
            floatBallProxyUI.f93271g = true;
            com.tencent.mm.plugin.ball.ui.FloatBallProxyUI.T6(floatBallProxyUI, 1);
            floatBallProxyUI.finish();
        }
    }
}
