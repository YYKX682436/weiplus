package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.a0 f47526d;

    public r0(com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var) {
        this.f47526d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "hy: base service js runtime post created run");
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = this.f47526d;
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) a0Var.M(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
        if (l0Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "hy: v8 not ready or released!");
            return;
        }
        if (a0Var.f47368o != null) {
            if (l0Var.z() != 0) {
                com.tencent.luggage.sdk.jsapi.component.service.t0 t0Var = a0Var.f47368o;
                long L = l0Var.L();
                long G = l0Var.G();
                long z17 = l0Var.z();
                iz5.a.b(null, 0L, java.lang.Long.valueOf(t0Var.f47535a));
                t0Var.f47535a = t0Var.f47539e.initCronetJsBinding(L, G, z17);
            } else {
                com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "uv_ptr is null. cronet binding init failed");
                a0Var.f47368o = null;
            }
        }
        com.tencent.luggage.sdk.jsapi.component.service.e eVar = a0Var.f47362f;
        eVar.f47398a.notifyBindTo(l0Var.L(), l0Var.G(), l0Var.z());
        if (a0Var.f47369p == null) {
            com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var = new com.tencent.luggage.sdk.jsapi.component.service.n2();
            a0Var.f47369p = n2Var;
            long L2 = l0Var.L();
            long G2 = l0Var.G();
            com.tencent.mm.weapp_core.JsBridge jsBridge = n2Var.f47502a;
            if (jsBridge == null) {
                kotlin.jvm.internal.o.o("jsBridge");
                throw null;
            }
            jsBridge.bindTo(L2, G2);
        }
        if (a0Var.Z()) {
            eVar.f47398a.notifyBindConsoleTo(l0Var.L(), l0Var.G(), l0Var.z());
        }
        eVar.f47399b.a(l0Var.L(), l0Var.G());
        com.tencent.mm.plugin.appbrand.jsruntime.v vVar = (com.tencent.mm.plugin.appbrand.jsruntime.v) a0Var.M(com.tencent.mm.plugin.appbrand.jsruntime.v.class);
        if (vVar != null) {
            vVar.B(new com.tencent.luggage.sdk.jsapi.component.service.q0(this));
        } else {
            com.tencent.mars.xlog.Log.w("Luggage.BaseAppBrandServiceLogic", "hy: buffer url addon not exist!");
        }
    }
}
