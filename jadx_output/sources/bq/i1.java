package bq;

/* loaded from: classes.dex */
public final class i1 extends bq.e {
    public i1(r45.qt2 qt2Var, int i17, com.tencent.mm.protobuf.g gVar, long j17, java.lang.String str, float f17, float f18, int i18, int i19, int i27, r45.pr2 pr2Var, r45.tj2 tj2Var) {
        super(qt2Var);
        java.util.LinkedList list;
        r45.fl2 fl2Var;
        java.lang.String string;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.qr2 qr2Var = new r45.qr2();
        db2.t4 t4Var = db2.t4.f228171a;
        qr2Var.set(1, t4Var.b(18132, qt2Var));
        java.lang.Integer num = null;
        t4Var.h((r45.kv0) qr2Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0), java.lang.Long.valueOf(j17), str)));
        r45.kv0 kv0Var = (r45.kv0) qr2Var.getCustom(1);
        if (kv0Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(i27));
        }
        r45.kv0 kv0Var2 = (r45.kv0) qr2Var.getCustom(1);
        if (kv0Var2 != null) {
            kv0Var2.set(15, tj2Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dramaSessionBuffer FinderPromotionStreamCgi ");
        sb6.append(pm0.v.u(tj2Var != null ? tj2Var.getLong(0) : 0L));
        sb6.append(' ');
        sb6.append(tj2Var != null ? tj2Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderBaseCgi", sb6.toString());
        qr2Var.set(2, java.lang.Integer.valueOf(i17));
        qr2Var.set(3, gVar);
        qr2Var.set(4, java.lang.Long.valueOf(j17));
        qr2Var.set(5, java.lang.Float.valueOf(f17));
        qr2Var.set(6, java.lang.Float.valueOf(f18));
        qr2Var.set(7, java.lang.Integer.valueOf(i18));
        qr2Var.set(8, java.lang.Integer.valueOf(i19));
        qr2Var.set(10, pr2Var);
        qr2Var.set(9, t4Var.n());
        lVar.f70664a = qr2Var;
        r45.rr2 rr2Var = new r45.rr2();
        rr2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) rr2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = rr2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderpromotionstream";
        lVar.f70667d = 18132;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("nativeDramaCgi_finderpromotionstream commentScene ");
        r45.kv0 kv0Var3 = (r45.kv0) qr2Var.getCustom(1);
        sb7.append(kv0Var3 != null ? java.lang.Integer.valueOf(kv0Var3.getInteger(1)) : null);
        sb7.append(' ');
        r45.kv0 kv0Var4 = (r45.kv0) qr2Var.getCustom(1);
        if (kv0Var4 != null && (list = kv0Var4.getList(7)) != null && (fl2Var = (r45.fl2) kz5.n0.Z(list)) != null && (string = fl2Var.getString(1)) != null) {
            num = java.lang.Integer.valueOf(string.length());
        }
        sb7.append(num);
        com.tencent.mars.xlog.Log.i("Finder.FinderBaseCgi", sb7.toString());
        p(lVar.a());
    }
}
