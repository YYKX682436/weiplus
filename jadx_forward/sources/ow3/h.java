package ow3;

/* loaded from: classes2.dex */
public class h extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f430943r;

    /* renamed from: s, reason: collision with root package name */
    public r45.mp4 f430944s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f430945t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f430946u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f430947v;

    public h(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.lp4();
        lVar.f152198b = new r45.mp4();
        lVar.f152200d = 1590;
        lVar.f152199c = "/cgi-bin/mmpay-bin/modifyexplain_tsbc";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f430943r = a17;
        r45.lp4 lp4Var = (r45.lp4) a17.f152243a.f152217a;
        lp4Var.f461235d = str;
        lp4Var.f461236e = str2;
        this.f430946u = str;
        this.f430947v = str2;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitModifyExplain", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.mp4 mp4Var = (r45.mp4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f430944s = mp4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitModifyExplain", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(mp4Var.f462261d), this.f430944s.f462262e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f430945t;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.mp4 mp4Var = (r45.mp4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = mp4Var.f462261d;
        this.f295563h = mp4Var.f462262e;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f430945t = u0Var;
        return mo9409x10f9447a(sVar, this.f430943r, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1590;
    }
}
