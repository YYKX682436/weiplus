package vy3;

/* loaded from: classes.dex */
public final class h extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.h f523004e = new vy3.h();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        nw4.g gVar = env.f422396d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderView", "openFinderView");
        java.lang.String str = (java.lang.String) msg.f422323a.get("extInfo");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("extInfo", new org.json.JSONObject(str));
            android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.ta.d(ya2.e1.f542005a, ll6, jSONObject.toString(), null, null, 12, null);
            gVar.e(msg.f422546c, msg.f422552i + ":fail", null);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenFinderView", e17, "openFinderView exception", new java.lang.Object[0]);
            gVar.e(msg.f422546c, msg.f422552i + ":fail", null);
            return false;
        }
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderView";
    }
}
