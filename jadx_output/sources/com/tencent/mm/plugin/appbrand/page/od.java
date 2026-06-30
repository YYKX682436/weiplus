package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class od implements com.tencent.mm.plugin.appbrand.page.hb {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f86974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.pd f86975b;

    public od(com.tencent.mm.plugin.appbrand.page.pd pdVar) {
        this.f86975b = pdVar;
        this.f86974a = jz5.h.a(jz5.i.f302831f, new com.tencent.mm.plugin.appbrand.page.nd(pdVar));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.hb
    public java.lang.String a(java.lang.String str) {
        if (!kotlin.jvm.internal.o.b(str, "WAWebview.js")) {
            return ((com.tencent.mm.plugin.appbrand.page.sb) this.f86974a.getValue()).a(str);
        }
        com.tencent.mm.plugin.appbrand.page.pd pdVar = this.f86975b;
        java.lang.Object r17 = pdVar.r(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class);
        kotlin.jvm.internal.o.d(r17);
        java.lang.String M = ((com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) r17).M("WAWebview.js");
        kotlin.jvm.internal.o.d(M);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.appbrand.jsapi.l F = pdVar.F();
        kotlin.jvm.internal.o.e(F, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.MonkeyTestAppPageView");
        sb6.append(((com.tencent.mm.plugin.appbrand.page.md) F).getWaAutoWebViewJs());
        sb6.append("\n\n");
        sb6.append(M);
        return sb6.toString();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.hb
    public java.lang.String b(java.lang.String str) {
        return ((com.tencent.mm.plugin.appbrand.page.sb) this.f86974a.getValue()).b(str);
    }
}
