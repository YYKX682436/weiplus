package bq;

/* loaded from: classes.dex */
public final class f extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.LinkedList objectIds, r45.qt2 qt2Var, int i17, int i18) {
        super(qt2Var);
        r45.kv0 kv0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectIds, "objectIds");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.qv0 qv0Var = new r45.qv0();
        qv0Var.set(2, objectIds);
        db2.t4 t4Var = db2.t4.f309704a;
        qv0Var.set(1, t4Var.b(8755, qt2Var));
        qv0Var.set(3, java.lang.Integer.valueOf(i17));
        qv0Var.set(4, t4Var.n());
        if (i18 != -1 && (kv0Var = (r45.kv0) qv0Var.m75936x14adae67(1)) != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(i18));
        }
        lVar.f152197a = qv0Var;
        r45.sv0 sv0Var = new r45.sv0();
        sv0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) sv0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = sv0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderbatchloadobject";
        lVar.f152200d = 8755;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBatchLoadObjectCGI", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }
}
