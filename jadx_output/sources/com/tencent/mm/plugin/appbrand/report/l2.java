package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class l2 implements ne.n, ne.q {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.l2 f87911b = new com.tencent.mm.plugin.appbrand.report.l2();

    @Override // ne.q
    public java.lang.String a() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return b(java.lang.System.currentTimeMillis());
    }

    public java.lang.String b(long j17) {
        java.lang.String a17;
        java.lang.String[] strArr = new java.lang.String[5];
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            a17 = gm0.j1.b().j();
            kotlin.jvm.internal.o.d(a17);
        } else {
            a17 = kk.v.a(gm0.m.i());
            kotlin.jvm.internal.o.d(a17);
        }
        strArr[0] = "hash=".concat(a17);
        strArr[1] = "ts=" + j17;
        strArr[2] = "host=";
        strArr[3] = "version=" + o45.wf.f343029g;
        strArr[4] = "device=2";
        java.lang.String k17 = u46.l.k(strArr, "&");
        kotlin.jvm.internal.o.f(k17, "join(...)");
        return k17;
    }
}
