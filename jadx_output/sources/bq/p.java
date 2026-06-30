package bq;

/* loaded from: classes.dex */
public final class p extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final yz5.a f23512o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String userName, long j17, r45.qt2 qt2Var, long j18, long j19, com.tencent.mm.protobuf.g lastBuffer, int i17, long j27, yz5.a aVar) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(lastBuffer, "lastBuffer");
        this.f23512o = aVar;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6690;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderdelmention";
        r45.d11 d11Var = new r45.d11();
        d11Var.set(2, userName);
        d11Var.set(3, java.lang.Long.valueOf(j17));
        d11Var.set(4, lastBuffer);
        d11Var.set(5, java.lang.Long.valueOf(j18));
        d11Var.set(6, java.lang.Long.valueOf(j19));
        d11Var.set(7, java.lang.Integer.valueOf(i17));
        d11Var.set(8, java.lang.Long.valueOf(j27));
        d11Var.set(1, db2.t4.f228171a.b(6690, qt2Var));
        lVar.f70664a = d11Var;
        lVar.f70665b = new r45.e11();
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.FinderDelMessage", "init userName: " + userName + " mentionId:" + j17 + " svrMentionId:" + j27);
    }

    @Override // com.tencent.mm.modelbase.i
    public void j() {
        super.j();
        yz5.a aVar = this.f23512o;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
