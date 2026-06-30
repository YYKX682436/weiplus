package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class q extends u32.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u32.g0 f180577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 d0Var, int i17, u32.g0 g0Var) {
        super(i17);
        this.f180577b = g0Var;
    }

    @Override // u32.q
    public void a() {
        u32.n0 n0Var = u32.h1.c().f180539a;
        u32.g0 g0Var = this.f180577b;
        u32.k1 k1Var = (u32.k1) n0Var;
        k1Var.getClass();
        boolean z17 = false;
        try {
            z17 = k1Var.f505851a.b5(0, g0Var);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
    }
}
