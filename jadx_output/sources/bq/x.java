package bq;

/* loaded from: classes2.dex */
public final class x extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.String finderUsername, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ur0 ur0Var = new r45.ur0();
        ur0Var.f387586e = finderUsername;
        ur0Var.f387585d = db2.t4.f228171a.b(10526, qt2Var);
        lVar.f70664a = ur0Var;
        r45.vr0 vr0Var = new r45.vr0();
        vr0Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = vr0Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = vr0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/fetchfindermembershiphomeinfo";
        lVar.f70667d = 10526;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.vr0 resp = (r45.vr0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderFetchMemberShipHomeInfoCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
