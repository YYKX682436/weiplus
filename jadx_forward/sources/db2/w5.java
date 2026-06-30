package db2;

/* loaded from: classes.dex */
public final class w5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f309756g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309757h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309758i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w5(int i17, java.lang.String reportData) {
        super(null, 1, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportData, "reportData");
        this.f309756g = "Finder.NetSceneFinderPassReport";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4093;
        r45.ho2 ho2Var = new r45.ho2();
        ho2Var.set(1, java.lang.Integer.valueOf(i17));
        ho2Var.set(2, reportData);
        lVar.f152197a = ho2Var;
        r45.io2 io2Var = new r45.io2();
        io2Var.set(0, new r45.ie());
        lVar.f152198b = io2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderpassreport";
        this.f309757h = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderPassReport", "NetSceneFinderPassReport " + i17 + ", " + reportData);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309756g, "NetSceneFinderPassReport onGYNetEnd " + i18 + ' ' + i19 + ' ' + str + ' ');
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309758i;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309758i = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309756g, "NetSceneFinderPassReport doScene");
        return mo9409x10f9447a(sVar, this.f309757h, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4093;
    }
}
