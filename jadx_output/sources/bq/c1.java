package bq;

/* loaded from: classes.dex */
public final class c1 extends bq.e {
    public c1(r45.qt2 qt2Var, long j17, int i17, com.tencent.mm.protobuf.g gVar, long j18, java.lang.String str) {
        super(qt2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.xj2 xj2Var = new r45.xj2();
        db2.t4 t4Var = db2.t4.f228171a;
        xj2Var.set(1, t4Var.b(12660, qt2Var));
        xj2Var.set(2, java.lang.Long.valueOf(j17));
        xj2Var.set(3, 1);
        xj2Var.set(4, java.lang.Integer.valueOf(i17));
        xj2Var.set(5, gVar);
        t4Var.h((r45.kv0) xj2Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0), java.lang.Long.valueOf(j18), str)));
        lVar.f70664a = xj2Var;
        r45.yj2 yj2Var = new r45.yj2();
        yj2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) yj2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = yj2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findernativedramastream";
        lVar.f70667d = 12660;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.yj2 resp = (r45.yj2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderNativeDramaStreamCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
