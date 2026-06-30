package c01;

/* loaded from: classes.dex */
public class wa {

    /* renamed from: b, reason: collision with root package name */
    public static final c01.wa f37550b = new c01.wa();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f37551a = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_register_history", 0);

    public java.lang.String a(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = this.f37551a;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.RegisterAccountInfo", "get %s, %s", str, str2);
            if (sharedPreferences.contains(str)) {
                java.lang.String str3 = new java.lang.String(android.util.Base64.decode(sharedPreferences.getString(str, ""), 0));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RegisterAccountInfo", "get json str %s", str3);
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
                    if (jSONObject.has(str2)) {
                        return jSONObject.getString(str2);
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.RegisterAccountInfo", "register info about %s is not found!", str);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RegisterAccountInfo", "get register info %s about %s failed, error: %s", str2, str, e17.getMessage());
        }
        return "";
    }
}
