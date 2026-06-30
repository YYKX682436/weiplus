package sx4;

/* loaded from: classes.dex */
public abstract class b0 {
    public static java.util.Map a(org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(next, -1);
            if (P == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebReportUtil", "reportData key error");
            } else {
                hashMap.put(java.lang.Integer.valueOf(P), jSONObject.opt(next));
            }
        }
        return hashMap;
    }

    public static void b(java.lang.String str, java.util.Map map) {
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()) {
            java.util.Map map2 = sx4.y.f495200a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            java.util.HashMap hashMap = (java.util.HashMap) sx4.y.f495200a;
            java.util.Map map3 = (java.util.Map) hashMap.get(str);
            if (map3 != null) {
                map3.putAll(map);
                return;
            } else {
                hashMap.put(str, new java.util.HashMap(map));
                return;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (map != null) {
            try {
                for (java.lang.Integer num : map.keySet()) {
                    jSONObject.put(java.lang.String.valueOf(num), map.get(num));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        bundle.putString("report_data", jSONObject.toString());
        bundle.putString("page_key", str);
        ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle, sx4.a0.class, null);
    }
}
