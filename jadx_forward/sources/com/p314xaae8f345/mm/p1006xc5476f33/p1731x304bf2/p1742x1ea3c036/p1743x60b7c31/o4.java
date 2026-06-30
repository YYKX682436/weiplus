package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class o4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "sendMessageToLiteApp";
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
        java.lang.Long l17;
        java.lang.Long l18;
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("target");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSendMessageToLiteApp", "target is null");
            bVar.c("target is null", null);
            return;
        }
        java.lang.String optString = optJSONObject.optString("type");
        long j17 = 0L;
        long j18 = 0L;
        if (optString.equals(ya.b.f77502x92235c1b)) {
            android.content.Context context = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).f488143d;
            if (!(context instanceof android.app.Activity)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSendMessageToLiteApp", "context is not Activity %s", context.getClass().getName());
                bVar.c("context is not Activity", null);
                return;
            } else {
                android.app.Activity activity = (android.app.Activity) context;
                l17 = java.lang.Long.valueOf(activity.getIntent().getLongExtra("liteAppUuid", 0L));
                l18 = java.lang.Long.valueOf(activity.getIntent().getLongExtra("liteAppPageId", 0L));
            }
        } else {
            if (!optString.equals("liteapp")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSendMessageToLiteApp", "Invalid target type");
                bVar.c("Invalid target type", null);
                return;
            }
            java.lang.String[] split = optJSONObject.optString(dm.i4.f66865x76d1ec5a).split("_");
            if (split.length == 2) {
                j17 = java.lang.Long.valueOf(java.lang.Long.parseLong(split[0]));
                j18 = java.lang.Long.valueOf(java.lang.Long.parseLong(split[1]));
            }
            l17 = j17;
            l18 = j18;
        }
        if (l17.longValue() == 0 || l18.longValue() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSendMessageToLiteApp", "appUuid or pageId error");
            bVar.c("appUuid or pageId error", null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("appUuid", l17.longValue());
        bundle.putLong("pageId", l18.longValue());
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("type", "gameWebview");
            sd.o0 o0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).f488188i;
            jSONObject3.put(dm.i4.f66865x76d1ec5a, java.lang.Integer.toString(o0Var != null ? o0Var.f488172r : 0));
            jSONObject2.put(ya.b.f77502x92235c1b, jSONObject3);
            jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
            bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject2.toString());
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.n4.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.m4(this, bVar));
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSendMessageToLiteApp", "json exception");
            bVar.c("json exception", null);
        }
    }
}
