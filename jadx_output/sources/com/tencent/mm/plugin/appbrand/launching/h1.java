package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f84634d;

    public h1(com.tencent.mm.plugin.appbrand.launching.r1 r1Var, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo) {
        this.f84634d = wxaPkgWrappingInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = this.f84634d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "runInClientProcess, prepare done, appPkg [%d | %s]", java.lang.Integer.valueOf(wxaPkgWrappingInfo.pkgVersion), com.tencent.mm.sdk.platformtools.t8.v(wxaPkgWrappingInfo.f75400e));
    }
}
