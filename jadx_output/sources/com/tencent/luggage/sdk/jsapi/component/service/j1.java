package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class j1 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.k1 f47457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.r f47458b;

    public j1(com.tencent.luggage.sdk.jsapi.component.service.k1 k1Var, com.tencent.mm.plugin.appbrand.jsruntime.r rVar) {
        this.f47457a = k1Var;
        this.f47458b = rVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(java.lang.Object obj) {
        this.f47457a.f47465c = obj;
        if (obj == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JSContextInterfaceSharer", "onJSContextInterfaceInjected, value is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = this.f47457a.f47463a.getF147808e();
        com.tencent.mm.plugin.appbrand.jsruntime.y yVar = f147808e != null ? (com.tencent.mm.plugin.appbrand.jsruntime.y) f147808e.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class) : null;
        if (yVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JSContextInterfaceSharer", "onJSContextInterfaceInjected, addOn is null");
        } else {
            yVar.r(new com.tencent.luggage.sdk.jsapi.component.service.i1(this.f47457a, this.f47458b, obj));
        }
    }
}
