package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class m6 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.n6 f81600f;

    public m6(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.n6 n6Var) {
        this.f81598d = e9Var;
        this.f81599e = i17;
        this.f81600f = n6Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$NewTipInfo jsApiGetWeAppNewTipsInfo$NewTipInfo = (com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$NewTipInfo) obj;
        com.tencent.mm.plugin.appbrand.jsapi.n6 n6Var = this.f81600f;
        int i17 = this.f81599e;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81598d;
        if (jsApiGetWeAppNewTipsInfo$NewTipInfo == null) {
            n6Var.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 107);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, n6Var.u(str, jSONObject));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int i18 = jsApiGetWeAppNewTipsInfo$NewTipInfo.f78523d;
        hashMap.put("showType", java.lang.Integer.valueOf(i18));
        java.lang.String str3 = jsApiGetWeAppNewTipsInfo$NewTipInfo.f78524e;
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str3);
        hashMap.put("iconUrl", jsApiGetWeAppNewTipsInfo$NewTipInfo.f78525f);
        int i19 = jsApiGetWeAppNewTipsInfo$NewTipInfo.f78526g;
        hashMap.put("tipsId", java.lang.Integer.valueOf(i19));
        java.lang.String str4 = jsApiGetWeAppNewTipsInfo$NewTipInfo.f78527h;
        hashMap.put("uniqueId", str4);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWeAppNewTipsInfo", "showType:%d, title%s, tipsId:%d, uniqueId:%s", java.lang.Integer.valueOf(i18), str3, java.lang.Integer.valueOf(i19), str4);
        n6Var.getClass();
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        e9Var.a(i17, n6Var.t("ok", hashMap));
    }
}
