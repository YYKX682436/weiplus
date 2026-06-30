package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public final class r0 extends ik1.a {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f156776h = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r0 f156777i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r0();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f156778d = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f156779e = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f156780f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public boolean f156781g = false;

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11568x8734bb7d c11568x8734bb7d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11568x8734bb7d();
        c11568x8734bb7d.f156526f = bm5.f1.a();
        android.util.Pair E7 = activityC12666xc288131a.E7(activityC12666xc288131a.getIntent());
        c11568x8734bb7d.f156527g = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) E7.first;
        c11568x8734bb7d.f156528h = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559) E7.second;
        c11568x8734bb7d.f156529i = str;
        c11568x8734bb7d.s();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "rebootProcessAndTask", "(Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUI;Ljava/lang/String;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "rebootProcessAndTask", "(Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUI;Ljava/lang/String;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "rebootProcessAndTask", "(Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUI;Ljava/lang/String;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "rebootProcessAndTask", "(Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUI;Ljava/lang/String;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    public static void c(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.v0 v0Var) {
        java.util.Iterator it = ((java.util.HashSet) f156777i.f156780f).iterator();
        while (it.hasNext()) {
            android.app.Activity activity = (android.app.Activity) it.next();
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) {
                activity.finish();
            }
        }
        ((ku5.t0) ku5.t0.f394148d).b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.app.r0$$c
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r0.f156777i.a(null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.v0.this);
            }
        }, "MicroMsg.AppBrandProcessSuicideLogic");
    }

    public final void a(java.lang.Class cls, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.v0 reason) {
        boolean z17;
        int b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.b0(((km0.c) gm0.j1.p().a()).f390522c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandReporterManager", "report now process mem : %d", java.lang.Integer.valueOf(b07));
        int i17 = b07 <= 90 ? 2 : b07 <= 130 ? 3 : b07 <= 170 ? 4 : b07 <= 210 ? 5 : 6;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(386L, 1L, 1L, false);
        g0Var.mo68477x336bdfd8(386L, i17, 1L, false);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d.f(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g0.f169378a.c("cleanupAndSuicideInWorker", false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandProcessSuicideLogic", e17, "sendKV", new java.lang.Object[0]);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159116c) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker, lastActivity:%s, reason:%s, skip for main process.", cls, reason);
            return;
        }
        if (bm5.f1.a().endsWith("appbrand1") && com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229370b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker, but mb2.0 is running, lastActivity:%s, reason: %s", cls, reason);
            this.f156781g = true;
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.v0.MB_2_0_RUNTIME_DESTROYED == reason) {
            if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8() && !com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495.mo40965x320351f8() && !this.f156781g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker, mb2.0 is no longer alive, but no other attempts produced before, skip for %s", reason);
                return;
            }
            this.f156781g = false;
        }
        boolean z18 = !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v1.f172173a.isEmpty();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.e.f156591a == null || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.e.f156592b == null) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.f.a((android.app.Application) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessSuicideLogic.ActivityThreadHackDetector", "hack ActivityThread failed %s", th6);
            }
        }
        android.os.Handler handler = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.e.f156592b;
        boolean z19 = handler != null && (handler.hasMessages(100) || handler.hasMessages(126) || ((android.os.Build.VERSION.SDK_INT == 28 && handler.hasMessages(160)) || handler.hasMessages(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de)));
        java.util.LinkedHashMap linkedHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f165742b;
        synchronized (linkedHashMap) {
            java.util.Iterator it = linkedHashMap.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) it.next();
                if (o6Var != null && o6Var.N0()) {
                    z17 = true;
                    break;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, dump DataCenter %s", c01.n2.d().m13882x9616526c());
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = cls == null ? "null" : cls.getName();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, last activity is %s", objArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, mActivityRecreatingByConfigurationChanged %B", java.lang.Boolean.valueOf(this.f156779e.get()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, hasPersistentRuntimes %B", java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, hasPendingLaunchActivity %B", java.lang.Boolean.valueOf(z19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, isWxAssistantRunning %B", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, activity count %d", java.lang.Integer.valueOf(this.f156778d.get()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
        if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301726q) {
            com.p314xaae8f345.p3210x3857dc.d.g().mo120241x5d03b04();
        }
        if (this.f156779e.get() || z18 || z19 || z17 || this.f156778d.get() > 0) {
            return;
        }
        if (com.p314xaae8f345.mm.p794xb0fa9b5e.d0.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a) && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.a.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "ble isKeepingAlive, skip suicide");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11846xc90653fd c11846xc90653fd = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.f.f159273a;
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.f.f159273a);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.DebuggerShellClientProcessHelper", "unregisterReceiver get exception " + th7);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.m()) {
            java.lang.String a17 = bm5.f1.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getProcessName(...)");
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            uk0.a.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12613xc3a4304e(a17, java.lang.System.currentTimeMillis(), reason.f156845d), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.s(), null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker", "(Ljava/lang/Class;Lcom/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic$SUICIDE_REASON;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker", "(Ljava/lang/Class;Lcom/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic$SUICIDE_REASON;)V", "java/lang/System_EXEC_", "exit", "(I)V");
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.f156779e.set(false);
        if (((java.util.HashSet) this.f156780f).add(activity)) {
            this.f156778d.incrementAndGet();
        }
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if ((((java.util.HashSet) this.f156780f).remove(activity) ? this.f156778d.decrementAndGet() : this.f156778d.get()) == 0) {
            ((ku5.t0) ku5.t0.f394148d).b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.s0(this, activity.getClass()), "MicroMsg.AppBrandProcessSuicideLogic");
        }
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) && activity.isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g0.f169378a.c("onActivityStopped", false);
        }
    }
}
