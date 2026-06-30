package t00;

/* loaded from: classes9.dex */
public final class e implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.E;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClearKvActionHandler", "handleAction: " + data);
        int i18 = y02.f.f540137d;
        y02.d dVar = (y02.d) p3380x6a61f93.p3387xf51c6630.C30631x21b8878b.m170409x21b0d463();
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ClearKvActionHandler", "kvMgr is null");
            callback.a();
            return;
        }
        int optInt = data.optInt("mode", 0);
        if (optInt == 2) {
            p3380x6a61f93.p3387xf51c6630.C30631x21b8878b.m170414x21b90183(((y02.f) dVar).m105978x2737f10());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClearKvActionHandler", "clearAll");
            callback.b(null);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (data.has("keys")) {
            org.json.JSONArray optJSONArray = data.optJSONArray("keys");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ClearKvActionHandler", "keys is null or empty");
                callback.a();
                return;
            }
            int length = optJSONArray.length();
            for (int i19 = 0; i19 < length; i19++) {
                java.lang.String optString = optJSONArray.optString(i19);
                if (optString != null) {
                    if (optString.length() > 0) {
                        arrayList.add(optString);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ClearKvActionHandler", "keys is empty");
            callback.a();
            return;
        }
        if (optInt == 0) {
            java.lang.String[] keys = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
            p3380x6a61f93.p3387xf51c6630.C30631x21b8878b.m170411x21b43b49(((y02.f) dVar).m105978x2737f10(), keys);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClearKvActionHandler", "clear specified keys, count: " + arrayList.size());
            callback.b(null);
            return;
        }
        if (optInt != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ClearKvActionHandler", "invalid mode: " + optInt);
            callback.a();
            return;
        }
        java.lang.String[] keys2 = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys2, "keys");
        p3380x6a61f93.p3387xf51c6630.C30631x21b8878b.m170412x21b8a3b7(((y02.f) dVar).m105978x2737f10(), keys2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClearKvActionHandler", "clearExcept keys, count: " + arrayList.size());
        callback.b(null);
    }

    @Override // t00.r0
    public boolean g() {
        return false;
    }
}
