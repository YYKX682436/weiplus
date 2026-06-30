package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public class p0 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.qk f169168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0 f169169e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0 n0Var, com.p314xaae8f345.mm.ui.qk qkVar) {
        this.f169169e = n0Var;
        this.f169168d = qkVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        android.view.WindowInsets rootWindowInsets;
        boolean e17;
        try {
            try {
                android.view.View decorView = this.f169169e.f169140a.getWindow().getDecorView();
                int rotation = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.a.a(this.f169169e.f169140a).getRotation();
                synchronized (this.f169169e.f169141b) {
                    android.view.WindowInsets[] windowInsetsArr = this.f169169e.f169145f;
                    rootWindowInsets = decorView.getRootWindowInsets();
                    windowInsetsArr[rotation] = rootWindowInsets;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0 n0Var = this.f169169e;
                    e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0.e(windowInsets);
                    n0Var.f169144e = e17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.WindowAndroidActivityCutoutHandlerApi28", "resetCache-onApplyWindowInsets, notch:%b, windowInsets:%s", java.lang.Boolean.valueOf(e17), rootWindowInsets);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.WindowAndroidActivityCutoutHandlerApi28", e18, "resetCache-onApplyWindowInsets", new java.lang.Object[0]);
            }
            return windowInsets;
        } finally {
            this.f169168d.d(this);
        }
    }
}
