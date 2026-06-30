package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.s f93165e;

    public g0(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93165e = sVar;
        this.f93164d = ballInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.service.s sVar = this.f93165e;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93164d;
        sVar.V(ballInfo);
        com.tencent.mm.plugin.ball.model.BallInfo t07 = sVar.t0(ballInfo);
        if (t07 == null || t07.f93050h == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(t07 != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateCustomViewInMMProcess exitBallInfo exist:%b", objArr);
            return;
        }
        sVar.c(t07);
        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(t07.f93046d)};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallCustomViewFlatFactory", "updateCustomView type:%d", objArr2);
        if (t07.f93046d == 40) {
            android.view.View view = t07.f93050h;
            if (view instanceof com.tencent.mm.plugin.ball.appbrand.FloatBallVideoPanelView) {
                com.tencent.mm.plugin.ball.appbrand.FloatBallVideoPanelView floatBallVideoPanelView = (com.tencent.mm.plugin.ball.appbrand.FloatBallVideoPanelView) view;
                java.lang.String string = t07.G.getString("coverUrl");
                t07.G.getInt("coverHeight");
                t07.G.getInt("coverWidth");
                float f17 = t07.G.getFloat("aspectRatio");
                boolean z17 = t07.G.getBoolean("onlyCover", false);
                floatBallVideoPanelView.c(string, 0, 0);
                com.tencent.mm.plugin.ball.service.b.a(f17, t07, floatBallVideoPanelView);
                if (z17) {
                    android.view.TextureView textureView = floatBallVideoPanelView.f92981g;
                    if (textureView == null) {
                        return;
                    }
                    textureView.setVisibility(8);
                    return;
                }
                android.view.TextureView textureView2 = floatBallVideoPanelView.f92981g;
                if (textureView2 == null) {
                    return;
                }
                textureView2.setVisibility(0);
            }
        }
    }
}
