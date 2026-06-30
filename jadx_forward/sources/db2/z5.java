package db2;

/* loaded from: classes5.dex */
public final class z5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309796g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309797h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(java.util.LinkedList reqItems) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqItems, "reqItems");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6218;
        r45.s81 s81Var = new r45.s81();
        s81Var.set(1, db2.t4.f309704a.a(6218));
        s81Var.set(2, reqItems);
        s81Var.set(4, g92.b.f351302e.U());
        lVar.f152197a = s81Var;
        lVar.f152198b = new r45.t81();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmsgsession";
        this.f309796g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderSessionStatus", "NetSceneFinderSessionStatus");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(i18);
            sb6.append(',');
            sb6.append(i19);
            g0Var.d(20492, 7L, sb6.toString());
            g0Var.C(1473L, 7L, 1L);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309797h;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309797h = u0Var;
        return mo9409x10f9447a(sVar, this.f309796g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6218;
    }
}
