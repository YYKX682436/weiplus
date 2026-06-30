package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class y8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f35022x366c91de = 1209;

    /* renamed from: NAME */
    private static final java.lang.String f35023x24728b = "openCTID";

    /* renamed from: g, reason: collision with root package name */
    public static final int f165472g = cf.b.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v8(null));

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        android.app.Activity r07;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        if (d0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = d0Var.t3();
            if (t37 == null || (r07 = t37.r0()) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, activity is null");
                str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                d0Var.a(i17, u(str, jSONObject2));
                return;
            }
            if (jSONObject == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, data is null");
                java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                str5 = str7 != null ? str7 : "";
                java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                d0Var.a(i17, u(str5, jSONObject3));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, data: " + jSONObject);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x8 x8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x8(this, jSONObject, d0Var, i17);
                java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                java.lang.String optString = z65.c.a() ? jSONObject.optString("miniProgramID") : null;
                if (optString == null) {
                    optString = d0Var.mo48798x74292566();
                }
                if (optString == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, miniProgramID is null");
                    str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str5 = str != null ? str : "";
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    try {
                        jSONObject4.put("errno", 4);
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    d0Var.a(i17, u(str5, jSONObject4));
                } else {
                    java.lang.String str10 = (java.lang.String) x8Var.mo146xb9724478("orgID");
                    if (str10 != null && (str2 = (java.lang.String) x8Var.mo146xb9724478("businessID")) != null && (str3 = (java.lang.String) x8Var.mo146xb9724478("bizSeq")) != null && (str4 = (java.lang.String) x8Var.mo146xb9724478("type")) != null) {
                        java.lang.String str11 = (java.lang.String) x8Var.mo146xb9724478("miniProgramPlatformID");
                        if (str11 != null) {
                            android.content.Intent intent = new android.content.Intent();
                            intent.setComponent(new android.content.ComponentName("cn.cyberIdentity.certification", "cn.wh.project.view.v.authorization.WAuthActivity"));
                            intent.setFlags(8388608);
                            intent.putExtra("orgID", str10);
                            intent.putExtra("appID", str2);
                            intent.putExtra("bizSeq", str3);
                            intent.putExtra("type", str4);
                            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                            jSONObject5.put("miniProgramID", optString);
                            jSONObject5.put("miniProgramPlatformID", str11);
                            java.lang.String optString2 = jSONObject.optString("authToken");
                            if (optString2 == null) {
                                optString2 = "";
                            }
                            jSONObject5.put("authToken", optString2);
                            java.lang.String optString3 = jSONObject.optString("signature");
                            if (optString3 == null) {
                                optString3 = "";
                            }
                            jSONObject5.put("signature", optString3);
                            java.lang.String optString4 = jSONObject.optString("mode");
                            if (optString4 == null) {
                                optString4 = "";
                            }
                            jSONObject5.put("mode", optString4);
                            java.lang.String optString5 = jSONObject.optString("expectData");
                            jSONObject5.put("expectData", optString5 == null ? "" : optString5);
                            intent.putExtra("extras", jSONObject5.toString());
                            intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(r07, intent, true, false)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, intent: " + intent.getExtras());
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w8 w8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w8(r07, d0Var, i17, this);
                                nf.g.a(r07).f418117c.add(w8Var);
                                try {
                                    int i18 = f165472g;
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                    arrayList.add(java.lang.Integer.valueOf(i18));
                                    arrayList.add(intent);
                                    java.util.Collections.reverse(arrayList);
                                    yj0.a.k(r07, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/JsApiOpenCTID", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentWithExtra;Lorg/json/JSONObject;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                                    return;
                                } catch (java.lang.Exception e27) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiOpenCTID", e27, "invoke, startActivityForResult fail", new java.lang.Object[0]);
                                    nf.g.a(r07).f418117c.remove(w8Var);
                                    d0Var.a(i17, C());
                                    return;
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, intent not available");
                            d0Var.a(i17, C());
                        }
                    }
                }
            }
        }
    }

    public final java.lang.String C() {
        java.util.Map k17 = kz5.c1.k(new jz5.l("resultCode", "C0412002"), new jz5.l("resultDesc", "国家网络身份认证App尚未安装"));
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!(k17 instanceof java.util.HashMap)) {
            k17 = new java.util.HashMap(k17);
        }
        k17.put("errno", 0);
        return t("ok", k17);
    }
}
