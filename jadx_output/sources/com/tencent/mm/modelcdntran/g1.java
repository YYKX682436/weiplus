package com.tencent.mm.modelcdntran;

/* loaded from: classes13.dex */
public class g1 extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.h1 f70946a;

    public g1(com.tencent.mm.modelcdntran.h1 h1Var) {
        this.f70946a = h1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        com.tencent.mm.modelcdntran.h1.wi(this.f70946a, "NetworkCallback.onAvailable");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        com.tencent.mm.modelcdntran.h1.wi(this.f70946a, "NetworkCallback.onCapabilitiesChanged");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        com.tencent.mm.modelcdntran.h1.wi(this.f70946a, "NetworkCallback.onLost");
    }
}
