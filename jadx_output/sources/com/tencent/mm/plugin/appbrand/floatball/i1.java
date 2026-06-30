package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class i1 implements tf1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.k1 f78103a;

    public i1(com.tencent.mm.plugin.appbrand.floatball.k1 k1Var) {
        this.f78103a = k1Var;
    }

    @Override // tf1.e
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "onBackgroundAudioStart");
        com.tencent.mm.plugin.appbrand.floatball.k1 k1Var = this.f78103a;
        k1Var.C = true;
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = k1Var.f93132d.f93054o;
        ballButtonInfo.f93069d = true;
        k1Var.S(ballButtonInfo);
        k1Var.g();
        android.view.Surface surface = k1Var.D;
        if (surface != null) {
            k1Var.f78110y.t(surface);
        }
    }

    @Override // tf1.e
    public void b() {
        com.tencent.mm.plugin.appbrand.floatball.k1 k1Var = this.f78103a;
        tf1.f fVar = k1Var.f78110y;
        k1Var.C = fVar != null && fVar.l();
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = k1Var.f93132d.f93054o;
        boolean z17 = k1Var.C;
        ballButtonInfo.f93069d = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "onBackgroundAudioUpdate isPlaying:%b", java.lang.Boolean.valueOf(z17));
        k1Var.S(k1Var.f93132d.f93054o);
        k1Var.g();
        android.view.Surface surface = k1Var.D;
        if (surface == null || !k1Var.C) {
            return;
        }
        k1Var.f78110y.t(surface);
    }

    @Override // tf1.e
    public void c(android.graphics.Bitmap bitmap) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(bitmap != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "onVideoSnapshot ret:%b", objArr);
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.floatball.k1 k1Var = this.f78103a;
        k1Var.D0(bitmap, k1Var.f78110y.j());
    }

    @Override // tf1.e
    public void d() {
    }

    @Override // tf1.e
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "onBackgroundAudioPause");
        com.tencent.mm.plugin.appbrand.floatball.k1 k1Var = this.f78103a;
        k1Var.C = false;
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = k1Var.f93132d.f93054o;
        ballButtonInfo.f93069d = false;
        k1Var.S(ballButtonInfo);
        k1Var.g();
    }
}
