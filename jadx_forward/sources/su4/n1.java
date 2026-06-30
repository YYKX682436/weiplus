package su4;

/* loaded from: classes.dex */
public class n1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494545d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494546e;

    /* renamed from: f, reason: collision with root package name */
    public r45.aa7 f494547f;

    /* renamed from: g, reason: collision with root package name */
    public final su4.r1 f494548g;

    public n1(su4.r1 r1Var) {
        this.f494548g = r1Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 719;
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmwebsearch";
        lVar.f152197a = new r45.z97();
        lVar.f152198b = new r45.aa7();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494546e = a17;
        r45.z97 z97Var = (r45.z97) a17.f152243a.f152217a;
        z97Var.f473355e = r1Var.f494595b;
        z97Var.f473354d = r1Var.f494594a;
        z97Var.f473357g = r1Var.f494597d;
        z97Var.f473359i = su4.r2.i();
        z97Var.f473356f = r1Var.f494596c;
        int i17 = r1Var.H;
        z97Var.f473358h = i17 == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0) : i17;
        z97Var.f473360m = r1Var.f494598e;
        z97Var.f473361n = r1Var.f494599f;
        z97Var.f473362o = r1Var.f494600g;
        z97Var.f473363p = r1Var.f494601h;
        z97Var.f473364q = r1Var.f494602i;
        z97Var.f473366s = r1Var.f494604k;
        z97Var.f473365r = r1Var.f494603j;
        z97Var.f473367t = r1Var.f494605l;
        z97Var.f473370w = r1Var.f494608o;
        z97Var.f473369v = r1Var.f494607n;
        z97Var.f473371x = r1Var.f494609p;
        z97Var.f473372y = r1Var.f494611r;
        z97Var.A = r1Var.f494615v;
        z97Var.F = com.p314xaae8f345.mm.ui.bk.C() ? 1 : 0;
        z97Var.G = su4.r2.g();
        if (z97Var.f473359i == null) {
            r45.e64 e64Var = new r45.e64();
            z97Var.f473359i = e64Var;
            e64Var.f454586n = !su4.r2.j() ? 1 : 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494545d = u0Var;
        return mo9409x10f9447a(sVar, this.f494546e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 719;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneMMWebSearch", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        this.f494547f = (r45.aa7) this.f494546e.f152244b.f152233a;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f494545d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
