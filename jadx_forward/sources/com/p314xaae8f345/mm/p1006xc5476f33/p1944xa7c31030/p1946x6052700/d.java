package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700;

/* loaded from: classes.dex */
public class d implements java.lang.Runnable {
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1946x6052700.ServiceC16798xc23ab7f3 serviceC16798xc23ab7f3) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JeVersion", "onDestroy: kill self");
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/performance/jectl/JeVersion$JeService$3", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/plugin/performance/jectl/JeVersion$JeService$3", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
