package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class j extends com.tencent.mm.app.w6 {
    @Override // com.tencent.mm.app.w6, com.tencent.mm.app.v6
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.appbrand.app.d dVar = com.tencent.mm.plugin.appbrand.app.d.f75045a;
        com.tencent.mars.xlog.Log.i("ActivityCrossProcessManager", "onActivityCreated " + activity + ' ');
        if (r26.n0.B(activity.getClass().getSimpleName(), "com.tencent.mm.ui.LauncherUI", false)) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
            kotlin.jvm.internal.o.f(runningAppProcesses, "getRunningAppProcesses(...)");
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (kotlin.jvm.internal.o.b(runningAppProcessInfo.processName, bm5.f1.a())) {
                    com.tencent.mm.plugin.appbrand.app.d.f75045a.a();
                } else {
                    com.tencent.mm.ipcinvoker.d0.d(runningAppProcessInfo.processName, new com.tencent.mm.ipcinvoker.type.IPCVoid(), com.tencent.mm.plugin.appbrand.ipc.f0.class, com.tencent.mm.plugin.appbrand.app.a.f75001d);
                }
            }
        }
        com.tencent.mm.plugin.appbrand.app.d.f75046b.addLast(new cf.a(activity, android.os.SystemClock.elapsedRealtime()));
    }

    @Override // com.tencent.mm.app.w6, com.tencent.mm.app.v6
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.appbrand.app.d dVar = com.tencent.mm.plugin.appbrand.app.d.f75045a;
        com.tencent.mars.xlog.Log.i("ActivityCrossProcessManager", "onActivityDestroy " + activity + ' ');
        com.tencent.mm.plugin.appbrand.app.d.f75046b.removeIf(new com.tencent.mm.plugin.appbrand.app.b(activity));
    }
}
