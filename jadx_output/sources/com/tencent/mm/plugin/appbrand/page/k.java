package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class k implements com.tencent.mm.plugin.appbrand.page.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.a f86806a;

    public k(com.tencent.mm.plugin.appbrand.page.a aVar, com.tencent.mm.plugin.appbrand.page.b bVar) {
        this.f86806a = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.a aVar = this.f86806a;
        if (aVar.J().R.e()) {
            java.lang.String d17 = aVar.J().R.d(str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(d17);
            sb6.append(d17.endsWith("/") ? "" : "/");
            sb6.append("page-frame.js");
            java.lang.String sb7 = sb6.toString();
            java.lang.String a17 = aVar.O().a(sb7);
            if (android.text.TextUtils.isEmpty(a17)) {
                throw new com.tencent.mm.plugin.appbrand.appcache.t6(sb7);
            }
            aVar.f86384v.a(d17, false);
            aVar.P(sb7, a17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.a aVar = this.f86806a;
        aVar.P(str, aVar.O().a(str));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public boolean c(java.lang.String str) {
        return "app-wxss.js".equals(str) || "page-frame.html".equals(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public void d() {
        com.tencent.mm.plugin.appbrand.page.a aVar = this.f86806a;
        aVar.f86384v.a(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, false);
        if (!aVar.J().R.e()) {
            aVar.P("page-frame.html", aVar.O().a("page-frame.html"));
            return;
        }
        java.lang.String a17 = aVar.O().a("app-wxss.js");
        if (android.text.TextUtils.isEmpty(a17)) {
            throw new com.tencent.mm.plugin.appbrand.appcache.t6("app-wxss.js");
        }
        aVar.P("app-wxss.js", a17);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i
    public java.lang.String name() {
        return "Legacy";
    }
}
