package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.o1 f90087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.c0 f90088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90089f;

    public h0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var, androidx.recyclerview.widget.c0 c0Var) {
        this.f90089f = appBrandLauncherRecentsList;
        this.f90087d = o1Var;
        this.f90088e = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90089f;
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = appBrandLauncherRecentsList.f90013w;
        if (loadMoreRecyclerView == null || !loadMoreRecyclerView.f11907x) {
            return;
        }
        if (loadMoreRecyclerView.E0()) {
            com.tencent.mm.plugin.appbrand.ui.recents.r0 r0Var = appBrandLauncherRecentsList.B;
            r0Var.sendMessage(r0Var.obtainMessage(2, this));
            return;
        }
        appBrandLauncherRecentsList.f90017z.clear();
        appBrandLauncherRecentsList.f90017z.addAll(this.f90087d);
        com.tencent.mm.sdk.platformtools.u3.m(-8);
        this.f90088e.a(appBrandLauncherRecentsList.S);
    }
}
