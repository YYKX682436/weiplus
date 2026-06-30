package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f90174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f90175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.a0 f90176f;

    public z(com.tencent.mm.plugin.appbrand.ui.recents.a0 a0Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f90176f = a0Var;
        this.f90174d = arrayList;
        this.f90175e = arrayList2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.a0 a0Var = this.f90176f;
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = a0Var.f90022d;
        int i17 = com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.f89998y0;
        appBrandLauncherRecentsList.getClass();
        k91.k4 g17 = k91.k4.g();
        com.tencent.mm.sdk.platformtools.n3 n3Var = appBrandLauncherRecentsList.A;
        g17.f305556d.add(n3Var.getSerial(), appBrandLauncherRecentsList.W);
        com.tencent.mm.plugin.appbrand.app.r9.hj().add(n3Var.getSerial(), appBrandLauncherRecentsList.V);
        if (appBrandLauncherRecentsList.f90001i) {
            ((com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)).add(n3Var.getSerial(), appBrandLauncherRecentsList.U);
        }
        appBrandLauncherRecentsList.f90005p.add(n3Var.getSerial(), appBrandLauncherRecentsList.X);
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.q0(a0Var.f90022d, this.f90174d, this.f90175e, false);
    }
}
