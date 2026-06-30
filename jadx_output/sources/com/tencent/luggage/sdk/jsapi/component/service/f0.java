package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class f0 implements com.tencent.mm.plugin.appbrand.jsruntime.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.a0 f47420d;

    public f0(com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var) {
        this.f47420d = a0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.x
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "hy: bindings triggered destroy");
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = this.f47420d;
        com.tencent.mm.libmmwebrtc.MMWebRTCBinding mMWebRTCBinding = a0Var.f47364h;
        if (mMWebRTCBinding != null) {
            mMWebRTCBinding.destroy();
        }
        if (a0Var.f47365i != null) {
            com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "uint wemedia");
            a0Var.f47365i.uint();
            a0Var.f47365i = null;
            com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "uint wemedia done");
        }
        if (a0Var.f47367n != null) {
            com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "before destroy gameaccelerate");
            a0Var.f47367n.b();
            a0Var.f47367n = null;
            com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "after destroy gameaccelerate");
        }
        com.tencent.luggage.sdk.jsapi.component.service.e eVar = a0Var.f47362f;
        if (eVar != null) {
            eVar.f47399b.b();
            a0Var.f47362f.f47398a.notifyDestroy();
        }
        com.tencent.magicar.MagicAR magicAR = a0Var.f47366m;
        if (magicAR != null) {
            magicAR.destroy();
        }
        a0Var.f47366m = null;
    }
}
