package ow3;

/* loaded from: classes9.dex */
public class i extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f430948r;

    /* renamed from: s, reason: collision with root package name */
    public r45.f25 f430949s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f430950t;

    public i() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.e25();
        lVar.f152198b = new r45.f25();
        lVar.f152200d = 1280;
        lVar.f152199c = "/cgi-bin/mmpay-bin/operation_tsbc";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f430948r = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitOperation", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.f25 f25Var = (r45.f25) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f430949s = f25Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitOperation", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(f25Var.f455476d), this.f430949s.f455477e);
        if (!this.f295564i && !this.f295565m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitOperation", "min_poundage: %s, max_amount: %s", java.lang.Integer.valueOf(this.f430949s.f455478f), java.lang.Integer.valueOf(this.f430949s.f455479g));
            if (this.f430949s.f455478f >= 0) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANK_REMIT_MIN_POUNDAGE_INT_SYNC, java.lang.Integer.valueOf(this.f430949s.f455478f));
            }
            if (this.f430949s.f455479g > 0) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANK_REMIT_MAX_TRANSFER_AMOUNT_INT_SYNC, java.lang.Integer.valueOf(this.f430949s.f455479g));
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f430949s.f455482m)) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANK_REMIT_PAYLIST_STRING_SYNC, this.f430949s.f455482m);
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f430950t;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.f25 f25Var = (r45.f25) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = f25Var.f455476d;
        this.f295563h = f25Var.f455477e;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f430950t = u0Var;
        return mo9409x10f9447a(sVar, this.f430948r, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1280;
    }
}
