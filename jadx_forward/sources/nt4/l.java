package nt4;

/* loaded from: classes9.dex */
public class l extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f421369d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f421370e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f421371f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f421372g;

    /* renamed from: h, reason: collision with root package name */
    public r45.v67 f421373h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f421374i;

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17, int i18, int i19, java.lang.String str9) {
        this.f421374i = "";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.w73();
        lVar.f152198b = new r45.x73();
        lVar.f152199c = mo149969xb5887636();
        lVar.f152200d = mo808xfb85f7b0();
        lVar.f152201e = 189;
        lVar.f152202f = 1000000189;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.J(str4);
        lVar.f152204h = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f421370e = a17;
        this.f421374i = str7;
        re4.v a18 = re4.u.a();
        r45.w73 w73Var = (r45.w73) a17.f152243a.f152217a;
        w73Var.f470461d = str;
        w73Var.f470464g = str4;
        w73Var.f470462e = str3;
        w73Var.f470465h = str5;
        w73Var.f470466i = str2;
        w73Var.f470463f = str6;
        w73Var.f470467m = str7;
        w73Var.f470468n = str8;
        w73Var.f470469o = i17;
        w73Var.f470472r = a18.f476086a;
        w73Var.f470471q = a18.f476087b;
        w73Var.f470473s = at4.g0.c();
        if (i18 > 0) {
            w73Var.f470474t = i18;
        }
        w73Var.f470475u = i19;
        w73Var.f470476v = str9;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f421369d = u0Var;
        return mo9409x10f9447a(sVar, this.f421370e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 398;
    }

    /* renamed from: getUri */
    public java.lang.String mo149969xb5887636() {
        return "/cgi-bin/mmpay-bin/genprepay";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        r45.x73 x73Var = (r45.x73) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGenPrepay", "hy: errCode and errMsg in proto: errCode: %d, errMsg:%s", java.lang.Integer.valueOf(x73Var.f471375f), x73Var.f471376g);
        if (i18 == 0 && i19 == 0) {
            this.f421371f = x73Var.f471373d;
            this.f421372g = x73Var.f471374e;
            this.f421373h = x73Var.f471377h;
        }
        java.lang.String str2 = x73Var.f471376g;
        this.f421369d.mo815x76e0bfae(i18, x73Var.f471375f, str2, this);
    }
}
