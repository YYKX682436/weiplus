package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes3.dex */
public abstract class e {
    public static final android.content.Intent a(android.content.Context context) {
        android.content.pm.ActivityInfo activityInfo;
        java.lang.String str;
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks;
        android.app.ActivityManager.RunningTaskInfo runningTaskInfo;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) b3.l.getSystemService(context, android.app.ActivityManager.class);
            boolean z17 = false;
            android.content.ComponentName componentName = (activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || (runningTaskInfo = runningTasks.get(0)) == null) ? null : runningTaskInfo.baseActivity;
            if (componentName == null) {
                return null;
            }
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (activityInfo = packageManager.getActivityInfo(componentName, 128)) != null && (str = activityInfo.taskAffinity) != null) {
                z17 = r26.n0.B(str, ".AppBrandUI", false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandLaunchMMSingleTaskUIHelper", "provideExtrasForSmoothBack, curStackBaseUI: " + componentName + ", curInAppBrandStack: " + z17);
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandLaunchMMSingleTaskUIHelper", "provideExtrasForSmoothBack, not need");
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandLaunchMMSingleTaskUIHelper", "provideExtrasForSmoothBack, provide");
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268468224);
            return intent;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandLaunchMMSingleTaskUIHelper", "provideExtrasForSmoothBack fail since " + e17);
            return null;
        }
    }
}
