package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class f0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f90073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90074e;

    public f0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, java.lang.Runnable runnable) {
        this.f90074e = appBrandLauncherRecentsList;
        this.f90073d = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90074e;
        appBrandLauncherRecentsList.f90013w.getViewTreeObserver().removeOnPreDrawListener(this);
        appBrandLauncherRecentsList.f90013w.post(this.f90073d);
        return false;
    }
}
