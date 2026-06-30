package db2;

/* loaded from: classes.dex */
public final class q1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f309657o;

    public q1(int i17, int i18, java.lang.String str) {
        super(null, 1, null);
        this.f309657o = "Finder.CgiFinderGetSelfHistoryList";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.g91 g91Var = new r45.g91();
        g91Var.set(2, str);
        g91Var.set(3, java.lang.Integer.valueOf(i17));
        g91Var.set(4, java.lang.Integer.valueOf(i18));
        g91Var.set(1, db2.t4.f309704a.a(7011));
        lVar.f152197a = g91Var;
        lVar.f152200d = 7011;
        lVar.f152198b = new r45.h91();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetplaylist";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetSelfHistoryList", "CgiFinderGetSelfHistoryList tabType: " + i17 + ", itemType: " + i18);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.h91 resp = (r45.h91) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309657o, "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
