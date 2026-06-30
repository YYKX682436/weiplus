package dn4;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final dn4.b f323567a = new dn4.b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.Object jSONArray;
        ?? r112;
        if (obj != null) {
            boolean z17 = true;
            boolean z18 = obj instanceof java.util.List ? true : obj instanceof java.util.Set;
            dn4.b bVar = f323567a;
            jz5.f0 f0Var = jz5.f0.f384359a;
            if (z18) {
                try {
                    jSONArray = new org.json.JSONArray();
                    java.util.Iterator it = ((java.util.Collection) obj).iterator();
                    while (it.hasNext()) {
                        java.lang.Object a17 = bVar.a(it.next());
                        if (a17 != null) {
                            jSONArray.put(a17);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStoryReportUtils", "[anyToJsonObject] object : " + obj + ", throw Exception : " + e17.getMessage());
                    return f0Var;
                }
            } else if (obj instanceof java.util.Map) {
                try {
                    jSONArray = new org.json.JSONObject();
                    for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                        java.lang.Object key = entry.getKey();
                        java.lang.Object value = entry.getValue();
                        if ((key instanceof java.lang.String) && value != null) {
                            if (value instanceof java.lang.String) {
                                if ((((java.lang.CharSequence) value).length() == 0) == false) {
                                }
                            }
                            java.lang.Object a18 = bVar.a(value);
                            if (a18 != null) {
                                if (a18 instanceof java.lang.String) {
                                    java.lang.String str = (java.lang.String) a18;
                                    try {
                                        try {
                                            new org.json.JSONObject(str);
                                        } catch (org.json.JSONException unused) {
                                            r112 = false;
                                        }
                                    } catch (org.json.JSONException unused2) {
                                        new org.json.JSONArray(str);
                                    }
                                    r112 = true;
                                    if (r112 != false) {
                                        jSONArray.put((java.lang.String) key, new org.json.JSONObject((java.lang.String) a18));
                                    }
                                }
                                jSONArray.put((java.lang.String) key, a18);
                            }
                        }
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStoryReportUtils", "[anyToJsonObject] object : " + obj + ", throw Exception : " + e18.getMessage());
                    return f0Var;
                }
            } else {
                if (obj instanceof java.lang.String) {
                    java.lang.String str2 = (java.lang.String) obj;
                    try {
                        try {
                            new org.json.JSONObject(str2);
                        } catch (org.json.JSONException unused3) {
                            new org.json.JSONArray(str2);
                        }
                    } catch (org.json.JSONException unused4) {
                        z17 = false;
                    }
                    if (z17 || !r26.n0.B((java.lang.CharSequence) obj, ",", false)) {
                        return obj;
                    }
                    r26.i0.v(str2, ",", "|", false, 4, null);
                    return obj;
                }
                if (obj instanceof java.lang.Boolean) {
                    return java.lang.Integer.valueOf(((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
                }
                if (obj instanceof java.lang.Number) {
                    return obj;
                }
            }
            return jSONArray;
        }
        return null;
    }
}
