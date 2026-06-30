package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f90290d;

    public w3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        this.f90290d = appBrandDebugUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            java.util.ArrayList<android.app.ActivityManager.RunningAppProcessInfo> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : runningAppProcesses) {
                java.lang.String processName = ((android.app.ActivityManager.RunningAppProcessInfo) obj).processName;
                kotlin.jvm.internal.o.f(processName, "processName");
                if (r26.i0.y(processName, "com.tencent.mm", false)) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList<jz5.l> arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
                arrayList2.add(new jz5.l(runningAppProcessInfo.processName, java.lang.Integer.valueOf(runningAppProcessInfo.pid)));
            }
            for (jz5.l lVar : arrayList2) {
                com.tencent.mm.plugin.appbrand.utils.a5.a((java.lang.String) lVar.f302833d, ((java.lang.Number) lVar.f302834e).intValue(), true, true);
            }
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f90290d;
            if (((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.ui.u3(appBrandDebugUI)) != null) {
                return;
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.ui.v3(this.f90290d));
    }
}
