package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes8.dex */
public class d7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        int parseInt;
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
            org.json.JSONObject jSONObject3 = jSONObject.getJSONObject("target");
            java.lang.String string = jSONObject3.getString("type");
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put(ya.b.f77502x92235c1b, jSONObject.getJSONObject(ya.b.f77502x92235c1b));
            jSONObject4.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject2);
            android.os.Bundle mo28566xf04ce124 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65361xd4eb96cf(this.f224975e.f380557a).mo28566xf04ce124();
            if (string.equals(ya.b.f77502x92235c1b)) {
                parseInt = mo28566xf04ce124.getInt("webviewId", -1);
            } else {
                if (!string.equals("webview") && !string.equals("gameWebview")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSendMessageToSource", "Invalid target type");
                    this.f224976f.a("json exception");
                    return;
                }
                java.lang.String optString = jSONObject3.optString(dm.i4.f66865x76d1ec5a);
                parseInt = !optString.isEmpty() ? java.lang.Integer.parseInt(optString) : -1;
            }
            if (parseInt == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendMessageToSource", "Invalid target id");
                this.f224976f.a("Invalid target id");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380 c19281x39681380 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380(parseInt, "onLiteAppMessage", jSONObject4);
            com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f m28830x447c3e7 = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.m28830x447c3e7(mo28566xf04ce124.getInt("openScene", -1));
            if (m28830x447c3e7 != com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.WEB_VIEW && !string.equals("webview")) {
                if (m28830x447c3e7 != com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.GAME && !string.equals("gameWebview")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendMessageToSource", "Invalid open scene");
                    this.f224976f.a("Invalid open scene");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380.f(c19281x39681380);
                this.f224976f.d(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380.g(c19281x39681380);
            this.f224976f.d(false);
        } catch (org.json.JSONException unused) {
            this.f224976f.a("json exception");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendMessageToSource", "json exception");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
