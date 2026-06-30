package bl0;

/* loaded from: classes7.dex */
public class d extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, k80.m {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f103218d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f103219e;

    /* renamed from: f, reason: collision with root package name */
    public final k80.l f103220f;

    public d(java.lang.String str, java.util.LinkedList linkedList, int i17, java.lang.String str2, int i18, int i19, int i27, k80.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSLoginConfirm", "NetSceneJSLogin doScene appId [%s], login_type [%d], state [%s], versionType [%d], opt [%d], extScene [%d]", str, java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152197a = new r45.i24();
        lVar2.f152198b = new r45.j24();
        lVar2.f152199c = "/cgi-bin/mmbiz-bin/js-login-confirm";
        lVar2.f152200d = 1117;
        lVar2.f152201e = 0;
        lVar2.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar2.a();
        this.f103218d = a17;
        r45.i24 i24Var = (r45.i24) a17.f152243a.f152217a;
        if (i27 > 0) {
            r45.nd7 nd7Var = new r45.nd7();
            i24Var.f458219m = nd7Var;
            nd7Var.f462829e = i27;
        }
        i24Var.f458213d = str;
        i24Var.f458214e = linkedList;
        i24Var.f458215f = i17;
        i24Var.f458216g = str2;
        i24Var.f458218i = i18;
        i24Var.f458217h = i19;
        this.f103220f = lVar;
    }

    public r45.j24 H() {
        return (r45.j24) this.f103218d.f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSLoginConfirm", "doScene");
        this.f103219e = u0Var;
        return mo9409x10f9447a(sVar, this.f103218d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1117;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.NetSceneJSLoginConfirm", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f103219e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        k80.l lVar = this.f103220f;
        if (lVar != null) {
            lVar.a(i18, i19, str, this);
        }
    }
}
