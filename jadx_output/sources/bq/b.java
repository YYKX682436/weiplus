package bq;

/* loaded from: classes.dex */
public final class b extends bq.e {
    public b(r45.qt2 qt2Var, com.tencent.mm.protobuf.g gVar, long j17, java.lang.String str, float f17, float f18, int i17, int i18, int i19, int i27) {
        super(qt2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.bu0 bu0Var = new r45.bu0();
        db2.t4 t4Var = db2.t4.f228171a;
        bu0Var.set(1, t4Var.b(23170, qt2Var));
        t4Var.h((r45.kv0) bu0Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0), java.lang.Long.valueOf(j17), str)));
        r45.kv0 kv0Var = (r45.kv0) bu0Var.getCustom(1);
        if (kv0Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(i19));
        }
        bu0Var.set(2, gVar);
        bu0Var.set(3, java.lang.Long.valueOf(j17));
        bu0Var.set(4, java.lang.Float.valueOf(f17));
        bu0Var.set(5, java.lang.Float.valueOf(f18));
        bu0Var.set(6, java.lang.Integer.valueOf(i17));
        bu0Var.set(7, java.lang.Integer.valueOf(i18));
        bu0Var.set(8, t4Var.n());
        bu0Var.set(9, java.lang.Integer.valueOf(i27));
        lVar.f70664a = bu0Var;
        r45.cu0 cu0Var = new r45.cu0();
        cu0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) cu0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = cu0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderadsstream";
        lVar.f70667d = 23170;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderAdsStreamCgi commentScene ");
        r45.kv0 kv0Var2 = (r45.kv0) bu0Var.getCustom(1);
        sb6.append(kv0Var2 != null ? java.lang.Integer.valueOf(kv0Var2.getInteger(1)) : null);
        com.tencent.mars.xlog.Log.i("FinderAdsStreamCgi", sb6.toString());
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.cu0 resp = (r45.cu0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderAdsStreamCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
