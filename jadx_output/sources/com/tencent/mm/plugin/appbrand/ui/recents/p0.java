package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class p0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90137d;

    public p0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f90137d = appBrandLauncherRecentsList;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90137d;
        try {
            java.lang.Object obj = w0Var.f316976d;
            if (obj == null || !(obj instanceof java.lang.Long)) {
                return;
            }
            java.util.concurrent.atomic.AtomicLong atomicLong = appBrandLauncherRecentsList.f90008r;
            com.tencent.mm.plugin.appbrand.ui.recents.r0 r0Var = appBrandLauncherRecentsList.B;
            long j17 = atomicLong.get();
            long j18 = appBrandLauncherRecentsList.f90009s.get();
            java.lang.Object obj2 = w0Var.f316976d;
            boolean equals = obj2.equals(java.lang.Long.valueOf(j17));
            java.util.concurrent.atomic.AtomicLong atomicLong2 = appBrandLauncherRecentsList.f90011u;
            java.util.ArrayList a17 = equals ? com.tencent.mm.plugin.appbrand.app.r9.hj().f76435f.a(com.tencent.wcdb.core.Database.DictDefaultMatchValue, 32) : com.tencent.mm.plugin.appbrand.app.r9.hj().f76435f.a(atomicLong2.get(), 32);
            if (!com.tencent.mm.sdk.platformtools.t8.L0(a17)) {
                atomicLong2.set(((com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) a17.get(a17.size() - 1)).C);
            }
            appBrandLauncherRecentsList.f90004o.getClass();
            if (w0Var.f316976d.equals(java.lang.Long.valueOf(j17))) {
                appBrandLauncherRecentsList.n0(new com.tencent.mm.plugin.appbrand.ui.recents.n0(this, appBrandLauncherRecentsList.f90002m ? new java.util.ArrayList(0) : appBrandLauncherRecentsList.f90001i ? com.tencent.mm.plugin.appbrand.app.r9.cj().u0(-1, com.tencent.mm.plugin.appbrand.appusage.y5.ASC) : null, a17));
            } else if (w0Var.f316976d.equals(java.lang.Long.valueOf(j18))) {
                int i17 = com.tencent.mm.plugin.appbrand.ui.recents.r0.f90142b;
                r0Var.a();
                r0Var.sendMessage(r0Var.obtainMessage(1, new com.tencent.mm.plugin.appbrand.ui.recents.o0(this, a17)));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLauncherRecentsList", "onPagingDataBack e %s", e17);
        }
    }
}
