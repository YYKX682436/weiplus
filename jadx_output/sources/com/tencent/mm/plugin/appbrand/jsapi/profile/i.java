package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class i implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.profile.j f82802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82804c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f82805d;

    public i(com.tencent.mm.plugin.appbrand.jsapi.profile.j jVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f82802a = jVar;
        this.f82803b = lVar;
        this.f82804c = i17;
        this.f82805d = jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult jumpToProfileResult = (com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult) appBrandProxyUIProcessTask$ProcessResult;
        org.json.JSONObject jSONObject = this.f82805d;
        int i17 = this.f82804c;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82803b;
        com.tencent.mm.plugin.appbrand.jsapi.profile.j jVar = this.f82802a;
        if (jumpToProfileResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.OpenWeComUserProfile", "onReceiveResult#IProcessResultReceiver, result is null");
            jVar.getClass();
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, jVar.u(str2, jSONObject2));
            jVar.D(lVar, jSONObject, mq0.z.f330649w, "result is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenWeComUserProfile", "onReceiveResult#IProcessResultReceiver, result: " + jumpToProfileResult);
        int ordinal = jumpToProfileResult.f82761d.ordinal();
        if (ordinal == 0) {
            jVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, jVar.u(str, jSONObject3));
            jVar.D(lVar, jSONObject, mq0.z.f330648v, "");
            return;
        }
        if (ordinal == 1) {
            jVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 1);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            lVar.a(i17, jVar.u(str2, jSONObject4));
            jVar.D(lVar, jSONObject, mq0.z.f330649w, "cancel");
            return;
        }
        if (ordinal == 2) {
            jVar.getClass();
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            try {
                jSONObject5.put("errno", 4);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            lVar.a(i17, jVar.u(str2, jSONObject5));
            jVar.D(lVar, jSONObject, mq0.z.f330649w, com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_INTERNAL_ERROR);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail:");
        java.lang.String str8 = jumpToProfileResult.f82762e;
        sb6.append(str8);
        java.lang.String sb7 = sb6.toString();
        jVar.getClass();
        str = android.text.TextUtils.isEmpty(sb7) ? null : sb7;
        str2 = str != null ? str : "";
        java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
        try {
            jSONObject6.put("errno", 8);
        } catch (java.lang.Exception e28) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
        }
        lVar.a(i17, jVar.u(str2, jSONObject6));
        jVar.D(lVar, jSONObject, mq0.z.f330649w, "fail:" + str8);
    }
}
