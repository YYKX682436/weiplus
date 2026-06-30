package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes2.dex */
public class k0 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f238406d;

    /* renamed from: e, reason: collision with root package name */
    public r45.tx f238407e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f238408f;

    public k0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, java.lang.String str5) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.sx();
        lVar.f152198b = new r45.tx();
        lVar.f152200d = 1779;
        lVar.f152199c = "/cgi-bin/mmpay-bin/transferoldpaycheck";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f238406d = a17;
        r45.sx sxVar = (r45.sx) a17.f152243a.f152217a;
        sxVar.f467530d = str;
        sxVar.f467531e = str2;
        sxVar.f467532f = str3;
        sxVar.f467533g = str4;
        sxVar.f467534h = j17;
        sxVar.f467535i = str5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRemittancePayCheck", "reqKey: %s, transfer: %s, fee: %s", str, str2, java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f238408f = u0Var;
        return mo9409x10f9447a(sVar, this.f238406d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1779;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRemittancePayCheck", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.tx txVar = (r45.tx) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238407e = txVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRemittancePayCheck", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(txVar.f468373d), this.f238407e.f468374e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f238408f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
