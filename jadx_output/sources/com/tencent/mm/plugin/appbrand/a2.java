package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class a2 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f74886d;

    public a2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f74886d = appBrandRuntime;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "hideSplash complete, appId:%s", this.f74886d.f74803n);
        this.f74886d.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.a2$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.a2.this.f74886d.f74811t = null;
            }
        });
        return null;
    }
}
