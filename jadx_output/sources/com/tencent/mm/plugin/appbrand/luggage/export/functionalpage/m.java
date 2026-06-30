package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public final class m extends com.tencent.mm.plugin.appbrand.page.a {
    public m(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n nVar) {
        super(nVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a
    public com.tencent.mm.plugin.appbrand.page.fb S(android.content.Context context) {
        return new ce.a();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, ni1.d
    public boolean a(int i17, java.lang.String data) {
        java.util.Objects.requireNonNull((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) F());
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.d dVar = ((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) F()).getRuntime().f85669p3;
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x component = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x) F();
        dVar.getClass();
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.w wVar = dVar.f85578b;
        if (wVar != null) {
            wVar.c(component, i17, data);
            return true;
        }
        kotlin.jvm.internal.o.o("invokeProcess");
        throw null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, com.tencent.mm.plugin.appbrand.page.d7
    public boolean j(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        ((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) F()).m(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.l(this));
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, ni1.d
    public java.util.Map p() {
        java.util.HashMap hashMap = new java.util.HashMap(com.tencent.mm.plugin.appbrand.jsapi.p0.e());
        for (com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var : kz5.c0.i(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.p(), new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.s(), new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.v(), new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.y())) {
            hashMap.put(k0Var.k(), k0Var);
        }
        return hashMap;
    }
}
