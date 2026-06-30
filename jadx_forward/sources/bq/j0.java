package bq;

/* loaded from: classes.dex */
public final class j0 extends bq.e {
    public j0(r45.qt2 qt2Var, long j17) {
        super(qt2Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.c61 c61Var = new r45.c61();
        c61Var.set(1, db2.t4.f309704a.b(22069, qt2Var));
        c61Var.set(2, java.lang.Long.valueOf(j17));
        lVar.f152197a = c61Var;
        r45.d61 d61Var = new r45.d61();
        d61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) d61Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = d61Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetfeedh5url";
        lVar.f152200d = 22069;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseCgi", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.d61 resp = (r45.d61) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGetFeedH5UrlCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
