package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class r extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f238518d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ep f238519e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f238520f;

    public r(r45.k6 k6Var, java.lang.String str, int i17, int i18, long j17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.dp();
        lVar.f152198b = new r45.ep();
        lVar.f152200d = 2504;
        lVar.f152199c = "/cgi-bin/mmpay-bin/busif2fsucpage";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f238518d = a17;
        r45.dp dpVar = (r45.dp) a17.f152243a.f152217a;
        dpVar.f454162d = k6Var;
        dpVar.f454163e = str;
        dpVar.f454164f = i17;
        if (i17 == 1) {
            dpVar.f454165g = i18;
            dpVar.f454166h = j17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fSucpage", "NetSceneBusiF2fSucpage suc_page_extend %s req %s fault_flag %s fault_retry_cnt %s fault_retry_client_time %s", str, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a.b(k6Var), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f238520f = u0Var;
        return mo9409x10f9447a(sVar, this.f238518d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2504;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fSucpage", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f238519e = (r45.ep) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (this.f238519e.f455165g != null) {
            stringBuffer.append("response: " + this.f238519e.f455166h);
            stringBuffer.append("is_show_btn: " + this.f238519e.f455165g.f82640g);
            if (this.f238519e.f455165g.f82637d != null) {
                stringBuffer.append("single_exposure_info_list " + this.f238519e.f455165g.f82637d.size());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fSucpage", "ret_code: %s, ret_msg: %s %s", java.lang.Integer.valueOf(this.f238519e.f455162d), this.f238519e.f455163e, stringBuffer.toString());
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f238520f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
