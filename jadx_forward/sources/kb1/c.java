package kb1;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final lb1.i f387755a;

    /* renamed from: b, reason: collision with root package name */
    public final pb1.i f387756b;

    public c(android.content.Context context) {
        this.f387755a = new lb1.i(context);
        this.f387756b = new pb1.i(context);
    }

    public void a() {
        lb1.i iVar = this.f387755a;
        synchronized (iVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleConnectMgr", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, new java.lang.Object[0]);
            if (iVar.f399241b == null) {
                iVar.f399241b = new java.util.concurrent.ConcurrentHashMap();
            }
            iVar.f399241b.clear();
        }
        pb1.i iVar2 = this.f387756b;
        synchronized (iVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar2.f434673a, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, new java.lang.Object[0]);
            iVar2.f434678f.set(true);
            iVar2.f434686n = new pb1.b(iVar2.f434673a);
            iVar2.f434676d = new java.util.HashMap();
            iVar2.f434680h = new java.util.ArrayList();
            iVar2.f434675c = new pb1.e(iVar2);
            iVar2.b();
        }
    }

    public void b() {
        android.content.Context context;
        lb1.i iVar = this.f387755a;
        synchronized (iVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleConnectMgr", "uninit", new java.lang.Object[0]);
            java.util.Map map = iVar.f399241b;
            if (map != null) {
                java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) map).values().iterator();
                while (it.hasNext()) {
                    ((lb1.k) it.next()).p();
                }
                ((java.util.concurrent.ConcurrentHashMap) iVar.f399241b).clear();
                iVar.f399241b = null;
            }
            iVar.f399242c = null;
            iVar.f399243d = null;
            iVar.f399244e = null;
        }
        pb1.i iVar2 = this.f387756b;
        synchronized (iVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar2.f434673a, "uninit", new java.lang.Object[0]);
            iVar2.d();
            iVar2.f434678f.set(false);
            iVar2.f434686n = pb1.p.f434693a;
            java.util.Map map2 = iVar2.f434676d;
            if (map2 != null) {
                ((java.util.HashMap) map2).clear();
            }
            java.util.List list = iVar2.f434680h;
            if (list != null) {
                ((java.util.ArrayList) list).clear();
            }
            if ((android.os.Build.VERSION.SDK_INT < 31 || ((context = iVar2.f434674b) != null && nf.t.b(context, null, "android.permission.BLUETOOTH_SCAN"))) && qb1.b.d() != null && qb1.b.d().isDiscovering()) {
                qb1.b.d().cancelDiscovery();
            }
            synchronized (iVar2) {
                if (iVar2.f434682j != null && iVar2.f434674b != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar2.f434673a, "bluetoothStateListener uninit");
                    iVar2.f434674b.unregisterReceiver(iVar2.f434682j);
                    iVar2.f434682j = null;
                }
            }
        }
        iVar2.f434675c = null;
    }
}
