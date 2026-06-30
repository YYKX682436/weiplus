package bq;

/* loaded from: classes5.dex */
public final class l1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(r45.kh type, r45.jh flag, long j17, long j18, int i17, long j19) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flag, "flag");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ot2 ot2Var = new r45.ot2();
        ot2Var.set(1, db2.t4.f309704a.a(19558));
        ot2Var.set(2, java.lang.Integer.valueOf(type.f460227d));
        ot2Var.set(3, java.lang.Integer.valueOf(flag.f459337d));
        ot2Var.set(4, java.lang.Long.valueOf(j17));
        ot2Var.set(5, java.lang.Long.valueOf(j18));
        ot2Var.set(6, java.lang.Integer.valueOf(i17));
        ot2Var.set(7, java.lang.Long.valueOf(j19));
        lVar.f152197a = ot2Var;
        r45.pt2 pt2Var = new r45.pt2();
        pt2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) pt2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = pt2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderreportbgminteract";
        lVar.f152200d = 22131;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderReportBgmInteractCGI", "[init] type:" + type + " flag:" + flag + " listenID:" + pm0.v.u(j17) + " finderFeedID:" + pm0.v.u(j18) + " itemType:" + i17 + " mTime:" + j19);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.pt2 resp = (r45.pt2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderReportBgmInteractCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
