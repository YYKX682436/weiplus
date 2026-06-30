package bq;

/* loaded from: classes.dex */
public final class c extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final long f105012o;

    /* JADX WARN: Multi-variable type inference failed */
    public c(r45.qt2 qt2Var, long j17, java.lang.String str) {
        super(null, 1, 0 == true ? 1 : 0);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.hu0 hu0Var = new r45.hu0();
        lVar.f152197a = hu0Var;
        hu0Var.set(1, db2.t4.f309704a.b(7454, qt2Var));
        r45.kv0 kv0Var = (r45.kv0) hu0Var.m75936x14adae67(1);
        this.f105012o = kv0Var != null ? kv0Var.m75942xfb822ef2(5) : 0L;
        hu0Var.set(2, java.lang.Long.valueOf(j17));
        hu0Var.set(3, str);
        hu0Var.set(4, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0)));
        lVar.f152197a = hu0Var;
        r45.iu0 iu0Var = new r45.iu0();
        iu0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) iu0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = iu0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderasyncgetcommentinfo";
        lVar.f152200d = 7454;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.iu0 resp = (r45.iu0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
