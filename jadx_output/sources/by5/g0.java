package by5;

/* loaded from: classes7.dex */
public abstract class g0 {
    public static java.lang.String a() {
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.app.ActivityThread", false, android.app.Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new java.lang.Class[0]);
        declaredMethod.setAccessible(true);
        java.lang.Object invoke = declaredMethod.invoke(null, new java.lang.Object[0]);
        java.lang.String str = invoke instanceof java.lang.String ? (java.lang.String) invoke : null;
        by5.c4.f("ProcessUtil", "getCurrentProcessNameByActivityThread, processName:" + invoke);
        return str;
    }

    public static void b(android.content.Context context) {
        java.lang.String str;
        by5.c4.f("ProcessUtil", "killAllProcess, start");
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        int myPid = android.os.Process.myPid();
        int myUid = android.os.Process.myUid();
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.uid == myUid && runningAppProcessInfo.pid != myPid && ((str = runningAppProcessInfo.processName) == null || !str.contains("com.tencent.mm") || str.contains("tools") || str.contains("appbrand") || str.contains("support"))) {
                by5.c4.f("ProcessUtil", "killAllProcess, processName:" + str + ", pid:" + runningAppProcessInfo.pid);
                int i17 = runningAppProcessInfo.pid;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/xweb/util/ProcessUtil", "killAllProcess", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/xweb/util/ProcessUtil", "killAllProcess", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }
        by5.c4.f("ProcessUtil", "killAllProcess, kill this process, pid:" + myPid);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/xweb/util/ProcessUtil", "killAllProcess", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/xweb/util/ProcessUtil", "killAllProcess", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
