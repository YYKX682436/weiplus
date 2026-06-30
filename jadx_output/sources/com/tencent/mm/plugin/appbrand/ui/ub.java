package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public final class ub implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI f90259a;

    public ub(com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI appBrandVideoPreviewUI) {
        this.f90259a = appBrandVideoPreviewUI;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i17) {
        if ((i17 & 4) == 0) {
            com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI appBrandVideoPreviewUI = this.f90259a;
            android.view.View decorView = appBrandVideoPreviewUI.getWindow().getDecorView();
            appBrandVideoPreviewUI.getClass();
            decorView.setSystemUiVisibility(1280);
        }
    }
}
