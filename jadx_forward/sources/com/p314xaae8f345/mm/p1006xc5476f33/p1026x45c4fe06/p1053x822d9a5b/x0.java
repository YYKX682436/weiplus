package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.y0 f159706e;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.y0 y0Var, java.lang.String str) {
        this.f159706e = y0Var;
        this.f159705d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.y0 y0Var = this.f159706e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "updateCover run isPlaying:%b", java.lang.Boolean.valueOf(y0Var.f159711f.C));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 k1Var = y0Var.f159711f;
        android.os.Bundle bundle = k1Var.f174665d.G;
        java.lang.String str = this.f159705d;
        bundle.putString("coverUrl", str);
        android.os.Bundle bundle2 = k1Var.f174665d.G;
        android.graphics.Bitmap bitmap = y0Var.f159709d;
        bundle2.putInt("coverHeight", bitmap.getHeight());
        k1Var.f174665d.G.putInt("coverWidth", bitmap.getWidth());
        k1Var.f174665d.G.putFloat("aspectRatio", y0Var.f159710e);
        k1Var.f174665d.G.putBoolean("onlyCover", k1Var.F);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            k1Var.f174665d.f174588p.f174601f = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.ae6));
        } else {
            k1Var.f174665d.f174588p.f174599d = str;
        }
        k1Var.R(k1Var.f174665d.f174588p);
        k1Var.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = k1Var.f174665d;
        gp1.v vVar = k1Var.f174669h;
        if (vVar != null) {
            vVar.b0(c12886x91aa2b6d);
        }
        android.view.Surface surface = k1Var.D;
        if (surface == null || !k1Var.C) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "surface is null");
        } else {
            k1Var.f159643y.t(surface);
        }
    }
}
