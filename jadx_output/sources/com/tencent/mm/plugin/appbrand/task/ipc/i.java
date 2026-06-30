package com.tencent.mm.plugin.appbrand.task.ipc;

/* loaded from: classes7.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.task.ipc.i f89069d = new com.tencent.mm.plugin.appbrand.task.ipc.i();

    @Override // java.lang.Runnable
    public final void run() {
        jx3.f.INSTANCE.idkeyStat(365L, 5L, 1L, false);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.tencent.mm.plugin.appbrand.app.r0.f75243h;
        try {
            com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.d();
            com.tencent.mm.plugin.appbrand.report.d.f(true);
            com.tencent.mm.plugin.appbrand.report.g0.f87845a.c("cleanupAndSuicideInWorker", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandProcessSuicideLogic", e17, "sendKV", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.appenderFlushSync();
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/task/ipc/AppBrandKillByClientMessage$silentKill$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/plugin/appbrand/task/ipc/AppBrandKillByClientMessage$silentKill$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/task/ipc/AppBrandKillByClientMessage$silentKill$1", "run", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/mm/plugin/appbrand/task/ipc/AppBrandKillByClientMessage$silentKill$1", "run", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
