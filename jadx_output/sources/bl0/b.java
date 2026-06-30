package bl0;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, k80.i {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f21679d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f21680e;

    /* renamed from: f, reason: collision with root package name */
    public final k80.h f21681f;

    public b(java.lang.String str, java.util.LinkedList linkedList, int i17, int i18, int i19, k80.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "NetSceneJSLogin doScene appId [%s], versionType [%d], opt [%d], extScene [%d]", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.e24();
        lVar.f70665b = new r45.f24();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/js-authorize-confirm";
        lVar.f70667d = me1.a.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f21679d = a17;
        r45.e24 e24Var = (r45.e24) a17.f70710a.f70684a;
        if (i19 > 0) {
            r45.nd7 nd7Var = new r45.nd7();
            e24Var.f372928h = nd7Var;
            nd7Var.f381296e = i19;
        }
        e24Var.f372924d = str;
        e24Var.f372925e = linkedList;
        e24Var.f372927g = i17;
        e24Var.f372926f = i18;
        this.f21681f = hVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "doScene");
        this.f21680e = u0Var;
        return dispatch(sVar, this.f21679d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return me1.a.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f21680e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        k80.h hVar = this.f21681f;
        if (hVar != null) {
            hVar.a(i18, i19, str, this);
        }
    }
}
