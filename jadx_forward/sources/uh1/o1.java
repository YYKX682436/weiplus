package uh1;

/* loaded from: classes15.dex */
public enum o1 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f509382d = new java.util.concurrent.ConcurrentHashMap();

    o1() {
    }

    public void a(uh1.m1 m1Var) {
        synchronized (this.f509382d) {
            if (((java.util.concurrent.ConcurrentHashMap) this.f509382d).containsKey(m1Var)) {
                try {
                    ((android.net.nsd.NsdManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("servicediscovery")).stopServiceDiscovery((android.net.nsd.NsdManager.DiscoveryListener) ((java.util.concurrent.ConcurrentHashMap) this.f509382d).get(m1Var));
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LocalServiceMgr", th6, "Throwable: stopScanServices", new java.lang.Object[0]);
                }
                ((java.util.concurrent.ConcurrentHashMap) this.f509382d).remove(m1Var);
            }
        }
    }
}
