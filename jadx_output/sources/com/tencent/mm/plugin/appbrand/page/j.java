package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class j implements com.tencent.mm.plugin.appbrand.page.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.a f86777a;

    public j(com.tencent.mm.plugin.appbrand.page.a aVar, com.tencent.mm.plugin.appbrand.page.b bVar) {
        this.f86777a = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.a aVar = this.f86777a;
        if (aVar.J().R.e()) {
            java.lang.String d17 = aVar.J().R.d(str);
            if (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME.equals(d17)) {
                return;
            }
            aVar.f86384v.a(d17, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(d17);
            sb6.append(d17.endsWith("/") ? "" : "/");
            java.lang.String sb7 = sb6.toString();
            e(sb7 + "common.app.js");
            e(sb7 + "webview.app.js");
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public void b(java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public boolean c(java.lang.String str) {
        return "webview.app.js".equals(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public void d() {
        this.f86777a.f86384v.a(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, true);
        e("common.app.js");
        e("webview.app.js");
    }

    public final void e(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.a aVar = this.f86777a;
        java.lang.String a17 = aVar.O().a(str);
        if (android.text.TextUtils.isEmpty(a17)) {
            throw new com.tencent.mm.plugin.appbrand.appcache.t6(str);
        }
        aVar.P(str, a17);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public java.lang.String name() {
        return "LazyCodeLoading";
    }
}
