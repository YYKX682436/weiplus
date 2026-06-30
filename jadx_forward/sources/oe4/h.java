package oe4;

/* loaded from: classes9.dex */
public class h extends oe4.g implements iu5.e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f426336d;

    /* renamed from: e, reason: collision with root package name */
    public iu5.b f426337e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f426338f;

    @Override // iu5.a
    public void B(iu5.b bVar) {
        this.f426337e = bVar;
    }

    @Override // oe4.g
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSoterMPUpdateAuthKey", "hy:NetSceneSoterMPUpdateAuthKey authkey required");
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f426336d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(4, -1, "", this);
        }
        iu5.b bVar = this.f426337e;
        if (bVar != null) {
            bVar.a(new iu5.d(false));
        }
    }

    @Override // oe4.g
    public void I(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSoterMPUpdateAuthKey", "hy: NetSceneSoterMPUpdateAuthKey onError: errType: %d, errcode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f426336d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f426336d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        iu5.b bVar = this.f426337e;
        if (bVar != null) {
            if (i18 == 0 && i19 == 0) {
                bVar.a(new iu5.d(true));
            } else {
                bVar.a(new iu5.d(false));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f426336d = u0Var;
        return mo9409x10f9447a(sVar, this.f426338f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1185;
    }

    @Override // iu5.a
    public void j(java.lang.Object obj) {
        iu5.c cVar = (iu5.c) obj;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.su6();
        lVar.f152198b = new r45.tu6();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/usrmsg/uploadsoterauthkey";
        lVar.f152200d = 1185;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f426338f = a17;
        r45.su6 su6Var = (r45.su6) a17.f152243a.f152217a;
        su6Var.f467510d = cVar.f376584a;
        su6Var.f467511e = cVar.f376585b;
    }

    @Override // iu5.a
    public void x() {
        gm0.j1.d().g(this);
    }
}
