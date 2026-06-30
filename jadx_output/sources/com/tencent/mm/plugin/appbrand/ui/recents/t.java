package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class t implements androidx.recyclerview.widget.k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.u f90152a;

    public t(com.tencent.mm.plugin.appbrand.ui.recents.u uVar) {
        this.f90152a = uVar;
    }

    @Override // androidx.recyclerview.widget.k2
    public void a() {
        com.tencent.mm.plugin.appbrand.ui.recents.u uVar = this.f90152a;
        uVar.f90157a.I.J(this);
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = uVar.f90157a;
        com.tencent.mm.ui.widget.ThreeDotsLoadingView threeDotsLoadingView = appBrandLauncherRecentsList.H.f90076b;
        if (threeDotsLoadingView != null && threeDotsLoadingView.isShown()) {
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.t0(appBrandLauncherRecentsList);
        }
    }
}
