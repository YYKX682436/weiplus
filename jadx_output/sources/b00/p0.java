package b00;

/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b00.p0 f16747a = new b00.p0();

    public static void b(b00.p0 p0Var, java.lang.String message, java.lang.String tag, int i17, java.lang.Object obj) {
        boolean z17;
        if ((i17 & 2) != 0) {
            tag = "MicroMsg.EcsUtil";
        }
        p0Var.getClass();
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(tag, "tag");
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException(message);
        if (z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17) {
            throw runtimeException;
        }
        com.tencent.mars.xlog.Log.printErrStackTrace(tag, runtimeException, "Ecs Error!!", new java.lang.Object[0]);
    }

    public final java.lang.String a(java.lang.String inputUrl, java.lang.String param, java.lang.String value) {
        kotlin.jvm.internal.o.g(inputUrl, "inputUrl");
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(value, "value");
        java.util.List f07 = r26.n0.f0(inputUrl, new java.lang.String[]{"#"}, false, 0, 6, null);
        java.lang.String str = (java.lang.String) f07.get(0);
        if (!r26.n0.D(str, "?", false, 2, null)) {
            str = str + '?';
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(r26.i0.o(str, "?", false, 2, null) ? "" : "&");
        sb6.append(param);
        sb6.append('=');
        sb6.append(value);
        java.lang.String sb7 = sb6.toString();
        if (f07.size() <= 1) {
            return sb7;
        }
        return sb7 + '#' + ((java.lang.String) f07.get(1));
    }

    public final java.lang.String c(java.lang.String userName) {
        java.lang.String g27;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        if (!com.tencent.mm.storage.z3.m4(userName) && !com.tencent.mm.storage.z3.q4(userName) && !com.tencent.mm.storage.z3.p4(userName)) {
            g27 = n17 != null ? n17.g2() : null;
            return g27 == null ? "" : g27;
        }
        java.lang.String a17 = t41.g.a(n17);
        if (a17 == null) {
            a17 = "";
        }
        g27 = n17 != null ? n17.g2() : null;
        return (g27 != null ? g27 : "").concat(a17);
    }

    public final java.util.List d(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = jSONArray.get(i17);
            if (obj instanceof org.json.JSONObject) {
                obj = e((org.json.JSONObject) obj);
            } else if (obj instanceof org.json.JSONArray) {
                obj = d((org.json.JSONArray) obj);
            }
            kotlin.jvm.internal.o.d(obj);
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final java.util.Map e(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return new java.util.LinkedHashMap();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object obj = jSONObject.get(next);
            kotlin.jvm.internal.o.d(next);
            if (obj instanceof org.json.JSONObject) {
                obj = e((org.json.JSONObject) obj);
            } else if (obj instanceof org.json.JSONArray) {
                obj = d((org.json.JSONArray) obj);
            }
            kotlin.jvm.internal.o.d(obj);
            linkedHashMap.put(next, obj);
        }
        return linkedHashMap;
    }

    public final org.json.JSONObject f(org.json.JSONObject json1, org.json.JSONObject json2) {
        kotlin.jvm.internal.o.g(json1, "json1");
        kotlin.jvm.internal.o.g(json2, "json2");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(json1.toString());
            java.util.Iterator<java.lang.String> keys = json2.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = json2.get(next);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                if (jSONObject.has(next)) {
                    java.lang.Object obj2 = jSONObject.get(next);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    if ((obj2 instanceof org.json.JSONObject) && (obj instanceof org.json.JSONObject)) {
                        jSONObject.put(next, f((org.json.JSONObject) obj2, (org.json.JSONObject) obj));
                    }
                } else {
                    jSONObject.put(next, obj);
                }
            }
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EcsUtil", "mergeJsonObjects exception " + e17);
            return new org.json.JSONObject();
        }
    }
}
