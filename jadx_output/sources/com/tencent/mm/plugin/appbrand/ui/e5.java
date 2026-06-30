package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI f89680d;

    public e5(com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI appBrandLauncherFolderUI) {
        this.f89680d = appBrandLauncherFolderUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.fragment.app.Fragment findFragmentById = this.f89680d.getSupportFragmentManager().findFragmentById(android.R.id.content);
        com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment fragment = findFragmentById instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment ? (com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment) findFragmentById : null;
        if (fragment != null) {
            fragment.l0();
        }
    }
}
