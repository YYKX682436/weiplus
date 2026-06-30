package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes11.dex */
public final class j implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.biz.k f79970f;

    public j(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.biz.k kVar) {
        this.f79968d = lVar;
        this.f79969e = i17;
        this.f79970f = kVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        android.content.Intent intent;
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiResponse jsApiChooseBizPoi$BizPoiResponse = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiResponse) obj;
        com.tencent.mm.plugin.appbrand.jsapi.biz.k kVar = this.f79970f;
        int i17 = this.f79969e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79968d;
        if (jsApiChooseBizPoi$BizPoiResponse == null) {
            kVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 107);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, kVar.u(str2, jSONObject));
            return;
        }
        int i18 = jsApiChooseBizPoi$BizPoiResponse.f79909d;
        if (i18 == 1) {
            com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiLaunchResponse jsApiChooseBizPoi$BizPoiLaunchResponse = jsApiChooseBizPoi$BizPoiResponse.f79910e;
            if (jsApiChooseBizPoi$BizPoiLaunchResponse == null || (intent = jsApiChooseBizPoi$BizPoiLaunchResponse.f79908d) == null) {
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                intent.removeFlags(268435456);
            } else {
                intent.setFlags(intent.getFlags() & (-268435457));
            }
            intent.setExtrasClassLoader(com.tencent.mm.plugin.appbrand.jsapi.biz.k.class.getClassLoader());
            android.content.Context context = lVar.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$invoke$1", "onCallback", "(Lcom/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiResponse;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$invoke$1", "onCallback", "(Lcom/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiResponse;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (i18 != 2) {
            kVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, kVar.u(str2, jSONObject2));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskResponse jsApiChooseBizPoi$BizPoiTaskResponse = jsApiChooseBizPoi$BizPoiResponse.f79911f;
        if (jsApiChooseBizPoi$BizPoiTaskResponse != null ? kotlin.jvm.internal.o.b(jsApiChooseBizPoi$BizPoiTaskResponse.f79915d, java.lang.Boolean.TRUE) : false) {
            kVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 1);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            lVar.a(i17, kVar.u(str2, jSONObject3));
            return;
        }
        if (jsApiChooseBizPoi$BizPoiTaskResponse != null ? kotlin.jvm.internal.o.b(jsApiChooseBizPoi$BizPoiTaskResponse.f79916e, java.lang.Boolean.TRUE) : false) {
            kVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 0);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            lVar.a(i17, kVar.u(str2, jSONObject4));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (jsApiChooseBizPoi$BizPoiTaskResponse != null) {
            java.lang.String str7 = jsApiChooseBizPoi$BizPoiTaskResponse.f79917f;
            if (str7 == null) {
                str7 = "";
            }
            hashMap.put("poiid", str7);
            java.lang.String str8 = jsApiChooseBizPoi$BizPoiTaskResponse.f79918g;
            if (str8 == null) {
                str8 = "";
            }
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str8);
            java.lang.String str9 = jsApiChooseBizPoi$BizPoiTaskResponse.f79919h;
            if (str9 == null) {
                str9 = "";
            }
            hashMap.put("address", str9);
            java.lang.Double d17 = jsApiChooseBizPoi$BizPoiTaskResponse.f79921m;
            hashMap.put("longitude", java.lang.Double.valueOf(d17 != null ? d17.doubleValue() : 0.0d));
            java.lang.Double d18 = jsApiChooseBizPoi$BizPoiTaskResponse.f79920i;
            hashMap.put("latitude", java.lang.Double.valueOf(d18 != null ? d18.doubleValue() : 0.0d));
            java.lang.String str10 = jsApiChooseBizPoi$BizPoiTaskResponse.f79922n;
            if (str10 == null) {
                str10 = "";
            }
            hashMap.put("districtid", str10);
            java.lang.String str11 = jsApiChooseBizPoi$BizPoiTaskResponse.f79923o;
            hashMap.put("content", str11 != null ? str11 : "");
        }
        kVar.getClass();
        java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        lVar.a(i17, kVar.t("ok", hashMap));
    }
}
