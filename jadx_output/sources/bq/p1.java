package bq;

/* loaded from: classes.dex */
public final class p1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(r45.qt2 qt2Var, java.lang.String finderNickName, java.lang.String eventName) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderNickName, "finderNickName");
        kotlin.jvm.internal.o.g(eventName, "eventName");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.cu2 cu2Var = new r45.cu2();
        cu2Var.set(1, db2.t4.f228171a.b(6241, qt2Var));
        cu2Var.set(5, finderNickName);
        cu2Var.set(6, eventName);
        lVar.f70664a = cu2Var;
        lVar.f70665b = new r45.du2();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findersearchevent";
        lVar.f70667d = 6241;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.du2 resp = (r45.du2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderSearchEventCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
