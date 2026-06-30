package bq;

/* loaded from: classes2.dex */
public final class w extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f23536o;

    /* renamed from: p, reason: collision with root package name */
    public final int f23537p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r45.qt2 qt2Var, java.lang.String finderUsername, java.lang.String finderMemberTicket, com.tencent.mm.protobuf.g gVar, int i17, int i18) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(finderMemberTicket, "finderMemberTicket");
        this.f23536o = finderUsername;
        this.f23537p = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.or0 or0Var = new r45.or0();
        or0Var.f382457d = db2.t4.f228171a.b(10269, qt2Var);
        or0Var.f382458e = finderUsername;
        or0Var.f382459f = finderMemberTicket;
        or0Var.f382460g = gVar;
        or0Var.f382461h = i17;
        lVar.f70664a = or0Var;
        r45.pr0 pr0Var = new r45.pr0();
        pr0Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = pr0Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = pr0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/fetchfindermemberfeedlist";
        lVar.f70667d = 10269;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.pr0 resp = (r45.pr0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.FinderFetchMemberFeedListCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
