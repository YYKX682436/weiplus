package t00;

/* loaded from: classes9.dex */
public final class h2 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.D;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SetKvActionHandler", "handleAction: " + data);
        int i18 = y02.f.f540137d;
        y02.d dVar = (y02.d) p3380x6a61f93.p3387xf51c6630.C30631x21b8878b.m170409x21b0d463();
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SetKvActionHandler", "kvMgr is null");
            callback.a();
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (data.has("keyValues")) {
            org.json.JSONObject optJSONObject = data.optJSONObject("keyValues");
            if (optJSONObject == null || optJSONObject.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SetKvActionHandler", "keyValues is empty");
                callback.a();
                return;
            }
            java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = optJSONObject.get(next);
                if (obj instanceof java.lang.String) {
                    if (((java.lang.CharSequence) obj).length() > 0) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                        linkedHashMap.put(next, obj);
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SetKvActionHandler", "keyValues is empty");
            callback.a();
            return;
        }
        int optInt = data.has("timeout") ? data.optInt("timeout", 0) : 0;
        int m170408x21b0a7e3 = optInt == -1 ? p3380x6a61f93.p3387xf51c6630.C30631x21b8878b.m170408x21b0a7e3(((y02.f) dVar).m105978x2737f10(), y02.s1.f540160g.b(linkedHashMap)) : optInt > 0 ? p3380x6a61f93.p3387xf51c6630.C30631x21b8878b.m170416x21b9bb15(((y02.f) dVar).m105978x2737f10(), y02.s1.f540160g.b(linkedHashMap), optInt) : p3380x6a61f93.p3387xf51c6630.C30631x21b8878b.m170407x21b07325(((y02.f) dVar).m105978x2737f10(), y02.s1.f540160g.b(linkedHashMap));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SetKvActionHandler", "setKv, count: " + linkedHashMap.size() + " errorCode: " + m170408x21b0a7e3);
        if (m170408x21b0a7e3 == 0) {
            callback.b(null);
        } else {
            callback.d(new org.json.JSONObject(kz5.b1.e(new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.Integer.valueOf(m170408x21b0a7e3)))));
        }
    }

    @Override // t00.r0
    public boolean g() {
        return false;
    }
}
