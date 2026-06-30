package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class n0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    @mk0.a
    /* loaded from: classes.dex */
    public static class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        private a() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((android.os.Bundle) obj).getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
                tw4.d.a(jSONObject.optString("eventName"), jSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("JsApiDispatchEvent", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // sd.c
    public java.lang.String b() {
        return "dispatchEvent";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        if (jSONObject == null || jSONObject.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("JsApiDispatchEvent", "dispatch liteapp  process data: empty");
            bVar.c("fail: dispatch liteapp  process data: empty", null);
            return;
        }
        if (jSONObject.has("liteAppInfo")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiDispatchEvent", "dispatch liteapp  process data:%s", jSONObject.toString());
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.toString());
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, getClass(), null);
            bVar.a();
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R0(context, str)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || jSONObject.optLong("liteCallbackId", 0L) == 0) {
                tw4.d.a(jSONObject.optString("eventName"), jSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
                bVar.a();
            } else {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.toString());
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle2, com.tencent.mm.plugin.webview.luggage.jsapi.n0.a.class, null);
                bVar.a();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("liteAppInfo");
            java.lang.String optString = jSONObject.optString("eventName");
            if (optJSONObject != null && ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65284x81288087(optJSONObject.optString("appId"), optString, (java.lang.Object) bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("JsApiDispatchEvent", e17, "", new java.lang.Object[0]);
        }
    }
}
