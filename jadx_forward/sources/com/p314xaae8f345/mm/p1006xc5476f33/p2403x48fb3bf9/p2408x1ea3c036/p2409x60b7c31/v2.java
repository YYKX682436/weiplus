package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class v2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openWeApp";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeApp", "invokeInMM");
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            q5Var.a("fail_invalid_data", null);
            return;
        }
        java.lang.String optString = e17.optString("currentUrl");
        java.lang.String optString2 = e17.optString("preVerifyAppId");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f89004f = context;
        nxVar.f88999a = e17.optString("userName");
        nxVar.f89006h = e17.optString("appId");
        nxVar.f89000b = e17.optString("relativeURL");
        nxVar.f89007i = e17.optInt("appVersion", 0);
        nxVar.f89002d = e17.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1018);
        nxVar.f89003e = e17.optString("sceneNote");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nxVar.f89003e)) {
            nxVar.f89003e = fp.s0.a(optString == null ? "" : optString);
        }
        nxVar.f89009k = e17.optString("downloadURL");
        nxVar.f89001c = e17.optInt("openType", 0);
        nxVar.f89010l = e17.optString("checkSumMd5");
        nxVar.f89012n = false;
        nxVar.f89013o.f151950f = e17.optString("extJsonInfo");
        nxVar.f89014p = e17.optString("liteGameInfo");
        nxVar.f89023y = optString2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            nxVar.f89023y = e17.optString("sourceAppId");
        }
        nxVar.f89024z = optString;
        nxVar.A = e17.optString("privateExtraData");
        if (e17.has("devuin")) {
            nxVar.f89008j = kk.v.b(e17.optString("devuin"));
        }
        c6113xa3727625.e();
        am.ox oxVar = c6113xa3727625.f136391h;
        if (oxVar.f89114a) {
            q5Var.a(null, null);
        } else {
            java.lang.String str2 = oxVar.f89115b;
            q5Var.a(str2 != null ? str2 : "", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
