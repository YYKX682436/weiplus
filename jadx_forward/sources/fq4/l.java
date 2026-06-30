package fq4;

/* loaded from: classes12.dex */
public class l extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f347147d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f347148e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f347149f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f347150g = 0;

    public l(int i17, java.lang.String str) {
        fq4.b bVar = new fq4.b();
        this.f347148e = bVar;
        c01.j9 j9Var = (c01.j9) bVar.mo47979x2d63726f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRsaGetVoicePrintResource", "sceneType %d %s", java.lang.Integer.valueOf(i17), str);
        r45.er3 er3Var = j9Var.f118802a;
        er3Var.f455224d = i17;
        er3Var.f455225e = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f347147d = u0Var;
        return mo9409x10f9447a(sVar, this.f347148e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 616;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        c01.k9 k9Var = (c01.k9) v0Var.mo13821x7f35c2d1();
        if (i18 == 4 && i19 == -102) {
            gm0.j1.e().j(new fq4.k(this, v0Var.mo47979x2d63726f().m150614x960aaed8().f424532c));
        } else {
            if (i18 != 0 && i19 != 0) {
                this.f347147d.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            r45.wr5 wr5Var = k9Var.f118820a.f456108d;
            if (wr5Var != null) {
                this.f347149f = new java.lang.String(wr5Var.f470936e.f453374f.f273689a);
                this.f347150g = k9Var.f118820a.f456108d.f470935d;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneRsaGetVoicePrintResource", "resp ResourceData null ");
            }
            this.f347147d.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
    }
}
