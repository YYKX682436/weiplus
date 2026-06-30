package wd1;

/* loaded from: classes7.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f77351x366c91de = 1460;

    /* renamed from: NAME */
    private static final java.lang.String f77352x24728b = "operateSnapshotWebView";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiOperateSnapshotWebView", "operateSnapshotWebView data: " + jSONObject);
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiOperateSnapshotWebView", "operateSnapshotWebView fail, env is null");
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiOperateSnapshotWebView", "operateSnapshotWebView fail, data is null");
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str2, jSONObject2));
            return;
        }
        wd1.a aVar = (wd1.a) yVar.t3().K1(wd1.a.class);
        java.lang.String optString = jSONObject.optString("type");
        if (optString != null) {
            switch (optString.hashCode()) {
                case -1783761045:
                    if (optString.equals("takeSnapshot")) {
                        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("rect");
                        int optInt = optJSONObject != null ? optJSONObject.optInt("x") : 0;
                        int optInt2 = optJSONObject != null ? optJSONObject.optInt("y") : 0;
                        int optInt3 = optJSONObject != null ? optJSONObject.optInt("width") : 0;
                        int optInt4 = optJSONObject != null ? optJSONObject.optInt("height") : 0;
                        long optLong = jSONObject.optLong("snapshotAfterScroll", 200L);
                        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("scrollTo");
                        int optInt5 = optJSONObject2 != null ? optJSONObject2.optInt("x") : 0;
                        int optInt6 = optJSONObject2 != null ? optJSONObject2.optInt("y") : 0;
                        p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f = yVar.mo50358x95c7fa5f();
                        p3325xe03a0797.p3326xc267989b.y0 a17 = mo50358x95c7fa5f != null ? p012xc85e97e9.p093xedfae76a.z.a(mo50358x95c7fa5f) : p3325xe03a0797.p3326xc267989b.z0.b();
                        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                        p3325xe03a0797.p3326xc267989b.l.d(a17, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new wd1.b(aVar, optInt5, optInt6, optInt, optInt2, optInt3, optInt4, optLong, yVar, i17, this, null), 2, null);
                        return;
                    }
                    return;
                case -449313604:
                    if (optString.equals("execScript")) {
                        java.lang.String optString2 = jSONObject.optString("script", "");
                        if (aVar != null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                            ym5.a1.f(new wd1.e(optString2, (wd1.k) aVar));
                        }
                        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                        str2 = str != null ? str : "";
                        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        try {
                            jSONObject3.put("errno", 0);
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                        }
                        yVar.a(i17, u(str2, jSONObject3));
                        return;
                    }
                    return;
                case 3417674:
                    if (optString.equals("open")) {
                        if (yVar.getF229340d() == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiOperateSnapshotWebView", "operateSnapshotWebView open fail, context is null");
                            str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                            str2 = str3 != null ? str3 : "";
                            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                            try {
                                jSONObject4.put("errno", 4);
                            } catch (java.lang.Exception e19) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                            }
                            yVar.a(i17, u(str2, jSONObject4));
                            return;
                        }
                        java.lang.String optString3 = jSONObject.optString("html", "");
                        if (aVar != null) {
                            android.content.Context f229340d = yVar.getF229340d();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f229340d, "getContext(...)");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                            ym5.a1.f(new wd1.i(f229340d, (wd1.k) aVar, optString3));
                        }
                        java.lang.String optString4 = jSONObject.optString("script", "");
                        if (aVar != null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
                            ym5.a1.f(new wd1.e(optString4, (wd1.k) aVar));
                        }
                        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                        str2 = str != null ? str : "";
                        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                        try {
                            jSONObject5.put("errno", 0);
                        } catch (java.lang.Exception e27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                        }
                        yVar.a(i17, u(str2, jSONObject5));
                        return;
                    }
                    return;
                case 94756344:
                    if (optString.equals("close")) {
                        if (aVar != null) {
                            ym5.a1.f(new wd1.d((wd1.k) aVar));
                        }
                        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                        str2 = str != null ? str : "";
                        java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                        try {
                            jSONObject6.put("errno", 0);
                        } catch (java.lang.Exception e28) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
                        }
                        yVar.a(i17, u(str2, jSONObject6));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
