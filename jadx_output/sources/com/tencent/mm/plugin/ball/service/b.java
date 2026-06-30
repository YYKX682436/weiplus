package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public abstract class b {
    public static void a(float f17, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, com.tencent.mm.plugin.ball.appbrand.FloatBallVideoPanelView floatBallVideoPanelView) {
        java.lang.Object[] objArr = {java.lang.Float.valueOf(f17)};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallCustomViewFlatFactory", "updateCustomView aspectRatio:%f", objArr);
        if (f17 == 1.0f) {
            ballInfo.f93051i.x = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479660bx);
            ballInfo.f93051i.y = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479660bx);
            android.graphics.Point point = ballInfo.f93051i;
            floatBallVideoPanelView.d(point.x, point.y);
            return;
        }
        if (f17 > 1.0f) {
            ballInfo.f93051i.x = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479666c3);
            ballInfo.f93051i.y = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479653br);
            android.graphics.Point point2 = ballInfo.f93051i;
            floatBallVideoPanelView.d(point2.x, point2.y);
            return;
        }
        ballInfo.f93051i.x = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479653br);
        ballInfo.f93051i.y = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479666c3);
        android.graphics.Point point3 = ballInfo.f93051i;
        floatBallVideoPanelView.d(point3.x, point3.y);
    }
}
