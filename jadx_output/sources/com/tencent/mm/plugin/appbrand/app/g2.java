package com.tencent.mm.plugin.appbrand.app;

@j95.b
/* loaded from: classes7.dex */
public final class g2 extends i95.w implements ft.h4 {

    /* renamed from: q, reason: collision with root package name */
    public static long f75099q;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.app.g2 f75089d = new com.tencent.mm.plugin.appbrand.app.g2();

    /* renamed from: e, reason: collision with root package name */
    public static final long f75090e = java.util.concurrent.TimeUnit.MINUTES.toMillis(1);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f75091f = true;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f75092g = true;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f75093h = true;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f75094i = true;

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f75095m = true;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f75096n = true;

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f75097o = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f75098p = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: r, reason: collision with root package name */
    public static final x.d f75100r = new x.d(0);

    /* renamed from: s, reason: collision with root package name */
    public static final com.tencent.mm.ipcinvoker.s0 f75101s = com.tencent.mm.plugin.appbrand.app.e2.f75062a;

    public static final java.lang.Integer Ai(com.tencent.mm.plugin.appbrand.app.g2 g2Var, android.app.ActivityManager.AppTask appTask) {
        g2Var.getClass();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
            if (taskInfo != null) {
                return java.lang.Integer.valueOf(taskInfo.taskId);
            }
        } else {
            android.app.ActivityManager.RecentTaskInfo taskInfo2 = appTask.getTaskInfo();
            if (taskInfo2 != null) {
                return java.lang.Integer.valueOf(taskInfo2.id);
            }
        }
        return null;
    }

    public static final void Ui(com.tencent.mm.plugin.appbrand.app.t1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        if (!f75097o.getAndSet(true)) {
            f75089d.Ri();
        }
        if (f75094i && !f75098p.getAndSet(true)) {
            java.lang.String[] strArr = gm0.j1.f273205l;
            for (int i17 = 0; i17 < 5; i17++) {
                com.tencent.mm.ipcinvoker.d0.a(com.tencent.mm.sdk.platformtools.x2.f193072b + strArr[i17], f75101s);
            }
        }
        if (scene != com.tencent.mm.plugin.appbrand.app.t1.f75285i) {
            long j17 = f75099q;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (android.os.SystemClock.elapsedRealtime() - j17 < f75090e) {
                return;
            }
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        f75099q = android.os.SystemClock.elapsedRealtime();
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.app.f2(scene), "MicroMsg.AppBrandZombieTaskKiller");
    }

    public static final void wi(com.tencent.mm.plugin.appbrand.app.g2 g2Var, com.tencent.mm.plugin.appbrand.app.t1 t1Var) {
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        java.lang.Object m521constructorimpl;
        g2Var.getClass();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) b3.l.getSystemService(com.tencent.mm.sdk.platformtools.x2.f193071a, android.app.ActivityManager.class);
        int i17 = 0;
        if (activityManager != null && (appTasks = activityManager.getAppTasks()) != null) {
            for (android.app.ActivityManager.AppTask appTask : appTasks) {
                android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                java.lang.String Di = taskInfo != null ? f75089d.Di(taskInfo) : null;
                if (com.tencent.mm.plugin.appbrand.app.s1.f75268a.a(appTask)) {
                    com.tencent.mm.plugin.appbrand.app.y1.f75341a.getClass();
                    if (((com.tencent.mm.plugin.appbrand.app.y1) ((jz5.n) com.tencent.mm.plugin.appbrand.app.x1.f75337b).getValue()).a(appTask)) {
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            appTask.finishAndRemoveTask();
                            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE);
                        } catch (java.lang.Throwable th6) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandZombieTaskKiller", "kill ZombieTask:" + Di + ", result:" + ((java.lang.Object) kotlin.Result.m529toStringimpl(m521constructorimpl)));
                        i17++;
                    }
                }
            }
        }
        if (i17 > 0) {
            g2Var.Vi(t1Var, i17);
        }
    }

    public final void Bi(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC cfg, java.lang.String str) {
        java.lang.Object m521constructorimpl;
        android.content.Intent intent;
        android.content.ComponentName component;
        kotlin.jvm.internal.o.g(cfg, "cfg");
        if (!f75097o.getAndSet(true)) {
            Ri();
        }
        if (f75096n) {
            try {
                android.app.ActivityManager activityManager = (android.app.ActivityManager) b3.l.getSystemService(com.tencent.mm.sdk.platformtools.x2.f193071a, android.app.ActivityManager.class);
                java.util.List<android.app.ActivityManager.AppTask> appTasks = activityManager != null ? activityManager.getAppTasks() : null;
                if (appTasks == null) {
                    appTasks = kz5.p0.f313996d;
                }
                for (android.app.ActivityManager.AppTask appTask : appTasks) {
                    android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                    if (kotlin.jvm.internal.o.b(str, (taskInfo == null || (intent = taskInfo.baseIntent) == null || (component = intent.getComponent()) == null) ? null : component.getClassName())) {
                        if (com.tencent.mm.plugin.appbrand.app.s1.f75268a.a(appTask)) {
                            android.app.ActivityManager.RecentTaskInfo taskInfo2 = appTask.getTaskInfo();
                            java.lang.String Di = taskInfo2 != null ? Di(taskInfo2) : null;
                            try {
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                appTask.finishAndRemoveTask();
                                m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE);
                            } catch (java.lang.Throwable th6) {
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandZombieTaskKiller", "checkIfKillZombieTaskBeforeStartAppBrandUI for appId:" + cfg.f77278d + ", kill ZombieTask:" + Di + ", result:" + ((java.lang.Object) kotlin.Result.m529toStringimpl(m521constructorimpl)));
                            Vi(com.tencent.mm.plugin.appbrand.app.t1.f75287n, 1);
                            return;
                        }
                        return;
                    }
                }
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandZombieTaskKiller", "checkIfKillZombieTaskBeforeStartAppBrandUI for appId:" + cfg.f77278d + ", detect ZombieTask get exception:" + android.util.Log.getStackTraceString(th7));
            }
        }
    }

    public final java.lang.String Di(android.app.ActivityManager.RecentTaskInfo recentTaskInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            java.lang.String obj = recentTaskInfo.toString();
            kotlin.jvm.internal.o.d(obj);
            return obj;
        }
        try {
            return "RecentTaskInfo{id=" + recentTaskInfo.id + " persistentId=" + recentTaskInfo.persistentId + " baseIntent=" + recentTaskInfo.baseIntent + " baseActivity=" + recentTaskInfo.baseActivity + " topActivity=" + recentTaskInfo.topActivity + " origActivity=" + recentTaskInfo.origActivity + " numActivities=" + recentTaskInfo.numActivities + '}';
        } catch (java.lang.Throwable unused) {
            java.lang.String obj2 = recentTaskInfo.toString();
            kotlin.jvm.internal.o.d(obj2);
            return obj2;
        }
    }

    public void Ni(java.lang.String str) {
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        java.lang.Object m521constructorimpl;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) b3.l.getSystemService(com.tencent.mm.sdk.platformtools.x2.f193071a, android.app.ActivityManager.class);
        if (activityManager == null || (appTasks = activityManager.getAppTasks()) == null) {
            return;
        }
        for (android.app.ActivityManager.AppTask appTask : appTasks) {
            try {
                android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                java.lang.String Di = taskInfo != null ? f75089d.Di(taskInfo) : null;
                if (com.tencent.mm.plugin.appbrand.app.s1.f75268a.a(appTask)) {
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        appTask.finishAndRemoveTask();
                        m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE);
                    } catch (java.lang.Throwable th6) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandZombieTaskKiller", "kill AppBrand task:" + Di + " for " + str + ", result:" + ((java.lang.Object) kotlin.Result.m529toStringimpl(m521constructorimpl)));
                }
            } catch (java.lang.RuntimeException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandZombieTaskKiller", "forceKillAllAppBrandTasks(" + str + ") dump task failed " + e17);
            }
        }
    }

    public final void Ri() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f75097o;
        try {
            f75096n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_appbrand_check_kill_zombie_task_before_start_ui, f75096n);
        } finally {
            atomicBoolean.set(true);
        }
    }

    public final void Vi(com.tencent.mm.plugin.appbrand.app.t1 t1Var, int i17) {
        int i18 = t1Var.f75289d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandZombieTaskKiller", "reportIDKey ID:1761, key:" + i18 + ", count:" + i17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C((long) 1761, (long) i18, (long) i17);
    }
}
