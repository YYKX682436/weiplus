package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes13.dex */
public class g1 extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.h1 f152479a;

    public g1(com.p314xaae8f345.mm.p947xba6de98f.h1 h1Var) {
        this.f152479a = h1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        com.p314xaae8f345.mm.p947xba6de98f.h1.wi(this.f152479a, "NetworkCallback.onAvailable");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        com.p314xaae8f345.mm.p947xba6de98f.h1.wi(this.f152479a, "NetworkCallback.onCapabilitiesChanged");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        com.p314xaae8f345.mm.p947xba6de98f.h1.wi(this.f152479a, "NetworkCallback.onLost");
    }
}
