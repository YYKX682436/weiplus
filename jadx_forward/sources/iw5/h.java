package iw5;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final iw5.h f376805a = new iw5.h();

    public final jz5.l a(java.lang.String reqJson) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqJson, "reqJson");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(reqJson);
            java.lang.String string = jSONObject.getString("type");
            byte[] decode = android.util.Base64.decode(jSONObject.getString("req"), 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
            return new jz5.l(string, new java.lang.String(decode, r26.c.f450398a));
        } catch (java.lang.Exception e17) {
            java.lang.String msg = "parseReq error " + e17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            if (iw5.o.f376808a == null) {
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtChannelUtil", msg);
            return null;
        }
    }
}
