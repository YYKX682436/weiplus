package bl0;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, k80.m {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f21685d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f21686e;

    /* renamed from: f, reason: collision with root package name */
    public final k80.l f21687f;

    public d(java.lang.String str, java.util.LinkedList linkedList, int i17, java.lang.String str2, int i18, int i19, int i27, k80.l lVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSLoginConfirm", "NetSceneJSLogin doScene appId [%s], login_type [%d], state [%s], versionType [%d], opt [%d], extScene [%d]", str, java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70664a = new r45.i24();
        lVar2.f70665b = new r45.j24();
        lVar2.f70666c = "/cgi-bin/mmbiz-bin/js-login-confirm";
        lVar2.f70667d = 1117;
        lVar2.f70668e = 0;
        lVar2.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar2.a();
        this.f21685d = a17;
        r45.i24 i24Var = (r45.i24) a17.f70710a.f70684a;
        if (i27 > 0) {
            r45.nd7 nd7Var = new r45.nd7();
            i24Var.f376686m = nd7Var;
            nd7Var.f381296e = i27;
        }
        i24Var.f376680d = str;
        i24Var.f376681e = linkedList;
        i24Var.f376682f = i17;
        i24Var.f376683g = str2;
        i24Var.f376685i = i18;
        i24Var.f376684h = i19;
        this.f21687f = lVar;
    }

    public r45.j24 H() {
        return (r45.j24) this.f21685d.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSLoginConfirm", "doScene");
        this.f21686e = u0Var;
        return dispatch(sVar, this.f21685d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1117;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSLoginConfirm", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f21686e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        k80.l lVar = this.f21687f;
        if (lVar != null) {
            lVar.a(i18, i19, str, this);
        }
    }
}
