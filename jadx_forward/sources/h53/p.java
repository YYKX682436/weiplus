package h53;

/* loaded from: classes7.dex */
public class p implements sd.h {
    private static final java.lang.String TAG = "MicroMsg.LuggageGameJsRuntimeImpl";

    /* renamed from: firstCreate */
    private boolean f69819xa6fc9bcc = true;

    /* renamed from: mContext */
    private android.content.Context f69820xd6cfe882;

    /* renamed from: mEngine */
    private cl.q0 f69821x204210f;

    public p(android.content.Context context) {
        this.f69820xd6cfe882 = context;
        m132902x316510();
    }

    @Override // od.p
    /* renamed from: addJavascriptInterface */
    public void mo32257x74041feb(java.lang.Object obj, java.lang.String str) {
        cl.q0 q0Var = this.f69821x204210f;
        q0Var.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        ((cl.a) q0Var.f124257b).h(new cl.t0(q0Var, obj, str, android.webkit.JavascriptInterface.class), false);
    }

    @Override // sd.h
    /* renamed from: destroy */
    public void mo130332x5cd39ffa() {
        this.f69821x204210f.c();
        ((cl.a) this.f69821x204210f.f124257b).g();
        this.f69820xd6cfe882 = null;
    }

    @Override // od.p
    /* renamed from: evaluateJavascript */
    public void mo32260x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f69821x204210f.d(str, new h53.o(this, valueCallback));
    }

    @Override // od.p
    /* renamed from: getContext */
    public android.content.Context mo32261x76847179() {
        return this.f69820xd6cfe882;
    }

    @Override // od.p
    /* renamed from: getUserAgent */
    public java.lang.String mo32054x11fd7f44() {
        return ik1.l0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "", (ik1.k0) nd.f.a(ik1.k0.class)) + " v8";
    }

    /* renamed from: init */
    public void m132902x316510() {
        boolean z17 = cl.x.f124350a;
        cl.e0 e0Var = new cl.e0(null);
        if (e0Var.B == null) {
            e0Var.B = new cl.q0(e0Var, e0Var.b(), new cl.d0(e0Var));
        }
        cl.q0 q0Var = e0Var.B;
        this.f69821x204210f = q0Var;
        q0Var.g(1, new h53.n(this));
        mo32257x74041feb(new h53.l(), "WxGameJsCoreNative");
    }

    @Override // sd.h
    /* renamed from: injectInitScript */
    public void mo130333xb7489a6c() {
        this.f69821x204210f.d(ik1.f.e("luggage_mm_adapter.js"), null);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int a17 = ((b17.y - com.p314xaae8f345.mm.ui.bl.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) - com.p314xaae8f345.mm.ui.bl.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) - com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        float g17 = i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        mo32260x738236e6(java.lang.String.format(ik1.f.e("game_jscore_system_info.js"), java.lang.String.valueOf(b17.x), java.lang.String.valueOf(a17), java.lang.String.valueOf(b17.x), java.lang.String.valueOf(b17.y), java.lang.String.valueOf(g17), m40061x1de3608b, android.os.Build.BRAND, wo.w0.m(), java.lang.String.format("0x%08X", java.lang.Integer.valueOf(o45.wf.f424562g)), "Android-" + android.os.Build.VERSION.SDK_INT, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.C())), null);
    }
}
