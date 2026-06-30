package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90170d;

    public x(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f90170d = appBrandLauncherRecentsList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView;
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90170d;
        android.view.View view = appBrandLauncherRecentsList.H.f90075a;
        if (view == null || view.getHeight() <= 0 || (loadMoreRecyclerView = appBrandLauncherRecentsList.f90013w) == null) {
            return;
        }
        try {
            loadMoreRecyclerView.scrollBy(0, appBrandLauncherRecentsList.H.f90075a.getHeight());
        } catch (java.lang.IndexOutOfBoundsException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLauncherRecentsList", "makeFooterFullyVisible scrollBy e=%s", e17);
        }
    }
}
