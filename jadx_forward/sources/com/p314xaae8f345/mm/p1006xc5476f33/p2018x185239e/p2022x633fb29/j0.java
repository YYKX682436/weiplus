package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes2.dex */
public class j0 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f238395d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pq4 f238396e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f238397f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f238398g;

    public j0(java.lang.String str, long j17, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneRemittanceMsgCheck", "transferID: %s, amount:%s msgCheckStr:%s", str, java.lang.Long.valueOf(j17), str2);
        this.f238398g = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.oq4();
        lVar.f152198b = new r45.pq4();
        lVar.f152200d = 6230;
        lVar.f152199c = "/cgi-bin/mmpay-bin/transfermsgcheck";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f238395d = a17;
        r45.oq4 oq4Var = (r45.oq4) a17.f152243a.f152217a;
        oq4Var.f463980d = str;
        oq4Var.f463981e = j17;
        oq4Var.f463982f = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f238397f = u0Var;
        return mo9409x10f9447a(sVar, this.f238395d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6230;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneRemittanceMsgCheck", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.pq4 pq4Var = (r45.pq4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238396e = pq4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneRemittanceMsgCheck", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(pq4Var.f464843d), this.f238396e.f464844e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f238397f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
