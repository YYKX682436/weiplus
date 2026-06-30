package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class x implements com.tencent.mm.plugin.appbrand.jsapi.k {

    /* renamed from: a, reason: collision with root package name */
    public final si1.g f92363a;

    /* renamed from: b, reason: collision with root package name */
    public final u81.h f92364b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f92365c;

    public x(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.jsapi.l lVar, si1.g gVar) {
        java.util.Objects.requireNonNull(lVar);
        this.f92365c = lVar;
        java.util.Objects.requireNonNull(gVar);
        this.f92363a = gVar;
        u81.h hVar = appBrandRuntime.N;
        java.util.Objects.requireNonNull(hVar);
        this.f92364b = hVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k
    public void a(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k
    public void b(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, com.tencent.mm.plugin.appbrand.jsapi.j jVar) {
        try {
            e(n5Var, c0Var, jVar);
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandComponentInterceptor", e17, "onDispatchImpl %s", n5Var.k());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k
    public boolean c(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, com.tencent.mm.plugin.appbrand.jsapi.j jVar) {
        si1.j b17 = this.f92363a.b(this.f92365c, k0Var, str, str2, i17, new com.tencent.mm.plugin.appbrand.w(this, jVar, k0Var, str, str2, i17));
        int i18 = b17.f408270a;
        if (-2 == i18) {
            return true;
        }
        if (i18 == 0) {
            return false;
        }
        jVar.b(k0Var.r(b17.f408271b, b17.f408272c, null));
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k
    public void d(int i17, java.lang.String str) {
    }

    public final void e(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, com.tencent.mm.plugin.appbrand.jsapi.j jVar) {
        u81.h hVar = this.f92364b;
        if (hVar.f425432a.f425427y.get()) {
            jVar.b("fail:interrupted");
            return;
        }
        java.lang.String k17 = n5Var.k();
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f92365c;
        boolean c17 = lVar.c(k17, c0Var);
        boolean z17 = true;
        if (!c17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentInterceptor", "onDispatch, event[%s], appId[%s], envStopped", n5Var.k(), lVar.getAppId());
            jVar.b("fail:interrupted");
            return;
        }
        u81.b b17 = hVar.b();
        boolean a17 = this.f92363a.a(lVar, n5Var.getClass());
        boolean z18 = u81.b.SUSPEND == b17 || a17;
        si1.r0 r0Var = si1.q0.f408285a;
        if (r0Var != null && r0Var.N4(n5Var)) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandComponentInterceptor", "dispatchToService, canSend %B, event %s, state %s, hasPermission %b", java.lang.Boolean.valueOf(z18), n5Var.k(), b17, java.lang.Boolean.valueOf(a17));
            if (z65.c.a()) {
                if (n5Var.k().equals(ud1.a.NAME)) {
                    n5Var.k();
                    n5Var.o().getClass();
                } else {
                    n5Var.k();
                    n5Var.o();
                }
            }
        }
        if (z18) {
            jVar.a();
        } else {
            jVar.b("fail:access denied");
        }
    }

    public void f(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, int i18) {
    }
}
