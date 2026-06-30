package com.tencent.mm.plugin.expt.hellhound.ext.session.config;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.expt.hellhound.ext.session.config.f f99795b;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f99796a;

    public f() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f99796a = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SessionUBAConfigChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionUBACloudConfig$1
            {
                this.__eventId = -2095890790;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v1, types: [org.json.JSONArray] */
            /* JADX WARN: Type inference failed for: r14v0 */
            /* JADX WARN: Type inference failed for: r14v1, types: [int] */
            /* JADX WARN: Type inference failed for: r14v3 */
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SessionUBAConfigChangeEvent sessionUBAConfigChangeEvent) {
                java.util.ArrayList arrayList;
                org.json.JSONArray optJSONArray;
                int length;
                org.json.JSONArray jSONArray;
                int length2;
                org.json.JSONArray jSONArray2;
                com.tencent.mm.autogen.events.SessionUBAConfigChangeEvent sessionUBAConfigChangeEvent2 = sessionUBAConfigChangeEvent;
                boolean z17 = false;
                if (sessionUBAConfigChangeEvent2 != null) {
                    am.wt wtVar = sessionUBAConfigChangeEvent2.f54762g;
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionUBACloudConfig", "mSessionUBAListener: %b, %s", wtVar.f8323b, wtVar.f8322a);
                    if (!wtVar.f8323b.booleanValue()) {
                        r45.l16 l16Var = new r45.l16();
                        l16Var.f379076d = false;
                        java.lang.String str = wtVar.f8322a;
                        if (str != null && !str.isEmpty()) {
                            java.lang.String str2 = wtVar.f8322a;
                            com.tencent.mm.plugin.expt.hellhound.ext.session.config.f.this.getClass();
                            try {
                                optJSONArray = new org.json.JSONObject(str2).optJSONArray("sessionUBAConfigs");
                            } catch (org.json.JSONException e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionUBACloudConfig", e17, "HellSessionUBACloudConfig parse crash", new java.lang.Object[0]);
                            }
                            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                                arrayList = new java.util.ArrayList();
                                int i17 = 0;
                                while (i17 < length) {
                                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                                    if (optJSONObject == null) {
                                        jSONArray = optJSONArray;
                                    } else {
                                        r45.m16 m16Var = new r45.m16();
                                        m16Var.f380073d = optJSONObject.optString("pageName");
                                        ?? optJSONArray2 = optJSONObject.optJSONArray("businessParams");
                                        if (optJSONArray2 != 0 && (length2 = optJSONArray2.length()) > 0) {
                                            for (?? r142 = z17; r142 < length2; r142++) {
                                                org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(r142);
                                                if (optJSONObject2 == null) {
                                                    jSONArray2 = optJSONArray;
                                                } else {
                                                    r45.b45 b45Var = new r45.b45();
                                                    jSONArray2 = optJSONArray;
                                                    b45Var.f370519d = optJSONObject2.optString("className");
                                                    b45Var.f370520e = optJSONObject2.optString("dataPath");
                                                    b45Var.f370521f = optJSONObject2.optString("action");
                                                    m16Var.f380074e.add(b45Var);
                                                }
                                                optJSONArray = jSONArray2;
                                            }
                                        }
                                        jSONArray = optJSONArray;
                                        arrayList.add(m16Var);
                                    }
                                    i17++;
                                    optJSONArray = jSONArray;
                                    z17 = false;
                                }
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    l16Var.f379077e.addAll(arrayList);
                                }
                            }
                            arrayList = null;
                            if (arrayList != null) {
                                l16Var.f379077e.addAll(arrayList);
                            }
                        }
                        try {
                            c52.c.d("mkv_k_hellsubascld", l16Var.toByteArray());
                            z17 = false;
                        } catch (java.lang.Exception e18) {
                            z17 = false;
                            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionUBACloudConfigDao", e18, "HellSessionUBACloudConfigDao writeBack", new java.lang.Object[0]);
                        }
                        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionUBACloudConfig", "mSessionUBAListener callback: END");
                        return z17;
                    }
                    r45.l16 a17 = x52.g.a();
                    if (a17 == null) {
                        a17 = new r45.l16();
                    }
                    a17.f379076d = true;
                    try {
                        c52.c.d("mkv_k_hellsubascld", a17.toByteArray());
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionUBACloudConfigDao", e19, "HellSessionUBACloudConfigDao writeBack", new java.lang.Object[0]);
                    }
                }
                return z17;
            }
        };
    }

    public static com.tencent.mm.plugin.expt.hellhound.ext.session.config.f a() {
        if (f99795b == null) {
            synchronized (com.tencent.mm.plugin.expt.hellhound.ext.session.config.f.class) {
                if (f99795b == null) {
                    f99795b = new com.tencent.mm.plugin.expt.hellhound.ext.session.config.f();
                }
            }
        }
        return f99795b;
    }
}
