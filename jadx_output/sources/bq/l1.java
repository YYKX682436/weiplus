package bq;

/* loaded from: classes5.dex */
public final class l1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(r45.kh type, r45.jh flag, long j17, long j18, int i17, long j19) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(flag, "flag");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ot2 ot2Var = new r45.ot2();
        ot2Var.set(1, db2.t4.f228171a.a(19558));
        ot2Var.set(2, java.lang.Integer.valueOf(type.f378694d));
        ot2Var.set(3, java.lang.Integer.valueOf(flag.f377804d));
        ot2Var.set(4, java.lang.Long.valueOf(j17));
        ot2Var.set(5, java.lang.Long.valueOf(j18));
        ot2Var.set(6, java.lang.Integer.valueOf(i17));
        ot2Var.set(7, java.lang.Long.valueOf(j19));
        lVar.f70664a = ot2Var;
        r45.pt2 pt2Var = new r45.pt2();
        pt2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) pt2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = pt2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderreportbgminteract";
        lVar.f70667d = 22131;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderReportBgmInteractCGI", "[init] type:" + type + " flag:" + flag + " listenID:" + pm0.v.u(j17) + " finderFeedID:" + pm0.v.u(j18) + " itemType:" + i17 + " mTime:" + j19);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.pt2 resp = (r45.pt2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderReportBgmInteractCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
