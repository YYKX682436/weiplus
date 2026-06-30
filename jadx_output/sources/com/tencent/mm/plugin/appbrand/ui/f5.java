package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI f89703d;

    public f5(com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI appBrandLauncherUI) {
        this.f89703d = appBrandLauncherUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment T6;
        com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI appBrandLauncherUI = this.f89703d;
        if (appBrandLauncherUI.activityHasDestroyed() || appBrandLauncherUI.isFinishing() || (T6 = appBrandLauncherUI.T6()) == null) {
            return;
        }
        T6.l0();
    }
}
