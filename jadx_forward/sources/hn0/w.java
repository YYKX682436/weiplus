package hn0;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final hn0.w f363976a = new hn0.w();

    public final boolean a(java.lang.String playerName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playerName, "playerName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Live.Vcodec2DecoderInjector", "doInject");
        int a17 = wo.r.a();
        boolean z17 = (a17 & 255) > 60;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Live.Vcodec2DecoderInjector", playerName + " set HEVC soft dec, cpuFlag:" + a17 + ", svrEnable:true, cpuEnable:" + z17);
        if (!z17) {
            return false;
        }
        try {
            long a18 = com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6.C10833x5d1d5d32.a();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("api", "setExternalDecoderFactoryInterface");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("factoryInterface", a18);
            jSONObject.put("params", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Live.Vcodec2DecoderInjector", playerName + " opens the vcodec2 decoder:" + jSONObject3 + ", ret:" + com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.m31898xd33a8dd4(jSONObject3));
        } catch (org.json.JSONException unused) {
        }
        return true;
    }
}
