package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class z1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "launch3rdApp";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        android.content.pm.Signature signature;
        java.lang.String g17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunch3RdApp", "invokeInMM");
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_data", null);
            return;
        }
        int optInt = e17.optInt("type");
        java.lang.String optString = e17.optString("appID");
        if (optInt == 0) {
            java.lang.String optString2 = e17.optString("extInfo");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunch3RdApp", "appid:[%s], extinfo:[%s]", optString, optString2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunch3RdApp", "appid is null or nil");
                q5Var.a("fail", null);
                return;
            }
            if (!((com.p314xaae8f345.mm.app.o7) dw4.a.f325831b).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunch3RdApp", "app is not installed, appid:[%s]", optString);
                q5Var.a("fail", null);
                return;
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699();
            c11272xd6622699.f33061xb2206a6f = optString2;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11272xd6622699);
            c11286x34a5504.f33127xc9f07109 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a;
            c11286x34a5504.f33125x9b39409a = optString2;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b c5670x1f7ac2b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b();
            am.ki kiVar = c5670x1f7ac2b.f135994g;
            kiVar.f88682a = c11286x34a5504;
            kiVar.f88683b = optString;
            kiVar.f88685d = context;
            kiVar.f88686e = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.x1(this, q5Var);
            c5670x1f7ac2b.e();
            return;
        }
        if (optInt != 1) {
            q5Var.a("invalid_type", null);
            return;
        }
        java.lang.String optString3 = e17.optString("signature");
        java.lang.String optString4 = e17.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        java.lang.String optString5 = e17.optString("param");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp, signature:[%s], packageName:[%s], param:[%s]", optString3, optString4, optString5);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp invalid_args");
            q5Var.a("invalid_args", null);
            return;
        }
        if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(context, optString4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp not_install");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                q5Var.a("not_install", null);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp isAffectedByPackageVisibility");
                f(context, optString4, e17, optString5, q5Var);
                return;
            }
        }
        android.content.pm.Signature[] a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(context, optString4, false);
        if (a17 != null && (signature = a17[0]) != null && (g17 = kk.k.g(signature.toByteArray())) != null && g17.equalsIgnoreCase(optString3)) {
            f(context, optString4, e17, optString5, q5Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp signature_mismatch");
            q5Var.a("signature_mismatch", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }

    public final void f(android.content.Context context, java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        android.content.Intent launchIntentForPackage;
        java.lang.String optString = jSONObject.optString("currentUrl");
        java.lang.String optString2 = jSONObject.optString("preVerifyAppId");
        try {
            launchIntentForPackage = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getLaunchIntentForPackage(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp getLaunchIntentForPackage, %s", e17.getMessage());
        }
        if (launchIntentForPackage == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp  intent == null, pkg:" + str);
            q5Var.a("fail", null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp  intent != null, pkg:" + str);
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.i(bundle, str2);
        launchIntentForPackage.putExtras(bundle);
        launchIntentForPackage.addFlags(268435456);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("current_page_url", optString);
        bundle2.putString("current_page_appid", optString2);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.y1 y1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.y1(this, str, q5Var);
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(context, launchIntentForPackage, null, y1Var, bundle2);
    }
}
