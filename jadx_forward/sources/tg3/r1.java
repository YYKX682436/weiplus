package tg3;

/* loaded from: classes11.dex */
public class r1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, l90.l {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f500746d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f500747e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f500748f;

    /* renamed from: g, reason: collision with root package name */
    public final int f500749g;

    public r1(java.lang.String str, int i17) {
        this(str, 1, i17, false);
    }

    public r45.iw5 H() {
        r45.iw5 iw5Var = (r45.iw5) this.f500747e.f152244b.f152233a;
        if (iw5Var != null) {
            java.util.Iterator it = iw5Var.E.iterator();
            while (it.hasNext()) {
                r45.gw5 gw5Var = (r45.gw5) it.next();
                ((us.a) ((vs.e) i95.n0.c(vs.e.class))).Bi(gw5Var.f457094d.f454289d, 0, gw5Var.F);
            }
        }
        return iw5Var;
    }

    public boolean I() {
        return this.f500748f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f500746d = u0Var;
        return mo9409x10f9447a(sVar, this.f500747e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 106;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.iw5 iw5Var = (r45.iw5) this.f500747e.f152244b.f152233a;
        if (iw5Var != null && iw5Var.D > 0) {
            java.util.Iterator it = iw5Var.E.iterator();
            while (it.hasNext()) {
                r45.gw5 gw5Var = (r45.gw5) it.next();
                r45.du5 du5Var = gw5Var.f457094d;
                com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                r0Var.f152062a = x51.j1.g(du5Var);
                r0Var.f152066e = gw5Var.D;
                r0Var.f152065d = gw5Var.E;
                r0Var.f152070i = -1;
                r0Var.f152063b = 3;
                r0Var.f152067f = 1;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
                vs.e eVar = (vs.e) i95.n0.c(vs.e.class);
                ((us.a) eVar).Bi(x51.j1.g(gw5Var.f457094d), this.f500749g, gw5Var.F);
            }
        } else if (iw5Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x51.j1.g(iw5Var.f458889d))) {
            java.lang.String g17 = x51.j1.g(iw5Var.f458889d);
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var2 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            r0Var2.f152062a = g17;
            r0Var2.f152066e = iw5Var.F;
            r0Var2.f152065d = iw5Var.G;
            r0Var2.f152070i = -1;
            r0Var2.f152063b = 3;
            r0Var2.f152067f = 1;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var2);
        }
        if (iw5Var != null) {
            java.util.Iterator it6 = iw5Var.N.iterator();
            while (it6.hasNext()) {
                r45.cx5 cx5Var = (r45.cx5) it6.next();
                com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var3 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                r0Var3.f152062a = cx5Var.f453433d;
                r0Var3.f152066e = cx5Var.f453438i;
                r0Var3.f152065d = cx5Var.f453439m;
                r0Var3.f152070i = -1;
                r0Var3.f152063b = 3;
                r0Var3.f152067f = 1;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var3);
            }
        }
        this.f500746d.mo815x76e0bfae(i18, i19, str, this);
    }

    public r1(java.lang.String str, int i17, int i18, boolean z17) {
        this(str, i17, i18, z17, 1);
    }

    public r1(java.lang.String str, int i17, int i18, boolean z17, int i19) {
        this.f500748f = z17;
        this.f500749g = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.hw5();
        lVar.f152198b = new r45.iw5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/searchcontact";
        lVar.f152200d = 106;
        lVar.f152201e = 34;
        lVar.f152202f = 1000000034;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f500747e = a17;
        r45.hw5 hw5Var = (r45.hw5) a17.f152243a.f152217a;
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = str;
        du5Var.f454290e = true;
        hw5Var.f458049d = du5Var;
        hw5Var.f458052g = i17;
        hw5Var.f458053h = i18;
        hw5Var.f458054i = i19;
    }
}
