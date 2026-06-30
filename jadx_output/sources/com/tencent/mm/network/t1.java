package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class t1 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.z0 f72137h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.o0 f72138i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f72139j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72140k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.network.g1 g1Var, long j17, java.lang.Integer num, com.tencent.mm.network.z0 z0Var, com.tencent.mm.network.o0 o0Var, int i17) {
        super(j17, num);
        this.f72140k = g1Var;
        this.f72137h = z0Var;
        this.f72138i = o0Var;
        this.f72139j = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mm.network.g1 g1Var = this.f72140k;
        try {
            return java.lang.Integer.valueOf(com.tencent.mm.network.g1.e(g1Var, this.f72137h, this.f72138i, this.f72139j));
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            g1Var.f71987e = 0;
            g1Var.f71988f = 0L;
            g1Var.f71989g = 0L;
            g1Var.A = 0L;
            com.tencent.mm.network.x2.h().o();
            return -1;
        }
    }
}
