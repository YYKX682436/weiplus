package fq4;

/* loaded from: classes12.dex */
public class h extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f347131d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f347132e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f347133f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f347134g = 2;

    public h(int i17, java.lang.String str) {
        fq4.c cVar = new fq4.c();
        this.f347132e = cVar;
        r45.ir3 ir3Var = ((c01.l9) cVar.mo47979x2d63726f()).f118842a;
        ir3Var.f458813d = str;
        ir3Var.f458814e = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetVoiceprintTicketRsa", "sceneType %d %s", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f347131d = u0Var;
        return mo9409x10f9447a(sVar, this.f347132e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ia.f34362x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.jr3 jr3Var = ((c01.m9) v0Var.mo13821x7f35c2d1()).f118864a;
        this.f347133f = jr3Var.f459599d;
        if (i18 == 4 && i19 == -301) {
            c01.f9.d(jr3Var.f459600e, jr3Var.f459602g, jr3Var.f459601f, true, 0);
            int i27 = this.f347134g - 1;
            this.f347134g = i27;
            if (i27 <= 0) {
                this.f347131d.mo815x76e0bfae(3, -1, "", this);
                return;
            } else {
                mo807x6c193ac1(m47995xb7ba1aa7(), this.f347131d);
                return;
            }
        }
        if (i18 == 4 && i19 == -102) {
            gm0.j1.e().j(new fq4.g(this, v0Var.mo47979x2d63726f().m150614x960aaed8().f424532c));
        } else if (i18 == 0 || i19 == 0) {
            this.f347131d.mo815x76e0bfae(i18, i19, str, this);
        } else {
            this.f347131d.mo815x76e0bfae(i18, i19, str, this);
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
