package bq;

/* loaded from: classes.dex */
public final class l extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r45.qt2 qt2Var, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, long j17, float f17, float f18, int i17, int i18, int i19, java.lang.String columnBuff) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(columnBuff, "columnBuff");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.by0 by0Var = new r45.by0();
        by0Var.set(9, gVar);
        by0Var.set(2, gVar2);
        by0Var.set(3, java.lang.Long.valueOf(j17));
        by0Var.set(5, java.lang.Float.valueOf(f17));
        by0Var.set(4, java.lang.Float.valueOf(f18));
        by0Var.set(6, java.lang.Integer.valueOf(i17));
        by0Var.set(7, java.lang.Integer.valueOf(i18));
        db2.t4 t4Var = db2.t4.f228171a;
        by0Var.set(8, t4Var.n());
        by0Var.set(10, java.lang.Integer.valueOf(i19));
        by0Var.set(11, columnBuff);
        by0Var.set(1, t4Var.b(10271, qt2Var));
        lVar.f70664a = by0Var;
        r45.cy0 cy0Var = new r45.cy0();
        cy0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) cy0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = cy0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercolumnflow";
        lVar.f70667d = 10271;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderColumnFlowCGI", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }
}
