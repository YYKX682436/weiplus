package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class m4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f85700c;

    public m4(com.tencent.mm.plugin.appbrand.j3 j3Var, java.lang.String str, java.lang.String str2) {
        this.f85700c = j3Var;
        this.f85698a = str;
        this.f85699b = str2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        final km5.b c17 = km5.u.c();
        ku5.u0 u0Var = ku5.t0.f312615d;
        final java.lang.String str = this.f85698a;
        final java.lang.String str2 = this.f85699b;
        ((ku5.t0) u0Var).a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.m4$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.m4 m4Var = com.tencent.mm.plugin.appbrand.m4.this;
                m4Var.getClass();
                com.tencent.mm.plugin.appbrand.service.u6 u6Var = new com.tencent.mm.plugin.appbrand.service.u6(str, str2);
                if (!com.tencent.mm.plugin.appbrand.service.k7.f88707a) {
                    u6Var.L0(m4Var.f85700c.f78450b.S2(false));
                    u6Var.F1(com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadBeforeRuntimeInit);
                }
                c17.c(u6Var);
            }
        });
        return null;
    }
}
