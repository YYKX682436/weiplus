package uz;

@j95.b
/* loaded from: classes.dex */
public class e2 extends i95.w implements vz.p1 {
    public void wi(android.content.Context context, org.json.JSONObject jSONObject, vz.o1 o1Var) {
        android.content.Context context2 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String optString2 = jSONObject.optString("schemeUrl");
        java.lang.String optString3 = jSONObject.optString("parameter");
        java.lang.String optString4 = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        java.lang.String optString5 = jSONObject.optString("signature");
        java.lang.String optString6 = jSONObject.optString("extInfo");
        java.lang.String optString7 = jSONObject.optString("sourceInfo");
        java.lang.String optString8 = jSONObject.optString("bizInfo");
        int optInt = jSONObject.optInt("showType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiGameDownloadManager", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s, pkg:%s, signature:%s", optString, optString2, optString6, optString3, optString4, optString5);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiGameDownloadManager", "appid and scheme is null or nil");
            o1Var.d(809, "appid and scheme is null or nil");
            return;
        }
        java.lang.String optString9 = jSONObject.optString("preVerifyAppId");
        java.lang.String optString10 = jSONObject.optString("currentUrl");
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            bundle.putString("current_page_url", java.net.URLEncoder.encode(optString10, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        bundle.putString("current_page_appid", optString9);
        bundle.putString("current_page_biz_info", optString8);
        bundle.putString("current_page_source_info", optString7);
        p95.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r2(o1Var, optString2, context2, optInt, bundle, optString4, optString5, optString3, optString6, optString));
    }
}
