package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class i1 implements tf1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 f159636a;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 k1Var) {
        this.f159636a = k1Var;
    }

    @Override // tf1.e
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "onBackgroundAudioStart");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 k1Var = this.f159636a;
        k1Var.C = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = k1Var.f174665d.f174587o;
        ballButtonInfo.f174602d = true;
        k1Var.S(ballButtonInfo);
        k1Var.g();
        android.view.Surface surface = k1Var.D;
        if (surface != null) {
            k1Var.f159643y.t(surface);
        }
    }

    @Override // tf1.e
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 k1Var = this.f159636a;
        tf1.f fVar = k1Var.f159643y;
        k1Var.C = fVar != null && fVar.l();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = k1Var.f174665d.f174587o;
        boolean z17 = k1Var.C;
        ballButtonInfo.f174602d = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "onBackgroundAudioUpdate isPlaying:%b", java.lang.Boolean.valueOf(z17));
        k1Var.S(k1Var.f174665d.f174587o);
        k1Var.g();
        android.view.Surface surface = k1Var.D;
        if (surface == null || !k1Var.C) {
            return;
        }
        k1Var.f159643y.t(surface);
    }

    @Override // tf1.e
    public void c(android.graphics.Bitmap bitmap) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(bitmap != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "onVideoSnapshot ret:%b", objArr);
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 k1Var = this.f159636a;
        k1Var.D0(bitmap, k1Var.f159643y.j());
    }

    @Override // tf1.e
    public void d() {
    }

    @Override // tf1.e
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "onBackgroundAudioPause");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 k1Var = this.f159636a;
        k1Var.C = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = k1Var.f174665d.f174587o;
        ballButtonInfo.f174602d = false;
        k1Var.S(ballButtonInfo);
        k1Var.g();
    }
}
