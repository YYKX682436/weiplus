package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.y0 f78173e;

    public x0(com.tencent.mm.plugin.appbrand.floatball.y0 y0Var, java.lang.String str) {
        this.f78173e = y0Var;
        this.f78172d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.floatball.y0 y0Var = this.f78173e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "updateCover run isPlaying:%b", java.lang.Boolean.valueOf(y0Var.f78178f.C));
        com.tencent.mm.plugin.appbrand.floatball.k1 k1Var = y0Var.f78178f;
        android.os.Bundle bundle = k1Var.f93132d.G;
        java.lang.String str = this.f78172d;
        bundle.putString("coverUrl", str);
        android.os.Bundle bundle2 = k1Var.f93132d.G;
        android.graphics.Bitmap bitmap = y0Var.f78176d;
        bundle2.putInt("coverHeight", bitmap.getHeight());
        k1Var.f93132d.G.putInt("coverWidth", bitmap.getWidth());
        k1Var.f93132d.G.putFloat("aspectRatio", y0Var.f78177e);
        k1Var.f93132d.G.putBoolean("onlyCover", k1Var.F);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            k1Var.f93132d.f93055p.f93068f = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.ae6));
        } else {
            k1Var.f93132d.f93055p.f93066d = str;
        }
        k1Var.R(k1Var.f93132d.f93055p);
        k1Var.g();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = k1Var.f93132d;
        gp1.v vVar = k1Var.f93136h;
        if (vVar != null) {
            vVar.b0(ballInfo);
        }
        android.view.Surface surface = k1Var.D;
        if (surface == null || !k1Var.C) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "surface is null");
        } else {
            k1Var.f78110y.t(surface);
        }
    }
}
