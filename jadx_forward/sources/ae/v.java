package ae;

/* loaded from: classes7.dex */
public class v extends com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f {

    /* renamed from: h, reason: collision with root package name */
    public boolean f84904h;

    public v(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0 j0Var) {
        super(yVar, j0Var);
        this.f84904h = false;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r a() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r a17 = super.a();
        if (this.f84904h) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) a17;
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class.isInstance(nVar)) {
                    nVar = null;
                }
                ae.q qVar = (ae.q) this.f128939d.z1(ae.q.class);
                if (qVar != null) {
                    com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad w17 = ((ae.a) qVar).w();
                    w17.n(new yg.RunnableC30790x37186a(new yg.c0(nVar.L(), nVar.G(), nVar.z()), w17));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameJsContextInterfaceLU", "No extension found!");
                }
            } catch (java.lang.NullPointerException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGameJsContextInterfaceLU", "injectNativeGlobal failed [%s]", e17);
                z17 = false;
            }
        }
        z17 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsContextInterfaceLU", "alloc injectNativeGlobal = [%b], ret = [%b]", java.lang.Boolean.valueOf(this.f84904h), java.lang.Boolean.valueOf(z17));
        return a17;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: allocNativeGlobal */
    public int m1153x525c626f() {
        this.f84904h = true;
        int m32111x589a335 = m32111x589a335();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsContextInterfaceLU", "alloc injectNativeGlobal = [%b], ret = [%d]", java.lang.Boolean.valueOf(this.f84904h), java.lang.Integer.valueOf(m32111x589a335));
        this.f84904h = false;
        return m32111x589a335;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public java.lang.String g() {
        return "WAGameSubContext.js";
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void u() {
        super.u();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsContextInterfaceLU", "hy: injected WAGameJSContextInterface");
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void x(int i17, java.lang.String str) {
        if (this.f84904h) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b) this.f128940e).x0(i17)).mo14660x738236e6(ik1.f.e("wxa_library/NativeGlobal-WAGame.js"), null);
        }
    }
}
