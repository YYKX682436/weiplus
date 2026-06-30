package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class w3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f264026e;

    /* renamed from: f, reason: collision with root package name */
    public static int f264027f;

    @Override // sd.c
    public java.lang.String b() {
        return "sendAppMessage";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(final android.content.Context context, java.lang.String str, final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        final org.json.JSONObject jSONObject;
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (java.lang.Exception unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            q5Var.a("data is null", null);
            return;
        }
        int optInt = jSONObject.optInt("sendAppMessageScene", 0);
        if (optInt == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSendAppMessage", "favoriteUrl");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z();
            zVar.f264743a = jSONObject.optString("shareUrl");
            zVar.f264746d = jSONObject.optString("img_url");
            zVar.f264744b = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            zVar.f264745c = jSONObject.optString("desc");
            zVar.f264747e = jSONObject.optString("appid");
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            if (context != null && (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
                c4Var.f87856i = (android.app.Activity) context;
                c4Var.f87860m = 36;
            }
            c4Var.f87863p = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.x3(this, q5Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a0.a(c5303xc75d2f73, zVar);
            c5303xc75d2f73.e();
            if (c5303xc75d2f73.f135624h.f87966a != 0) {
                q5Var.a("fail", null);
                return;
            }
            return;
        }
        if (optInt == 2) {
            uw4.u.b(context, jSONObject.optString("sourceUserName"), jSONObject.optString("shareUrl"), jSONObject, q5Var, null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.f9.a(jSONObject.optString("img_url"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("img_url", jSONObject.optString("img_url"));
        hashMap.put("desc", jSONObject.optString("desc"));
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
        hashMap.put("url", jSONObject.optString("shareUrl"));
        hashMap.put("srcUserName", jSONObject.optString("src_username"));
        hashMap.put("srcDisplayname", jSONObject.optString("src_displayname"));
        hashMap.put("appId", jSONObject.optString("appid"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSendAppMessage", "sendAppMessage shareToFriend params:" + hashMap);
        com.p314xaae8f345.mm.ui.da daVar = new com.p314xaae8f345.mm.ui.da() { // from class: com.tencent.mm.plugin.webview.luggage.jsapi.w3$$a
            @Override // com.p314xaae8f345.mm.ui.xc
            /* renamed from: mmOnActivityResult */
            public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var2 = q5Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.w3 w3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.w3.this;
                w3Var.getClass();
                if (i17 == 1) {
                    org.json.JSONObject jSONObject2 = jSONObject;
                    java.lang.String optString = jSONObject2.optString("appid");
                    if (i18 != -1) {
                        if (i18 == 0 || i18 == 1) {
                            q5Var2.a("cancel", null);
                            return;
                        } else {
                            q5Var2.a("fail", null);
                            return;
                        }
                    }
                    java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
                    if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
                        q5Var2.a(null, null);
                        return;
                    }
                    java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                    java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSendAppMessage", "toUser is null");
                        q5Var2.a("fail", null);
                        return;
                    }
                    java.lang.String optString2 = jSONObject2.optString("img_url");
                    boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2);
                    android.content.Context context2 = context;
                    if (K0) {
                        uw4.y.a(context2, optString, stringExtra, jSONObject2, stringExtra2);
                        return;
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context2, "", context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.y3(w3Var, optString2, q5Var2));
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(optString2, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.z3(w3Var, Q, context2, optString, stringExtra, jSONObject2, stringExtra2, q5Var2));
                }
            }
        };
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        if (jSONObject.has("link")) {
            hashMap.put("url", jSONObject.optString("link"));
        }
        se5.a aVar = new se5.a();
        aVar.l(n13.v.f415673a.e(hashMap));
        n13.r rVar = new n13.r();
        rVar.f415650a = true;
        rVar.f415651b = 1;
        rVar.f415652c = daVar;
        rVar.f415653d.f415672a = 3;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, aVar, rVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
