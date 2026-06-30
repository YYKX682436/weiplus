package ap;

/* loaded from: classes12.dex */
public abstract class c {
    public static void a(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompatReporter", "report to KV_ID_COMPAT: ilogs=23773, bizType=" + i17 + ", bizName=" + str);
        jx3.f.INSTANCE.d(23773, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, str3, str4, str5, str6, str7, str8, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
    }

    public static java.lang.String b(java.util.Map map) {
        try {
            return new org.json.JSONObject(map).toString().replace(",", ";");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CompatReporter", e17, "json error", new java.lang.Object[0]);
            return e17.getMessage();
        }
    }
}
