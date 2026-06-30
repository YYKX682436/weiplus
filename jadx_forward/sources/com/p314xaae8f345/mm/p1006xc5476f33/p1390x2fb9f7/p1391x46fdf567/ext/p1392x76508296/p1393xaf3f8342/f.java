package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.f f181328b;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f181329a;

    public f() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f181329a = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6001x5b1d72aa>(a0Var) { // from class: com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionUBACloudConfig$1
            {
                this.f39173x3fe91575 = -2095890790;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v1, types: [org.json.JSONArray] */
            /* JADX WARN: Type inference failed for: r14v0 */
            /* JADX WARN: Type inference failed for: r14v1, types: [int] */
            /* JADX WARN: Type inference failed for: r14v3 */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6001x5b1d72aa c6001x5b1d72aa) {
                java.util.ArrayList arrayList;
                org.json.JSONArray optJSONArray;
                int length;
                org.json.JSONArray jSONArray;
                int length2;
                org.json.JSONArray jSONArray2;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6001x5b1d72aa c6001x5b1d72aa2 = c6001x5b1d72aa;
                boolean z17 = false;
                if (c6001x5b1d72aa2 != null) {
                    am.wt wtVar = c6001x5b1d72aa2.f136295g;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionUBACloudConfig", "mSessionUBAListener: %b, %s", wtVar.f89856b, wtVar.f89855a);
                    if (!wtVar.f89856b.booleanValue()) {
                        r45.l16 l16Var = new r45.l16();
                        l16Var.f460609d = false;
                        java.lang.String str = wtVar.f89855a;
                        if (str != null && !str.isEmpty()) {
                            java.lang.String str2 = wtVar.f89855a;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.f.this.getClass();
                            try {
                                optJSONArray = new org.json.JSONObject(str2).optJSONArray("sessionUBAConfigs");
                            } catch (org.json.JSONException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionUBACloudConfig", e17, "HellSessionUBACloudConfig parse crash", new java.lang.Object[0]);
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
                                        m16Var.f461606d = optJSONObject.optString("pageName");
                                        ?? optJSONArray2 = optJSONObject.optJSONArray("businessParams");
                                        if (optJSONArray2 != 0 && (length2 = optJSONArray2.length()) > 0) {
                                            for (?? r142 = z17; r142 < length2; r142++) {
                                                org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(r142);
                                                if (optJSONObject2 == null) {
                                                    jSONArray2 = optJSONArray;
                                                } else {
                                                    r45.b45 b45Var = new r45.b45();
                                                    jSONArray2 = optJSONArray;
                                                    b45Var.f452052d = optJSONObject2.optString("className");
                                                    b45Var.f452053e = optJSONObject2.optString("dataPath");
                                                    b45Var.f452054f = optJSONObject2.optString("action");
                                                    m16Var.f461607e.add(b45Var);
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
                                    l16Var.f460610e.addAll(arrayList);
                                }
                            }
                            arrayList = null;
                            if (arrayList != null) {
                                l16Var.f460610e.addAll(arrayList);
                            }
                        }
                        try {
                            c52.c.d("mkv_k_hellsubascld", l16Var.mo14344x5f01b1f6());
                            z17 = false;
                        } catch (java.lang.Exception e18) {
                            z17 = false;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionUBACloudConfigDao", e18, "HellSessionUBACloudConfigDao writeBack", new java.lang.Object[0]);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionUBACloudConfig", "mSessionUBAListener callback: END");
                        return z17;
                    }
                    r45.l16 a17 = x52.g.a();
                    if (a17 == null) {
                        a17 = new r45.l16();
                    }
                    a17.f460609d = true;
                    try {
                        c52.c.d("mkv_k_hellsubascld", a17.mo14344x5f01b1f6());
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionUBACloudConfigDao", e19, "HellSessionUBACloudConfigDao writeBack", new java.lang.Object[0]);
                    }
                }
                return z17;
            }
        };
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.f a() {
        if (f181328b == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.f.class) {
                if (f181328b == null) {
                    f181328b = new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.f();
                }
            }
        }
        return f181328b;
    }
}
