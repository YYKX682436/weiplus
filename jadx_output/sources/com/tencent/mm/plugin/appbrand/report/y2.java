package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f88434e;

    public y2(java.lang.String str, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f88433d = str;
        this.f88434e = appBrandInitConfigWC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.report.b3 b3Var = com.tencent.mm.plugin.appbrand.report.b3.f87812a;
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.report.b3.a(b3Var);
        java.lang.String str = this.f88433d;
        java.lang.String str2 = null;
        java.lang.String u17 = a17.u(str, null);
        if (u17 != null) {
            a17.W(str);
            str2 = u17;
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        java.lang.String k17 = u46.l.k(new java.lang.String[]{str2, this.f88434e.f47276v, str, "2"}, ",");
        kotlin.jvm.internal.o.f(k17, "join(...)");
        com.tencent.mm.plugin.appbrand.report.b3.b(b3Var, k17);
    }
}
