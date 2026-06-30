package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public final class n extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1301;
    public static final java.lang.String NAME = "collectWepalm";

    /* renamed from: g, reason: collision with root package name */
    public int f82635g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i18;
        java.lang.String str5;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var;
        java.lang.String str6;
        java.lang.String str7;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var2 = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        rk0.c.c("MicroMsg.JsApiCollectWepalm", "start collectWepalm", new java.lang.Object[0]);
        if (c0Var2 == null) {
            return;
        }
        android.app.Activity Z0 = c0Var2.Z0();
        if (Z0 == null || jSONObject == null) {
            rk0.c.b("MicroMsg.JsApiCollectWepalm", "mmActivity is null, invoke fail!", new java.lang.Object[0]);
            java.lang.String str8 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            java.lang.String str9 = str8 == null ? "" : str8;
            java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var2.a(i17, u(str9, jSONObject2));
            return;
        }
        this.f82635g = cf.b.a(this);
        java.lang.String optString = jSONObject.optString("sessionid");
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = jSONObject.optString("palmSideLimit");
        java.lang.String str11 = optString2 == null ? "" : optString2;
        java.lang.String optString3 = jSONObject.optString("needPalmInfo");
        java.lang.String str12 = optString3 == null ? "0" : optString3;
        java.lang.String optString4 = jSONObject.optString("needUploadPalmCgi");
        if (optString4 == null) {
            str2 = "";
            str = "1";
        } else {
            str = optString4;
            str2 = "";
        }
        java.lang.String optString5 = jSONObject.optString("palmCaptureMode");
        if (optString5 == null) {
            str3 = "MicroMsg.AppBrandJsApi";
            str4 = "makeReturnJson with JSONObject, put errno, e=%s";
            i18 = 0;
            rk0.c.c("MicroMsg.JsApiCollectWepalm", "PALM_CAPTURE_MODE is null! use defVal: 1", new java.lang.Object[0]);
            str5 = "1";
        } else {
            str3 = "MicroMsg.AppBrandJsApi";
            str4 = "makeReturnJson with JSONObject, put errno, e=%s";
            i18 = 0;
            str5 = optString5;
        }
        java.lang.String optString6 = jSONObject.optString("guidePopUpMode");
        if (optString6 == null) {
            str6 = "errno";
            c0Var = c0Var2;
            rk0.c.c("MicroMsg.JsApiCollectWepalm", "GUIDE_POP_UP_MODE is null! use defVal: 0", new java.lang.Object[i18]);
            str7 = "0";
        } else {
            c0Var = c0Var2;
            str6 = "errno";
            str7 = optString6;
        }
        rk0.c.c("MicroMsg.JsApiCollectWepalm", "[param]，data: " + jSONObject + "， requestcode： " + this.f82635g + ", this: " + hashCode(), new java.lang.Object[0]);
        if (!(optString.length() == 0)) {
            if (!(str11.length() == 0)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("requese_code", this.f82635g);
                intent.putExtra("sessionid", optString);
                intent.putExtra("palmSideLimit", str11);
                intent.putExtra("needPalmInfo", str12);
                intent.putExtra("needUploadPalmCgi", str);
                intent.putExtra("palmCaptureMode", str5);
                intent.putExtra("guidePopUpMode", str7);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                nf.g a17 = nf.g.a(Z0);
                if (a17 != null) {
                    a17.f(new com.tencent.mm.plugin.appbrand.jsapi.pay.m(this, c0Var, currentTimeMillis, optString, i17));
                }
                j45.l.n(Z0, "palm", ".ui.PalmPrintFrontUI", intent, this.f82635g);
                return;
            }
        }
        rk0.c.b("MicroMsg.JsApiCollectWepalm", "sessionId.is empty || palmSideLimit is empty", new java.lang.Object[0]);
        java.lang.String str13 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        java.lang.String str14 = str13 == null ? str2 : str13;
        java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put(str6, 101);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e(str3, str4, e18);
        }
        c0Var.a(i17, u(str14, jSONObject3));
    }
}
