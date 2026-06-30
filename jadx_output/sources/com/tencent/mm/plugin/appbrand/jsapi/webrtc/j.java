package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class j extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 1204;
    public static final java.lang.String NAME = "isOpenSR";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("mediaStreamTrackId", 0)) : null;
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.w wVar = com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0.f83805u;
        java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0.f83806v;
        kotlin.jvm.internal.o.d(valueOf);
        int intValue = ((java.lang.Number) kz5.c1.h(hashMap, valueOf)).intValue();
        if (intValue == -1) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("isOpen", java.lang.Boolean.FALSE);
            hashMap2.put("errCode", 1001);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 0);
            java.lang.String t17 = t("ok", hashMap2);
            kotlin.jvm.internal.o.f(t17, "makeReturnJson(...)");
            return t17;
        }
        if (intValue != 0) {
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("isOpen", java.lang.Boolean.TRUE);
            hashMap3.put("errCode", 1002);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap3.put("errno", 0);
            java.lang.String t18 = t("ok", hashMap3);
            kotlin.jvm.internal.o.f(t18, "makeReturnJson(...)");
            return t18;
        }
        java.util.HashMap hashMap4 = new java.util.HashMap();
        hashMap4.put("isOpen", java.lang.Boolean.FALSE);
        hashMap4.put("errCode", 1000);
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap4.put("errno", 0);
        java.lang.String t19 = t("ok", hashMap4);
        kotlin.jvm.internal.o.f(t19, "makeReturnJson(...)");
        return t19;
    }
}
