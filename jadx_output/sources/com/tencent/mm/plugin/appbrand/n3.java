package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class n3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f86022b;

    public n3(com.tencent.mm.plugin.appbrand.j3 j3Var, java.lang.String str) {
        this.f86022b = j3Var;
        this.f86021a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.page.md mdVar = new com.tencent.mm.plugin.appbrand.page.md(this.f86021a);
        mdVar.L0(this.f86022b.f78450b.S2(false));
        com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var = com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadBeforeRuntimeInit;
        mdVar.A3(o0Var);
        try {
            com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f86022b.f78450b.f74803n, true).E = o0Var;
        } catch (java.lang.Exception unused) {
            this.f86022b.g("doAheadPreloadPageView DONE but get NULL session", new java.lang.Object[0]);
        }
        return mdVar;
    }
}
