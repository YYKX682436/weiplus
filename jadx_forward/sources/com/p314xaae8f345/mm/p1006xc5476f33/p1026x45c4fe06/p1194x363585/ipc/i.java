package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc;

/* loaded from: classes7.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.i f170602d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.i();

    @Override // java.lang.Runnable
    public final void run() {
        jx3.f.INSTANCE.mo68477x336bdfd8(365L, 5L, 1L, false);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r0.f156776h;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d.f(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g0.f169378a.c("cleanupAndSuicideInWorker", false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandProcessSuicideLogic", e17, "sendKV", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
