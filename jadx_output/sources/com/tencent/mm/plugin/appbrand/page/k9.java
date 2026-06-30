package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class k9 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.db f86835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86836b;

    public k9(com.tencent.mm.plugin.appbrand.page.w9 w9Var, com.tencent.mm.plugin.appbrand.page.db dbVar, java.lang.String str) {
        this.f86835a = dbVar;
        this.f86836b = str;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.xweb.l2 l2Var = (com.tencent.xweb.l2) obj;
        com.tencent.mm.plugin.appbrand.page.db dbVar = this.f86835a;
        java.lang.String str = this.f86836b;
        if (l2Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebView", "onReceiveValue result is null");
            ((com.tencent.mm.plugin.appbrand.jsapi.media.l6) dbVar).a(str, null);
            return;
        }
        if (!str.equalsIgnoreCase(l2Var.c())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebView", "onReceiveValue url is not current url, current url:%s,  getUrl:%s", str, l2Var.c());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebView", "onReceiveValue, url = %s, errorCode = %d", l2Var.c(), java.lang.Integer.valueOf(l2Var.b()));
        if (l2Var.b() != 0 || l2Var.a() == null || l2Var.a().limit() <= 0) {
            ((com.tencent.mm.plugin.appbrand.jsapi.media.l6) dbVar).a(l2Var.c(), null);
            l2Var.d();
        } else {
            com.tencent.mm.plugin.appbrand.page.y yVar = new com.tencent.mm.plugin.appbrand.page.y();
            java.nio.ByteBuffer a17 = l2Var.a();
            com.tencent.mm.plugin.appbrand.page.j9 j9Var = new com.tencent.mm.plugin.appbrand.page.j9(this, l2Var);
            yVar.f87261a = a17;
            yVar.f87262b = j9Var;
            ((com.tencent.mm.plugin.appbrand.jsapi.media.l6) dbVar).a(str, yVar);
        }
    }
}
