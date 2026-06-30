package bq;

/* loaded from: classes.dex */
public final class w1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(java.lang.String friendUsername, java.lang.String poiId) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(friendUsername, "friendUsername");
        kotlin.jvm.internal.o.g(poiId, "poiId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6495;
        r45.u03 u03Var = new r45.u03();
        u03Var.set(1, db2.t4.f228171a.a(6495));
        u03Var.set(3, friendUsername);
        u03Var.set(2, poiId);
        lVar.f70664a = u03Var;
        lVar.f70665b = new r45.v03();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderunbindpoi";
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.v03 resp = (r45.v03) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.FinderUnBindPoiStreamCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
