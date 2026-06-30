package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class p0 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88258d;

    public p0(java.lang.String str) {
        this.f88258d = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        java.util.HashMap hashMap = (java.util.HashMap) com.tencent.mm.plugin.appbrand.report.quality.t0.f88313m;
        java.lang.String str = this.f88258d;
        hashMap.remove(str);
        com.tencent.mm.plugin.appbrand.x0.e(str, this);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        com.tencent.mm.plugin.appbrand.report.quality.t0.c(this.f88258d, 2);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        com.tencent.mm.plugin.appbrand.report.quality.t0.c(this.f88258d, 3);
    }
}
