package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class c3 extends com.p314xaae8f345.mm.p944x882e457a.m1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152129d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.m1 f152130e = this;

    /* renamed from: f, reason: collision with root package name */
    public final long f152131f;

    /* renamed from: g, reason: collision with root package name */
    public int f152132g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.l0 f152133h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f152134i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f152135m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Executor f152136n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.e3 f152137o;

    public c3(com.p314xaae8f345.mm.p944x882e457a.o oVar, java.util.concurrent.Executor executor, com.p314xaae8f345.mm.p944x882e457a.e3 e3Var) {
        this.f152135m = oVar;
        this.f152136n = executor;
        this.f152137o = e3Var;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f152131f = java.lang.System.currentTimeMillis();
        this.f152132g = 0;
        this.f152133h = new com.p314xaae8f345.mm.p944x882e457a.a3(this);
        this.f152134i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(com.p314xaae8f345.mm.p944x882e457a.z2.f152379a.getLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p944x882e457a.b3(this), false);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152129d = u0Var;
        com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var = this.f152133h;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f152135m;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, oVar, l0Var);
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f152130e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(m1Var.hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(oVar.f152246d);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(mo9409x10f9447a);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RunCgi", "Start doScene:%d func:%d netid:%d time:%d", valueOf, valueOf2, valueOf3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f152131f));
        com.p314xaae8f345.mm.p944x882e457a.e3 e3Var = this.f152137o;
        if (e3Var != null) {
            if (mo9409x10f9447a < 0) {
                this.f152132g = 1;
                com.p314xaae8f345.mm.p944x882e457a.z2.a(this.f152136n, e3Var, 3, -1, "", this.f152135m, m1Var);
            } else {
                this.f152134i.c(60000L, 60000L);
            }
        }
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getReqResp */
    public com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558() {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = super.mo47948x7f0c4558();
        return mo47948x7f0c4558 != null ? mo47948x7f0c4558 : this.f152135m;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return this.f152135m.f152246d;
    }
}
