package gs4;

/* loaded from: classes2.dex */
public class l extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public r45.uh5 f356650d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f356651e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f356652f;

    public l() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.th5 th5Var = new r45.th5();
        th5Var.f467974d = java.lang.System.currentTimeMillis();
        lVar.f152197a = th5Var;
        lVar.f152198b = new r45.uh5();
        lVar.f152199c = "/cgi-bin/mmpay-bin/querywalletentrancebalanceswitchstate";
        lVar.f152200d = 2635;
        this.f356651e = lVar.a();
    }

    public r45.uh5 H() {
        r45.uh5 uh5Var = this.f356650d;
        return uh5Var == null ? new r45.uh5() : uh5Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f356652f = u0Var;
        return mo9409x10f9447a(sVar, this.f356651e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2635;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueryWalletEntranceBalanceSwitchState", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f356650d = (r45.uh5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        }
        this.f356652f.mo815x76e0bfae(i18, i19, str, this);
    }
}
