package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes13.dex */
public class t3 extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 f231333a;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var) {
        this.f231333a = i4Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        super.onAvailable(network);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        network.writeToParcel(obtain, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "found requested network. netid: " + obtain.readInt() + " toString: " + network.toString());
        if (fp.h.c(28)) {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "getMultipathPreference ret " + connectivityManager.getMultipathPreference(network));
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "getMultipathPreference  Error");
                try {
                    connectivityManager.unregisterNetworkCallback(this);
                    return;
                } catch (java.lang.Exception unused2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "unregisterNetworkCallback Error");
                    return;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = this.f231333a;
        i4Var.U1 = network;
        if (i4Var.W1 != null) {
            for (int i17 = 0; i17 < i4Var.W1.size(); i17++) {
                i4Var.n(((java.lang.Integer) i4Var.W1.get(i17)).intValue(), true);
            }
        }
        i4Var.V1 = this;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "networkcallback hashCode: " + i4Var.V1.hashCode());
    }
}
