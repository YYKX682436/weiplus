package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class w implements android.webkit.ValueCallback {
    public w(com.tencent.mm.plugin.appbrand.service.j jVar) {
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: eval WAService.js result %s", (java.lang.String) obj);
    }
}
