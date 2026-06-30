package bl0;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, k80.k {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f21682d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f21683e;

    /* renamed from: f, reason: collision with root package name */
    public final k80.j f21684f;

    public c(java.lang.String str, java.util.LinkedList linkedList, int i17, java.lang.String str2, java.lang.String str3, int i18, int i19, k80.j jVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSLogin", "NetSceneJSLogin doScene appId [%s], loginType [%d], url [%s], state [%s], versionType [%d], extScene [%d]", str, java.lang.Integer.valueOf(i17), str2, str3, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.k24();
        lVar.f70665b = new r45.l24();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/js-login";
        lVar.f70667d = 1029;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f21682d = a17;
        r45.k24 k24Var = (r45.k24) a17.f70710a.f70684a;
        k24Var.f378325d = str;
        k24Var.f378326e = linkedList;
        k24Var.f378327f = i17;
        k24Var.f378328g = str2;
        k24Var.f378329h = str3;
        k24Var.f378330i = i18;
        if (i19 > 0) {
            r45.nd7 nd7Var = new r45.nd7();
            k24Var.f378331m = nd7Var;
            nd7Var.f381296e = i19;
        }
        this.f21684f = jVar;
    }

    public r45.l24 H() {
        return (r45.l24) this.f21682d.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSLogin", "doScene");
        this.f21683e = u0Var;
        return dispatch(sVar, this.f21682d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1029;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSLogin", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f21683e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        k80.j jVar = this.f21684f;
        if (jVar != null) {
            jVar.a(i18, i19, str, this);
        }
    }
}
