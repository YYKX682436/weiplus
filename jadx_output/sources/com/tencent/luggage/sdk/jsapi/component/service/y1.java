package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class y1 extends com.tencent.mm.plugin.appbrand.jsapi.ag {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.ag
    public void a(org.json.JSONObject config) {
        kotlin.jvm.internal.o.g(config, "config");
        super.a(config);
        try {
            config.put("isIsolateContext", java.lang.Boolean.TRUE);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WASnapshotConfigProvider", e17, "put with key(isIsolateContext)", new java.lang.Object[0]);
        }
    }
}
