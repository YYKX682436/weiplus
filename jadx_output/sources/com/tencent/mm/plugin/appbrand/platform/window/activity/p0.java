package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public class p0 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.qk f87635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.platform.window.activity.n0 f87636e;

    public p0(com.tencent.mm.plugin.appbrand.platform.window.activity.n0 n0Var, com.tencent.mm.ui.qk qkVar) {
        this.f87636e = n0Var;
        this.f87635d = qkVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        android.view.WindowInsets rootWindowInsets;
        boolean e17;
        try {
            try {
                android.view.View decorView = this.f87636e.f87607a.getWindow().getDecorView();
                int rotation = com.tencent.mm.plugin.appbrand.platform.window.activity.a.a(this.f87636e.f87607a).getRotation();
                synchronized (this.f87636e.f87608b) {
                    android.view.WindowInsets[] windowInsetsArr = this.f87636e.f87612f;
                    rootWindowInsets = decorView.getRootWindowInsets();
                    windowInsetsArr[rotation] = rootWindowInsets;
                    com.tencent.mm.plugin.appbrand.platform.window.activity.n0 n0Var = this.f87636e;
                    e17 = com.tencent.mm.plugin.appbrand.platform.window.activity.n0.e(windowInsets);
                    n0Var.f87611e = e17;
                }
                com.tencent.mars.xlog.Log.i("Luggage.WXA.WindowAndroidActivityCutoutHandlerApi28", "resetCache-onApplyWindowInsets, notch:%b, windowInsets:%s", java.lang.Boolean.valueOf(e17), rootWindowInsets);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.WindowAndroidActivityCutoutHandlerApi28", e18, "resetCache-onApplyWindowInsets", new java.lang.Object[0]);
            }
            return windowInsets;
        } finally {
            this.f87635d.d(this);
        }
    }
}
