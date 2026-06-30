package bq;

/* loaded from: classes.dex */
public final class g extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(java.lang.String friendUsername, java.util.LinkedList bindList) {
        super(null, 1, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(friendUsername, "friendUsername");
        kotlin.jvm.internal.o.g(bindList, "bindList");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4078;
        r45.cw0 cw0Var = new r45.cw0();
        cw0Var.set(1, db2.t4.f228171a.a(4078));
        cw0Var.set(3, friendUsername);
        cw0Var.getList(2).addAll(bindList);
        jz5.l P6 = ((ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class))).P6();
        cw0Var.set(4, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        cw0Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        lVar.f70664a = cw0Var;
        lVar.f70665b = new r45.dw0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderbindpoi";
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.dw0 resp = (r45.dw0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.FinderBindPoiStreamCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
