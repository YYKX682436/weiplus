package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f88437e;

    public z2(java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        this.f88436d = str;
        this.f88437e = h0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.report.b3 b3Var = com.tencent.mm.plugin.appbrand.report.b3.f87812a;
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.report.b3.a(b3Var);
        kotlin.jvm.internal.h0 h0Var = this.f88437e;
        java.lang.String str = (java.lang.String) h0Var.f310123d;
        java.lang.String str2 = this.f88436d;
        a17.D(str2, str);
        java.lang.String k17 = u46.l.k(new java.lang.String[]{h0Var.f310123d, "", str2, "1"}, ",");
        kotlin.jvm.internal.o.f(k17, "join(...)");
        com.tencent.mm.plugin.appbrand.report.b3.b(b3Var, k17);
    }
}
