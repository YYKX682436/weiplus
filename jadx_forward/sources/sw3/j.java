package sw3;

/* loaded from: classes9.dex */
public class j extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f495006d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pp6 f495007e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f495008f;

    public j(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.op6();
        lVar.f152198b = new r45.pp6();
        lVar.f152200d = 2817;
        lVar.f152199c = "/cgi-bin/mmpay-bin/transferphonepaycheck";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f495006d = a17;
        r45.op6 op6Var = (r45.op6) a17.f152243a.f152217a;
        op6Var.f463962d = str;
        op6Var.f463963e = str2;
        op6Var.f463964f = str3;
        op6Var.f463965g = str4;
        op6Var.f463966h = j17;
        op6Var.f463967i = str5;
        op6Var.f463968m = str6;
        op6Var.f463969n = str7;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "do scene NetSceneMobileRemitPayCheck reqKey:%s transferId:%s transactionId:%s receiverOpenid:%s fee:%s extendStr:%s rcvrToken:%s placeorderToken:%s", str, str2, str3, str4, java.lang.Long.valueOf(j17), str5, str6, str7);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f495008f = u0Var;
        return mo9409x10f9447a(sVar, this.f495006d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2817;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.pp6 pp6Var = (r45.pp6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f495007e = pp6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(pp6Var.f464828d), this.f495007e.f464829e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f495008f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
