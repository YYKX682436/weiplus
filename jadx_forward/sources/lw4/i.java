package lw4;

/* loaded from: classes8.dex */
public class i implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw4.j f403190d;

    public i(lw4.j jVar) {
        this.f403190d = jVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int m74185x25784152;
        lw4.j jVar = this.f403190d;
        try {
            m74185x25784152 = jVar.f403191a.m74185x25784152();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiVideoCallback", "OnVideoTimeUpdate e=%s", e17);
        }
        if (java.lang.Math.abs(m74185x25784152 - jVar.f403193c) < 250) {
            return true;
        }
        jVar.f403193c = m74185x25784152;
        org.json.JSONObject h17 = jVar.h();
        h17.put("currentTime", jVar.f403191a.m74186x898ffe25());
        jVar.j(jVar.g(4, h17));
        return true;
    }
}
