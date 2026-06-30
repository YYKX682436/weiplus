package bq;

/* loaded from: classes2.dex */
public final class b1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23478o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(r45.qt2 qt2Var, java.lang.String finderAuthorUsername, java.lang.String myUsername, java.lang.String str, int i17, long j17, int i18) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderAuthorUsername, "finderAuthorUsername");
        kotlin.jvm.internal.o.g(myUsername, "myUsername");
        this.f23478o = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.gg2 gg2Var = new r45.gg2();
        gg2Var.f375208d = db2.t4.f228171a.b(11327, qt2Var);
        gg2Var.f375210f = finderAuthorUsername;
        gg2Var.f375211g = str;
        gg2Var.f375209e = myUsername;
        gg2Var.f375212h = i17;
        gg2Var.f375213i = j17;
        lVar.f70664a = gg2Var;
        lVar.f70665b = new r45.hg2();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findermemberqapagedgetqalist";
        lVar.f70667d = 11327;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.hg2 resp = (r45.hg2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderMemberQAPagedGetQAListCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
