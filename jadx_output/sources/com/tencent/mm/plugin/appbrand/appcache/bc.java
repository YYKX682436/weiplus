package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class bc implements com.tencent.mm.plugin.appbrand.appcache.nb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f75457a;

    public bc(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f75457a = appBrandRuntime;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.nb
    public boolean a() {
        this.f75457a.getClass();
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.nb
    public void b(k91.y0 y0Var) {
        this.f75457a.E.add(y0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.nb
    public com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo c() {
        return ((k91.z0) this.f75457a.b(k91.z0.class)).f305852r;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.nb
    public java.lang.String getAppId() {
        return this.f75457a.f74803n;
    }
}
