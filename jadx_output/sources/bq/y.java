package bq;

/* loaded from: classes2.dex */
public final class y extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23538o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(r45.qt2 qt2Var, java.lang.String finderAuthorUsername, com.tencent.mm.protobuf.g gVar, int i17, int i18) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderAuthorUsername, "finderAuthorUsername");
        this.f23538o = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.yr0 yr0Var = new r45.yr0();
        yr0Var.f391315e = finderAuthorUsername;
        yr0Var.f391316f = gVar;
        yr0Var.f391314d = db2.t4.f228171a.b(10628, qt2Var);
        yr0Var.f391317g = i17;
        lVar.f70664a = yr0Var;
        r45.zr0 zr0Var = new r45.zr0();
        zr0Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = zr0Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = zr0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/fetchfindermemberzonehomeline";
        lVar.f70667d = 10628;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.zr0 resp = (r45.zr0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderFetchMemberZoneHomeLineCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
