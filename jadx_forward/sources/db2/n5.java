package db2;

/* loaded from: classes.dex */
public final class n5 extends az2.u implements zy2.kc {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309633g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309634h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f309635i;

    public n5(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j17, int i17, r45.qt2 qt2Var) {
        super(null, 1, null);
        this.f309635i = "Finder.NetSceneFinderGetFansList";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3531;
        r45.u51 u51Var = new r45.u51();
        u51Var.set(1, xy2.c.f(qt2Var));
        u51Var.set(3, gVar);
        u51Var.set(4, db2.t4.f309704a.a(3531));
        u51Var.set(5, java.lang.Long.valueOf(j17));
        u51Var.set(6, java.lang.Integer.valueOf(i17));
        lVar.f152197a = u51Var;
        lVar.f152198b = new r45.v51();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetfanslist";
        this.f309633g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGetFansList", "NetSceneFinderGetFansList,liveId:" + j17 + ",scene:" + i17);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309635i, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 9L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 10L, 1L, false);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309634h;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309634h = u0Var;
        return mo9409x10f9447a(sVar, this.f309633g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3531;
    }
}
