package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90022d;

    public a0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f90022d = appBrandLauncherRecentsList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String sb6;
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90022d;
        com.tencent.mm.plugin.appbrand.ui.recents.m1 m1Var = appBrandLauncherRecentsList.f90004o;
        java.util.ArrayList a17 = com.tencent.mm.plugin.appbrand.app.r9.hj().f76435f.a(com.tencent.wcdb.core.Database.DictDefaultMatchValue, 32);
        m1Var.getClass();
        int i17 = appBrandLauncherRecentsList.f89367e;
        java.lang.String str = appBrandLauncherRecentsList.f89368f;
        appBrandLauncherRecentsList.C.getClass();
        java.util.ArrayList arrayList = null;
        if (a17.size() <= 0) {
            sb6 = null;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            int i18 = 0;
            for (int i19 = 0; i19 < a17.size(); i19++) {
                java.lang.Object obj = a17.get(i19);
                if (obj instanceof com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) {
                    i18++;
                    sb7.append(((com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) obj).f76362e);
                    if (i18 == 20 || i18 >= a17.size()) {
                        break;
                    } else {
                        sb7.append(":#:");
                    }
                }
            }
            sb6 = sb7.toString();
        }
        com.tencent.mm.plugin.appbrand.appusage.f2[] f2VarArr = com.tencent.mm.plugin.appbrand.appusage.f2.f76431d;
        com.tencent.mm.plugin.appbrand.report.v0.c(i17, "", 0, sb6, 0, "", str);
        if (appBrandLauncherRecentsList.f90002m) {
            arrayList = new java.util.ArrayList(0);
        } else if (appBrandLauncherRecentsList.f90001i) {
            arrayList = ((com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)).u0(-1, com.tencent.mm.plugin.appbrand.appusage.y5.ASC);
        }
        appBrandLauncherRecentsList.n0(new com.tencent.mm.plugin.appbrand.ui.recents.z(this, arrayList, a17));
        com.tencent.mm.plugin.appbrand.appusage.c1.z0().s0(appBrandLauncherRecentsList.f90008r.get(), true, appBrandLauncherRecentsList.f90007q, appBrandLauncherRecentsList.f89999J, appBrandLauncherRecentsList.K);
        appBrandLauncherRecentsList.f90010t.set(true);
    }
}
