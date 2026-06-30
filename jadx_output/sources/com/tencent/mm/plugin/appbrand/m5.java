package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class m5 implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC f85705a;

    public m5(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC) {
        this.f85705a = appBrandRuntimeContainerWC;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i17) {
        android.app.Activity w17;
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.f85705a;
        android.widget.FrameLayout frameLayout = appBrandRuntimeContainerWC.f74838q;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.b(frameLayout) || (w17 = appBrandRuntimeContainerWC.w()) == null || w17.getWindow() == null) {
            return;
        }
        com.tencent.mm.ui.bk.h0(w17.getWindow(), !com.tencent.mm.ui.uk.g(w17.getWindow().getNavigationBarColor()));
    }
}
