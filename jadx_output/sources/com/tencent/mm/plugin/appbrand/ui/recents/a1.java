package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo f90023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f90024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90025f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.c1 f90026g;

    public a1(com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var, com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo, int i17, java.lang.String str) {
        this.f90026g = c1Var;
        this.f90023d = appBrandRecentTaskInfo;
        this.f90024e = i17;
        this.f90025f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo = this.f90023d;
        boolean z17 = appBrandRecentTaskInfo.B;
        int i18 = appBrandRecentTaskInfo.A;
        java.lang.String str = appBrandRecentTaskInfo.f76355w;
        com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var = this.f90026g;
        if (z17) {
            ((com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)).D0(str, i18, true);
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = c1Var.f90054p;
            if (!appBrandLauncherRecentsList.f90002m && appBrandLauncherRecentsList.f90001i) {
                com.tencent.mm.plugin.appbrand.app.r9.hj().m0(appBrandRecentTaskInfo.f76355w, appBrandRecentTaskInfo.A, false, 0, 2, null, false);
            }
            c1Var.f90054p.m0(new com.tencent.mm.plugin.appbrand.ui.recents.z0(this));
            i17 = 7;
        } else {
            int m07 = ((com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)).m0(str, i18, true);
            if (m07 == -2) {
                c1Var.f90054p.n0(new com.tencent.mm.plugin.appbrand.ui.recents.x0(this));
                return;
            } else if (m07 == -1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLauncherRecentsList", "addStarApp, username %s, type %d, fatal", str, java.lang.Integer.valueOf(i18));
                return;
            } else {
                c1Var.f90054p.m0(new com.tencent.mm.plugin.appbrand.ui.recents.y0(this));
                i17 = 6;
            }
        }
        com.tencent.mm.plugin.appbrand.report.y0.b(appBrandRecentTaskInfo, i17, this.f90024e, this.f90025f);
    }
}
