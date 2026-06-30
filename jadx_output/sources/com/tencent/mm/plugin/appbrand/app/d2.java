package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class d2 implements com.tencent.mm.plugin.appbrand.app.y1 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.app.d2 f75049b = new com.tencent.mm.plugin.appbrand.app.d2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f75050c = kz5.c1.k(new jz5.l(com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.class.getName(), ":appbrand0"), new jz5.l(com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI1.class.getName(), ":appbrand1"), new jz5.l(com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI2.class.getName(), ":appbrand2"), new jz5.l(com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI3.class.getName(), ":appbrand3"), new jz5.l(com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI4.class.getName(), ":appbrand4"));

    @Override // com.tencent.mm.plugin.appbrand.app.y1
    public boolean a(android.app.ActivityManager.AppTask appTask) {
        android.app.ActivityManager.RecentTaskInfo taskInfo;
        android.content.Intent intent;
        android.content.ComponentName component;
        android.app.ActivityManager activityManager;
        kotlin.jvm.internal.o.g(appTask, "appTask");
        if (!com.tencent.mm.plugin.appbrand.app.g2.f75094i) {
            return false;
        }
        try {
            taskInfo = appTask.getTaskInfo();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandZombieTaskKiller", "ZombieTaskPredicateForDeadProcess.isZombieTask get exception " + th6);
            return false;
        }
        if (taskInfo != null && (intent = taskInfo.baseIntent) != null && (component = intent.getComponent()) != null) {
            if (((java.lang.String) f75050c.get(component.getClassName())) != null) {
                if (!com.tencent.mm.plugin.appbrand.app.g2.f75095m) {
                    return false;
                }
                java.lang.Integer Ai = com.tencent.mm.plugin.appbrand.app.g2.Ai(com.tencent.mm.plugin.appbrand.app.g2.f75089d, appTask);
                if (Ai != null) {
                    int intValue = Ai.intValue();
                    x.d dVar = com.tencent.mm.plugin.appbrand.app.g2.f75100r;
                    synchronized (dVar) {
                        if (dVar.contains(java.lang.Integer.valueOf(intValue))) {
                            return false;
                        }
                    }
                }
                return !com.tencent.mm.sdk.platformtools.x2.o(com.tencent.mm.sdk.platformtools.x2.f193072b + r2);
            }
            android.content.pm.PackageManager packageManager = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager();
            if (packageManager == null || (activityManager = (android.app.ActivityManager) b3.l.getSystemService(com.tencent.mm.sdk.platformtools.x2.f193071a, android.app.ActivityManager.class)) == null) {
                return false;
            }
            android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(component, 128);
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            kotlin.jvm.internal.o.f(runningAppProcesses, "getRunningAppProcesses(...)");
            java.util.Iterator<T> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b(((android.app.ActivityManager.RunningAppProcessInfo) it.next()).processName, activityInfo.processName)) {
                    return false;
                }
            }
            try {
                android.app.ActivityManager.RecentTaskInfo taskInfo2 = appTask.getTaskInfo();
                if (taskInfo2 != null) {
                    android.content.ComponentName componentName = taskInfo2.topActivity;
                    if (taskInfo2.numActivities != 1 && componentName != null) {
                        android.content.pm.ActivityInfo activityInfo2 = packageManager.getActivityInfo(componentName, 128);
                        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses2 = activityManager.getRunningAppProcesses();
                        kotlin.jvm.internal.o.f(runningAppProcesses2, "getRunningAppProcesses(...)");
                        java.util.Iterator<T> it6 = runningAppProcesses2.iterator();
                        while (it6.hasNext()) {
                            if (kotlin.jvm.internal.o.b(((android.app.ActivityManager.RunningAppProcessInfo) it6.next()).processName, activityInfo2.processName)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandZombieTaskKiller", "ZombieTaskPredicateForDeadProcess.isZombieTask get exception for reading topActivity, " + th7);
            }
            return true;
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandZombieTaskKiller", "ZombieTaskPredicateForDeadProcess.isZombieTask get exception " + th6);
            return false;
        }
        return false;
    }
}
