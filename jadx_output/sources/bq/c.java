package bq;

/* loaded from: classes.dex */
public final class c extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final long f23479o;

    /* JADX WARN: Multi-variable type inference failed */
    public c(r45.qt2 qt2Var, long j17, java.lang.String str) {
        super(null, 1, 0 == true ? 1 : 0);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.hu0 hu0Var = new r45.hu0();
        lVar.f70664a = hu0Var;
        hu0Var.set(1, db2.t4.f228171a.b(7454, qt2Var));
        r45.kv0 kv0Var = (r45.kv0) hu0Var.getCustom(1);
        this.f23479o = kv0Var != null ? kv0Var.getLong(5) : 0L;
        hu0Var.set(2, java.lang.Long.valueOf(j17));
        hu0Var.set(3, str);
        hu0Var.set(4, java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(0)));
        lVar.f70664a = hu0Var;
        r45.iu0 iu0Var = new r45.iu0();
        iu0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) iu0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = iu0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderasyncgetcommentinfo";
        lVar.f70667d = 7454;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.iu0 resp = (r45.iu0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.FinderBaseCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
