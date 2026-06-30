package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public class q8 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f274477a;

    public q8(android.content.Context context) {
        this.f274477a = context;
    }

    /* renamed from: toString */
    public java.lang.String m77801x9616526c() {
        android.content.Context context = this.f274477a;
        if (context == null) {
            return null;
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        java.lang.String packageName = context.getPackageName();
        if (activityManager == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(packageName)) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            for (android.app.ActivityManager.RunningTaskInfo runningTaskInfo : activityManager.getRunningTasks(100)) {
                if (runningTaskInfo.baseActivity.getClassName().startsWith(packageName) || runningTaskInfo.topActivity.getClassName().startsWith(packageName)) {
                    sb6.append(java.lang.String.format("{id:%d num:%d/%d top:%s base:%s}", java.lang.Integer.valueOf(runningTaskInfo.id), java.lang.Integer.valueOf(runningTaskInfo.numRunning), java.lang.Integer.valueOf(runningTaskInfo.numActivities), runningTaskInfo.topActivity.getShortClassName(), runningTaskInfo.baseActivity.getShortClassName()));
                }
            }
            return sb6.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return "";
        }
    }
}
