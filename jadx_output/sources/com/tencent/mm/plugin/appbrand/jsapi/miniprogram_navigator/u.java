package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class u implements com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f82271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f82273c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s f82274d;

    public u(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s sVar, com.tencent.mm.plugin.appbrand.y yVar, int i17, org.json.JSONObject jSONObject) {
        this.f82274d = sVar;
        this.f82271a = yVar;
        this.f82272b = i17;
        this.f82273c = jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g
    public void a(boolean z17, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        org.json.JSONObject jSONObject = this.f82273c;
        int i17 = this.f82272b;
        com.tencent.mm.plugin.appbrand.y yVar = this.f82271a;
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s sVar = this.f82274d;
        if (z17) {
            sVar.getClass();
            str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, sVar.u(str3, jSONObject2));
            sVar.H(jSONObject, ya.b.SUCCESS, "");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail");
        if (android.text.TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = " " + str;
        }
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        sVar.getClass();
        str3 = android.text.TextUtils.isEmpty(null) ? sb7 : null;
        java.lang.String str5 = str3 != null ? str3 : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        yVar.a(i17, sVar.u(str5, jSONObject3));
        sVar.H(jSONObject, "fail", sb7);
    }
}
