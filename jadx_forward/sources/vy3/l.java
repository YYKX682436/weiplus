package vy3;

/* loaded from: classes.dex */
public final class l extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.l f523008e = new vy3.l();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(msg.f422323a);
            int optInt = jSONObject.optInt("logid", 0);
            java.lang.String optString = jSONObject.optString("msg", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            jx3.f.INSTANCE.mo68478xbd3cda5f(optInt, optString);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiReportKV", e17, "ScanJsApi-Call:reportKV exception", new java.lang.Object[0]);
            return true;
        }
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "reportKV";
    }
}
