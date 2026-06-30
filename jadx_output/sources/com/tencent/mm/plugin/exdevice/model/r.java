package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class r extends u32.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f99048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u32.j0 f99049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.exdevice.model.d0 d0Var, int i17, long j17, u32.j0 j0Var) {
        super(i17);
        this.f99048b = j17;
        this.f99049c = j0Var;
    }

    @Override // u32.q
    public void a() {
        u32.n0 n0Var = u32.h1.c().f99006a;
        u32.j0 j0Var = this.f99049c;
        u32.k1 k1Var = (u32.k1) n0Var;
        long j17 = this.f99048b;
        k1Var.getClass();
        boolean z17 = false;
        try {
            z17 = k1Var.f424318a.oe(j17, 0, j0Var);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "connect failed!!!");
    }
}
