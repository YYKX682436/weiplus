package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class s3 implements com.tencent.mm.plugin.appbrand.page.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f87075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.a5[] f87076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f87077c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f87078d;

    public s3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.a5[] a5VarArr, long j17) {
        this.f87078d = i3Var;
        this.f87075a = w2Var;
        this.f87076b = a5VarArr;
        this.f87077c = j17;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.j2
    public void a(com.tencent.mm.plugin.appbrand.page.y1 y1Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.wd wdVar = com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB;
        y1Var.s(this.f87077c, wdVar);
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f87078d;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f87075a;
        i3Var.l(wdVar, w2Var, y1Var);
        i3Var.F(w2Var, y1Var, wdVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.j2
    public void b(com.tencent.mm.plugin.appbrand.page.y1 y1Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f87078d;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f87075a;
        com.tencent.mm.plugin.appbrand.page.wd wdVar = com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB;
        com.tencent.mm.plugin.appbrand.page.a5 G = i3Var.G(w2Var, y1Var, wdVar, str, com.tencent.mm.plugin.appbrand.page.xd.a(wdVar));
        this.f87076b[0] = G;
        y1Var.t(this.f87077c, "onAppRoute", wdVar, G, null, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.j2
    public void c(com.tencent.mm.plugin.appbrand.page.y1 y1Var, java.lang.String str) {
    }
}
