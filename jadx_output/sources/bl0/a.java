package bl0;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, k80.g {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f21676d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f21677e;

    /* renamed from: f, reason: collision with root package name */
    public final k80.f f21678f;

    public a(java.lang.String str, r45.me7 me7Var, java.util.LinkedList linkedList, int i17, int i18, boolean z17, k80.f fVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAuthorize", "NetSceneJSLogin doScene appId [%s], versionType [%d], extScene[%d]", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.g24();
        lVar.f70665b = new r45.h24();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/js-authorize";
        lVar.f70667d = 1157;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f21676d = a17;
        r45.g24 g24Var = (r45.g24) a17.f70710a.f70684a;
        if (i18 > 0) {
            r45.nd7 nd7Var = new r45.nd7();
            g24Var.f374837g = nd7Var;
            nd7Var.f381296e = i18;
        }
        g24Var.f374834d = str;
        g24Var.f374835e = linkedList;
        g24Var.f374836f = i17;
        g24Var.f374839i = me7Var;
        g24Var.f374840m = z17;
        if (me7Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAuthorize", "NetSceneJSLogin doScene req.plugin_info plugin_appid=" + g24Var.f374839i.f380432d + "  custom_version=" + g24Var.f374839i.f380433e + "  inner_version=" + g24Var.f374839i.f380434f);
        }
        this.f21678f = fVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAuthorize", "doScene");
        this.f21677e = u0Var;
        return dispatch(sVar, this.f21676d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1157;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAuthorize", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f21677e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        k80.f fVar = this.f21678f;
        if (fVar != null) {
            fVar.a(i18, i19, str, this);
        }
    }
}
