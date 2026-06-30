package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f90167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90168e;

    public w(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, long j17) {
        this.f90168e = appBrandLauncherRecentsList;
        this.f90167d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90168e;
        java.util.ArrayList a17 = appBrandLauncherRecentsList.f90004o.a(com.tencent.mm.plugin.appbrand.app.r9.hj().f76435f.a(this.f90167d, 32));
        com.tencent.mm.plugin.appbrand.ui.recents.r0 r0Var = appBrandLauncherRecentsList.B;
        int i17 = com.tencent.mm.plugin.appbrand.ui.recents.r0.f90142b;
        r0Var.a();
        com.tencent.mm.plugin.appbrand.ui.recents.r0 r0Var2 = appBrandLauncherRecentsList.B;
        r0Var2.sendMessage(r0Var2.obtainMessage(1, new com.tencent.mm.plugin.appbrand.ui.recents.v(this, a17)));
    }
}
