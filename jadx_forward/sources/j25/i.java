package j25;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j25.j f378847d;

    public i(j25.j jVar) {
        this.f378847d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831 serviceC21023x76ade831;
        if (ob0.r3.b()) {
            return;
        }
        j25.j jVar = this.f378847d;
        jVar.getClass();
        if (g32.c.f349680a) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginExDeviceProcess", "ExDeviceProcessBusyMonitor.isBusy(): false");
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginExDeviceProcess", "needKill: %s, workingFlag: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(g32.c.f349681b));
        if (!z17) {
            jVar.f378848d.postDelayed(jVar.f378849e, 20000L);
            return;
        }
        jVar.getClass();
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.f274732h;
        if (weakReference != null && (serviceC21023x76ade831 = (com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831) weakReference.get()) != null) {
            serviceC21023x76ade831.stopSelf();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginExDeviceProcess", "Stop service %s", serviceC21023x76ade831);
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin_support/PluginExDeviceProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/plugin_support/PluginExDeviceProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
