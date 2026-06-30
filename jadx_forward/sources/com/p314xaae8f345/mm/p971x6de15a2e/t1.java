package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class t1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.z0 f153670h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.o0 f153671i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f153672j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.g1 f153673k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var, long j17, java.lang.Integer num, com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, com.p314xaae8f345.mm.p971x6de15a2e.o0 o0Var, int i17) {
        super(j17, num);
        this.f153673k = g1Var;
        this.f153670h = z0Var;
        this.f153671i = o0Var;
        this.f153672j = i17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var = this.f153673k;
        try {
            return java.lang.Integer.valueOf(com.p314xaae8f345.mm.p971x6de15a2e.g1.e(g1Var, this.f153670h, this.f153671i, this.f153672j));
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            g1Var.f153520e = 0;
            g1Var.f153521f = 0L;
            g1Var.f153522g = 0L;
            g1Var.A = 0L;
            com.p314xaae8f345.mm.p971x6de15a2e.x2.h().o();
            return -1;
        }
    }
}
