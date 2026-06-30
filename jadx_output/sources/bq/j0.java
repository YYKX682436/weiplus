package bq;

/* loaded from: classes.dex */
public final class j0 extends bq.e {
    public j0(r45.qt2 qt2Var, long j17) {
        super(qt2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.c61 c61Var = new r45.c61();
        c61Var.set(1, db2.t4.f228171a.b(22069, qt2Var));
        c61Var.set(2, java.lang.Long.valueOf(j17));
        lVar.f70664a = c61Var;
        r45.d61 d61Var = new r45.d61();
        d61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) d61Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = d61Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfeedh5url";
        lVar.f70667d = 22069;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.FinderBaseCgi", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.d61 resp = (r45.d61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderGetFeedH5UrlCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
