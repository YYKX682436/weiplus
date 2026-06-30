package rf1;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f476152a;

    /* renamed from: b, reason: collision with root package name */
    public static rf1.b f476153b;

    public static void a(rf1.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "addListener");
        rf1.b bVar = f476153b;
        if (bVar != null) {
            ((java.util.concurrent.CopyOnWriteArrayList) bVar.f476151b).add(cVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "addListener, receiver is null");
        }
    }

    public static void b(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "disable");
        if (!f476152a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "disable, not enable");
            return;
        }
        android.content.Context a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(context);
        f476152a = false;
        rf1.b bVar = f476153b;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "enable, receiver is null");
            return;
        }
        bVar.getClass();
        try {
            a17.unregisterReceiver(bVar);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) a17.getSystemService("connectivity");
        if (connectivityManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "disable, connectivityManager is null");
        } else {
            try {
                connectivityManager.unregisterNetworkCallback(bVar.f476150a);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.ConnectWifiEvents", e17, "unregisterNetworkCallback failure", new java.lang.Object[0]);
            }
        }
        f476153b = null;
    }

    public static void c(rf1.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "removeListener");
        rf1.b bVar = f476153b;
        if (bVar != null) {
            ((java.util.concurrent.CopyOnWriteArrayList) bVar.f476151b).remove(cVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "removeListener, receiver is null");
        }
    }
}
