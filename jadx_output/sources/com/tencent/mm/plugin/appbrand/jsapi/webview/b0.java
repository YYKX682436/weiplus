package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f83874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f83875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f83876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f83877g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webview.c0 f83878h;

    public b0(boolean z17, of1.w1 w1Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.webview.c0 c0Var2) {
        this.f83874d = z17;
        this.f83875e = w1Var;
        this.f83876f = c0Var;
        this.f83877g = i17;
        this.f83878h = c0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        of1.x1 controller;
        of1.x1 controller2;
        boolean z17 = this.f83874d;
        com.tencent.mm.plugin.appbrand.jsapi.webview.c0 c0Var = this.f83878h;
        int i17 = this.f83877g;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var2 = this.f83876f;
        of1.w1 w1Var = this.f83875e;
        if (z17) {
            if (w1Var == null || (controller2 = w1Var.getController()) == null) {
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.webview.z zVar = new com.tencent.mm.plugin.appbrand.jsapi.webview.z(c0Var2, i17, c0Var);
            of1.v0 v0Var = (of1.v0) controller2;
            com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper = v0Var.f345022a2;
            if (webViewTransHelper == null) {
                kotlin.jvm.internal.o.o("transHelper");
                throw null;
            }
            of1.p0 p0Var = new of1.p0(v0Var, zVar);
            synchronized (webViewTransHelper.f181752r) {
                if (webViewTransHelper.f181742e == null) {
                    webViewTransHelper.f181753s.add(p0Var);
                    return;
                } else {
                    p0Var.invoke();
                    return;
                }
            }
        }
        if (w1Var == null || (controller = w1Var.getController()) == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.webview.a0 a0Var = new com.tencent.mm.plugin.appbrand.jsapi.webview.a0(c0Var2, i17, c0Var);
        of1.v0 v0Var2 = (of1.v0) controller;
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper2 = v0Var2.f345022a2;
        if (webViewTransHelper2 == null) {
            kotlin.jvm.internal.o.o("transHelper");
            throw null;
        }
        of1.l0 l0Var = new of1.l0(v0Var2, a0Var);
        synchronized (webViewTransHelper2.f181752r) {
            if (webViewTransHelper2.f181742e == null) {
                webViewTransHelper2.f181753s.add(l0Var);
            } else {
                l0Var.invoke();
            }
        }
    }
}
