package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public abstract class q7 {
    public static void a(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, android.content.Intent intent, java.lang.String str) {
        sd1.a aVar = (sd1.a) nd.f.a(sd1.a.class);
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ReferrerHelper", "mayPutReferrer, referrerHelper is null");
            return;
        }
        sd1.c c17 = ((com.tencent.mm.plugin.appbrand.utils.p5) aVar).c(jSONObject, lVar);
        if (c17 == null) {
            c17 = com.tencent.mm.plugin.appbrand.utils.p5.f90530e;
        }
        if (sd1.c.f406677e == c17) {
            return;
        }
        intent.putExtra("IsFromWebViewReffer", str);
    }
}
