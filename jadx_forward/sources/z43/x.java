package z43;

/* loaded from: classes.dex */
public class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject.optString("appID");
        java.lang.String optString2 = jSONObject.optString("schemeUrl");
        java.lang.String optString3 = jSONObject.optString("parameter");
        java.lang.String optString4 = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        java.lang.String optString5 = jSONObject.optString("signature");
        int optInt = jSONObject.optInt("alertType");
        java.lang.String optString6 = jSONObject.optString("extInfo");
        java.lang.String optString7 = jSONObject.optString("sourceInfo");
        java.lang.String optString8 = jSONObject.optString("bizInfo");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(jSONObject.optBoolean("checkLaunchApp", true));
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(jSONObject.optBoolean("disableOpenId", false));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiLaunchApplication", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s, pkg:%s, signature:%s disableOpenId:%b", optString, optString2, optString6, optString3, optString4, optString5, valueOf2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiLaunchApplication", "appid and scheme is null or nil");
            this.f224976f.a("fail");
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
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.k14();
        lVar.f152198b = new r45.l14();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/checklaunchapp";
        lVar.f152200d = 1125;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.k14 k14Var = (r45.k14) a17.f152243a.f152217a;
        k14Var.f459825d = optString9;
        k14Var.f459826e = optString;
        k14Var.f459827f = 0;
        k14Var.f459828g = optString10;
        k14Var.f459829h = optString2;
        k14Var.f459830i = optInt;
        k14Var.f459831m = 0;
        k14Var.f459834p = optString4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiLaunchApplication", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s)", optString9, optString, 0, k14Var.f459828g, k14Var.f459829h, java.lang.Integer.valueOf(k14Var.f459830i));
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new z43.w(this, valueOf, optString2, bundle, optString4, optString5, optString3, optString6, optString, valueOf2), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
