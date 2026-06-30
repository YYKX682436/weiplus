package xt1;

/* loaded from: classes9.dex */
public class q0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f538085d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f538086e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f538087f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f538088g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f538089h;

    public q0(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ea3();
        lVar.f152198b = new r45.fa3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getavailablecard";
        lVar.f152200d = ib1.n.f69905x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f538085d = a17;
        r45.ea3 ea3Var = (r45.ea3) a17.f152243a.f152217a;
        ea3Var.f454718d = str;
        ea3Var.f454719e = i17;
        ea3Var.f454720f = str2;
        ea3Var.f454721g = str3;
        ea3Var.f454722h = i18;
        ea3Var.f454723i = str4;
        ea3Var.f454724m = str5;
        ea3Var.f454725n = str6;
        ea3Var.f454726o = gVar;
        if ("INVOICE".equalsIgnoreCase(str6)) {
            ea3Var.f454727p = 1;
        } else {
            ea3Var.f454727p = 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f538086e = u0Var;
        return mo9409x10f9447a(sVar, this.f538085d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return ib1.n.f69905x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetsceneGetAvailableCard", "onGYNetEnd, errType = " + i18 + " errCode = " + i19);
        if (i18 == 0 && i19 == 0) {
            r45.fa3 fa3Var = (r45.fa3) this.f538085d.f152244b.f152233a;
            this.f538087f = fa3Var.f455673d;
            this.f538088g = fa3Var.f455675f;
            this.f538089h = fa3Var.f455674e != 0;
        }
        this.f538086e.mo815x76e0bfae(i18, i19, str, this);
    }
}
