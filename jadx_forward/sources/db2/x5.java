package db2;

/* loaded from: classes.dex */
public final class x5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309769g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309770h;

    /* renamed from: i, reason: collision with root package name */
    public int f309771i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(java.lang.String friendUsername, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(friendUsername, "friendUsername");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6208;
        r45.xf3 xf3Var = new r45.xf3();
        xf3Var.set(1, db2.t4.f309704a.b(6208, qt2Var));
        xf3Var.set(2, gVar);
        xf3Var.set(3, friendUsername);
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        xf3Var.set(4, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        xf3Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        lVar.f152197a = xf3Var;
        lVar.f152198b = new r45.yf3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getfinderrelativepoilist";
        this.f309769g = lVar.a();
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderPoiRelateStream", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309770h;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309770h = u0Var;
        return mo9409x10f9447a(sVar, this.f309769g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6208;
    }
}
