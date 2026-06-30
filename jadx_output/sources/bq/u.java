package bq;

/* loaded from: classes.dex */
public final class u extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String query, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(query, "query");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.eu2 eu2Var = new r45.eu2();
        eu2Var.set(3, query);
        eu2Var.set(2, gVar);
        eu2Var.set(1, db2.t4.f228171a.b(6665, qt2Var));
        eu2Var.set(4, xy2.c.f(qt2Var));
        lVar.f70664a = eu2Var;
        r45.fu2 fu2Var = new r45.fu2();
        fu2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) fu2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = fu2Var;
        lVar.f70667d = 6665;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findersearchfans";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderFansSearchCGI", "FinderFansSearchCGI init query ".concat(query));
    }
}
