package by5;

/* loaded from: classes7.dex */
public class i2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.lang.String str;
        by5.c4.f("ProcessUtil", "killGpuProcess, start");
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        int myPid = android.os.Process.myPid();
        int myUid = android.os.Process.myUid();
        boolean z17 = false;
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.uid == myUid && runningAppProcessInfo.pid != myPid && (str = runningAppProcessInfo.processName) != null && str.contains("xweb_privileged_process")) {
                by5.c4.f("ProcessUtil", "killGpuProcess, processName:" + str + ", pid:" + runningAppProcessInfo.pid);
                int i17 = runningAppProcessInfo.pid;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/xweb/util/ProcessUtil", "killGpuProcess", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/xweb/util/ProcessUtil", "killGpuProcess", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                z17 = true;
            }
        }
        if (!z17) {
            by5.c4.f("ProcessUtil", "killGpuProcess, try force kill gpu process");
            tx5.j.d(80025, null);
        }
        return qx5.a.b();
    }
}
