package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f90160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.w f90161e;

    public v(com.tencent.mm.plugin.appbrand.ui.recents.w wVar, java.util.ArrayList arrayList) {
        this.f90161e = wVar;
        this.f90160d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.w wVar = this.f90161e;
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = wVar.f90168e.f90013w;
        if (loadMoreRecyclerView != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(loadMoreRecyclerView)) {
                if (wVar.f90168e.f90013w.E0()) {
                    wVar.f90168e.B.obtainMessage(2, this).sendToTarget();
                } else {
                    com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.r0(wVar.f90168e, this.f90160d);
                }
            }
        }
    }
}
