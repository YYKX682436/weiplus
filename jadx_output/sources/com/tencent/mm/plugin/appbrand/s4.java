package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class s4 implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer f88448a;

    public s4(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer) {
        this.f88448a = appBrandRuntimeContainer;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i17) {
        int i18;
        android.app.Activity a17;
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer = this.f88448a;
        if (appBrandRuntimeContainer.f74838q.isShown()) {
            android.widget.FrameLayout frameLayout = appBrandRuntimeContainer.f74838q;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (!n3.x0.b(frameLayout) || (i18 = android.os.Build.VERSION.SDK_INT) < 26 || (appBrandRuntimeContainer.f74838q.getWindowSystemUiVisibility() & 2) != 0 || (a17 = q75.a.a(appBrandRuntimeContainer.f87645d)) == null || a17.getWindow() == null) {
                return;
            }
            boolean g17 = com.tencent.mm.ui.uk.g(a17.getWindow().getNavigationBarColor());
            android.view.Window window = a17.getWindow();
            boolean z17 = !g17;
            if (window == null || window.getDecorView() == null || i18 < 26) {
                return;
            }
            android.view.View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z17 ? systemUiVisibility | 16 : systemUiVisibility & (-17));
        }
    }
}
