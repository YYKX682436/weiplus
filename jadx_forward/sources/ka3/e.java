package ka3;

/* loaded from: classes15.dex */
public final class e {
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.List a() {
        java.lang.String[] b17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ra3.q.f475060a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = ra3.q.f475060a;
        if (o4Var2 == null) {
            b17 = new java.lang.String[0];
        } else {
            b17 = o4Var2.b();
            if (b17 == null) {
                b17 = new java.lang.String[0];
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ka3.g.f387602i, "mmkv getallkeys=" + b17);
        java.util.Iterator a17 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(b17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            p3321xbce91901.jvm.p3324x21ffc6bd.b bVar = (p3321xbce91901.jvm.p3324x21ffc6bd.b) a17;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            java.lang.String str = (java.lang.String) bVar.next();
            if (ka3.g.f387601h.e(str)) {
                org.json.JSONObject c17 = c(str, "{}");
                try {
                    ka3.f fVar = new ka3.f(c17, str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ka3.g.f387602i, "get RegisterData from mmkv, aids=" + fVar.f387591a + ", key=" + str);
                    arrayList.add(fVar);
                } catch (org.json.JSONException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(ka3.g.f387602i, "parse register option error, option=" + c17);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ka3.g.f387602i, "invalid hce register key=".concat(str));
            }
        }
    }

    public final java.lang.String b(java.lang.String uin, java.lang.String liteAppId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uin, "uin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppId, "liteAppId");
        return uin + '_' + liteAppId;
    }

    public final org.json.JSONObject c(java.lang.String key, java.lang.String defaultVal) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ra3.q.f475060a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultVal, "defaultVal");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = ra3.q.f475060a;
        java.lang.String string = o4Var2.getString(key, defaultVal);
        if (string != null) {
            defaultVal = string;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(defaultVal);
        if (jSONObject.length() != 0 && !jSONObject.has("wallet")) {
            try {
                ka3.v vVar = ka3.w.f387639e;
                jSONObject.put("wallet", "cn");
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                o4Var2.putString(key, jSONObject2);
            } catch (org.json.JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final ka3.f d(java.lang.String uin, java.lang.String liteAppId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uin, "uin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppId, "liteAppId");
        return new ka3.f(c(b(uin, liteAppId), "{}"), b(uin, liteAppId));
    }

    public final boolean e(java.lang.String uin, java.lang.String liteAppId, ka3.w walletType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uin, "uin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppId, "liteAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(walletType, "walletType");
        try {
            org.json.JSONObject c17 = c(b(uin, liteAppId), "{}");
            if (c17.length() == 0) {
                return false;
            }
            ka3.v vVar = ka3.w.f387639e;
            java.lang.String optString = c17.optString("wallet");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            return vVar.a(optString) == walletType;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }
}
