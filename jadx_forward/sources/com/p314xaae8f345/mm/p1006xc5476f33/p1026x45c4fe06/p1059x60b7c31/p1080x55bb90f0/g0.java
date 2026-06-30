package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

/* loaded from: classes7.dex */
public class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34033x366c91de = 1452;

    /* renamed from: NAME */
    private static final java.lang.String f34034x24728b = "notifyGroupMembers";

    /* renamed from: g, reason: collision with root package name */
    public final int f161927g = cf.b.a(this);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.g0 r17, android.content.Context r18, java.lang.String r19, java.lang.String r20, java.util.LinkedList r21, java.lang.String r22, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r23) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.g0.C(com.tencent.mm.plugin.appbrand.jsapi.chattool.g0, android.content.Context, java.lang.String, java.lang.String, java.util.LinkedList, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiNotifyGroupMembers", "notifyGroupMembers data: " + jSONObject);
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiNotifyGroupMembers", "notifyGroupMembers fail, env is null");
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiNotifyGroupMembers", "notifyGroupMembers fail, data is null");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str, jSONObject2));
            return;
        }
        android.content.Context mo50352x76847179 = e9Var.mo50352x76847179();
        if (mo50352x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiNotifyGroupMembers", "notifyGroupMembers fail, context is null");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str, jSONObject3));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.String optString = jSONObject.optString("content", "");
        h0Var.f391656d = optString;
        if (optString == null || optString.length() == 0) {
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var.a(i17, u(str, jSONObject4));
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("atUserList");
        if (optJSONArray != null) {
            java.util.Iterator it = e06.p.m(0, optJSONArray.length()).iterator();
            while (((e06.j) it).hasNext()) {
                linkedList.add(optJSONArray.optString(((kz5.x0) it).b(), ""));
            }
        }
        j91.d dVar = (j91.d) e9Var.t3().K1(j91.d.class);
        java.lang.String optString2 = jSONObject.optString("chatToolMode", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var2.f391656d = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var3.f391656d = "";
        if (dVar != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString2, "allPage") && !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar).o(jSONObject)) {
                java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                str = str6 != null ? str6 : "";
                java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                try {
                    jSONObject5.put("errno", 101);
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                e9Var.a(i17, u(str, jSONObject5));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar;
            h0Var2.f391656d = tVar.d();
            h0Var3.f391656d = tVar.c();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.d0(jSONObject.optString("userNameType", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463), linkedList, e9Var, h0Var, this, mo50352x76847179, h0Var2, h0Var3, i17, null), 3, null);
    }
}
