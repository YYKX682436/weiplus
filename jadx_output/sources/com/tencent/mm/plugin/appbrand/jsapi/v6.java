package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class v6 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.w6 f83510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f83511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f83512c;

    public v6(com.tencent.mm.plugin.appbrand.jsapi.w6 w6Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f83510a = w6Var;
        this.f83511b = d0Var;
        this.f83512c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiJumpToWCPayMessage", "on Activity result: %s", java.lang.Integer.valueOf(i18));
        boolean z17 = false;
        if (i17 != this.f83510a.f83713g) {
            return false;
        }
        int i19 = this.f83512c;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f83511b;
        if (i18 == -1) {
            d0Var.a(i19, "jumpToWCPayMessage:ok");
        } else {
            d0Var.a(i19, "jumpToWCPayMessage:fail");
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = d0Var.t3();
        if (intent != null && intent.getIntExtra("closeWebView", 0) == 1) {
            z17 = true;
        }
        if (!z17) {
            t37 = null;
        }
        if (t37 != null) {
            t37.S();
        }
        return true;
    }
}
