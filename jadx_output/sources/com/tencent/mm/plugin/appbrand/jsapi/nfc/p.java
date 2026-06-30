package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* loaded from: classes7.dex */
public class p extends com.tencent.mm.plugin.appbrand.v0 {
    public p(com.tencent.mm.plugin.appbrand.jsapi.nfc.r rVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "AppBrandLifeCycle onDestroy");
        synchronized (com.tencent.mm.plugin.appbrand.jsapi.nfc.d.class) {
            com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82400b = true;
        }
    }
}
