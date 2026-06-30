package t00;

/* loaded from: classes.dex */
public final class l1 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495861i;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        org.json.JSONObject optJSONObject = data.optJSONObject("logInfo");
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString("logStr") : null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            java.lang.String optString2 = optJSONObject != null ? optJSONObject.optString("logLevel") : null;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString2, "warning")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("[Ecs jsapi log]", optString);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString2, "error")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("[Ecs jsapi log]", optString);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("[Ecs jsapi log]", optString);
            }
        }
        callback.b(null);
    }
}
