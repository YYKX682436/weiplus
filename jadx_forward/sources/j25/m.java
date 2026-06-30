package j25;

/* loaded from: classes11.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j25.n f378854d;

    public m(j25.n nVar) {
        this.f378854d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831 serviceC21023x76ade831;
        boolean z17 = true;
        int i17 = j62.e.g().i("clicfg_support_auto_release", 1, true, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessReclaimSwitch", "isSupportProcessReclaimDisabled:" + i17);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginSupportProcess", "Support process reclaim disabled");
            return;
        }
        j25.n nVar = this.f378854d;
        java.util.List list = nVar.f378856e;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k25.a aVar = (k25.a) it.next();
                if (aVar != null && aVar.d()) {
                    z17 = false;
                    break;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginSupportProcess", "needKill:" + z17);
        if (z17) {
            boolean mo40965x320351f8 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4671xf410f8ca.f19953x4fbc8495.mo40965x320351f8();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginSupportProcess", "isProcessBackground:" + mo40965x320351f8);
            if (mo40965x320351f8) {
                nVar.getClass();
                java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.f274732h;
                if (weakReference != null && (serviceC21023x76ade831 = (com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831) weakReference.get()) != null) {
                    serviceC21023x76ade831.stopSelf();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginSupportProcess", "Stop service %s", serviceC21023x76ade831);
                }
                int myPid = android.os.Process.myPid();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(myPid));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin_support/PluginSupportProcess", "killSupport", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/plugin_support/PluginSupportProcess", "killSupport", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                return;
            }
        }
        nVar.f378855d.postDelayed(nVar.f378857f, 15000L);
    }
}
