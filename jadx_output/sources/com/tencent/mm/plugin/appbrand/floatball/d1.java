package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.e1 f78084d;

    public d1(com.tencent.mm.plugin.appbrand.floatball.e1 e1Var) {
        this.f78084d = e1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "loadAlbum, only updateCustomViewInMMProcess");
        com.tencent.mm.plugin.appbrand.floatball.e1 e1Var = this.f78084d;
        com.tencent.mm.plugin.appbrand.floatball.k1 k1Var = e1Var.f78087a;
        k1Var.f93132d.G.putBoolean("onlyCover", k1Var.F);
        com.tencent.mm.plugin.appbrand.floatball.k1 k1Var2 = e1Var.f78087a;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = k1Var2.f93132d;
        gp1.v vVar = k1Var2.f93136h;
        if (vVar != null) {
            vVar.b0(ballInfo);
        }
    }
}
