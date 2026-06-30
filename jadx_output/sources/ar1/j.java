package ar1;

/* loaded from: classes4.dex */
public final class j extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f13378d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f13379e;

    public j(java.lang.String str, int i17) {
        java.lang.String c17;
        r45.pb3 pb3Var = new r45.pb3();
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            c17 = ((ox.r) d0Var).Bi(2).c();
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f419870d;
            c17 = ((ox.r) d0Var2).Bi(1).c();
        }
        pb3Var.f382921d = c17;
        pb3Var.f382922e = 20;
        pb3Var.f382923f = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 25742;
        lVar.f70664a = pb3Var;
        lVar.f70665b = new r45.qb3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mp/getblacklist";
        this.f13378d = lVar.a();
        com.tencent.mars.xlog.Log.i("BizFans.NetSceneBizFansGetBlackList", "NetSceneBizFansGetBlackList");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f13379e = u0Var;
        return dispatch(sVar, this.f13378d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 25742;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("BizFans.NetSceneBizFansGetBlackList", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f13379e;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
