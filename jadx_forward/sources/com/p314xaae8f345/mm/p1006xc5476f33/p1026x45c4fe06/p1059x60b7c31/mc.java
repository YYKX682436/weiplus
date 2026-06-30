package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class mc extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34455x366c91de = 1536;

    /* renamed from: NAME */
    public static final java.lang.String f34456x24728b = "resolveExternalFileRefs";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        jc1.d dVar;
        jc1.d dVar2;
        java.lang.String str4;
        org.json.JSONArray optJSONArray;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.JsApiResolveExternalFileRefs", "env is null");
            return;
        }
        str = "";
        java.util.ArrayList<java.lang.String> arrayList = null;
        if (e9Var.mo50354x59eafec1() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.JsApiResolveExternalFileRefs", "fileSystem is null");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str, jSONObject2));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = e9Var.mo32091x9a3f0ba2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u07 = mo32091x9a3f0ba2 != null ? mo32091x9a3f0ba2.u0() : null;
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1 = u07 instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 ? (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) u07 : null;
        if (c3897xbc286aa1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.JsApiResolveExternalFileRefs", "initConfig is null");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str, jSONObject3));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = c3897xbc286aa1.D;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11812xa040dc98 != null ? c11812xa040dc98.f158868t : null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.JsApiResolveExternalFileRefs", "externalFileRefs is empty");
            str2 = android.text.TextUtils.isEmpty("fail:externalFileRefs empty") ? "fail:internal error" : "fail:externalFileRefs empty";
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var.a(i17, u(str2, jSONObject4));
            return;
        }
        try {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject(c3897xbc286aa1.D.f158868t);
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("fileRefKeys")) != null) {
                arrayList = new java.util.ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i18 = 0; i18 < length; i18++) {
                    java.lang.Object obj = optJSONArray.get(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    arrayList.add((java.lang.String) obj);
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.JsApiResolveExternalFileRefs", "fileRefKeys is empty");
                java.lang.String str8 = android.text.TextUtils.isEmpty("fail:fileRefKeys empty") ? "fail:jsapi invalid request data" : "fail:fileRefKeys empty";
                java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                try {
                    jSONObject6.put("errno", 101);
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                e9Var.a(i17, u(str8, jSONObject6));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiResolveExternalFileRefs", "resolveExternalFileRefs, fileRefKeys:" + arrayList + ", externalFileRefs:" + jSONObject5);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
            for (java.lang.String str10 : arrayList) {
                org.json.JSONObject optJSONObject = jSONObject5.optJSONObject(str10);
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                    java.lang.String optString2 = optJSONObject.optString("type");
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(optString);
                    java.lang.String extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(optString2);
                    if (extensionFromMimeType == null) {
                        extensionFromMimeType = str;
                    }
                    ik1.b0 b0Var = new ik1.b0();
                    str3 = str;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = e9Var.mo50354x59eafec1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50354x59eafec1);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256 = mo50354x59eafec1.mo49619x6aa75256(r6Var, extensionFromMimeType, false, b0Var);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49619x6aa75256, "createTempFileFrom(...)");
                    if (mo49619x6aa75256 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                        java.lang.Object value = b0Var.f373357a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
                        str4 = (java.lang.String) value;
                        dVar2 = jc1.f.f380445a;
                        linkedHashMap.put(str10, kz5.c1.j(new jz5.l(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str4), new jz5.l("errno", java.lang.Integer.valueOf(dVar2.f380436a)), new jz5.l("errMsg", dVar2.f380437b)));
                        str = str3;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.JsApiResolveExternalFileRefs", "createTempFile failed, fileOpResult:" + mo49619x6aa75256 + ", fileRefKey:" + str10 + ", fileRef:" + optJSONObject);
                        dVar = !r6Var.m() ? jc1.e.f380438a : !r6Var.h() ? jc1.e.f380443f : jc1.e.f380439b;
                    }
                } else {
                    str3 = str;
                    dVar = new jc1.d(1300022, "fail:fileRefKey not found");
                }
                dVar2 = dVar;
                str4 = str3;
                linkedHashMap.put(str10, kz5.c1.j(new jz5.l(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str4), new jz5.l("errno", java.lang.Integer.valueOf(dVar2.f380436a)), new jz5.l("errMsg", dVar2.f380437b)));
                str = str3;
            }
            java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            linkedHashMap.put("errno", 0);
            e9Var.a(i17, t("ok", linkedHashMap));
        } catch (java.lang.Exception e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.JsApiResolveExternalFileRefs", "externalFileRefs is invalid, " + e28.getMessage());
            str2 = android.text.TextUtils.isEmpty("fail:externalFileRefs invalid") ? "fail:internal error" : "fail:externalFileRefs invalid";
            java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            try {
                jSONObject7.put("errno", 4);
            } catch (java.lang.Exception e29) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
            }
            e9Var.a(i17, u(str2, jSONObject7));
        }
    }
}
