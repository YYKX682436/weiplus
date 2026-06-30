package bs4;

/* loaded from: classes4.dex */
public abstract class a extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f24003d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f24004e;

    public a(java.lang.String str, int i17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.at atVar = new r45.at();
        atVar.f370251f = str;
        atVar.f370249d = i17;
        atVar.f370250e = i18;
        lVar.f70664a = atVar;
        lVar.f70665b = new r45.bt();
        lVar.f70666c = getUri();
        lVar.f70667d = getFuncId();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.wallet_core.ui.r1.J(str);
        lVar.f70671h = 0;
        this.f24004e = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCancelPay", "request uri: %s, reqKey: %s, payScene: %d, payChannel:%d", getUri(), str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f24003d = u0Var;
        return dispatch(sVar, this.f24004e, this);
    }

    public abstract int getFuncId();

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return getFuncId();
    }

    public abstract java.lang.String getUri();

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        getUri();
        if (i18 == 0 && i19 == 0) {
            try {
                r45.bt btVar = (r45.bt) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCancelPay", "NetSceneCancelPay BaseResponse.Ret is %d, BaseResponse.ErrMsg is %s", java.lang.Integer.valueOf(btVar.BaseResponse.f376959d), btVar.BaseResponse.f376960e);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCancelPay", e17.getMessage());
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f24003d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
