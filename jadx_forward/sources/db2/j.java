package db2;

/* loaded from: classes.dex */
public final class j extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f309556m;

    public j(java.lang.String finderUsername, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        java.lang.String concat = "Cgi.FinderAccountRecommend#".concat(finderUsername);
        this.f309556m = concat;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ct0 ct0Var = new r45.ct0();
        ct0Var.set(1, db2.t4.f309704a.a(10027));
        ct0Var.set(2, finderUsername);
        ct0Var.set(4, gVar);
        ct0Var.set(5, java.lang.Integer.valueOf(i17));
        lVar.f152197a = ct0Var;
        lVar.f152198b = new r45.dt0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderacctrecommend";
        lVar.f152200d = 10027;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(concat, "[CgiFinderAccountRecommend] created...");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.dt0 resp = (r45.dt0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309556m, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309556m, "[run]...");
        pq5.g l17 = super.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        return l17;
    }
}
