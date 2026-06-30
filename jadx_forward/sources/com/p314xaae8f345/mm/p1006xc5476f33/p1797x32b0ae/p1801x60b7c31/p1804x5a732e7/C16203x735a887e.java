package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiRecognizeQRCode */
/* loaded from: classes8.dex */
public class C16203x735a887e extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f225019g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f225020h;

    public C16203x735a887e() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f225019g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiRecognizeQRCode.2
            {
                this.f39173x3fe91575 = 812146647;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
                am.cq cqVar = c5886xd11a0be7.f136194g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiRecognizeQRCode", "recognize qr code success, count: %d", java.lang.Integer.valueOf(cqVar.f87902b.size()));
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (int i17 = 0; i17 < cqVar.f87902b.size(); i17++) {
                    try {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("codeType", cqVar.f87903c.get(i17));
                        jSONObject2.put("codeVersion", cqVar.f87905e.get(i17));
                        jSONObject2.put("x", cqVar.f87909i.get(i17));
                        jSONObject2.put("y", cqVar.f87910j.get(i17));
                        jSONObject2.put("codeString", cqVar.f87902b.get(i17));
                        jSONArray.put(jSONObject2);
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiRecognizeQRCode", e17.toString());
                    }
                }
                jSONObject.put("count", cqVar.f87902b.size());
                jSONObject.put("items", jSONArray);
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16203x735a887e c16203x735a887e = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16203x735a887e.this;
                c16203x735a887e.f224976f.c(jSONObject, false);
                c16203x735a887e.f225019g.mo48814x2efc64();
                c16203x735a887e.f225020h.mo48814x2efc64();
                return false;
            }
        };
        this.f225020h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiRecognizeQRCode.3
            {
                this.f39173x3fe91575 = 1700407223;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c7) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiRecognizeQRCode", "recognize qr code failed. path: %s", c5885x60bd3c7.f136193g.f87811a);
                try {
                    jSONObject.put("count", 0);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiRecognizeQRCode", e17.toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16203x735a887e c16203x735a887e = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16203x735a887e.this;
                c16203x735a887e.f224976f.c(jSONObject, false);
                c16203x735a887e.f225019g.mo48814x2efc64();
                c16203x735a887e.f225020h.mo48814x2efc64();
                return false;
            }
        };
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiRecognizeQRCode", "Invoke recognizeQRCode");
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString)) {
            optString = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f224975e.f380557a, optString);
        } else if (optString.startsWith("http")) {
            java.lang.Object c17 = c();
            if (!(c17 instanceof mx5.b)) {
                this.f224975e.b("not found flutter activity");
                return;
            }
            mx5.b bVar = (mx5.b) c17;
            int f127500f = bVar.getF127500f();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", optString);
            hashMap.put("pageName", bVar.mo28569xa3f2e0d6());
            hashMap.put("activityId", java.lang.String.valueOf(this.f224975e.f380557a));
            kx5.n.h().k(f127500f, "getImageLocalInfo", hashMap, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o5(this));
            return;
        }
        if (optString == null || optString.isEmpty()) {
            this.f224976f.a("path is empty");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184();
        this.f225019g.mo48813x58998cd();
        this.f225020h.mo48813x58998cd();
        long nanoTime = java.lang.System.nanoTime();
        am.aq aqVar = c5884x4c2d9184.f136192g;
        aqVar.f87707a = nanoTime;
        aqVar.f87708b = optString;
        c5884x4c2d9184.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
