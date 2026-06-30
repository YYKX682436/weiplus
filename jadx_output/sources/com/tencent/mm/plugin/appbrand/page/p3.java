package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class p3 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wd f86986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86987f;

    public p3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        this.f86987f = i3Var;
        this.f86985d = str;
        this.f86986e = wdVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.page.w2 d17;
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f86987f;
        com.tencent.mm.plugin.appbrand.page.r4 r4Var = i3Var.f86706i;
        java.lang.String str = this.f86985d;
        com.tencent.mm.plugin.appbrand.page.wd wdVar = this.f86986e;
        return (r4Var == null || (d17 = r4Var.d(str, wdVar, i3Var, new com.tencent.mm.plugin.appbrand.page.o3(i3Var, str, wdVar))) == null) ? i3Var.f0(str, wdVar) ? new com.tencent.mm.plugin.appbrand.page.y1(i3Var.getContext(), i3Var) : new com.tencent.mm.plugin.appbrand.page.s8(i3Var.getContext(), i3Var) : d17;
    }
}
