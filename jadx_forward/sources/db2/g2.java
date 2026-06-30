package db2;

/* loaded from: classes.dex */
public final class g2 extends az2.j {
    public g2(int i17, java.lang.Long l17, java.lang.String str, java.lang.Long l18, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5909;
        r45.qh2 qh2Var = new r45.qh2();
        if (l17 != null) {
            qh2Var.set(2, java.lang.Long.valueOf(l17.longValue()));
        }
        qh2Var.set(5, str);
        if (l18 != null) {
            qh2Var.set(4, java.lang.Long.valueOf(l18.longValue()));
        }
        qh2Var.set(3, java.lang.Integer.valueOf(i17));
        qh2Var.set(1, db2.t4.f309704a.b(5909, qt2Var));
        r45.kv0 kv0Var = (r45.kv0) qh2Var.m75936x14adae67(1);
        if (kv0Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0));
        }
        lVar.f152197a = qh2Var;
        r45.rh2 rh2Var = new r45.rh2();
        rh2Var.set(0, new r45.ie());
        lVar.f152198b = rh2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findermodevent";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderModEvent", "CgiFinderModEvent init eventTopicId: " + l17 + " userName: " + str + ", objectId:" + l18);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.rh2 resp = (r45.rh2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderModEvent", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
