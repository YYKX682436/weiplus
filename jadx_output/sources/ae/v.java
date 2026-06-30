package ae;

/* loaded from: classes7.dex */
public class v extends com.tencent.luggage.sdk.jsapi.component.service.f {

    /* renamed from: h, reason: collision with root package name */
    public boolean f3371h;

    public v(com.tencent.luggage.sdk.jsapi.component.service.y yVar, com.tencent.mm.plugin.appbrand.jsruntime.j0 j0Var) {
        super(yVar, j0Var);
        this.f3371h = false;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public com.tencent.mm.plugin.appbrand.jsruntime.r a() {
        boolean z17;
        com.tencent.mm.plugin.appbrand.jsruntime.r a17 = super.a();
        if (this.f3371h) {
            try {
                com.tencent.mm.plugin.appbrand.jsruntime.n nVar = (com.tencent.mm.plugin.appbrand.jsruntime.n) a17;
                if (!com.tencent.mm.plugin.appbrand.jsruntime.l0.class.isInstance(nVar)) {
                    nVar = null;
                }
                ae.q qVar = (ae.q) this.f47406d.z1(ae.q.class);
                if (qVar != null) {
                    com.tencent.magicbrush.MagicBrush w17 = ((ae.a) qVar).w();
                    w17.n(new yg.x$$b(new yg.c0(nVar.L(), nVar.G(), nVar.z()), w17));
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsContextInterfaceLU", "No extension found!");
                }
            } catch (java.lang.NullPointerException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WAGameJsContextInterfaceLU", "injectNativeGlobal failed [%s]", e17);
                z17 = false;
            }
        }
        z17 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsContextInterfaceLU", "alloc injectNativeGlobal = [%b], ret = [%b]", java.lang.Boolean.valueOf(this.f3371h), java.lang.Boolean.valueOf(z17));
        return a17;
    }

    @android.webkit.JavascriptInterface
    public int allocNativeGlobal() {
        this.f3371h = true;
        int alloc = alloc();
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsContextInterfaceLU", "alloc injectNativeGlobal = [%b], ret = [%d]", java.lang.Boolean.valueOf(this.f3371h), java.lang.Integer.valueOf(alloc));
        this.f3371h = false;
        return alloc;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public java.lang.String g() {
        return "WAGameSubContext.js";
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void u() {
        super.u();
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsContextInterfaceLU", "hy: injected WAGameJSContextInterface");
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void x(int i17, java.lang.String str) {
        if (this.f3371h) {
            ((com.tencent.mm.plugin.appbrand.jsruntime.n) ((com.tencent.mm.plugin.appbrand.jsruntime.b) this.f47407e).x0(i17)).evaluateJavascript(ik1.f.e("wxa_library/NativeGlobal-WAGame.js"), null);
        }
    }
}
