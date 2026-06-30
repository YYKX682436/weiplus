package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e;

/* loaded from: classes7.dex */
public final class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34539x366c91de = 640;

    /* renamed from: NAME */
    public static final java.lang.String f34540x24728b = "requestSubscribeMessage";

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.n(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestSubscribeMessage", "JsApiRequestSubscribeMessage invoked");
        if (jSONObject == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("tmplIds");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray.length() == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("errCode", 10001);
            java.lang.String p17 = p("fail:TmplIds can't be empty", linkedHashMap);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestSubscribeMessage", "[callbackJsApi] return json:" + p17);
            yVar.a(i17, p17);
            return;
        }
        try {
            int length = jSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.Object obj = jSONArray.get(i18);
                if (!(obj instanceof java.lang.String)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
                    java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                    linkedHashMap2.put("errCode", java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261));
                    java.lang.String p18 = p("fail:Invalid template id", linkedHashMap2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestSubscribeMessage", "[callbackJsApi] return json:" + p18);
                    yVar.a(i17, p18);
                    return;
                }
                arrayList.add(obj);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
            java.lang.String username = yVar.t3().u0().f128811x;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
            java.lang.String appId = yVar.t3().u0().f158811d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12185x86bd78c5(username, appId, yVar.t3().u0().f128817z, arrayList, 0, this, yVar, i17).b();
        } catch (org.json.JSONException unused) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
            yVar.a(i17, o("fail:invalid data"));
        }
    }
}
