package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public enum j0 {
    /* JADX INFO: Fake field, exist only in values array */
    X5,
    MMV8,
    /* JADX INFO: Fake field, exist only in values array */
    WebViewBased,
    /* JADX INFO: Fake field, exist only in values array */
    NativeScript,
    NodeJS,
    J2V8,
    /* JADX INFO: Fake field, exist only in values array */
    WebViewX5,
    WebViewXW,
    WebViewSystem,
    Invalid;


    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.j0[] f87883m;

    static {
        com.tencent.mm.plugin.appbrand.report.j0 j0Var = MMV8;
        com.tencent.mm.plugin.appbrand.report.j0 j0Var2 = NodeJS;
        f87883m = new com.tencent.mm.plugin.appbrand.report.j0[]{j0Var, J2V8, j0Var2};
    }

    public static com.tencent.mm.plugin.appbrand.report.j0 a(com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        if (tVar instanceof com.tencent.mm.plugin.appbrand.jsruntime.g) {
            return J2V8;
        }
        if (tVar instanceof com.tencent.mm.plugin.appbrand.jsruntime.o0) {
            return NodeJS;
        }
        boolean z17 = tVar instanceof com.tencent.mm.plugin.appbrand.debugger.g1;
        com.tencent.mm.plugin.appbrand.report.j0 j0Var = Invalid;
        if (z17) {
            return j0Var;
        }
        if (!(tVar instanceof com.tencent.mm.plugin.appbrand.page.fb)) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return j0Var;
        }
        boolean z18 = tVar instanceof com.tencent.mm.plugin.appbrand.page.na;
        java.lang.Object obj = tVar;
        if (z18) {
            obj = ((com.tencent.mm.plugin.appbrand.page.na) tVar).f86927d;
        }
        if (obj instanceof com.tencent.xweb.WebView) {
            com.tencent.xweb.WebView webView = (com.tencent.xweb.WebView) obj;
            if (webView.isSysKernel()) {
                return WebViewSystem;
            }
            if (webView.isXWalkKernel()) {
                return WebViewXW;
            }
        }
        return j0Var;
    }
}
