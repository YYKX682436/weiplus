package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes3.dex */
public abstract class e {
    public static final android.content.Intent a(android.content.Context context) {
        android.content.pm.ActivityInfo activityInfo;
        java.lang.String str;
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks;
        android.app.ActivityManager.RunningTaskInfo runningTaskInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) b3.l.m9714xac92a5d0(context, android.app.ActivityManager.class);
            boolean z17 = false;
            android.content.ComponentName componentName = (activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || (runningTaskInfo = runningTasks.get(0)) == null) ? null : runningTaskInfo.baseActivity;
            if (componentName == null) {
                return null;
            }
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (activityInfo = packageManager.getActivityInfo(componentName, 128)) != null && (str = activityInfo.taskAffinity) != null) {
                z17 = r26.n0.B(str, ".AppBrandUI", false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandLaunchMMSingleTaskUIHelper", "provideExtrasForSmoothBack, curStackBaseUI: " + componentName + ", curInAppBrandStack: " + z17);
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandLaunchMMSingleTaskUIHelper", "provideExtrasForSmoothBack, not need");
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandLaunchMMSingleTaskUIHelper", "provideExtrasForSmoothBack, provide");
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268468224);
            return intent;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandLaunchMMSingleTaskUIHelper", "provideExtrasForSmoothBack fail since " + e17);
            return null;
        }
    }
}
