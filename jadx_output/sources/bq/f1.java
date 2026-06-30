package bq;

/* loaded from: classes.dex */
public final class f1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23485o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(java.lang.String finderUsername, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, int i17) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        this.f23485o = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.fo2 fo2Var = new r45.fo2();
        lVar.f70664a = fo2Var;
        fo2Var.set(2, finderUsername);
        fo2Var.set(3, gVar);
        fo2Var.set(1, db2.t4.f228171a.b(14792, qt2Var));
        lVar.f70664a = fo2Var;
        r45.go2 go2Var = new r45.go2();
        go2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) go2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = go2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderpaidcollectionuserpage";
        lVar.f70667d = 14792;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.go2 resp = (r45.go2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderPaidCollectionUserPageCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
