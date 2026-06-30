package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class ag extends com.tencent.mm.plugin.appbrand.jsapi.cg {
    public void a(org.json.JSONObject config) {
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.mm.plugin.appbrand.jsapi.bg bgVar = com.tencent.mm.plugin.appbrand.jsapi.cg.f80198a;
        bgVar.a(config, "platform", com.eclipsesource.mmv8.Platform.ANDROID);
        bgVar.a(config, "brand", android.os.Build.BRAND);
        bgVar.a(config, "model", wo.w0.m());
        try {
            config.put("nativeBufferEnabled", java.lang.Boolean.TRUE);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WASnapshotConfigProvider", e17, "put with key(nativeBufferEnabled)", new java.lang.Object[0]);
        }
    }
}
