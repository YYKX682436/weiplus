package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class i0 implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90091a;

    public i0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f90091a = appBrandLauncherRecentsList;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        this.f90091a.f90016y.notifyItemRangeChanged(i17, i18, obj);
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        this.f90091a.f90016y.notifyItemRangeInserted(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90091a;
        appBrandLauncherRecentsList.T.f90149a.I.f90028t = true;
        appBrandLauncherRecentsList.f90016y.notifyItemRangeRemoved(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90091a;
        appBrandLauncherRecentsList.T.f90149a.I.f90028t = true;
        appBrandLauncherRecentsList.f90016y.notifyItemMoved(i17, i18);
    }
}
