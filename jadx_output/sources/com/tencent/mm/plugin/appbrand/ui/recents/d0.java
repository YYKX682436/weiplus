package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.o1 f90061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.o1 f90062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90063f;

    public d0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var, com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var2) {
        this.f90063f = appBrandLauncherRecentsList;
        this.f90061d = o1Var;
        this.f90062e = o1Var2;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.c0 a17 = androidx.recyclerview.widget.h0.a(new com.tencent.mm.plugin.appbrand.ui.recents.p1(this.f90061d, this.f90062e), false);
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90063f;
        com.tencent.mm.plugin.appbrand.ui.recents.r0 r0Var = appBrandLauncherRecentsList.B;
        int i17 = com.tencent.mm.plugin.appbrand.ui.recents.r0.f90142b;
        r0Var.a();
        com.tencent.mm.plugin.appbrand.ui.recents.r0 r0Var2 = appBrandLauncherRecentsList.B;
        r0Var2.sendMessage(r0Var2.obtainMessage(1, new com.tencent.mm.plugin.appbrand.ui.recents.c0(this, a17)));
    }
}
