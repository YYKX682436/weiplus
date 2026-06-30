package bq;

/* loaded from: classes.dex */
public final class g1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23487o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(java.lang.String friendUsername, com.tencent.mm.protobuf.g gVar, int i17, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(friendUsername, "friendUsername");
        this.f23487o = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6850;
        r45.vf3 vf3Var = new r45.vf3();
        vf3Var.set(1, db2.t4.f228171a.b(6850, qt2Var));
        vf3Var.set(3, gVar);
        vf3Var.set(4, friendUsername);
        vf3Var.set(2, java.lang.Integer.valueOf(i17));
        jz5.l P6 = ((ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class))).P6();
        vf3Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        vf3Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        lVar.f70664a = vf3Var;
        lVar.f70665b = new r45.wf3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getfinderpoilist";
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.wf3 resp = (r45.wf3) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.FinderPoiListStreamCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
