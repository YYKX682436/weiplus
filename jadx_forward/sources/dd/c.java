package dd;

/* loaded from: classes9.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static org.json.JSONObject e(dd.c cVar, boolean z17, org.json.JSONObject jSONObject, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            jSONObject = null;
        }
        cVar.getClass();
        return z17 ? j(cVar, jSONObject, null, 2, null) : g(cVar, jSONObject, null, 2, null);
    }

    public static /* synthetic */ org.json.JSONObject g(dd.c cVar, org.json.JSONObject jSONObject, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            jSONObject = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        return cVar.f(jSONObject, str);
    }

    public static /* synthetic */ org.json.JSONObject j(dd.c cVar, org.json.JSONObject jSONObject, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            jSONObject = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        return cVar.i(jSONObject, str);
    }

    public final org.json.JSONObject a(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str);
                if (obj instanceof android.os.Bundle) {
                    jSONObject.put(str, a((android.os.Bundle) obj));
                } else {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DynamicModuleUtil", e17, "bundleToJson", new java.lang.Object[0]);
            return null;
        }
    }

    public final void b(org.json.JSONObject json, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e kvData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kvData, "kvData");
        java.util.Iterator<java.lang.String> keys = json.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object obj = json.get(next);
            if (obj instanceof java.lang.Integer) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                kvData.mo27557xc5c55e60(next, ((java.lang.Number) obj).intValue());
            } else if (obj instanceof java.lang.Boolean) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                kvData.mo27556xf2e34299(next, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.Long) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                kvData.mo27564xf2e7ce2b(next, ((java.lang.Number) obj).longValue());
            } else if (obj instanceof java.lang.String) {
                kvData.mo27566xe4673800(next, (java.lang.String) obj);
            }
        }
    }

    public final java.util.HashMap c(org.json.JSONObject jsonObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.String optString = jsonObject.optString(next);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            hashMap.put(next, optString);
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kz5.q0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    public final org.json.JSONObject d(int i17, java.util.Map map) {
        ?? r07;
        if (map != null) {
            r07 = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.Object value = entry.getValue();
                if ((value instanceof java.lang.String) || (value instanceof java.lang.Number) || (value instanceof java.lang.Boolean) || value == null) {
                    r07.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            r07 = kz5.q0.f395534d;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject((java.util.Map) r07);
        jSONObject.put("errCode", i17);
        java.lang.String str = (java.lang.String) dd.d.f310405b.get(java.lang.Integer.valueOf(i17));
        if (str == null) {
            str = "ok";
        }
        jSONObject.put("errMsg", str);
        return jSONObject;
    }

    public final org.json.JSONObject f(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        if (!jSONObject.has(ya.b.f77504xbb80cbe3)) {
            jSONObject.put(ya.b.f77504xbb80cbe3, false);
        }
        if (!jSONObject.has("msg") && str != null) {
            jSONObject.put("msg", str);
        }
        return jSONObject;
    }

    public final org.json.JSONObject h(android.content.Intent intent, int i17) {
        android.os.Bundle extras;
        java.util.Set<java.lang.String> keySet;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (intent != null && (extras = intent.getExtras()) != null && (keySet = extras.keySet()) != null) {
            for (java.lang.String str : keySet) {
                jSONObject2.put(str, extras.get(str));
            }
        }
        boolean z17 = true;
        boolean z18 = false;
        if (i17 == -1) {
            z18 = true;
            z17 = false;
        } else if (i17 != 0) {
            z17 = false;
        }
        jSONObject.put("cancel", z17);
        jSONObject.put("result", jSONObject2);
        return e(this, z18, jSONObject, null, 4, null);
    }

    public final org.json.JSONObject i(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        if (!jSONObject.has(ya.b.f77504xbb80cbe3)) {
            jSONObject.put(ya.b.f77504xbb80cbe3, true);
        }
        if (!jSONObject.has("msg") && str != null) {
            jSONObject.put("msg", str);
        }
        return jSONObject;
    }
}
