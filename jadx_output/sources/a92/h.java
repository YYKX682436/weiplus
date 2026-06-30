package a92;

/* loaded from: classes2.dex */
public class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f2425d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f2426e;

    public h(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.w7();
        lVar.f70665b = new r45.x7();
        lVar.f70666c = "/cgi-bin/micromsg-bin/androidfcmunreg";
        lVar.f70667d = ib1.n.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f2425d = a17;
        ((r45.w7) a17.f70710a.f70684a).f388918d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f2426e = u0Var;
        return dispatch(sVar, this.f2425d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.m9.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.NetSceneFcmUnreg", "onGYNetEnd, errType = " + i18 + " errCode = " + i19);
        this.f2426e.onSceneEnd(i18, i19, str, this);
    }
}
