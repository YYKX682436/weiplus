package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* loaded from: classes7.dex */
public abstract class h extends com.tencent.mm.plugin.appbrand.jsapi.f {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.nfc.f f82402g = null;

    public final void C(com.tencent.mm.plugin.appbrand.jsapi.nfc.f fVar, boolean z17) {
        this.f82402g = fVar;
        new com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiAppBrandNFCBase$CheckIsSupportHCETask(this, z17).d();
    }
}
