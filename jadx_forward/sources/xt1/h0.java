package xt1;

/* loaded from: classes14.dex */
public class h0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f538019d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f538020e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f538021f;

    public h0(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6, r45.pd6 pd6Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.dc3();
        lVar.f152198b = new r45.ec3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getcarditeminfo";
        lVar.f152200d = 1057;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f538019d = a17;
        r45.dc3 dc3Var = (r45.dc3) a17.f152243a.f152217a;
        dc3Var.f453832d = str;
        dc3Var.f453833e = i17;
        dc3Var.f453834f = str2;
        dc3Var.f453835g = str3;
        dc3Var.f453837i = str4;
        dc3Var.f453836h = str5;
        dc3Var.f453838m = i18;
        dc3Var.f453839n = str6;
        dc3Var.f453840o = pd6Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f538020e = u0Var;
        return mo9409x10f9447a(sVar, this.f538019d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1057;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCardItemInfo", "onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            this.f538021f = ((r45.ec3) this.f538019d.f152244b.f152233a).f454798d;
        }
        this.f538020e.mo815x76e0bfae(i18, i19, str, this);
    }
}
