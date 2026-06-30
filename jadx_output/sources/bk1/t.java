package bk1;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final bk1.t f21350a = new bk1.t();

    public static java.lang.Object a(bk1.t tVar, int i17, int i18, kotlin.coroutines.Continuation continuation, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = Integer.MAX_VALUE;
        }
        if ((i19 & 2) != 0) {
            i18 = 32;
        }
        tVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiWxaAppGetUserAuthorizeScopeList", "doFetch, updateTime: " + i17 + ", maxFetchCount: " + i18);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(rVar);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp_getuserauthorizescopelist";
        lVar.f70667d = 5046;
        r45.ic7 ic7Var = new r45.ic7();
        ic7Var.f376939d = i17;
        ic7Var.f376940e = i18;
        lVar.f70664a = ic7Var;
        lVar.f70665b = new r45.jc7();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        final bk1.r rVar2 = new bk1.r(weakReference);
        rVar.m(new bk1.q(com.tencent.mm.modelbase.z2.e(a17, new com.tencent.mm.modelbase.e3(rVar2) { // from class: bk1.s

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.s f21349d;

            {
                kotlin.jvm.internal.o.g(rVar2, "function");
                this.f21349d = rVar2;
            }

            @Override // com.tencent.mm.modelbase.e3
            public final /* synthetic */ int callback(int i27, int i28, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
                return ((java.lang.Number) this.f21349d.v(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), str, oVar, m1Var)).intValue();
            }
        }, false, null)));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
