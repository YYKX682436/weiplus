package bl0;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, k80.g {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f103209d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f103210e;

    /* renamed from: f, reason: collision with root package name */
    public final k80.f f103211f;

    public a(java.lang.String str, r45.me7 me7Var, java.util.LinkedList linkedList, int i17, int i18, boolean z17, k80.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAuthorize", "NetSceneJSLogin doScene appId [%s], versionType [%d], extScene[%d]", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.g24();
        lVar.f152198b = new r45.h24();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/js-authorize";
        lVar.f152200d = 1157;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f103209d = a17;
        r45.g24 g24Var = (r45.g24) a17.f152243a.f152217a;
        if (i18 > 0) {
            r45.nd7 nd7Var = new r45.nd7();
            g24Var.f456370g = nd7Var;
            nd7Var.f462829e = i18;
        }
        g24Var.f456367d = str;
        g24Var.f456368e = linkedList;
        g24Var.f456369f = i17;
        g24Var.f456372i = me7Var;
        g24Var.f456373m = z17;
        if (me7Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAuthorize", "NetSceneJSLogin doScene req.plugin_info plugin_appid=" + g24Var.f456372i.f461965d + "  custom_version=" + g24Var.f456372i.f461966e + "  inner_version=" + g24Var.f456372i.f461967f);
        }
        this.f103211f = fVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAuthorize", "doScene");
        this.f103210e = u0Var;
        return mo9409x10f9447a(sVar, this.f103209d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1157;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAuthorize", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f103210e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        k80.f fVar = this.f103211f;
        if (fVar != null) {
            fVar.a(i18, i19, str, this);
        }
    }
}
