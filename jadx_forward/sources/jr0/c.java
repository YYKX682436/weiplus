package jr0;

/* loaded from: classes12.dex */
public class c implements jr0.k {

    /* renamed from: a, reason: collision with root package name */
    public static long f382856a;

    static {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new jr0.a());
    }

    @Override // jr0.k
    public void a(jr0.i iVar) {
        java.lang.String str = iVar.f477393b;
        java.lang.String str2 = iVar.f477394c;
        org.json.JSONObject jSONObject = iVar.f477395d;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        try {
            if (str.equals("Trace")) {
                if (iVar.f477393b.equalsIgnoreCase("Trace_EvilMethod") && jSONObject.getString("detail").equalsIgnoreCase("ANR")) {
                    b(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str2), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(jSONObject.getString("cost")), jSONObject);
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AnrReportListener", e17, "", new java.lang.Object[0]);
        } finally {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AnrReportListener", "[report] cost:%sms", java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - uptimeMillis));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r31, long r33, org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jr0.c.b(long, long, org.json.JSONObject):void");
    }
}
