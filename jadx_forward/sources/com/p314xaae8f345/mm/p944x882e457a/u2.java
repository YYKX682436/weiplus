package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.k0 f152351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f152352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f152353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.v2 f152354g;

    public u2(com.p314xaae8f345.mm.p944x882e457a.v2 v2Var, com.p314xaae8f345.mm.p971x6de15a2e.k0 k0Var, int i17, int i18) {
        this.f152354g = v2Var;
        this.f152351d = k0Var;
        this.f152352e = i17;
        this.f152353f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f152351d.ri(new com.p314xaae8f345.mm.p944x882e457a.v2(new com.p314xaae8f345.mm.p944x882e457a.l1(), this.f152354g.f152364h, null), this.f152352e, this.f152353f, "");
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteReqResp", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }
}
