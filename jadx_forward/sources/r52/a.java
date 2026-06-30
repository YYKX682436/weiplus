package r52;

/* loaded from: classes15.dex */
public abstract class a {
    public static final boolean a(java.lang.String str) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b("FinderHomeAffinityUI", str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", str);
    }

    public static final boolean b(java.lang.String str) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderShareFeedAffinityUI", str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("FinderShareFeedAffinityUI", str);
    }

    public static final boolean c(java.lang.String str) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b("FinderShareFeedRelUI", str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI", str);
    }

    public static final boolean d(java.lang.String str) {
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        java.lang.String str2;
        java.lang.String className;
        android.content.Context applicationContext;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderMultiTaskRouterUI", str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("FinderMultiTaskRouterUI", str)) {
            return false;
        }
        if (a(str)) {
            return true;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.f181316a.k()) {
            ((o63.j) ((q63.e) i95.n0.c(q63.e.class))).getClass();
            return r63.n.f474575a.p();
        }
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.Object systemService = (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
            if (activityManager != null && (appTasks = activityManager.getAppTasks()) != null) {
                java.util.Iterator<T> it = appTasks.iterator();
                while (it.hasNext()) {
                    android.app.ActivityManager.RecentTaskInfo taskInfo = ((android.app.ActivityManager.AppTask) it.next()).getTaskInfo();
                    if (taskInfo != null) {
                        android.content.ComponentName componentName = taskInfo.topActivity;
                        java.lang.String str3 = "";
                        if (componentName == null || (str2 = componentName.getClassName()) == null) {
                            str2 = "";
                        }
                        android.content.ComponentName componentName2 = taskInfo.baseActivity;
                        if (componentName2 != null && (className = componentName2.getClassName()) != null) {
                            str3 = className;
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b52.b.g(str2), str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderMultiReport", "baseActivity = " + str3 + ", topActivity = " + str2 + ", activityName = " + str);
                            return a(str3);
                        }
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public static final boolean e(java.lang.String str) {
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        java.lang.String str2;
        java.lang.String className;
        android.content.Context applicationContext;
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.Object systemService = (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
            if (activityManager == null || (appTasks = activityManager.getAppTasks()) == null) {
                return false;
            }
            java.util.Iterator<T> it = appTasks.iterator();
            while (it.hasNext()) {
                android.app.ActivityManager.RecentTaskInfo taskInfo = ((android.app.ActivityManager.AppTask) it.next()).getTaskInfo();
                if (taskInfo != null) {
                    android.content.ComponentName componentName = taskInfo.topActivity;
                    java.lang.String str3 = "";
                    if (componentName == null || (str2 = componentName.getClassName()) == null) {
                        str2 = "";
                    }
                    android.content.ComponentName componentName2 = taskInfo.baseActivity;
                    if (componentName2 != null && (className = componentName2.getClassName()) != null) {
                        str3 = className;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b52.b.g(str2), str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderMultiReport", "baseActivity = " + str3 + ", topActivity = " + str2 + ", activityName = " + str);
                        return b(str3);
                    }
                }
            }
            return false;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
