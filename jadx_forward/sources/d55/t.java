package d55;

/* loaded from: classes12.dex */
public abstract class t {
    public static void a(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p2500x32bcfcd1.C19823xc30d8063 c19823xc30d8063, d55.s sVar) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", "fallback");
            jSONObject.put("time", c19823xc30d8063.f273740e);
            jSONObject.put("crash_count", c19823xc30d8063.f273739d);
            jSONObject.put("version", c19823xc30d8063.f273741f);
            jSONObject.put("actions", ((d55.r) sVar).f308145b.toString());
            context.getSharedPreferences("recovery_journal_fallback", 4).edit().putString(str, jSONObject.toString()).apply();
        } catch (java.lang.Throwable th6) {
            d55.q0.a("MicroMsg.recovery.journal", "put fallback desc fail", th6);
        }
    }
}
