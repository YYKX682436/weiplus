package bq;

/* loaded from: classes.dex */
public final class n extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23496o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String finderUsername, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, int i17) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        this.f23496o = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.xz0 xz0Var = new r45.xz0();
        xz0Var.set(2, finderUsername);
        xz0Var.set(3, gVar);
        xz0Var.set(1, db2.t4.f228171a.b(7032, qt2Var));
        lVar.f70664a = xz0Var;
        lVar.f70665b = new r45.yz0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercourseuserpage";
        lVar.f70667d = 7032;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderCourseUserPageCGI", "init userName = " + finderUsername + ", lastBuffer:" + gVar);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.yz0 resp = (r45.yz0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderCourseUserPageCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
