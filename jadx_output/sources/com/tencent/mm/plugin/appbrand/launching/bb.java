package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class bb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f84528d;

    public bb(com.tencent.mm.plugin.appbrand.o6 runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f84528d = runtime;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.launching.fb a17;
        java.util.List<com.tencent.mm.plugin.appbrand.launching.cb> list;
        java.lang.String str2 = this.f84528d.f74803n;
        com.tencent.mm.plugin.appbrand.launching.n nVar = (com.tencent.mm.plugin.appbrand.launching.n) this.f84528d.f86172i2.b();
        kotlin.jvm.internal.o.f(nVar, "getCgiPrefetch(...)");
        java.lang.String str3 = this.f84528d.u0().f47277w;
        kotlin.jvm.internal.o.f(str3, "getWxaLaunchInstanceId(...)");
        com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp a18 = nVar.a(2, str3, -1L);
        if (a18 == null || (str = a18.f84336d) == null || (a17 = com.tencent.mm.plugin.appbrand.launching.fb.f84612b.a(str)) == null || (list = a17.f84613a) == null) {
            return;
        }
        for (com.tencent.mm.plugin.appbrand.launching.cb cbVar : list) {
            if (cbVar.f84554c == 1) {
                java.lang.String str4 = cbVar.f84552a;
                ui1.p pVar = ui1.t.f428082d;
                if (!u46.l.e(str2) && !u46.l.e(str4)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "presetUserAuthorized for appId:%s api:%s", str2, str4);
                    ui1.t.f428082d.e(str2, str4);
                }
            }
        }
    }
}
