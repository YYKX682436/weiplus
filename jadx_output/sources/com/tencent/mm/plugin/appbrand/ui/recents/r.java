package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90141d;

    public r(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f90141d = appBrandLauncherRecentsList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90141d;
        if (appBrandLauncherRecentsList.f90013w.computeVerticalScrollOffset() == 0) {
            appBrandLauncherRecentsList.f90013w.scrollBy(0, appBrandLauncherRecentsList.E.getTop());
        }
    }
}
