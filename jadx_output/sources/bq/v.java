package bq;

/* loaded from: classes2.dex */
public final class v extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23534o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r45.qt2 qt2Var, java.lang.String finderUsername, java.lang.String finderMemberTicket, long j17, com.tencent.mm.protobuf.g gVar, int i17) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(finderMemberTicket, "finderMemberTicket");
        this.f23534o = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.mr0 mr0Var = new r45.mr0();
        mr0Var.f380765d = db2.t4.f228171a.b(8905, qt2Var);
        mr0Var.f380766e = finderUsername;
        mr0Var.f380769h = finderMemberTicket;
        mr0Var.f380768g = gVar;
        mr0Var.f380767f = j17;
        lVar.f70664a = mr0Var;
        r45.nr0 nr0Var = new r45.nr0();
        lVar.f70664a = mr0Var;
        lVar.f70665b = nr0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/fetchfindermembercollectionshortinfo";
        lVar.f70667d = 10269;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.nr0 resp = (r45.nr0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderFetchMemberCollectionShortInfoCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
