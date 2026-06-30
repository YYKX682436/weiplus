package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class f3 implements com.tencent.mm.plugin.appbrand.appcache.nb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f90439b;

    public f3(java.lang.String str, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo) {
        this.f90438a = str;
        this.f90439b = wxaPkgWrappingInfo;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.nb
    public boolean a() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.nb
    public void b(k91.y0 y0Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.nb
    public com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo c() {
        return this.f90439b;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.nb
    public java.lang.String getAppId() {
        return this.f90438a;
    }
}
