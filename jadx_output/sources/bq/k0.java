package bq;

/* loaded from: classes.dex */
public final class k0 extends bq.e {
    public k0(long j17, java.lang.String str, int i17, r45.qt2 qt2Var) {
        super(qt2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.e61 e61Var = new r45.e61();
        db2.t4 t4Var = db2.t4.f228171a;
        e61Var.set(1, t4Var.b(9376, qt2Var));
        e61Var.set(2, java.lang.Long.valueOf(j17));
        e61Var.set(3, java.lang.Integer.valueOf(i17));
        lVar.f70664a = e61Var;
        r45.kv0 kv0Var = (r45.kv0) e61Var.getCustom(1);
        r45.kv0 kv0Var2 = (r45.kv0) e61Var.getCustom(1);
        t4Var.h(kv0Var, qt2Var, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(kv0Var2 != null ? kv0Var2.getInteger(1) : 0), java.lang.Long.valueOf(j17), str)));
        r45.h61 h61Var = new r45.h61();
        h61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) h61Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = h61Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfeedhelppromotionedinfo";
        lVar.f70667d = 9376;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.h61 resp = (r45.h61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderGetFeedHelpPromotionCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
