package xt1;

/* loaded from: classes4.dex */
public class m0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f538056d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f538057e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f538058f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f538059g;

    /* renamed from: h, reason: collision with root package name */
    public int f538060h;

    public m0(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.it3();
        lVar.f152198b = new r45.jt3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/giftcarditem";
        lVar.f152200d = 1045;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f538056d = a17;
        r45.it3 it3Var = (r45.it3) a17.f152243a.f152217a;
        it3Var.f458849d = str;
        it3Var.f458850e = str2;
        it3Var.f458851f = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f538057e = u0Var;
        return mo9409x10f9447a(sVar, this.f538056d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1045;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGiftCardItem", "onGYNetEnd, errType = " + i18 + " errCode = " + i19);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f538056d;
        if (i18 == 0 && i19 == 0) {
            r45.jt3 jt3Var = (r45.jt3) oVar.f152244b.f152233a;
            if (jt3Var != null) {
                this.f538058f = jt3Var.f459629d;
                this.f538059g = jt3Var.f459631f;
                this.f538060h = jt3Var.f459630e;
            }
        } else {
            r45.jt3 jt3Var2 = (r45.jt3) oVar.f152244b.f152233a;
            if (jt3Var2 != null) {
                this.f538058f = jt3Var2.f459629d;
                this.f538059g = jt3Var2.f459631f;
                this.f538060h = jt3Var2.f459630e;
            }
        }
        this.f538057e.mo815x76e0bfae(i18, i19, str, this);
    }
}
