package xt1;

/* loaded from: classes9.dex */
public class n0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f538063d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f538064e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f538065f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f538066g;

    /* renamed from: h, reason: collision with root package name */
    public int f538067h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f538068i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f538069m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f538070n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f538071o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f538072p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f538073q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f538074r;

    public n0(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.eb5();
        lVar.f152198b = new r45.fb5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/preacceptgiftcard";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.c.f33375x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f538063d = a17;
        r45.eb5 eb5Var = (r45.eb5) a17.f152243a.f152217a;
        eb5Var.f454769d = i17;
        eb5Var.f454770e = str;
        eb5Var.f454771f = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f538064e = u0Var;
        return mo9409x10f9447a(sVar, this.f538063d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.c.f33375x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePreAcceptGiftCard", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.fb5 fb5Var = (r45.fb5) this.f538063d.f152244b.f152233a;
            this.f538065f = fb5Var.f455703d;
            this.f538066g = fb5Var.f455704e;
            this.f538067h = fb5Var.f455705f;
            this.f538068i = fb5Var.f455706g;
            this.f538069m = fb5Var.f455707h;
            this.f538070n = fb5Var.f455709m;
            this.f538071o = fb5Var.f455710n;
            this.f538072p = fb5Var.f455711o;
            this.f538073q = fb5Var.f455712p;
            this.f538074r = fb5Var.f455713q;
        }
        this.f538064e.mo815x76e0bfae(i18, i19, str, this);
    }
}
