package vh4;

/* loaded from: classes7.dex */
public class c2 implements java.lang.Runnable {
    public c2(vh4.t1 t1Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        int myPid = android.os.Process.myPid();
        int myUid = android.os.Process.myUid();
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessOperator", "killAllProcessWithoutPush: skip:" + runningAppProcessInfo.processName);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessOperator", "killAllProcessWithoutPush: kill other:" + runningAppProcessInfo.processName);
                if (runningAppProcessInfo.uid == myUid && (i17 = runningAppProcessInfo.pid) != myPid) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/process/ProcessOperator", "killAllProcessWithoutPush", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/mm/process/ProcessOperator", "killAllProcessWithoutPush", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessOperator", "killAllProcessWithoutPush: kill this");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/process/ProcessOperator", "killAllProcessWithoutPush", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/mm/process/ProcessOperator", "killAllProcessWithoutPush", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
