package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public final class d2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.y1 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d2 f156582b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f156583c = kz5.c1.k(new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93.class.getName(), ":appbrand0"), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12658xb00da3fe.class.getName(), ":appbrand1"), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12659xb00da3ff.class.getName(), ":appbrand2"), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12660xb00da400.class.getName(), ":appbrand3"), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12661xb00da401.class.getName(), ":appbrand4"));

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.y1
    public boolean a(android.app.ActivityManager.AppTask appTask) {
        android.app.ActivityManager.RecentTaskInfo taskInfo;
        android.content.Intent intent;
        android.content.ComponentName component;
        android.app.ActivityManager activityManager;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appTask, "appTask");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156627i) {
            return false;
        }
        try {
            taskInfo = appTask.getTaskInfo();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandZombieTaskKiller", "ZombieTaskPredicateForDeadProcess.isZombieTask get exception " + th6);
            return false;
        }
        if (taskInfo != null && (intent = taskInfo.baseIntent) != null && (component = intent.getComponent()) != null) {
            if (((java.lang.String) f156583c.get(component.getClassName())) != null) {
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156628m) {
                    return false;
                }
                java.lang.Integer Ai = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.Ai(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156622d, appTask);
                if (Ai != null) {
                    int intValue = Ai.intValue();
                    x.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156633r;
                    synchronized (dVar) {
                        if (dVar.contains(java.lang.Integer.valueOf(intValue))) {
                            return false;
                        }
                    }
                }
                return !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + r2);
            }
            android.content.pm.PackageManager packageManager = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager();
            if (packageManager == null || (activityManager = (android.app.ActivityManager) b3.l.m9714xac92a5d0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.app.ActivityManager.class)) == null) {
                return false;
            }
            android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(component, 128);
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(runningAppProcesses, "getRunningAppProcesses(...)");
            java.util.Iterator<T> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((android.app.ActivityManager.RunningAppProcessInfo) it.next()).processName, activityInfo.processName)) {
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
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(runningAppProcesses2, "getRunningAppProcesses(...)");
                        java.util.Iterator<T> it6 = runningAppProcesses2.iterator();
                        while (it6.hasNext()) {
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((android.app.ActivityManager.RunningAppProcessInfo) it6.next()).processName, activityInfo2.processName)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandZombieTaskKiller", "ZombieTaskPredicateForDeadProcess.isZombieTask get exception for reading topActivity, " + th7);
            }
            return true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandZombieTaskKiller", "ZombieTaskPredicateForDeadProcess.isZombieTask get exception " + th6);
            return false;
        }
        return false;
    }
}
