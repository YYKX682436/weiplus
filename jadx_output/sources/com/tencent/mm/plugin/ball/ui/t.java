package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes8.dex */
public class t implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.FloatBallProxyUI f93355d;

    public t(com.tencent.mm.plugin.ball.ui.FloatBallProxyUI floatBallProxyUI) {
        this.f93355d = floatBallProxyUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.ball.ui.FloatBallProxyUI floatBallProxyUI = this.f93355d;
        if (itemId == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallProxyUI", "click remove all balls");
            com.tencent.mm.plugin.ball.ui.FloatBallProxyUI.T6(floatBallProxyUI, 1);
            floatBallProxyUI.finish();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallProxyUI", "click cancel remove all balls");
            com.tencent.mm.plugin.ball.ui.FloatBallProxyUI.T6(floatBallProxyUI, 2);
            floatBallProxyUI.finish();
        }
    }
}
