package kn4;

/* renamed from: kn4.x$$b */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC29039x37186a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MatrixTrafficCollector", "Kill self, because current process cost too much mobile traffic at background.");
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/trafficmonitor/MatrixTrafficCollector", "lambda$safeCheck$2", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/plugin/trafficmonitor/MatrixTrafficCollector", "lambda$safeCheck$2", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }
}
