package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class q extends com.tencent.mm.plugin.appbrand.ui.recents.RecentsRecyclerView {

    /* renamed from: i2, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90138i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, android.content.Context context) {
        super(context);
        this.f90138i2 = appBrandLauncherRecentsList;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView
    public androidx.recyclerview.widget.LinearLayoutManager l1() {
        return this.f90138i2.f90014x;
    }
}
