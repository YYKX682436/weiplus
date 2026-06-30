package ow3;

/* loaded from: classes2.dex */
public class l extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f430957r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f430958s;

    public l(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitReportPayRes", "NetSceneBankRemitReportPayRes() transfer_bill_id:%s unique_id:%s unpay_type:%s", str, str2, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.hq5 hq5Var = new r45.hq5();
        hq5Var.f457920d = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(("" + str).getBytes());
        hq5Var.f457921e = str2;
        hq5Var.f457922f = i17;
        lVar.f152197a = hq5Var;
        lVar.f152198b = new r45.iq5();
        lVar.f152199c = "/cgi-bin/mmpay-bin/reportpayres_tsbc";
        lVar.f152200d = 2739;
        this.f430957r = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitReportPayRes", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f430958s;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.iq5 iq5Var = (r45.iq5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = iq5Var.f458802d;
        this.f295563h = iq5Var.f458803e;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f430958s = u0Var;
        return mo9409x10f9447a(sVar, this.f430957r, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2739;
    }
}
