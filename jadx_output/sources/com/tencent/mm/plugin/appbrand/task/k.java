package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public class k extends com.tencent.luggage.sdk.processes.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Class f89077h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Class f89078i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Class f89079j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Class f89080k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Class f89081l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f89082m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f89083n;

    public k(java.lang.Class uiClass, java.lang.Class pluginUIClass, java.lang.Class keepAliveServiceClass, java.lang.Class foregroundServiceClass, java.lang.Class processTriggerServiceClass, java.lang.Class preLoadingUIClass) {
        kotlin.jvm.internal.o.g(uiClass, "uiClass");
        kotlin.jvm.internal.o.g(pluginUIClass, "pluginUIClass");
        kotlin.jvm.internal.o.g(keepAliveServiceClass, "keepAliveServiceClass");
        kotlin.jvm.internal.o.g(foregroundServiceClass, "foregroundServiceClass");
        kotlin.jvm.internal.o.g(processTriggerServiceClass, "processTriggerServiceClass");
        kotlin.jvm.internal.o.g(preLoadingUIClass, "preLoadingUIClass");
        this.f89077h = uiClass;
        this.f89078i = pluginUIClass;
        this.f89079j = foregroundServiceClass;
        this.f89080k = processTriggerServiceClass;
        this.f89081l = preLoadingUIClass;
    }

    @Override // com.tencent.luggage.sdk.processes.h
    public void m() {
        android.app.ActivityManager activityManager;
        android.content.pm.PackageManager packageManager;
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        android.content.ComponentName component;
        java.lang.Object m521constructorimpl;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = ((android.app.ActivityManager) systemService).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            android.app.ActivityManager.RunningAppProcessInfo next = it.next();
            java.lang.String str = next.processName;
            if (str != null && kotlin.jvm.internal.o.b(str, i())) {
                com.tencent.mars.xlog.Log.i("Luggage.LuggageMiniProgramProcess", "killProcess " + next.processName + " pid:" + next.pid);
                try {
                    int i17 = next.pid;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/luggage/sdk/processes/LuggageMiniProgramProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/luggage/sdk/processes/LuggageMiniProgramProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    break;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("Luggage.LuggageMiniProgramProcess", "killProcess " + next.processName + " pid:" + next.pid + " error:" + e17.getMessage());
                }
            }
        }
        jx3.f.INSTANCE.idkeyStat(365L, 5L, 1L, false);
        com.tencent.mm.plugin.appbrand.app.g2 g2Var = com.tencent.mm.plugin.appbrand.app.g2.f75089d;
        java.lang.String i18 = i();
        g2Var.getClass();
        if ((i18 == null || i18.length() == 0) || (activityManager = (android.app.ActivityManager) b3.l.getSystemService(com.tencent.mm.sdk.platformtools.x2.f193071a, android.app.ActivityManager.class)) == null || (packageManager = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager()) == null || (appTasks = activityManager.getAppTasks()) == null) {
            return;
        }
        for (android.app.ActivityManager.AppTask appTask : appTasks) {
            try {
                android.app.ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                java.lang.String Di = taskInfo != null ? com.tencent.mm.plugin.appbrand.app.g2.f75089d.Di(taskInfo) : null;
                if (com.tencent.mm.plugin.appbrand.app.s1.f75268a.a(appTask) && (component = appTask.getTaskInfo().baseIntent.getComponent()) != null) {
                    android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(component, 128);
                    kotlin.jvm.internal.o.f(activityInfo, "getActivityInfo(...)");
                    if (kotlin.jvm.internal.o.b(activityInfo.processName, i18)) {
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            appTask.finishAndRemoveTask();
                            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE);
                        } catch (java.lang.Throwable th6) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandZombieTaskKiller", "forceKillAppBrandTaskForProcess(" + i18 + ") kill AppBrand task:" + Di + ", result:" + ((java.lang.Object) kotlin.Result.m529toStringimpl(m521constructorimpl)));
                    }
                }
            } catch (java.lang.RuntimeException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandZombieTaskKiller", "forceKillAppBrandTaskForProcess(" + i18 + ") dump task failed " + e18);
            }
        }
    }

    @Override // com.tencent.luggage.sdk.processes.h
    public void o(com.tencent.luggage.sdk.processes.s record) {
        kotlin.jvm.internal.o.g(record, "record");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramProcess", "sendFinishMessage record:" + record + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.tencent.luggage.sdk.processes.h.q(this, new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandFinishMessage(record.f47684a, record.f47691h, false), null, 2, null);
    }

    public final long v() {
        java.lang.Object obj;
        java.util.Iterator it = this.f47640a.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                com.tencent.luggage.sdk.processes.s sVar = (com.tencent.luggage.sdk.processes.s) next;
                kotlin.jvm.internal.o.e(sVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
                long j17 = ((com.tencent.mm.plugin.appbrand.task.o) sVar).f89108l;
                do {
                    java.lang.Object next2 = it.next();
                    com.tencent.luggage.sdk.processes.s sVar2 = (com.tencent.luggage.sdk.processes.s) next2;
                    kotlin.jvm.internal.o.e(sVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
                    long j18 = ((com.tencent.mm.plugin.appbrand.task.o) sVar2).f89108l;
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
        com.tencent.luggage.sdk.processes.s sVar3 = (com.tencent.luggage.sdk.processes.s) obj;
        if (sVar3 != null) {
            return ((com.tencent.mm.plugin.appbrand.task.o) sVar3).f89108l;
        }
        return 0L;
    }
}
