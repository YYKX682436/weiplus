package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public class n extends com.tencent.mm.plugin.appbrand.page.n7 implements com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x {

    /* renamed from: n2, reason: collision with root package name */
    public static final /* synthetic */ int f85661n2 = 0;

    /* renamed from: m2, reason: collision with root package name */
    public java.lang.String f85662m2;

    public n() {
        super(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.m.class);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n7, com.tencent.luggage.sdk.jsapi.component.b
    public void B3() {
        r1().setNavHidden(false);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n7, com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5
    public void K2() {
        try {
            super.K2();
        } catch (java.lang.NullPointerException unused) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n7, com.tencent.mm.plugin.appbrand.page.v5
    public void Z0(com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        super.Z0(wdVar);
        r1().setNavHidden(true);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n7, com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5, com.tencent.mm.plugin.appbrand.page.r, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getF147807d();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n7
    public void n4() {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n7, com.tencent.mm.plugin.appbrand.page.v5
    public boolean o2() {
        return false;
    }

    public java.lang.String o4() {
        return this.f85662m2;
    }

    public void p4(java.lang.String str) {
        this.f85662m2 = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n7, com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5, com.tencent.mm.plugin.appbrand.page.r, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n7, com.tencent.luggage.sdk.jsapi.component.b
    /* renamed from: getRuntime, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t t3() {
        return (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t) super.getRuntime();
    }
}
