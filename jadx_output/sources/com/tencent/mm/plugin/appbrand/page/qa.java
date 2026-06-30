package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class qa implements com.tencent.mm.plugin.appbrand.jsapi.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f87040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webview.o f87041b;

    public qa(com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar) {
        this.f87040a = n7Var;
        this.f87041b = oVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a0
    public void onReady() {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f87040a;
        java.lang.Object B1 = n7Var.B1(ni1.f.class);
        com.tencent.mm.plugin.appbrand.page.sa saVar = B1 instanceof com.tencent.mm.plugin.appbrand.page.sa ? (com.tencent.mm.plugin.appbrand.page.sa) B1 : null;
        if (saVar != null) {
            saVar.m(this.f87041b);
        }
        n7Var.G(this);
    }
}
