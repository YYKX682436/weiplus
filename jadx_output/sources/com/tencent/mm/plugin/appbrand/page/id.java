package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class id implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.net.URL f86773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f86775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ed f86776g;

    public id(com.tencent.mm.plugin.appbrand.page.ed edVar, java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f86776g = edVar;
        this.f86773d = url;
        this.f86774e = str;
        this.f86775f = valueCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.ed edVar = this.f86776g;
        if (edVar.f86587p.get()) {
            return;
        }
        java.net.URL url = this.f86773d;
        if (url != null) {
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = edVar.f86579e;
            java.lang.String X1 = v5Var == null ? null : v5Var.X1();
            com.tencent.mm.plugin.appbrand.page.v5 v5Var2 = edVar.f86579e;
            com.tencent.mars.xlog.Log.i("Luggage.MPWebViewRenderEngineLegacyImpl", "evaluateJavascript sourceURL:%s, componentURL:%s, componentId:%d, hash:%d", url, X1, java.lang.Integer.valueOf(v5Var2 == null ? 0 : v5Var2.getComponentId()), java.lang.Integer.valueOf(edVar.hashCode()));
        }
        edVar.X(this.f86774e, this.f86775f);
    }
}
