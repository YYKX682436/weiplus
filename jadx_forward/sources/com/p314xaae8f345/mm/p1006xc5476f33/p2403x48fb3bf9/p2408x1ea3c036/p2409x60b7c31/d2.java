package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class d2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "launchApplication";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplication", "invokeInMM");
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchApplication", "data is null");
            q5Var.a("fail", null);
            return;
        }
        java.lang.String optString = e17.optString("appID");
        java.lang.String optString2 = e17.optString("schemeUrl");
        java.lang.String optString3 = e17.optString("parameter");
        java.lang.String optString4 = e17.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        java.lang.String optString5 = e17.optString("signature");
        int optInt = e17.optInt("alertType");
        java.lang.String optString6 = e17.optString("extInfo");
        java.lang.String optString7 = e17.optString("sourceInfo");
        java.lang.String optString8 = e17.optString("bizInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplication", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s, pkg:%s, signature:%s", optString, optString2, optString6, optString3, optString4, optString5);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchApplication", "appid and scheme is null or nil");
            q5Var.a("fail", null);
            return;
        }
        java.lang.String optString9 = e17.optString("preVerifyAppId");
        java.lang.String optString10 = e17.optString("currentUrl");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplication", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s)", optString9, optString, 0, k14Var.f459828g, k14Var.f459829h, java.lang.Integer.valueOf(k14Var.f459830i));
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.c2(this, q5Var, optString2, context, bundle, optString4, optString5, optString3, optString6, optString), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
