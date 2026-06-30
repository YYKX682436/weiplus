package c01;

/* loaded from: classes.dex */
public class wa {

    /* renamed from: b, reason: collision with root package name */
    public static final c01.wa f119083b = new c01.wa();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f119084a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_register_history", 0);

    public java.lang.String a(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = this.f119084a;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegisterAccountInfo", "get %s, %s", str, str2);
            if (sharedPreferences.contains(str)) {
                java.lang.String str3 = new java.lang.String(android.util.Base64.decode(sharedPreferences.getString(str, ""), 0));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegisterAccountInfo", "get json str %s", str3);
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
                    if (jSONObject.has(str2)) {
                        return jSONObject.getString(str2);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RegisterAccountInfo", "register info about %s is not found!", str);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RegisterAccountInfo", "get register info %s about %s failed, error: %s", str2, str, e17.getMessage());
        }
        return "";
    }
}
