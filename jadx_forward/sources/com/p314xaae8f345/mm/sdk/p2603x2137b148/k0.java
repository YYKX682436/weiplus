package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class k0 extends android.net.ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "network available (from network callback)");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "network lost (from network callback)");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t0.f274512g = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.b();
    }
}
