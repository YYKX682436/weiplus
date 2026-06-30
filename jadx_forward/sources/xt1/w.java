package xt1;

/* loaded from: classes11.dex */
public class w extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f538128d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f538129e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f538130f;

    /* renamed from: g, reason: collision with root package name */
    public int f538131g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f538132h;

    public w(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, int i19, r45.pd6 pd6Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.s0();
        lVar.f152198b = new r45.t0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/acceptcarditem";
        lVar.f152200d = 1037;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f538128d = a17;
        r45.s0 s0Var = (r45.s0) a17.f152243a.f152217a;
        s0Var.f466886f = str;
        s0Var.f466884d = str2;
        s0Var.f466885e = i17;
        s0Var.f466887g = str3;
        s0Var.f466889i = str4;
        s0Var.f466888h = str5;
        s0Var.f466890m = i18;
        s0Var.f466891n = i19;
        s0Var.f466892o = pd6Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f538129e = u0Var;
        return mo9409x10f9447a(sVar, this.f538128d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1037;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAcceptCardItem", "onGYNetEnd, errType = " + i18 + " errCode = " + i19);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f538128d;
        if (i18 == 0 && i19 == 0) {
            r45.t0 t0Var = (r45.t0) oVar.f152244b.f152233a;
            if (t0Var != null) {
                this.f538130f = t0Var.f467576d;
                this.f538131g = t0Var.f467577e;
                this.f538132h = t0Var.f467578f;
            }
        } else {
            r45.t0 t0Var2 = (r45.t0) oVar.f152244b.f152233a;
            if (t0Var2 != null) {
                this.f538130f = t0Var2.f467576d;
                this.f538131g = t0Var2.f467577e;
                this.f538132h = t0Var2.f467578f;
            }
        }
        this.f538129e.mo815x76e0bfae(i18, i19, str, this);
    }
}
