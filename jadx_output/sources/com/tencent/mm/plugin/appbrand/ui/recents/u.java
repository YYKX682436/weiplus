package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class u implements vl1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90157a;

    public u(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f90157a = appBrandLauncherRecentsList;
    }

    @Override // vl1.j
    public void a(com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView, androidx.recyclerview.widget.f2 f2Var) {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90157a;
        com.tencent.mm.ui.widget.ThreeDotsLoadingView threeDotsLoadingView = appBrandLauncherRecentsList.H.f90076b;
        if (threeDotsLoadingView != null && threeDotsLoadingView.isShown()) {
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.t0(appBrandLauncherRecentsList);
            return;
        }
        com.tencent.mm.plugin.appbrand.ui.recents.a2 a2Var = appBrandLauncherRecentsList.I;
        if (a2Var.f90029u) {
            a2Var.I(new com.tencent.mm.plugin.appbrand.ui.recents.t(this));
        }
    }
}
