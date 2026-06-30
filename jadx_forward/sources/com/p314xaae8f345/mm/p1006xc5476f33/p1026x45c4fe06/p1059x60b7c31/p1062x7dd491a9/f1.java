package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* loaded from: classes.dex */
public class f1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f33722x366c91de = 665;

    /* renamed from: NAME */
    private static final java.lang.String f33723x24728b = "launchApplicationForNative";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchApplicationForNative", "data is null");
            e9Var.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String optString2 = jSONObject.optString("schemeUrl");
        java.lang.String optString3 = jSONObject.optString("parameter");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("alertType"), 0);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("operateDirectly"), 0);
        java.lang.String optString4 = jSONObject.optString("extInfo");
        java.lang.String optString5 = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        java.lang.String optString6 = jSONObject.optString("signature");
        java.lang.String optString7 = jSONObject.optString("sourceInfo");
        java.lang.String optString8 = jSONObject.optString("bizInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s, pkg:%s, signature:%s", optString, optString2, optString4, optString3, optString5, optString6);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchApplicationForNative", "appid and scheme is null or nil");
            e9Var.a(i17, o("fail:appid and scheme is null or nil"));
            return;
        }
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (V0 != null) {
            str = V0.X1();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchApplicationForNative", "getCurrentPageView is null");
            str = null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                bundle.putString("current_page_url", java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
        bundle.putString("current_page_appid", mo48798x74292566);
        bundle.putString("current_page_biz_info", optString8);
        bundle.putString("current_page_source_info", optString7);
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152197a = new r45.k14();
        lVar2.f152198b = new r45.l14();
        lVar2.f152199c = "/cgi-bin/mmbiz-bin/checklaunchapp";
        lVar2.f152200d = 1125;
        r45.k14 k14Var = (r45.k14) lVar2.a().f152243a.f152217a;
        k14Var.f459825d = mo48798x74292566;
        k14Var.f459826e = optString;
        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) e9Var.t3()).l2().f169323f;
        k14Var.f459827f = i18;
        k14Var.f459828g = str;
        k14Var.f459829h = optString2;
        k14Var.f459830i = P;
        k14Var.f459831m = 1;
        k14Var.f459832n = P2;
        k14Var.f459834p = optString5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s, operateDirectly : %s)", mo48798x74292566, optString, java.lang.Integer.valueOf(i18), k14Var.f459828g, k14Var.f459829h, java.lang.Integer.valueOf(k14Var.f459830i), java.lang.Integer.valueOf(k14Var.f459832n));
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar2.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.a1(this, e9Var, i17, optString2, bundle, optString5, optString6, optString3, optString, optString4));
    }
}
