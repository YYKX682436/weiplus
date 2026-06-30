package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public class k extends com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Class f170610h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Class f170611i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Class f170612j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Class f170613k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Class f170614l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f170615m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f170616n;

    public k(java.lang.Class uiClass, java.lang.Class pluginUIClass, java.lang.Class keepAliveServiceClass, java.lang.Class foregroundServiceClass, java.lang.Class processTriggerServiceClass, java.lang.Class preLoadingUIClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiClass, "uiClass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginUIClass, "pluginUIClass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keepAliveServiceClass, "keepAliveServiceClass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(foregroundServiceClass, "foregroundServiceClass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processTriggerServiceClass, "processTriggerServiceClass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preLoadingUIClass, "preLoadingUIClass");
        this.f170610h = uiClass;
        this.f170611i = pluginUIClass;
        this.f170612j = foregroundServiceClass;
        this.f170613k = processTriggerServiceClass;
        this.f170614l = preLoadingUIClass;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h
    public void m() {
        android.app.ActivityManager activityManager;
        android.content.pm.PackageManager packageManager;
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        android.content.ComponentName component;
        java.lang.Object m143895xf1229813;
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = ((android.app.ActivityManager) systemService).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            android.app.ActivityManager.RunningAppProcessInfo next = it.next();
            java.lang.String str = next.processName;
            if (str != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, i())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageMiniProgramProcess", "killProcess " + next.processName + " pid:" + next.pid);
                try {
                    int i17 = next.pid;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/luggage/sdk/processes/LuggageMiniProgramProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/luggage/sdk/processes/LuggageMiniProgramProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    break;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LuggageMiniProgramProcess", "killProcess " + next.processName + " pid:" + next.pid + " error:" + e17.getMessage());
                }
            }
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(365L, 5L, 1L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2 g2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156622d;
        java.lang.String i18 = i();
        g2Var.getClass();
        if ((i18 == null || i18.length() == 0) || (activityManager = (android.app.ActivityManager) b3.l.m9714xac92a5d0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.app.ActivityManager.class)) == null || (packageManager = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager()) == null || (appTasks = activityManager.getAppTasks()) == null) {
            return;
        }
        for (android.app.ActivityManager.AppTask appTask : appTasks) {
            try {
                android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                java.lang.String Di = taskInfo != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156622d.Di(taskInfo) : null;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.s1.f156801a.a(appTask) && (component = appTask.getTaskInfo().baseIntent.getComponent()) != null) {
                    android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(component, 128);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityInfo, "getActivityInfo(...)");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityInfo.processName, i18)) {
                        try {
                            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                            appTask.finishAndRemoveTask();
                            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE);
                        } catch (java.lang.Throwable th6) {
                            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandZombieTaskKiller", "forceKillAppBrandTaskForProcess(" + i18 + ") kill AppBrand task:" + Di + ", result:" + ((java.lang.Object) p3321xbce91901.C29043x91b2b43d.m143904x7003d4e1(m143895xf1229813)));
                    }
                }
            } catch (java.lang.RuntimeException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandZombieTaskKiller", "forceKillAppBrandTaskForProcess(" + i18 + ") dump task failed " + e18);
            }
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h
    public void o(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s record) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramProcess", "sendFinishMessage record:" + record + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h.q(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12606x6310078e(record.f129217a, record.f129224h, false), null, 2, null);
    }

    public final long v() {
        java.lang.Object obj;
        java.util.Iterator it = this.f129173a.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) next;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(sVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
                long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o) sVar).f170641l;
                do {
                    java.lang.Object next2 = it.next();
                    com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar2 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) next2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(sVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
                    long j18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o) sVar2).f170641l;
                    if (j17 < j18) {
                        next = next2;
                        j17 = j18;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar3 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) obj;
        if (sVar3 != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o) sVar3).f170641l;
        }
        return 0L;
    }
}
