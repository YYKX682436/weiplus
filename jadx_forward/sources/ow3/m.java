package ow3;

/* loaded from: classes9.dex */
public class m extends ow3.b implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t {

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f430959r;

    /* renamed from: s, reason: collision with root package name */
    public r45.or5 f430960s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f430961t;

    public m(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4, int i19, int i27, java.lang.String str5, java.lang.String str6, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i28) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = str6 == null ? "" : str6;
        objArr[1] = android.util.Base64.encodeToString(gVar.g(), 2);
        objArr[2] = java.lang.Integer.valueOf(i28);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitRequestOrder", "unique_id:%s last_transfer_bill_id:%s unpay_type:%s", objArr);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nr5();
        lVar.f152198b = new r45.or5();
        lVar.f152200d = 1380;
        lVar.f152199c = "/cgi-bin/mmpay-bin/request_tsbc";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f430959r = a17;
        r45.nr5 nr5Var = (r45.nr5) a17.f152243a.f152217a;
        nr5Var.f463152d = str;
        nr5Var.f463153e = str2;
        nr5Var.f463154f = str3;
        nr5Var.f463155g = i17;
        nr5Var.f463156h = i18;
        nr5Var.f463157i = str4;
        nr5Var.f463158m = i19;
        nr5Var.f463159n = i27;
        nr5Var.f463160o = str5;
        nr5Var.f463161p = str6;
        nr5Var.f463162q = gVar;
        nr5Var.f463163r = i28;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitRequestOrder", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.or5 or5Var = (r45.or5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f430960s = or5Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBankRemitRequestOrder", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(or5Var.f463997d), this.f430960s.f463998e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f430961t;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.or5 or5Var = (r45.or5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = or5Var.f463997d;
        this.f295563h = or5Var.f463998e;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public boolean M() {
        r45.h7 h7Var = this.f430960s.f464004n;
        return h7Var == null || h7Var.f457425d != 1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f430961t = u0Var;
        return mo9409x10f9447a(sVar, this.f430959r, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1380;
    }
}
