package by5;

/* loaded from: classes7.dex */
public class m2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.lang.String str;
        by5.c4.f("ProcessUtil", "killToolsProcess, start");
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        int myPid = android.os.Process.myPid();
        int myUid = android.os.Process.myUid();
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.uid == myUid && runningAppProcessInfo.pid != myPid && (str = runningAppProcessInfo.processName) != null && str.contains("com.tencent.mm") && str.contains("tools")) {
                by5.c4.f("ProcessUtil", "killToolsProcess, processName:" + str + ", pid:" + runningAppProcessInfo.pid);
                int i17 = runningAppProcessInfo.pid;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/xweb/util/ProcessUtil", "killToolsProcess", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/xweb/util/ProcessUtil", "killToolsProcess", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }
        return qx5.a.b();
    }
}
