package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class n2 implements com.tencent.mm.ipcinvoker.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f86020a;

    public n2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f86020a = appBrandRuntime;
    }

    @Override // com.tencent.mm.ipcinvoker.u0
    public void R() {
        if (this.f86020a.C.getAndSet(false)) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f86020a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "onServiceReconnected: %s", appBrandRuntime.f74803n);
            if (!appBrandRuntime.J0()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntime", "Main Process Restarted, start prepare again");
                appBrandRuntime.m(new com.tencent.mm.plugin.appbrand.i2(appBrandRuntime));
                return;
            }
            appBrandRuntime.t1();
            java.lang.String str = appBrandRuntime.f74803n;
            java.util.Iterator it = com.tencent.mm.plugin.appbrand.x0.f92366a;
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            java.util.Iterator c17 = com.tencent.mm.plugin.appbrand.x0.c(str);
            while (c17.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.v0) c17.next()).f();
            }
        }
    }
}
