package bl0;

/* loaded from: classes7.dex */
public class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, k80.k {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f103215d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f103216e;

    /* renamed from: f, reason: collision with root package name */
    public final k80.j f103217f;

    public c(java.lang.String str, java.util.LinkedList linkedList, int i17, java.lang.String str2, java.lang.String str3, int i18, int i19, k80.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSLogin", "NetSceneJSLogin doScene appId [%s], loginType [%d], url [%s], state [%s], versionType [%d], extScene [%d]", str, java.lang.Integer.valueOf(i17), str2, str3, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.k24();
        lVar.f152198b = new r45.l24();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/js-login";
        lVar.f152200d = 1029;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f103215d = a17;
        r45.k24 k24Var = (r45.k24) a17.f152243a.f152217a;
        k24Var.f459858d = str;
        k24Var.f459859e = linkedList;
        k24Var.f459860f = i17;
        k24Var.f459861g = str2;
        k24Var.f459862h = str3;
        k24Var.f459863i = i18;
        if (i19 > 0) {
            r45.nd7 nd7Var = new r45.nd7();
            k24Var.f459864m = nd7Var;
            nd7Var.f462829e = i19;
        }
        this.f103217f = jVar;
    }

    public r45.l24 H() {
        return (r45.l24) this.f103215d.f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSLogin", "doScene");
        this.f103216e = u0Var;
        return mo9409x10f9447a(sVar, this.f103215d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1029;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSLogin", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f103216e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        k80.j jVar = this.f103217f;
        if (jVar != null) {
            jVar.a(i18, i19, str, this);
        }
    }
}
