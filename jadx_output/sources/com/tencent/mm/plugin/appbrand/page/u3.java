package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class u3 implements com.tencent.mm.plugin.appbrand.page.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f87135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.a5[] f87136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f87137c;

    public u3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.a5[] a5VarArr) {
        this.f87137c = i3Var;
        this.f87135a = w2Var;
        this.f87136b = a5VarArr;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.j2
    public void a(com.tencent.mm.plugin.appbrand.page.y1 y1Var, java.lang.String str) {
        this.f87137c.F(this.f87135a, y1Var, com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.j2
    public void b(com.tencent.mm.plugin.appbrand.page.y1 y1Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f87137c;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f87135a;
        com.tencent.mm.plugin.appbrand.page.wd wdVar = com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB;
        this.f87136b[0] = i3Var.G(w2Var, y1Var, wdVar, str, com.tencent.mm.plugin.appbrand.page.xd.a(wdVar));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.j2
    public void c(com.tencent.mm.plugin.appbrand.page.y1 y1Var, java.lang.String str) {
    }
}
