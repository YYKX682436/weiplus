package b00;

/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b00.p0 f98280a = new b00.p0();

    public static void b(b00.p0 p0Var, java.lang.String message, java.lang.String tag, int i17, java.lang.Object obj) {
        boolean z17;
        if ((i17 & 2) != 0) {
            tag = "MicroMsg.EcsUtil";
        }
        p0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException(message);
        if (z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17) {
            throw runtimeException;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(tag, runtimeException, "Ecs Error!!", new java.lang.Object[0]);
    }

    public final java.lang.String a(java.lang.String inputUrl, java.lang.String param, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputUrl, "inputUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(userName) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(userName) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(userName)) {
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object obj = jSONObject.get(next);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
            if (obj instanceof org.json.JSONObject) {
                obj = e((org.json.JSONObject) obj);
            } else if (obj instanceof org.json.JSONArray) {
                obj = d((org.json.JSONArray) obj);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            linkedHashMap.put(next, obj);
        }
        return linkedHashMap;
    }

    public final org.json.JSONObject f(org.json.JSONObject json1, org.json.JSONObject json2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json1, "json1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json2, "json2");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(json1.toString());
            java.util.Iterator<java.lang.String> keys = json2.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = json2.get(next);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                if (jSONObject.has(next)) {
                    java.lang.Object obj2 = jSONObject.get(next);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    if ((obj2 instanceof org.json.JSONObject) && (obj instanceof org.json.JSONObject)) {
                        jSONObject.put(next, f((org.json.JSONObject) obj2, (org.json.JSONObject) obj));
                    }
                } else {
                    jSONObject.put(next, obj);
                }
            }
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsUtil", "mergeJsonObjects exception " + e17);
            return new org.json.JSONObject();
        }
    }
}
