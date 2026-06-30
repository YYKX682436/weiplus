package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes13.dex */
public class t0 extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 f258335a;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var) {
        this.f258335a = g1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        super.onAvailable(network);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = this.f258335a;
        g1Var.f258065x.f258411q0++;
        vq4.d0.c("MicroMsg.Voip.VoipContext", "found requested network, toString: " + network.toString());
        if (fp.h.c(28)) {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
            try {
                int multipathPreference = connectivityManager.getMultipathPreference(network);
                vq4.d0.c("MicroMsg.Voip.VoipContext", "getMultipathPreference ret " + multipathPreference);
                if (multipathPreference == 0) {
                    g1Var.f258065x.f258408p0 = 3;
                }
            } catch (java.lang.Exception unused) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "getMultipathPreference  Error");
                g1Var.f258065x.f258408p0 = 2;
                try {
                    connectivityManager.unregisterNetworkCallback(this);
                    return;
                } catch (java.lang.Exception unused2) {
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "unregisterNetworkCallback Error");
                    return;
                }
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.s0(this, network, this));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        super.onLost(network);
        this.f258335a.f258065x.f258414r0++;
        vq4.d0.c("MicroMsg.Voip.VoipContext", "network onLost, toString: " + network.toString());
    }
}
