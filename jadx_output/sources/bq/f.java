package bq;

/* loaded from: classes.dex */
public final class f extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.LinkedList objectIds, r45.qt2 qt2Var, int i17, int i18) {
        super(qt2Var);
        r45.kv0 kv0Var;
        kotlin.jvm.internal.o.g(objectIds, "objectIds");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.qv0 qv0Var = new r45.qv0();
        qv0Var.set(2, objectIds);
        db2.t4 t4Var = db2.t4.f228171a;
        qv0Var.set(1, t4Var.b(8755, qt2Var));
        qv0Var.set(3, java.lang.Integer.valueOf(i17));
        qv0Var.set(4, t4Var.n());
        if (i18 != -1 && (kv0Var = (r45.kv0) qv0Var.getCustom(1)) != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(i18));
        }
        lVar.f70664a = qv0Var;
        r45.sv0 sv0Var = new r45.sv0();
        sv0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) sv0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = sv0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderbatchloadobject";
        lVar.f70667d = 8755;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderBatchLoadObjectCGI", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }
}
