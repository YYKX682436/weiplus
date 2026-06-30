package c72;

/* loaded from: classes8.dex */
public class z extends c72.v implements c72.c {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f121137g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f121138h = "";

    public z(long j17, java.lang.String str, java.lang.String str2) {
        c72.e eVar = new c72.e();
        this.f121137g = eVar;
        r45.hx6 hx6Var = ((c72.m) eVar.mo47979x2d63726f()).f121091a;
        hx6Var.f458076d = c72.v.f121126f;
        hx6Var.f458077e = j17;
        hx6Var.f458080h = str2;
        hx6Var.f458079g = str;
    }

    @Override // c72.v
    public int H(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f121137g;
        return mo9409x10f9447a(sVar, v0Var, this);
    }

    @Override // c72.v
    public r45.vt4 I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return ((c72.n) v0Var.mo13821x7f35c2d1()).f121092a.f458931e;
    }

    @Override // c72.v
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.ix6 ix6Var;
        c72.n nVar = (c72.n) v0Var.mo13821x7f35c2d1();
        if (i18 == 0 && i19 == 0) {
            r45.ix6 ix6Var2 = nVar.f121092a;
            boolean z17 = ix6Var2.f458932f == 0;
            this.f121138h = ix6Var2.f458930d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: is verify ok: %b, youtuRet: %d, has random pwd: %b", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(nVar.f121092a.f458932f), java.lang.Boolean.valueOf(true ^ com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f121138h)));
            i19 = nVar.f121092a.f458932f;
        } else if (nVar != null && (ix6Var = nVar.f121092a) != null && ix6Var.f458932f != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: has detail ret. use");
            i19 = nVar.f121092a.f458932f;
        }
        this.f121127e.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // c72.v
    public void K(java.lang.String str) {
        ((c72.m) this.f121137g.mo47979x2d63726f()).f121091a.f458076d = str;
    }

    @Override // c72.c
    public boolean e() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 930;
    }

    @Override // c72.c
    public java.lang.String n() {
        return this.f121138h;
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
