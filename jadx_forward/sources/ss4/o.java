package ss4;

/* loaded from: classes2.dex */
public class o extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.di3 f493645d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f493646e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f493647f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f493648g;

    public o(java.lang.String str, boolean z17) {
        this.f493646e = z17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ci3();
        lVar.f152198b = new r45.di3();
        if (z17) {
            lVar.f152200d = 2803;
            lVar.f152199c = "/cgi-bin/mmpay-bin/mktgetf2flottery";
        } else {
            lVar.f152200d = 2508;
            lVar.f152199c = "/cgi-bin/mmpay-bin/mktgetlottery";
        }
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f493647f = a17;
        ((r45.ci3) a17.f152243a.f152217a).f453106d = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMktGetLottery", "NetSceneMktGetLottery, getLotteryParams: %s, isF2f: %s", str, java.lang.Boolean.valueOf(z17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f493648g = u0Var;
        return mo9409x10f9447a(sVar, this.f493647f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return this.f493646e ? 2803 : 2508;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMktGetLottery", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f493645d = (r45.di3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f493648g;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
