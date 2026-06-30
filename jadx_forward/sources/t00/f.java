package t00;

/* loaded from: classes9.dex */
public final class f implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495872t;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClearPreloadDataActionHandler", "handleAction: " + data);
        y02.p0 a17 = y02.r0.f540159d.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ClearPreloadDataActionHandler", "preloadMgr is null");
            callback.a();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (data.has("keys")) {
            org.json.JSONArray optJSONArray = data.optJSONArray("keys");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ClearPreloadDataActionHandler", "keys is null");
                callback.a();
                return;
            }
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.String optString = optJSONArray.optString(i18);
                if (optString != null) {
                    if (optString.length() > 0) {
                        arrayList.add(optString);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ClearPreloadDataActionHandler", "keys is null");
            callback.a();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClearPreloadDataActionHandler", "clearPreload, count: " + arrayList.size());
        java.lang.String[] keys = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        p3380x6a61f93.p3387xf51c6630.C30629x21b48624.m170385x21b2480d(((y02.r0) a17).m105978x2737f10(), keys);
        callback.b(null);
    }

    @Override // t00.r0
    public boolean g() {
        return false;
    }
}
