package c72;

/* loaded from: classes8.dex */
public class s extends c72.v implements c72.c {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f121121g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f121122h = "";

    public s(long j17, java.lang.String str, java.lang.String str2) {
        c72.d dVar = new c72.d();
        this.f121121g = dVar;
        r45.ln5 ln5Var = ((c72.i) dVar.mo47979x2d63726f()).f121087a;
        ln5Var.f461197g = c72.v.f121126f;
        ln5Var.f461194d = j17;
        ln5Var.f461195e = str;
        ln5Var.f461196f = str2;
    }

    @Override // c72.v
    public int H(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f121121g;
        return mo9409x10f9447a(sVar, v0Var, this);
    }

    @Override // c72.v
    public r45.vt4 I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return ((c72.j) v0Var.mo13821x7f35c2d1()).f121088a.f462228e;
    }

    @Override // c72.v
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.mn5 mn5Var;
        c72.j jVar = (c72.j) v0Var.mo13821x7f35c2d1();
        if (i18 == 0 && i19 == 0) {
            r45.mn5 mn5Var2 = jVar.f121088a;
            int i27 = mn5Var2.f462229f;
            boolean z17 = i27 == 0;
            this.f121122h = mn5Var2.f462227d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceRegFaceRsa", "hy: is verify ok: %b, youtuRet; %d, has random pwd: %b", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(jVar.f121088a.f462229f), java.lang.Boolean.valueOf(true ^ com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f121122h)));
            i19 = i27;
        } else if (jVar != null && (mn5Var = jVar.f121088a) != null && mn5Var.f462229f != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceRegFaceRsa", "hy: has detail ret. use");
            i19 = jVar.f121088a.f462229f;
        }
        this.f121127e.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // c72.v
    public void K(java.lang.String str) {
        ((c72.i) this.f121121g.mo47979x2d63726f()).f121087a.f461197g = str;
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
        return this.f121122h;
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
