package bl0;

/* loaded from: classes7.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, k80.i {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f103212d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f103213e;

    /* renamed from: f, reason: collision with root package name */
    public final k80.h f103214f;

    public b(java.lang.String str, java.util.LinkedList linkedList, int i17, int i18, int i19, k80.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "NetSceneJSLogin doScene appId [%s], versionType [%d], opt [%d], extScene [%d]", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.e24();
        lVar.f152198b = new r45.f24();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/js-authorize-confirm";
        lVar.f152200d = me1.a.f72878x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f103212d = a17;
        r45.e24 e24Var = (r45.e24) a17.f152243a.f152217a;
        if (i19 > 0) {
            r45.nd7 nd7Var = new r45.nd7();
            e24Var.f454461h = nd7Var;
            nd7Var.f462829e = i19;
        }
        e24Var.f454457d = str;
        e24Var.f454458e = linkedList;
        e24Var.f454460g = i17;
        e24Var.f454459f = i18;
        this.f103214f = hVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "doScene");
        this.f103213e = u0Var;
        return mo9409x10f9447a(sVar, this.f103212d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return me1.a.f72878x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f103213e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        k80.h hVar = this.f103214f;
        if (hVar != null) {
            hVar.a(i18, i19, str, this);
        }
    }
}
