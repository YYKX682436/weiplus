package ow3;

/* loaded from: classes4.dex */
public class a extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f430922r;

    /* renamed from: s, reason: collision with root package name */
    public r45.sa f430923s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f430924t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f430925u;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ra();
        lVar.f152198b = new r45.sa();
        lVar.f152200d = 1348;
        lVar.f152199c = "/cgi-bin/mmpay-bin/appointbank_tsbc";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f430922r = a17;
        r45.ra raVar = (r45.ra) a17.f152243a.f152217a;
        raVar.f466216d = str;
        raVar.f466218f = str2;
        raVar.f466217e = str3;
        this.f430925u = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitAppointBank", "seqno: %s, timing_id: %s, bankType: %s", str, str2, str3);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitAppointBank", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.sa saVar = (r45.sa) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f430923s = saVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitAppointBank", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(saVar.f467124d), this.f430923s.f467125e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f430924t;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.sa saVar = (r45.sa) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = saVar.f467124d;
        this.f295563h = saVar.f467125e;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f430924t = u0Var;
        return mo9409x10f9447a(sVar, this.f430922r, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1348;
    }
}
