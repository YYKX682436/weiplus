package bq;

/* loaded from: classes.dex */
public final class q1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public int f105053o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(java.lang.String query, int i17, java.lang.String requestId, java.util.LinkedList tags, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tags, "tags");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.nu2 nu2Var = new r45.nu2();
        nu2Var.set(1, db2.t4.f309704a.b(10834, qt2Var));
        nu2Var.set(2, query);
        nu2Var.set(3, gVar);
        nu2Var.set(4, java.lang.Integer.valueOf(i17));
        nu2Var.set(5, requestId);
        nu2Var.set(6, tags);
        lVar.f152197a = nu2Var;
        lVar.f152198b = new r45.ou2();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findersearchinteraction";
        lVar.f152200d = 10834;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ou2 resp = (r45.ou2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSearchInteractionFeedCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
