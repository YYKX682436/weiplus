package dy4;

/* loaded from: classes8.dex */
public final class u implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.w f326240d;

    public u(dy4.w wVar) {
        this.f326240d = wVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        dy4.w wVar = this.f326240d;
        dy4.f1 f1Var = wVar.f326250c;
        if (f1Var == null) {
            return true;
        }
        ye1.e eVar = f1Var.f326160n;
        int mo1851x9746038c = eVar != null ? eVar.mo1851x9746038c() : 0;
        double d17 = 1000;
        int i17 = (int) (wVar.f326251d * d17);
        try {
            if (java.lang.Math.abs(mo1851x9746038c - wVar.f326252e) < 250) {
                return true;
            }
            wVar.f326252e = mo1851x9746038c;
            double d18 = (i17 * 1.0d) / d17;
            double doubleValue = new java.math.BigDecimal((mo1851x9746038c * 1.0d) / d17).setScale(3, 4).doubleValue();
            org.json.JSONObject c17 = wVar.c();
            c17.put("position", doubleValue);
            c17.put("duration", d18);
            wVar.a("onVideoTimeUpdate", c17);
            return true;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(wVar.f326248a, "OnXWebVideoTimeUpdate fail", e17);
            return true;
        }
    }
}
