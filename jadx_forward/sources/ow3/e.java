package ow3;

/* loaded from: classes2.dex */
public class e extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f430932r;

    /* renamed from: s, reason: collision with root package name */
    public r45.md0 f430933s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f430934t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f430935u;

    public e(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ld0();
        lVar.f152198b = new r45.md0();
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.g0.f34294x366c91de;
        lVar.f152199c = "/cgi-bin/mmpay-bin/deleterecord_tsbc";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f430932r = a17;
        ((r45.ld0) a17.f152243a.f152217a).f460857d = str;
        this.f430935u = str;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitDeleteRecord", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.md0 md0Var = (r45.md0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f430933s = md0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitDeleteRecord", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(md0Var.f461909d), this.f430933s.f461910e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f430934t;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.md0 md0Var = (r45.md0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = md0Var.f461909d;
        this.f295563h = md0Var.f461910e;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f430934t = u0Var;
        return mo9409x10f9447a(sVar, this.f430932r, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.g0.f34294x366c91de;
    }
}
