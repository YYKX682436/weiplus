package p65;

/* loaded from: classes7.dex */
public class m implements j65.h {
    public m(p65.o oVar) {
    }

    public void a() {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        if (activityManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessOperator", "Fail to get ActivityManager.");
        } else {
            int myPid = android.os.Process.myPid();
            int myUid = android.os.Process.myUid();
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.uid == myUid && runningAppProcessInfo.pid != myPid && !runningAppProcessInfo.processName.endsWith(":push")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ProcessOperator", "Kill process: %s(%s) by killAllProcessExceptPushAndSelf()", runningAppProcessInfo.processName, java.lang.Integer.valueOf(runningAppProcessInfo.pid));
                    int i17 = runningAppProcessInfo.pid;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/process/ProcessOperator", "killAllProcessExceptPushAndSelf", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/mm/process/ProcessOperator", "killAllProcessExceptPushAndSelf", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/routine/DefaultStartupRoutine$2", "onDensityChange", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/mm/routine/DefaultStartupRoutine$2", "onDensityChange", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
    }
}
