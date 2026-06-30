package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.nfc.r f82419d;

    public q(com.tencent.mm.plugin.appbrand.jsapi.nfc.r rVar) {
        this.f82419d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.appbrand.jsapi.nfc.r rVar = this.f82419d;
        synchronized (rVar.f82429t) {
            z17 = rVar.f82430u;
            if (!z17) {
                rVar.f82430u = true;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE onStartHCEOvertime has finished, return");
            return;
        }
        synchronized (com.tencent.mm.plugin.appbrand.jsapi.nfc.d.class) {
            z18 = com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82400b;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE onStartHCEOvertime has stop, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "start HCEService overtime, expect time limit: %d seconds", 10);
        synchronized (com.tencent.mm.plugin.appbrand.jsapi.nfc.d.class) {
            com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82400b = true;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = rVar.f82423n;
        if (lVar != null) {
            fd1.c.a(lVar.getAppId(), 13007, -2);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", 13007);
        rVar.D(com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(rVar, 13007, "fail: start HCEService failed", hashMap));
    }
}
