package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes14.dex */
public class f0 extends dp1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.l0 f97269a;

    public f0(com.tencent.mm.plugin.downloader_app.model.l0 l0Var) {
        this.f97269a = l0Var;
    }

    @Override // dp1.m
    public boolean a(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.downloader_app.model.l0 l0Var = this.f97269a;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onBallInstallImageViewSet:%b", java.lang.Boolean.valueOf(l0Var.f97291p));
        return l0Var.f97291p;
    }

    @Override // dp1.m
    public boolean b(android.content.Context context, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        boolean z17 = com.tencent.mm.sdk.platformtools.o4.R("game_download_float_ball").getBoolean("game_download_first_" + gm0.j1.b().j(), true);
        com.tencent.mm.plugin.downloader_app.model.l0 l0Var = this.f97269a;
        java.lang.String str = l0Var.f97296u.size() > 0 ? ((com.tencent.mm.plugin.downloader_app.model.i0) l0Var.f97296u.get(0)).f97279a : "";
        if (z17) {
            jj0.a.a().c(str, 7, 0, null, "");
            com.tencent.mm.sdk.platformtools.o4.R("game_download_float_ball").putBoolean("game_download_first_" + gm0.j1.b().j(), false);
        }
        return false;
    }

    @Override // dp1.m
    public boolean c(android.widget.TextView textView, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        textView.post(new com.tencent.mm.plugin.downloader_app.model.e0(this, textView, ballInfo));
        return false;
    }
}
