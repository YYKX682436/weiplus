package bq;

/* loaded from: classes.dex */
public final class q1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public int f23520o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(java.lang.String query, int i17, java.lang.String requestId, java.util.LinkedList tags, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(tags, "tags");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.nu2 nu2Var = new r45.nu2();
        nu2Var.set(1, db2.t4.f228171a.b(10834, qt2Var));
        nu2Var.set(2, query);
        nu2Var.set(3, gVar);
        nu2Var.set(4, java.lang.Integer.valueOf(i17));
        nu2Var.set(5, requestId);
        nu2Var.set(6, tags);
        lVar.f70664a = nu2Var;
        lVar.f70665b = new r45.ou2();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findersearchinteraction";
        lVar.f70667d = 10834;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ou2 resp = (r45.ou2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderSearchInteractionFeedCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
