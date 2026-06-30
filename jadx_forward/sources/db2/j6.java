package db2;

/* loaded from: classes2.dex */
public final class j6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f309567g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309568h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309569i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j6(java.lang.String query) {
        super(null, 1, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        this.f309567g = "Finder.NetSceneRingtoneSuggestion";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 8968;
        lVar.f152199c = "/cgi-bin/micromsg-bin/ringbacksearchwordsuggest";
        t45.s0 s0Var = new t45.s0();
        s0Var.f497174d = query;
        lVar.f152197a = s0Var;
        lVar.f152198b = new t45.t0();
        this.f309568h = lVar.a();
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309567g, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309569i;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309569i = u0Var;
        return mo9409x10f9447a(sVar, this.f309568h, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 8968;
    }
}
