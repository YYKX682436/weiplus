package db2;

/* loaded from: classes.dex */
public final class q4 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(java.lang.String query, int i17, java.lang.String requestId, java.util.LinkedList tags, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tags, "tags");
        r45.nu2 nu2Var = new r45.nu2();
        nu2Var.set(1, db2.t4.f309704a.b(10834, qt2Var));
        nu2Var.set(2, query);
        nu2Var.set(3, gVar);
        nu2Var.set(4, java.lang.Integer.valueOf(i17));
        nu2Var.set(5, requestId);
        nu2Var.set(6, tags);
        r45.ou2 ou2Var = new r45.ou2();
        ou2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ou2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = nu2Var;
        lVar.f152198b = ou2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findersearchinteraction";
        lVar.f152200d = 10834;
        p(lVar.a());
    }
}
