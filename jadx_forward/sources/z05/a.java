package z05;

/* loaded from: classes9.dex */
public abstract class a {
    public static final z05.e a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        z05.e eVar = new z05.e();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("cdnthumburl");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            eVar.u(optString);
            java.lang.String optString2 = jSONObject.optString("cdnthumbmd5");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
            eVar.t(optString2);
            eVar.s(jSONObject.optInt("cdnthumblength", 0));
            eVar.w(jSONObject.optInt("cdnthumbwidth", 0));
            eVar.r(jSONObject.optInt("cdnthumbheight", 0));
            java.lang.String optString3 = jSONObject.optString("cdnthumbaeskey");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
            eVar.q(optString3);
            return eVar;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Common", e17.getMessage());
            return null;
        }
    }
}
