package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class u3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f89263a;

    public u3(com.tencent.mm.plugin.appbrand.j3 j3Var) {
        this.f89263a = j3Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        boolean z17;
        boolean z18 = com.tencent.mm.plugin.appbrand.da.f77575a;
        synchronized (com.tencent.mm.plugin.appbrand.da.class) {
            z17 = com.tencent.mm.plugin.appbrand.da.f77576b;
        }
        this.f89263a.h("ensureXWebPreLoaded xwebLoaded %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return java.lang.Boolean.TRUE;
        }
        km5.b c17 = km5.u.c();
        com.tencent.mm.plugin.appbrand.keylogger.w.g(this.f89263a.f78450b.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareWebView);
        this.f89263a.f78450b.o(new com.tencent.mm.plugin.appbrand.s3(this, c17, java.lang.System.currentTimeMillis()));
        this.f89263a.f78450b.m(new com.tencent.mm.plugin.appbrand.t3(this));
        return java.lang.Boolean.FALSE;
    }
}
