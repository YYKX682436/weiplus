package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f90132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.p0 f90133e;

    public o0(com.tencent.mm.plugin.appbrand.ui.recents.p0 p0Var, java.util.ArrayList arrayList) {
        this.f90133e = p0Var;
        this.f90132d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.p0 p0Var = this.f90133e;
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = p0Var.f90137d.f90013w;
        if (loadMoreRecyclerView == null || !loadMoreRecyclerView.f11907x) {
            return;
        }
        if (!loadMoreRecyclerView.E0()) {
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.r0(p0Var.f90137d, this.f90132d);
        } else {
            com.tencent.mm.plugin.appbrand.ui.recents.r0 r0Var = p0Var.f90137d.B;
            r0Var.sendMessage(r0Var.obtainMessage(2, this));
        }
    }
}
