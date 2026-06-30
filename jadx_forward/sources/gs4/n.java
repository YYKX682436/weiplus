package gs4;

/* loaded from: classes4.dex */
public class n extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.f36 f356653d;

    /* renamed from: e, reason: collision with root package name */
    public r45.g36 f356654e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f356655f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f356656g;

    public n(boolean z17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.f36 f36Var = new r45.f36();
        f36Var.f455529e = java.lang.System.currentTimeMillis();
        if (z17) {
            f36Var.f455528d = 1;
        } else {
            f36Var.f455528d = 0;
        }
        this.f356653d = f36Var;
        lVar.f152197a = f36Var;
        lVar.f152198b = new r45.g36();
        lVar.f152199c = "/cgi-bin/mmpay-bin/setwalletentrancebalanceswitchstate";
        lVar.f152200d = 2554;
        this.f356655f = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f356656g = u0Var;
        return mo9409x10f9447a(sVar, this.f356655f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2554;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneSetWalletEntranceBalanceSwitchState", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f356654e = (r45.g36) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        }
        this.f356656g.mo815x76e0bfae(i18, i19, str, this);
    }
}
