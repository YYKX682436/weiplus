package po5;

/* loaded from: classes13.dex */
public final class d extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ po5.i f438882a;

    public d(po5.i iVar) {
        this.f438882a = iVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        super.onAvailable(network);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
        network.writeToParcel(obtain, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "found requested network. netid: " + obtain.readInt() + " toString: " + network);
        if (fp.h.c(28)) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "getMultipathPreference ret " + connectivityManager.getMultipathPreference(network));
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "getMultipathPreference  Error");
                try {
                    connectivityManager.unregisterNetworkCallback(this);
                    return;
                } catch (java.lang.Exception unused2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "unregisterNetworkCallback Error");
                    return;
                }
            }
        }
        po5.i iVar = this.f438882a;
        iVar.f438887a = network;
        int size = iVar.f438889c.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = iVar.f438889c.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            iVar.c(((java.lang.Number) obj).intValue(), true);
        }
        iVar.f438888b = this;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("networkcallback hashCode: ");
        android.net.ConnectivityManager.NetworkCallback networkCallback = iVar.f438888b;
        sb6.append(networkCallback != null ? networkCallback.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", sb6.toString());
    }
}
