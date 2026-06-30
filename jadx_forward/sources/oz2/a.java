package oz2;

/* loaded from: classes9.dex */
public class a extends oe4.g implements d50.l {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f431770d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f431771e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f431772f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f431773g = false;

    public a(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.jc6();
        lVar.f152198b = new r45.kc6();
        lVar.f152199c = "/cgi-bin/mmpay-bin/sotergetchallenge";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r6.f34501x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f431771e = a17;
        r45.jc6 jc6Var = (r45.jc6) a17.f152243a.f152217a;
        re4.v a18 = re4.u.a();
        java.lang.String str = a18.f476086a;
        java.lang.String str2 = a18.f476087b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSoterGetPayChallenge", "hy: cpu_id: %s, uid: %s", str, str2);
        jc6Var.f459236e = str;
        jc6Var.f459237f = str2;
        jc6Var.f459235d = 0;
        jc6Var.f459238g = i17;
        jc6Var.f459239h = 1;
    }

    @Override // oe4.g
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSoterGetPayChallenge", "hy: auth key expired");
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f431770d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void I(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f431770d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.kc6 kc6Var = (r45.kc6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            java.lang.String str2 = kc6Var.f460122d;
            this.f431772f = str2;
            mz2.d2 d2Var = mz2.d2.IML;
            d2Var.f414644d = str2;
            this.f431773g = 1 == kc6Var.f460123e;
            boolean z17 = this.f431773g;
            d2Var.f414646f = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSoterGetPayChallenge", "hy: challenge: %s, need auth key: %b", this.f431772f, java.lang.Boolean.valueOf(z17));
        }
        this.f431770d.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f431770d = u0Var;
        return mo9409x10f9447a(sVar, this.f431771e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r6.f34501x366c91de;
    }
}
