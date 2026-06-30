package bq;

/* loaded from: classes2.dex */
public final class o0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f105034o;

    public o0(java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f105034o = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.k81 k81Var = new r45.k81();
        db2.t4 t4Var = db2.t4.f309704a;
        k81Var.f460015d = t4Var.b(7198, qt2Var);
        k81Var.f460016e = str;
        k81Var.f460017f = 0;
        k81Var.f460018g = gVar;
        k81Var.f460015d = t4Var.b(7198, qt2Var);
        lVar.f152197a = k81Var;
        r45.l81 l81Var = new r45.l81();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmemberdraft";
        lVar.f152200d = 7198;
        lVar.f152198b = l81Var;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGetMemberDraftCgi", "FinderGetMemberDraftCgi init finderUserName " + str + " lastBuffer:" + gVar);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.l81 resp = (r45.l81) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGetMemberDraftCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
