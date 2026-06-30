package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class w0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.w0 f268126d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.w0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("itemList");
        boolean z17 = str == null || str.length() == 0;
        nw4.g gVar = env.f422396d;
        if (z17) {
            gVar.e(msg.f422546c, "downloadPageDataForFastLoad:fail invalid itemList", null);
            return true;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray(str);
        int length = jSONArray.length();
        boolean z18 = false;
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            if (optJSONObject == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad invalid item index: " + i17);
            } else {
                java.lang.String optString = optJSONObject.optString("url");
                int optInt = optJSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1);
                int optInt2 = optJSONObject.optInt("item_show_type", -1);
                java.lang.String optString2 = optJSONObject.optString("brand_user_name");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad itemShowType: " + optInt2 + ", openScene: " + optInt + ", url: %s", optString);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(optInt)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    if (optString.length() > 0) {
                        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(optString, optInt2, optInt, optString2, new java.lang.Object[0]);
                        z18 = true;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad can not preload openScene: %d", java.lang.Integer.valueOf(optInt));
                }
            }
        }
        if (z18) {
            gVar.e(msg.f422546c, "downloadPageDataForFastLoad:ok", null);
        } else {
            gVar.e(msg.f422546c, "downloadPageDataForFastLoad:fail not valid url", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.n.f34091x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "downloadPageDataForFastLoad";
    }
}
