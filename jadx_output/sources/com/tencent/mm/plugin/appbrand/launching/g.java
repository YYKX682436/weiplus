package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mm.plugin.appbrand.launching.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f84615a;

    public g(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f84615a = runtime;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.f
    public java.util.List a() {
        return this.f84615a.E0().f305852r.f75402g;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.f
    public java.lang.String b(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return com.tencent.mm.plugin.appbrand.appcache.la.p(this.f84615a, path);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.f
    public boolean c() {
        java.lang.String appId = getAppId();
        nf.y yVar = nf.x.f336616b;
        if (yVar != null) {
            return yVar.i(appId);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.f
    public java.lang.String getAppId() {
        java.lang.String str = this.f84615a.f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        return str;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.f
    public boolean k() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f84615a;
        com.tencent.mm.plugin.appbrand.o6 o6Var = appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) appBrandRuntime : null;
        return o6Var != null && o6Var.q2();
    }
}
