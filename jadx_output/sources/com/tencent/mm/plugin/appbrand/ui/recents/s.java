package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class s implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f90147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90148e;

    public s(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, java.lang.Runnable runnable) {
        this.f90148e = appBrandLauncherRecentsList;
        this.f90147d = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f90148e.E.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f90147d.run();
        return false;
    }
}
