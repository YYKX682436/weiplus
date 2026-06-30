package t00;

/* loaded from: classes8.dex */
public final class h1 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495855c;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        bw5.x7 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PreloadEcsEcsActionHandler", "handleAction context null");
            callback.a();
            return;
        }
        pq.a aVar = new pq.a(context);
        java.lang.String optString = data.optString("ecsJumpInfoBase64");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            org.json.JSONObject optJSONObject = data.optJSONObject("ecsJumpInfo");
            if (optJSONObject == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PreloadEcsEcsActionHandler", "handleAction jumpInfo null");
                callback.a();
                return;
            }
            a17 = r10.b.f450107a.a(optJSONObject);
        } else {
            bw5.x7 x7Var = new bw5.x7();
            x7Var.mo11468x92b714fd(android.util.Base64.decode(optString, 0));
            a17 = x7Var;
        }
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PreloadEcsEcsActionHandler", "handleAction jumpInfoObject null");
            callback.a();
            return;
        }
        bw5.l8 l8Var = new bw5.l8();
        org.json.JSONObject optJSONObject2 = data.optJSONObject("config");
        if (optJSONObject2 != null) {
            l8Var.f111213g = optJSONObject2.optInt("cgiPreloadScene", 0);
            boolean[] zArr = l8Var.f111215i;
            zArr[4] = true;
            if (optJSONObject2.has("cgiPreloadExtraData")) {
                java.lang.Object obj = optJSONObject2.get("cgiPreloadExtraData");
                if (obj instanceof java.lang.String) {
                    if (((java.lang.CharSequence) obj).length() > 0) {
                        byte[] bytes = ((java.lang.String) obj).getBytes(r26.c.f450398a);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                        l8Var.f111214h = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
                        zArr[5] = true;
                    }
                } else if (obj instanceof org.json.JSONObject) {
                    byte[] bytes2 = obj.toString().getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
                    l8Var.f111214h = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes2, 0, bytes2.length);
                    zArr[5] = true;
                }
            }
        }
        i95.m c17 = i95.n0.c(pq.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pq.q.h6((pq.q) c17, aVar, a17, l8Var, null, 8, null);
        callback.b(null);
    }
}
