package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes.dex */
class c implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f81532d;

    private c() {
    }

    public final void a(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("appId");
        if (optString.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "appId is null");
            this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INVALID_REQUEST_DATA")));
        } else if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "ensureLiteAppStoreAlive, already alive, appId: %s", optString);
            this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("OK")));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "ensureLiteAppStoreAlive, not alive, appId: %s", optString);
            this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INTERNAL_ERROR")));
        }
    }

    public final void b(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("appId");
        int optInt = jSONObject.optInt("aliveSeconds", 300);
        if (optString.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "appId is null");
            this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INVALID_REQUEST_DATA")));
        } else if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "ensureLiteAppStoreAlive, already alive, appId: %s", optString);
            this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("OK")));
        } else {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(optString, optInt, true, 10L, new com.tencent.mm.plugin.appbrand.jsapi.liteapp.b(this, optString));
        }
    }

    public final void c(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("appId");
        if (optString.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "appId is null");
            this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INVALID_REQUEST_DATA")));
        } else {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Zj(optString);
            this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("OK")));
        }
    }

    public final void d(org.json.JSONObject jSONObject) {
        try {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("config");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("option");
            if (optJSONArray != null && optJSONObject != null) {
                java.lang.String string = optJSONObject.getString("type");
                if (!string.equals("other")) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "subscribeLiteAppStore fail, %s unsupport", string);
                    this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INVALID_REQUEST_DATA")));
                    return;
                }
                java.lang.String string2 = optJSONObject.getString("appId");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    arrayList.add(optJSONArray.getString(i17));
                }
                int uk6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).uk(string2, arrayList);
                if (uk6 < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "subscribeLiteAppStore failed, ret: %d", java.lang.Integer.valueOf(uk6));
                    this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INTERNAL_ERROR")));
                    return;
                }
                if (com.tencent.mm.plugin.appbrand.jsapi.liteapp.z.f81563b == null) {
                    synchronized (com.tencent.mm.plugin.appbrand.jsapi.liteapp.z.class) {
                        if (com.tencent.mm.plugin.appbrand.jsapi.liteapp.z.f81563b == null) {
                            com.tencent.mm.plugin.appbrand.jsapi.liteapp.z.f81563b = new com.tencent.mm.plugin.appbrand.jsapi.liteapp.z();
                        }
                    }
                }
                com.tencent.mm.plugin.appbrand.jsapi.liteapp.z.f81563b.a(string2, this.f81532d);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "subscribeLiteAppStore success");
                this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("OK")));
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "config or option is null");
            this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INVALID_REQUEST_DATA")));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "JSONException occurred. %s", e17.toString());
            this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INVALID_REQUEST_DATA")));
        }
    }

    public final void e(org.json.JSONObject jSONObject) {
        try {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("config");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("option");
            if (optJSONArray != null && optJSONObject != null) {
                java.lang.String string = optJSONObject.getString("type");
                if (!string.equals("other")) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "subscribeLiteAppStore fail, %s unsupport", string);
                    this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INVALID_REQUEST_DATA")));
                    return;
                }
                java.lang.String string2 = optJSONObject.getString("appId");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    arrayList.add(optJSONArray.getString(i17));
                }
                int vk6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).vk(string2, arrayList);
                if (vk6 < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "unsubscribeLiteAppStore failed, ret: %d", java.lang.Integer.valueOf(vk6));
                    this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INTERNAL_ERROR")));
                    return;
                }
                if (com.tencent.mm.plugin.appbrand.jsapi.liteapp.z.f81563b == null) {
                    synchronized (com.tencent.mm.plugin.appbrand.jsapi.liteapp.z.class) {
                        if (com.tencent.mm.plugin.appbrand.jsapi.liteapp.z.f81563b == null) {
                            com.tencent.mm.plugin.appbrand.jsapi.liteapp.z.f81563b = new com.tencent.mm.plugin.appbrand.jsapi.liteapp.z();
                        }
                    }
                }
                com.tencent.mm.plugin.appbrand.jsapi.liteapp.z.f81563b.b(string2);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "unsubscribeLiteAppStore success");
                this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("OK")));
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "config or option is null");
            this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INVALID_REQUEST_DATA")));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "JSONException occurred. %s", e17.toString());
            this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INVALID_REQUEST_DATA")));
        }
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        char c17;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        this.f81532d = rVar;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(iPCString.f68406d);
            java.lang.String optString = jSONObject.optString(ya.b.METHOD);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "invoke CallLiteAppConnectEventImpl. method: %s", optString);
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
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "callLiteAppConnectEvent, method unset");
                this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INVALID_REQUEST_DATA")));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "json exception. error: %s", e17.toString());
            this.f81532d.a(new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.appbrand.jsapi.liteapp.a.C("INVALID_REQUEST_DATA")));
        }
    }
}
