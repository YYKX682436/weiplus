package bq;

/* loaded from: classes5.dex */
public final class r1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(java.util.LinkedList reqItems) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(reqItems, "reqItems");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.s81 s81Var = new r45.s81();
        s81Var.set(1, db2.t4.f228171a.a(6218));
        s81Var.set(2, reqItems);
        s81Var.set(4, g92.b.f269769e.U());
        lVar.f70664a = s81Var;
        lVar.f70665b = new r45.t81();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetmsgsession";
        lVar.f70667d = 6218;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderSessionStatusCGI", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.t81 resp = (r45.t81) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append(',');
        sb6.append(i18);
        g0Var.d(20492, 7L, sb6.toString());
        g0Var.C(1473L, 7L, 1L);
    }
}
