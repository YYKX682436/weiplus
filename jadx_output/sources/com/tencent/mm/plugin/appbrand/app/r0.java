package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class r0 extends ik1.a {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f75243h = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.app.r0 f75244i = new com.tencent.mm.plugin.appbrand.app.r0();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f75245d = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f75246e = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f75247f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public boolean f75248g = false;

    public static void b(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$RebootProcessAndTask appBrandProcessSuicideLogic$RebootProcessAndTask = new com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$RebootProcessAndTask();
        appBrandProcessSuicideLogic$RebootProcessAndTask.f74993f = bm5.f1.a();
        android.util.Pair E7 = appBrandUI.E7(appBrandUI.getIntent());
        appBrandProcessSuicideLogic$RebootProcessAndTask.f74994g = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) E7.first;
        appBrandProcessSuicideLogic$RebootProcessAndTask.f74995h = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) E7.second;
        appBrandProcessSuicideLogic$RebootProcessAndTask.f74996i = str;
        appBrandProcessSuicideLogic$RebootProcessAndTask.s();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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

    public static void c(final com.tencent.mm.plugin.appbrand.app.v0 v0Var) {
        java.util.Iterator it = ((java.util.HashSet) f75244i.f75247f).iterator();
        while (it.hasNext()) {
            android.app.Activity activity = (android.app.Activity) it.next();
            if (activity instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) {
                activity.finish();
            }
        }
        ((ku5.t0) ku5.t0.f312615d).b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.app.r0$$c
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.app.r0.f75244i.a(null, com.tencent.mm.plugin.appbrand.app.v0.this);
            }
        }, "MicroMsg.AppBrandProcessSuicideLogic");
    }

    public final void a(java.lang.Class cls, com.tencent.mm.plugin.appbrand.app.v0 reason) {
        boolean z17;
        int b07 = com.tencent.mm.sdk.platformtools.t8.b0(((km0.c) gm0.j1.p().a()).f308989c);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandReporterManager", "report now process mem : %d", java.lang.Integer.valueOf(b07));
        int i17 = b07 <= 90 ? 2 : b07 <= 130 ? 3 : b07 <= 170 ? 4 : b07 <= 210 ? 5 : 6;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(386L, 1L, 1L, false);
        g0Var.idkeyStat(386L, i17, 1L, false);
        try {
            com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.d();
            com.tencent.mm.plugin.appbrand.report.d.f(true);
            com.tencent.mm.plugin.appbrand.report.g0.f87845a.c("cleanupAndSuicideInWorker", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandProcessSuicideLogic", e17, "sendKV", new java.lang.Object[0]);
        }
        if (com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d && com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77583c) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker, lastActivity:%s, reason:%s, skip for main process.", cls, reason);
            return;
        }
        if (bm5.f1.a().endsWith("appbrand1") && com.tencent.mm.plugin.magicbrush.a5.f147837b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker, but mb2.0 is running, lastActivity:%s, reason: %s", cls, reason);
            this.f75248g = true;
            return;
        }
        if (com.tencent.mm.plugin.appbrand.app.v0.MB_2_0_RUNTIME_DESTROYED == reason) {
            if (!com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground() && !com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.isBackground() && !this.f75248g) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker, mb2.0 is no longer alive, but no other attempts produced before, skip for %s", reason);
                return;
            }
            this.f75248g = false;
        }
        boolean z18 = !com.tencent.mm.plugin.appbrand.v1.f90640a.isEmpty();
        if (com.tencent.mm.plugin.appbrand.app.e.f75058a == null || com.tencent.mm.plugin.appbrand.app.e.f75059b == null) {
            try {
                com.tencent.mm.plugin.appbrand.app.f.a((android.app.Application) com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext());
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessSuicideLogic.ActivityThreadHackDetector", "hack ActivityThread failed %s", th6);
            }
        }
        android.os.Handler handler = com.tencent.mm.plugin.appbrand.app.e.f75059b;
        boolean z19 = handler != null && (handler.hasMessages(100) || handler.hasMessages(126) || ((android.os.Build.VERSION.SDK_INT == 28 && handler.hasMessages(160)) || handler.hasMessages(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX)));
        java.util.LinkedHashMap linkedHashMap = com.tencent.mm.plugin.appbrand.l.f84209b;
        synchronized (linkedHashMap) {
            java.util.Iterator it = linkedHashMap.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) it.next();
                if (o6Var != null && o6Var.N0()) {
                    z17 = true;
                    break;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, dump DataCenter %s", c01.n2.d().toString());
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = cls == null ? "null" : cls.getName();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, last activity is %s", objArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, mActivityRecreatingByConfigurationChanged %B", java.lang.Boolean.valueOf(this.f75246e.get()));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, hasPersistentRuntimes %B", java.lang.Boolean.valueOf(z18));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, hasPendingLaunchActivity %B", java.lang.Boolean.valueOf(z19));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, isWxAssistantRunning %B", java.lang.Boolean.valueOf(z17));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, activity count %d", java.lang.Integer.valueOf(this.f75245d.get()));
        com.tencent.mars.xlog.Log.appenderFlushSync();
        if (com.tencent.xweb.WebView.f220193q) {
            com.tencent.xweb.d.g().flush();
        }
        if (this.f75246e.get() || z18 || z19 || z17 || this.f75245d.get() > 0) {
            return;
        }
        if (com.tencent.mm.ipcinvoker.d0.g(com.tencent.mm.sdk.platformtools.w9.f193053a) && com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "ble isKeepingAlive, skip suicide");
            return;
        }
        com.tencent.mm.plugin.appbrand.debugger.DebuggerShellClientProcessHelper$receiver$1 debuggerShellClientProcessHelper$receiver$1 = com.tencent.mm.plugin.appbrand.debugger.f.f77740a;
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(com.tencent.mm.plugin.appbrand.debugger.f.f77740a);
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.DebuggerShellClientProcessHelper", "unregisterReceiver get exception " + th7);
        }
        kotlin.jvm.internal.o.g(reason, "reason");
        if (com.tencent.mm.sdk.platformtools.x2.m()) {
            java.lang.String a17 = bm5.f1.a();
            kotlin.jvm.internal.o.f(a17, "getProcessName(...)");
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            uk0.a.b(new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandProcessSuicideNotifyTask$Args(a17, java.lang.System.currentTimeMillis(), reason.f75312d), new com.tencent.mm.plugin.appbrand.task.ipc.s(), null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker", "(Ljava/lang/Class;Lcom/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic$SUICIDE_REASON;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker", "(Ljava/lang/Class;Lcom/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic$SUICIDE_REASON;)V", "java/lang/System_EXEC_", "exit", "(I)V");
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.f75246e.set(false);
        if (((java.util.HashSet) this.f75247f).add(activity)) {
            this.f75245d.incrementAndGet();
        }
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if ((((java.util.HashSet) this.f75247f).remove(activity) ? this.f75245d.decrementAndGet() : this.f75245d.get()) == 0) {
            ((ku5.t0) ku5.t0.f312615d).b(new com.tencent.mm.plugin.appbrand.app.s0(this, activity.getClass()), "MicroMsg.AppBrandProcessSuicideLogic");
        }
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        if ((activity instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) && activity.isFinishing()) {
            com.tencent.mm.plugin.appbrand.report.g0.f87845a.c("onActivityStopped", false);
        }
    }
}
