package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class k extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 1205;
    public static final java.lang.String NAME = "isSupportSR";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f83843g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f83844h = "";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f83845i = "";

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f83846m = "";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.w wVar = com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0.f83805u;
        f83843g = wVar.b();
        f83845i = wVar.a();
        if (wo.w0.q()) {
            f83844h = "5cbdf5691046122ffd776971f3f2c327";
        } else {
            f83844h = "10c74c8fd7af5879063796155fe5d264";
        }
        f83846m = "1c200d3e9055b847fc718206e9974ec5";
        if (!com.tencent.mm.vfs.w6.j(f83843g)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("isSupport", java.lang.Boolean.FALSE);
            hashMap.put("errCode", 1003);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            java.lang.String t17 = t("ok", hashMap);
            kotlin.jvm.internal.o.f(t17, "makeReturnJson(...)");
            return t17;
        }
        if (!com.tencent.mm.vfs.w6.p(f83843g).equals(f83844h)) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("isSupport", java.lang.Boolean.FALSE);
            hashMap2.put("errCode", 1004);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 0);
            java.lang.String t18 = t("ok", hashMap2);
            kotlin.jvm.internal.o.f(t18, "makeReturnJson(...)");
            return t18;
        }
        if (!com.tencent.mm.vfs.w6.j(f83845i)) {
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("isSupport", java.lang.Boolean.FALSE);
            hashMap3.put("errCode", 1005);
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap3.put("errno", 0);
            java.lang.String t19 = t("ok", hashMap3);
            kotlin.jvm.internal.o.f(t19, "makeReturnJson(...)");
            return t19;
        }
        if (com.tencent.mm.vfs.w6.p(f83845i).equals(f83846m)) {
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put("isSupport", java.lang.Boolean.TRUE);
            hashMap4.put("errCode", 1007);
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap4.put("errno", 0);
            java.lang.String t27 = t("ok", hashMap4);
            kotlin.jvm.internal.o.f(t27, "makeReturnJson(...)");
            return t27;
        }
        java.util.HashMap hashMap5 = new java.util.HashMap();
        hashMap5.put("isSupport", java.lang.Boolean.FALSE);
        hashMap5.put("errCode", 1006);
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap5.put("errno", 0);
        java.lang.String t28 = t("ok", hashMap5);
        kotlin.jvm.internal.o.f(t28, "makeReturnJson(...)");
        return t28;
    }
}
