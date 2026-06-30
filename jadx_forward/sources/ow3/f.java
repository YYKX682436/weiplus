package ow3;

/* loaded from: classes2.dex */
public class f extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f430936r;

    /* renamed from: s, reason: collision with root package name */
    public r45.na3 f430937s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f430938t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f430939u;

    public f(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ma3();
        lVar.f152198b = new r45.na3();
        lVar.f152200d = 1542;
        lVar.f152199c = "/cgi-bin/mmpay-bin/getbankinfo_tsbc";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f430936r = a17;
        ((r45.ma3) a17.f152243a.f152217a).f461826d = str;
        this.f430939u = str2;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitGetBankInfo", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.na3 na3Var = (r45.na3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f430937s = na3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitGetBankInfo", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(na3Var.f462725d), this.f430937s.f462726e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f430938t;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.na3 na3Var = (r45.na3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = na3Var.f462725d;
        this.f295563h = na3Var.f462726e;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f430938t = u0Var;
        return mo9409x10f9447a(sVar, this.f430936r, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1542;
    }
}
