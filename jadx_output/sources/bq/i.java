package bq;

/* loaded from: classes.dex */
public final class i extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23488o;

    /* renamed from: p, reason: collision with root package name */
    public final int f23489p;

    public i(int i17, int i18, int i19, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f23488o = i17;
        this.f23489p = i18;
        r45.mw0 mw0Var = new r45.mw0();
        db2.t4 t4Var = db2.t4.f228171a;
        mw0Var.set(1, t4Var.a(4239));
        mw0Var.set(2, t4Var.n());
        mw0Var.set(7, java.lang.Integer.valueOf(i17));
        mw0Var.set(3, java.lang.Integer.valueOf(i18));
        mw0Var.set(4, java.lang.Integer.valueOf(i19));
        mw0Var.set(5, gVar);
        mw0Var.set(6, gVar2);
        mw0Var.set(8, xy2.c.f(qt2Var));
        com.tencent.mars.xlog.Log.i("FinderCatelogStreamCGI", "init: tabType=" + i18 + ", pullType=" + i17 + ", scene=" + i19 + ", finder_username=" + mw0Var.getString(8) + ", extBuff=" + gVar + ", lastBuffer=" + gVar2);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = mw0Var;
        lVar.f70667d = 4239;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercatelogstream";
        lVar.f70665b = new r45.nw0();
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.nw0 resp = (r45.nw0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderCatelogStreamCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str + ", tabType:" + this.f23489p + ", server increatment size:" + resp.getList(3).size());
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = t().getList(3);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                kotlin.jvm.internal.o.g(finderObject, "finderObject");
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).cl(finderObject, this.f23483m);
            }
        }
    }

    public final r45.nw0 t() {
        com.tencent.mm.protobuf.f fVar = this.f70646f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCatelogStreamResponse");
        return (r45.nw0) fVar;
    }
}
