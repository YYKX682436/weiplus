package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class q extends u32.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u32.g0 f99044b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.exdevice.model.d0 d0Var, int i17, u32.g0 g0Var) {
        super(i17);
        this.f99044b = g0Var;
    }

    @Override // u32.q
    public void a() {
        u32.n0 n0Var = u32.h1.c().f99006a;
        u32.g0 g0Var = this.f99044b;
        u32.k1 k1Var = (u32.k1) n0Var;
        k1Var.getClass();
        boolean z17 = false;
        try {
            z17 = k1Var.f424318a.b5(0, g0Var);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
    }
}
