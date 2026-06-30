package ap;

/* loaded from: classes12.dex */
public abstract class c {
    public static void a(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CompatReporter", "report to KV_ID_COMPAT: ilogs=23773, bizType=" + i17 + ", bizName=" + str);
        jx3.f.INSTANCE.d(23773, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, str3, str4, str5, str6, str7, str8, com.tencent.mm.sdk.platformtools.z.f193109e);
    }

    public static java.lang.String b(java.util.Map map) {
        try {
            return new org.json.JSONObject(map).toString().replace(",", ";");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CompatReporter", e17, "json error", new java.lang.Object[0]);
            return e17.getMessage();
        }
    }
}
