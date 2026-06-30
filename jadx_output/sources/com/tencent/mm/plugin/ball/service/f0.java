package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gp1.u f93158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.s f93159f;

    public f0(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, gp1.u uVar) {
        this.f93159f = sVar;
        this.f93157d = ballInfo;
        this.f93158e = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93157d;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(ballInfo.f93046d)};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallCustomViewFlatFactory", "flatViewByBallInfo type:%d", objArr);
        if (ballInfo.f93046d == 40) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.ball.appbrand.FloatBallVideoPanelView floatBallVideoPanelView = new com.tencent.mm.plugin.ball.appbrand.FloatBallVideoPanelView(context, null);
            ballInfo.f93050h = floatBallVideoPanelView;
            if (ballInfo.f93051i == null) {
                ballInfo.f93051i = new android.graphics.Point();
            }
            floatBallVideoPanelView.setOnCoverClickListener(new com.tencent.mm.plugin.ball.service.a(this.f93158e, ballInfo));
            floatBallVideoPanelView.setBallInfo(ballInfo);
            ballInfo.f93053n = 1;
            com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo ballCollapseInfo = ballInfo.f93056q;
            ballCollapseInfo.f93082d = false;
            ballCollapseInfo.f93083e = 2000L;
            java.lang.String string = ballInfo.G.getString("coverUrl");
            ballInfo.G.getInt("coverHeight");
            ballInfo.G.getInt("coverWidth");
            float f17 = ballInfo.G.getFloat("aspectRatio");
            floatBallVideoPanelView.c(string, 0, 0);
            com.tencent.mm.plugin.ball.service.b.a(f17, ballInfo, floatBallVideoPanelView);
        }
        com.tencent.mm.plugin.ball.service.s sVar = this.f93159f;
        sVar.V(ballInfo);
        sVar.b(ballInfo);
        sVar.c(ballInfo);
    }
}
