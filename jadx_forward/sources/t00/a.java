package t00;

/* loaded from: classes.dex */
public final class a implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.G;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AmeobaReportEcsActionHandler", "handleAction data: " + data);
        java.lang.String optString = data.optString("eventId");
        java.lang.String optString2 = data.optString("viewId");
        java.lang.String optString3 = data.optString("pageId");
        org.json.JSONObject optJSONObject = data.optJSONObject("reportData");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            hashMap.put("event_id", optString);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            hashMap.put("view_id", optString2);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
            hashMap.put("page_id", optString3);
        }
        if (optJSONObject != null && optJSONObject.length() > 0) {
            java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                java.lang.Object opt = optJSONObject.opt(next);
                if (opt != null) {
                    hashMap.put(next, opt);
                }
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(optString, null, hashMap, 12, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AmeobaReportEcsActionHandler", "report success, eventId: " + optString);
        callback.b(null);
    }
}
