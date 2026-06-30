package bq;

/* loaded from: classes.dex */
public final class w1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(java.lang.String friendUsername, java.lang.String poiId) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(friendUsername, "friendUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiId, "poiId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6495;
        r45.u03 u03Var = new r45.u03();
        u03Var.set(1, db2.t4.f309704a.a(6495));
        u03Var.set(3, friendUsername);
        u03Var.set(2, poiId);
        lVar.f152197a = u03Var;
        lVar.f152198b = new r45.v03();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderunbindpoi";
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.v03 resp = (r45.v03) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUnBindPoiStreamCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
