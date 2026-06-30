package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes13.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Network f258328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager.NetworkCallback f258329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.t0 f258330f;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.t0 t0Var, android.net.Network network, android.net.ConnectivityManager.NetworkCallback networkCallback) {
        this.f258330f = t0Var;
        this.f258328d = network;
        this.f258329e = networkCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.t0 t0Var = this.f258330f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = t0Var.f258335a;
        android.net.Network network = g1Var.P;
        android.net.Network network2 = this.f258328d;
        if (network != null) {
            g1Var.P = network2;
            if (g1Var.R != null) {
                for (int i17 = 0; i17 < t0Var.f258335a.R.size(); i17++) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var2 = t0Var.f258335a;
                    g1Var2.j(((java.lang.Integer) g1Var2.R.get(i17)).intValue(), true);
                }
            }
        } else {
            g1Var.P = network2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var3 = t0Var.f258335a;
        android.net.ConnectivityManager.NetworkCallback networkCallback = this.f258329e;
        g1Var3.Q = networkCallback;
        if (networkCallback != null) {
            try {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "networkcallback hashCode: " + t0Var.f258335a.Q.hashCode());
            } catch (java.lang.Throwable unused) {
                vq4.d0.a("MicroMsg.Voip.VoipContext", "networkcallback is null");
            }
        }
        t0Var.f258335a.f258065x.f258408p0 = 1;
    }
}
