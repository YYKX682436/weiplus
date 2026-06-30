package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes.dex */
class c implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f163065d;

    private c() {
    }

    public final void a(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("appId");
        if (optString.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "appId is null");
            this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INVALID_REQUEST_DATA")));
        } else if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "ensureLiteAppStoreAlive, already alive, appId: %s", optString);
            this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("OK")));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "ensureLiteAppStoreAlive, not alive, appId: %s", optString);
            this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INTERNAL_ERROR")));
        }
    }

    public final void b(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("appId");
        int optInt = jSONObject.optInt("aliveSeconds", 300);
        if (optString.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "appId is null");
            this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INVALID_REQUEST_DATA")));
        } else if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "ensureLiteAppStoreAlive, already alive, appId: %s", optString);
            this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("OK")));
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(optString, optInt, true, 10L, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.b(this, optString));
        }
    }

    public final void c(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("appId");
        if (optString.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "appId is null");
            this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INVALID_REQUEST_DATA")));
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Zj(optString);
            this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("OK")));
        }
    }

    public final void d(org.json.JSONObject jSONObject) {
        try {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("config");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("option");
            if (optJSONArray != null && optJSONObject != null) {
                java.lang.String string = optJSONObject.getString("type");
                if (!string.equals("other")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "subscribeLiteAppStore fail, %s unsupport", string);
                    this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INVALID_REQUEST_DATA")));
                    return;
                }
                java.lang.String string2 = optJSONObject.getString("appId");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    arrayList.add(optJSONArray.getString(i17));
                }
                int uk6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).uk(string2, arrayList);
                if (uk6 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "subscribeLiteAppStore failed, ret: %d", java.lang.Integer.valueOf(uk6));
                    this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INTERNAL_ERROR")));
                    return;
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.z.f163096b == null) {
                    synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.z.class) {
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.z.f163096b == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.z.f163096b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.z();
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.z.f163096b.a(string2, this.f163065d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "subscribeLiteAppStore success");
                this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("OK")));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "config or option is null");
            this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INVALID_REQUEST_DATA")));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "JSONException occurred. %s", e17.toString());
            this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INVALID_REQUEST_DATA")));
        }
    }

    public final void e(org.json.JSONObject jSONObject) {
        try {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("config");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("option");
            if (optJSONArray != null && optJSONObject != null) {
                java.lang.String string = optJSONObject.getString("type");
                if (!string.equals("other")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "subscribeLiteAppStore fail, %s unsupport", string);
                    this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INVALID_REQUEST_DATA")));
                    return;
                }
                java.lang.String string2 = optJSONObject.getString("appId");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    arrayList.add(optJSONArray.getString(i17));
                }
                int vk6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).vk(string2, arrayList);
                if (vk6 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "unsubscribeLiteAppStore failed, ret: %d", java.lang.Integer.valueOf(vk6));
                    this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INTERNAL_ERROR")));
                    return;
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.z.f163096b == null) {
                    synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.z.class) {
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.z.f163096b == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.z.f163096b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.z();
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.z.f163096b.b(string2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "unsubscribeLiteAppStore success");
                this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("OK")));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "config or option is null");
            this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INVALID_REQUEST_DATA")));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "JSONException occurred. %s", e17.toString());
            this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INVALID_REQUEST_DATA")));
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        char c17;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        this.f163065d = rVar;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(c10756x2a5d7b2d.f149939d);
            java.lang.String optString = jSONObject.optString(ya.b.f77491x8758c4e1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "invoke CallLiteAppConnectEventImpl. method: %s", optString);
            switch (optString.hashCode()) {
                case -1715934283:
                    if (optString.equals("releaseLiteAppStore")) {
                        c17 = 4;
                        break;
                    }
                    c17 = 65535;
                    break;
                case -998807871:
                    if (optString.equals("ensureLiteAppStoreAlive")) {
                        c17 = 2;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 678170495:
                    if (optString.equals("unsubscribeLiteAppStore")) {
                        c17 = 1;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 1088850743:
                    if (optString.equals("checkLiteAppStoreAlive")) {
                        c17 = 3;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 1917506680:
                    if (optString.equals("subscribeLiteAppStore")) {
                        c17 = 0;
                        break;
                    }
                    c17 = 65535;
                    break;
                default:
                    c17 = 65535;
                    break;
            }
            if (c17 == 0) {
                d(jSONObject);
                return;
            }
            if (c17 == 1) {
                e(jSONObject);
                return;
            }
            if (c17 == 2) {
                b(jSONObject);
                return;
            }
            if (c17 == 3) {
                a(jSONObject);
            } else if (c17 == 4) {
                c(jSONObject);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "callLiteAppConnectEvent, method unset");
                this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INVALID_REQUEST_DATA")));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "json exception. error: %s", e17.toString());
            this.f163065d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.a.C("INVALID_REQUEST_DATA")));
        }
    }
}
