package ef3;

/* loaded from: classes9.dex */
public class k extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f333947d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f333948e;

    /* renamed from: f, reason: collision with root package name */
    public r45.o93 f333949f;

    /* renamed from: g, reason: collision with root package name */
    public final int f333950g;

    public k(int i17, boolean z17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.n93();
        lVar.f152198b = new r45.o93();
        lVar.f152200d = 4362;
        lVar.f152199c = "/cgi-bin/micromsg-bin/getallfunction";
        lVar.f152211o = 1;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f333947d = a17;
        r45.n93 n93Var = (r45.n93) a17.f152243a.f152217a;
        this.f333950g = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetPayFunctionListNew", "walletRegion: %s, hasCache: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        n93Var.f462714d = i17;
        n93Var.f462715e = !z17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f333948e = u0Var;
        return mo9409x10f9447a(sVar, this.f333947d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4362;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetPayFunctionListNew", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.o93 o93Var = (r45.o93) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            this.f333949f = o93Var;
            if (o93Var != null) {
                try {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(bt4.d.f(this.f333950g), ot5.e.a(o93Var.mo14344x5f01b1f6()));
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallLogic", "save config exp, " + e17.getLocalizedMessage());
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f333948e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
