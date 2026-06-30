package bq;

/* loaded from: classes.dex */
public final class e1 extends bq.e {
    public e1(r45.qt2 qt2Var, long j17, long j18, long j19) {
        super(qt2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.on2 on2Var = new r45.on2();
        on2Var.set(2, java.lang.Long.valueOf(j17));
        on2Var.set(3, java.lang.Long.valueOf(j18));
        on2Var.set(4, java.lang.Long.valueOf(j19));
        on2Var.set(1, db2.t4.f228171a.b(11836, qt2Var));
        lVar.f70664a = on2Var;
        lVar.f70665b = new r45.pn2();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderopbulletcomment";
        lVar.f70667d = 11836;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.pn2 resp = (r45.pn2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderOpBulletCommentCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
