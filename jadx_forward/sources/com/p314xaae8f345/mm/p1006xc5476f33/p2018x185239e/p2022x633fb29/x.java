package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class x extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public r45.zv f238590d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f238591e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f238592f;

    public x(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, int i19, java.lang.String str5, java.lang.String str6, int i27) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yv();
        lVar.f152198b = new r45.zv();
        lVar.f152200d = 2773;
        lVar.f152199c = "/cgi-bin/mmpay-bin/f2fsucpage";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f238591e = a17;
        r45.yv yvVar = (r45.yv) a17.f152243a.f152217a;
        yvVar.f472918d = str;
        yvVar.f472919e = str2;
        yvVar.f472920f = i17;
        yvVar.f472921g = str3;
        yvVar.f472922h = str4;
        yvVar.f472923i = i18;
        yvVar.f472924m = i19;
        yvVar.f472925n = str5;
        yvVar.f472926o = str6;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f238592f = u0Var;
        return mo9409x10f9447a(sVar, this.f238591e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2773;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneF2fSuccPage", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.zv zvVar = (r45.zv) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238590d = zvVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneF2fSuccPage", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(zvVar.f473914d), this.f238590d.f473915e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f238592f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
