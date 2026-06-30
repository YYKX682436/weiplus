package xe1;

/* loaded from: classes15.dex */
public class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe1.p f535360d;

    public a(xe1.p pVar) {
        this.f535360d = pVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int m51333x25784152;
        xe1.p pVar = this.f535360d;
        try {
            m51333x25784152 = pVar.f535361d.m51333x25784152();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Video.JsApiVideoCallback", "OnVideoTimeUpdate e=%s", e17);
        }
        if (java.lang.Math.abs(m51333x25784152 - pVar.f535364g) < 250) {
            return true;
        }
        org.json.JSONObject b17 = pVar.b();
        pVar.f535364g = m51333x25784152;
        b17.put("position", new java.math.BigDecimal((m51333x25784152 * 1.0d) / 1000.0d).setScale(3, 4).doubleValue());
        b17.put("duration", pVar.f535361d.m51335x51e8b0a());
        pVar.a(new xe1.n(null), b17);
        return true;
    }
}
