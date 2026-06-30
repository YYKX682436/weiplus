package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class r1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f153663h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.g1 f153664i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var, long j17, java.lang.Object obj, int i17) {
        super(j17, obj);
        this.f153664i = g1Var;
        this.f153663h = i17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.g1.j(this.f153664i, this.f153663h);
            return null;
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }
}
