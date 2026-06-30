package t00;

/* loaded from: classes9.dex */
public final class o0 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495870r;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPreloadDataActionHandler", "handleAction: " + data);
        y02.p0 a17 = y02.r0.f540159d.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetPreloadDataActionHandler", "preloadMgr is null");
            callback.a();
            return;
        }
        t00.m0 i18 = i(data);
        if (!i18.f495848a || (arrayList = i18.f495851d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetPreloadDataActionHandler", "data invalid");
            callback.a();
            return;
        }
        if (!i18.f495849b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPreloadDataActionHandler", "handle Sync");
            h(((y02.r0) a17).a((java.lang.String[]) arrayList.toArray(new java.lang.String[0])), callback);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPreloadDataActionHandler", "handle Async");
        java.lang.String[] keys = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        t00.n0 n0Var = new t00.n0(this, callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        y02.o1 o1Var = new y02.o1();
        o1Var.f540156i = n0Var;
        p3380x6a61f93.p3387xf51c6630.C30629x21b48624.m170386x21b8152e(((y02.r0) a17).m105978x2737f10(), keys, i18.f495850c, o1Var);
    }

    @Override // t00.r0
    public boolean d(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPreloadDataActionHandler", "preHandleAction: " + data);
        y02.p0 a17 = y02.r0.f540159d.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetPreloadDataActionHandler", "preloadMgr is null");
            callback.a();
            return true;
        }
        t00.m0 i18 = i(data);
        if (!i18.f495848a || (arrayList = i18.f495851d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetPreloadDataActionHandler", "data invalid");
            callback.a();
            return true;
        }
        if (i18.f495849b) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPreloadDataActionHandler", "handle Sync");
        h(((y02.r0) a17).a((java.lang.String[]) arrayList.toArray(new java.lang.String[0])), callback);
        return true;
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }

    public final void h(bw5.e6[] e6VarArr, c00.n3 n3Var) {
        if (e6VarArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPreloadDataActionHandler", "onFail, invalid preloadResp");
            n3Var.a();
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (bw5.e6 e6Var : e6VarArr) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str = "";
            jSONObject.put("key", e6Var.f108277g[1] ? e6Var.f108274d : "");
            if (e6Var.f108277g[2]) {
                str = e6Var.f108275e;
            }
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str);
            jSONObject.put("time", e6Var.f108276f);
            jSONArray.put(jSONObject);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("kvData", jSONArray);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPreloadDataActionHandler", "onSuccess, result count: " + jSONArray.length());
        n3Var.b(jSONObject2);
    }

    public final t00.m0 i(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONObject.has("keys")) {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("keys");
            if (optJSONArray == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetPreloadDataActionHandler", "invalid keys");
                return new t00.m0(false, false, 0, null, 8, null);
            }
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String optString = optJSONArray.optString(i17);
                if (optString != null) {
                    if (optString.length() > 0) {
                        arrayList.add(optString);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetPreloadDataActionHandler", "keys isEmpty");
                return new t00.m0(false, false, 0, null, 8, null);
            }
        }
        return new t00.m0(true, (jSONObject.has("async") ? jSONObject.optInt("async", 0) : 0) == 1, jSONObject.has("timeoutMs") ? jSONObject.optInt("timeoutMs", 3000) : 3000, arrayList);
    }
}
