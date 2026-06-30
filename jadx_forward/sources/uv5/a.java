package uv5;

/* loaded from: classes13.dex */
public abstract class a extends com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f513002a;

    public static java.lang.String a(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2 = f513002a;
        if (str2 != null) {
            return str2;
        }
        try {
            str = context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.IntentServiceC26594x4aa6a22c.class), 0).processName;
        } catch (java.lang.Throwable unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        f513002a = str;
        return str;
    }

    public static void b(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        java.lang.String a17 = a(context);
        if (a17 == null || (runningAppProcesses = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses()) == null) {
            return;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(a17)) {
                android.os.Process.killProcess(runningAppProcessInfo.pid);
            }
        }
    }
}
