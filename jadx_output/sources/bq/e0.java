package bq;

/* loaded from: classes.dex */
public final class e0 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(r45.qt2 contextObj, long j17, long j18, java.lang.String nonceId) {
        super(contextObj);
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.a51 a51Var = new r45.a51();
        a51Var.set(2, java.lang.Long.valueOf(j17));
        a51Var.set(3, java.lang.Long.valueOf(j18));
        a51Var.set(4, nonceId);
        a51Var.set(1, db2.t4.f228171a.b(11137, contextObj));
        lVar.f70664a = a51Var;
        lVar.f70665b = new r45.b51();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetbulletcommentuserinfo";
        lVar.f70667d = 11137;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.b51 resp = (r45.b51) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.FinderBaseCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
