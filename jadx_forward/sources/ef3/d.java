package ef3;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f333938a;

    public d(java.lang.String str) {
        this.f333938a = "";
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            jSONObject.optString("eu_protocol_url");
            jSONObject.optInt("0");
            this.f333938a = jSONObject.optString("wxpay_protocol_url");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MciroMsg.EUInfo", e17, "", new java.lang.Object[0]);
        }
    }
}
