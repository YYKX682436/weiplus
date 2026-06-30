package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.predownload.c0 f75744d;

    public b0(com.tencent.mm.plugin.appbrand.appcache.predownload.c0 c0Var) {
        this.f75744d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.appcache.predownload.c0 c0Var = this.f75744d;
        c0Var.f75749b.a(com.tencent.mm.plugin.appbrand.service.r6.Success_AllPkgDownloaded);
        com.tencent.mm.plugin.appbrand.appcache.predownload.d0.f75754b.remove(c0Var.f75748a, c0Var);
    }
}
