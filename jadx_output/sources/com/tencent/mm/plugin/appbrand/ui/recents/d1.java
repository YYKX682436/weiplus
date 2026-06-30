package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class d1 extends androidx.recyclerview.widget.w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90064d;

    public d1(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, com.tencent.mm.plugin.appbrand.ui.recents.b0 b0Var) {
        this.f90064d = appBrandLauncherRecentsList;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsListScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        boolean z17 = i17 == 2;
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90064d;
        appBrandLauncherRecentsList.L = z17;
        if (i17 == 0) {
            appBrandLauncherRecentsList.m0(this);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsListScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsListScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.u0(this.f90064d);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsListScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var;
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo i17;
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90064d;
        if (appBrandLauncherRecentsList.f90013w == null || (linearLayoutManager = appBrandLauncherRecentsList.f90014x) == null || appBrandLauncherRecentsList.f90016y == null || appBrandLauncherRecentsList.D == null) {
            return;
        }
        int y17 = appBrandLauncherRecentsList.f90014x.y();
        for (int w17 = linearLayoutManager.w(); w17 <= y17; w17++) {
            androidx.recyclerview.widget.k3 p07 = appBrandLauncherRecentsList.f90013w.p0(w17);
            if ((p07 instanceof com.tencent.mm.plugin.appbrand.ui.recents.c1) && (i17 = (c1Var = (com.tencent.mm.plugin.appbrand.ui.recents.c1) p07).i()) != null) {
                appBrandLauncherRecentsList.D.b(c1Var, i17.f76357y);
            }
        }
    }
}
