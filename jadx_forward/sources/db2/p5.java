package db2;

/* loaded from: classes.dex */
public final class p5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309652g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309653h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f309654i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String userName) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f309654i = "Finder.NetSceneFinderGetFollowTopicList";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 712;
        r45.m61 m61Var = new r45.m61();
        m61Var.set(1, gVar);
        m61Var.set(3, db2.t4.f309704a.a(712));
        m61Var.set(2, userName);
        lVar.f152197a = m61Var;
        lVar.f152198b = new r45.n61();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetfollowtopiclist";
        this.f309652g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGetFollowTopicList", "NetSceneFinderGetFollowList init ");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309654i, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 7L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 8L, 1L, false);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309653h;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309653h = u0Var;
        return mo9409x10f9447a(sVar, this.f309652g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 712;
    }
}
