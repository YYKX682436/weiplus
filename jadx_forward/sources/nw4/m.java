package nw4;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f422410a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f422411b = new java.util.HashMap();

    public m() {
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_webview_jsapi_call_limit, "{\"list\":[{\"limit\":10,\"pos\":14},{\"limit\":10,\"pos\":15}]}", true);
            org.json.JSONArray optJSONArray = new org.json.JSONObject(Zi).optJSONArray("list");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.Object obj = optJSONArray.get(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                    this.f422411b.put(java.lang.Integer.valueOf(jSONObject.optInt("pos")), java.lang.Integer.valueOf(jSONObject.optInt("limit")));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiFrequentHelper", "size=" + this.f422411b.size() + ", config=" + Zi);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiFrequentHelper", "parse fail: ex=" + th6.getMessage());
        }
    }

    public final boolean a(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.HashMap hashMap = this.f422411b;
        if (hashMap.containsKey(valueOf)) {
            java.lang.Object obj = hashMap.get(java.lang.Integer.valueOf(i17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            int intValue = ((java.lang.Number) obj).intValue();
            if (intValue <= 0) {
                return false;
            }
            java.util.HashMap hashMap2 = this.f422410a;
            nw4.l lVar = (nw4.l) hashMap2.get(java.lang.Integer.valueOf(i17));
            long currentTimeMillis = java.lang.System.currentTimeMillis() / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
            if (lVar == null) {
                lVar = new nw4.l(currentTimeMillis, 1);
            } else if (lVar.f422404a == currentTimeMillis) {
                lVar.f422405b++;
            } else {
                lVar.f422404a = currentTimeMillis;
                lVar.f422405b = 1;
            }
            hashMap2.put(java.lang.Integer.valueOf(i17), lVar);
            if (lVar.f422405b >= intValue) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiFrequentHelper", "isTooFrequent controlByte:" + i17 + ", count:" + lVar.f422405b);
        }
        return false;
    }

    public final void b(int i17, java.lang.String funcName, java.lang.String url) {
        nw4.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.HashMap hashMap = this.f422411b;
        if (hashMap.containsKey(valueOf)) {
            java.lang.Object obj = hashMap.get(java.lang.Integer.valueOf(i17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            int intValue = ((java.lang.Number) obj).intValue();
            if (intValue > 0 && (lVar = (nw4.l) this.f422410a.get(java.lang.Integer.valueOf(i17))) != null && lVar.f422405b == intValue) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
                g0Var.d(18188, funcName, com.p314xaae8f345.mm.sdk.p2603x2137b148.y9.a(url));
            }
        }
    }
}
