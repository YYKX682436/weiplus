package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

@j95.b
/* loaded from: classes7.dex */
public final class g2 extends i95.w implements ft.h4 {

    /* renamed from: q, reason: collision with root package name */
    public static long f156632q;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2 f156622d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2();

    /* renamed from: e, reason: collision with root package name */
    public static final long f156623e = java.util.concurrent.TimeUnit.MINUTES.toMillis(1);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f156624f = true;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f156625g = true;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f156626h = true;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f156627i = true;

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f156628m = true;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f156629n = true;

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f156630o = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f156631p = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: r, reason: collision with root package name */
    public static final x.d f156633r = new x.d(0);

    /* renamed from: s, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p794xb0fa9b5e.s0 f156634s = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.e2.f156595a;

    public static final java.lang.Integer Ai(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2 g2Var, android.app.ActivityManager.AppTask appTask) {
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

    public static final void Ui(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (!f156630o.getAndSet(true)) {
            f156622d.Ri();
        }
        if (f156627i && !f156631p.getAndSet(true)) {
            java.lang.String[] strArr = gm0.j1.f354738l;
            for (int i17 = 0; i17 < 5; i17++) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + strArr[i17], f156634s);
            }
        }
        if (scene != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t1.f156818i) {
            long j17 = f156632q;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (android.os.SystemClock.elapsedRealtime() - j17 < f156623e) {
                return;
            }
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        f156632q = android.os.SystemClock.elapsedRealtime();
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.f2(scene), "MicroMsg.AppBrandZombieTaskKiller");
    }

    public static final void wi(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2 g2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t1 t1Var) {
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        java.lang.Object m143895xf1229813;
        g2Var.getClass();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) b3.l.m9714xac92a5d0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.app.ActivityManager.class);
        int i17 = 0;
        if (activityManager != null && (appTasks = activityManager.getAppTasks()) != null) {
            for (android.app.ActivityManager.AppTask appTask : appTasks) {
                android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                java.lang.String Di = taskInfo != null ? f156622d.Di(taskInfo) : null;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.s1.f156801a.a(appTask)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.y1.f156874a.getClass();
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.y1) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.x1.f156870b).mo141623x754a37bb()).a(appTask)) {
                        try {
                            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                            appTask.finishAndRemoveTask();
                            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE);
                        } catch (java.lang.Throwable th6) {
                            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandZombieTaskKiller", "kill ZombieTask:" + Di + ", result:" + ((java.lang.Object) p3321xbce91901.C29043x91b2b43d.m143904x7003d4e1(m143895xf1229813)));
                        i17++;
                    }
                }
            }
        }
        if (i17 > 0) {
            g2Var.Vi(t1Var, i17);
        }
    }

    public final void Bi(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 cfg, java.lang.String str) {
        java.lang.Object m143895xf1229813;
        android.content.Intent intent;
        android.content.ComponentName component;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cfg, "cfg");
        if (!f156630o.getAndSet(true)) {
            Ri();
        }
        if (f156629n) {
            try {
                android.app.ActivityManager activityManager = (android.app.ActivityManager) b3.l.m9714xac92a5d0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.app.ActivityManager.class);
                java.util.List<android.app.ActivityManager.AppTask> appTasks = activityManager != null ? activityManager.getAppTasks() : null;
                if (appTasks == null) {
                    appTasks = kz5.p0.f395529d;
                }
                for (android.app.ActivityManager.AppTask appTask : appTasks) {
                    android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, (taskInfo == null || (intent = taskInfo.baseIntent) == null || (component = intent.getComponent()) == null) ? null : component.getClassName())) {
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.s1.f156801a.a(appTask)) {
                            android.app.ActivityManager.RecentTaskInfo taskInfo2 = appTask.getTaskInfo();
                            java.lang.String Di = taskInfo2 != null ? Di(taskInfo2) : null;
                            try {
                                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                appTask.finishAndRemoveTask();
                                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE);
                            } catch (java.lang.Throwable th6) {
                                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandZombieTaskKiller", "checkIfKillZombieTaskBeforeStartAppBrandUI for appId:" + cfg.f158811d + ", kill ZombieTask:" + Di + ", result:" + ((java.lang.Object) p3321xbce91901.C29043x91b2b43d.m143904x7003d4e1(m143895xf1229813)));
                            Vi(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t1.f156820n, 1);
                            return;
                        }
                        return;
                    }
                }
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandZombieTaskKiller", "checkIfKillZombieTaskBeforeStartAppBrandUI for appId:" + cfg.f158811d + ", detect ZombieTask get exception:" + android.util.Log.getStackTraceString(th7));
            }
        }
    }

    public final java.lang.String Di(android.app.ActivityManager.RecentTaskInfo recentTaskInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            java.lang.String obj = recentTaskInfo.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            return obj;
        }
        try {
            return "RecentTaskInfo{id=" + recentTaskInfo.id + " persistentId=" + recentTaskInfo.persistentId + " baseIntent=" + recentTaskInfo.baseIntent + " baseActivity=" + recentTaskInfo.baseActivity + " topActivity=" + recentTaskInfo.topActivity + " origActivity=" + recentTaskInfo.origActivity + " numActivities=" + recentTaskInfo.numActivities + '}';
        } catch (java.lang.Throwable unused) {
            java.lang.String obj2 = recentTaskInfo.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
            return obj2;
        }
    }

    public void Ni(java.lang.String str) {
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        java.lang.Object m143895xf1229813;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) b3.l.m9714xac92a5d0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.app.ActivityManager.class);
        if (activityManager == null || (appTasks = activityManager.getAppTasks()) == null) {
            return;
        }
        for (android.app.ActivityManager.AppTask appTask : appTasks) {
            try {
                android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                java.lang.String Di = taskInfo != null ? f156622d.Di(taskInfo) : null;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.s1.f156801a.a(appTask)) {
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        appTask.finishAndRemoveTask();
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE);
                    } catch (java.lang.Throwable th6) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandZombieTaskKiller", "kill AppBrand task:" + Di + " for " + str + ", result:" + ((java.lang.Object) p3321xbce91901.C29043x91b2b43d.m143904x7003d4e1(m143895xf1229813)));
                }
            } catch (java.lang.RuntimeException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandZombieTaskKiller", "forceKillAllAppBrandTasks(" + str + ") dump task failed " + e17);
            }
        }
    }

    public final void Ri() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f156630o;
        try {
            f156629n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_appbrand_check_kill_zombie_task_before_start_ui, f156629n);
        } finally {
            atomicBoolean.set(true);
        }
    }

    public final void Vi(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t1 t1Var, int i17) {
        int i18 = t1Var.f156822d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandZombieTaskKiller", "reportIDKey ID:1761, key:" + i18 + ", count:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C((long) 1761, (long) i18, (long) i17);
    }
}
