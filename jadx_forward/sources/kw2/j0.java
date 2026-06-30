package kw2;

/* loaded from: classes12.dex */
public final class j0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kw2.m0 f394569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f394570b;

    public j0(kw2.m0 m0Var, org.json.JSONObject jSONObject) {
        this.f394569a = m0Var;
        this.f394570b = jSONObject;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.b3 b3Var = (rh.b3) obj;
        double d17 = 10;
        double d18 = b3Var.f476849h * d17;
        kw2.m0 m0Var = this.f394569a;
        float e17 = kw2.m0.e(m0Var, d18);
        float e18 = kw2.m0.e(m0Var, b3Var.f476847f * d17);
        float e19 = kw2.m0.e(m0Var, b3Var.f476848g * d17);
        boolean z17 = false;
        java.util.List i17 = kz5.c0.i(java.lang.Float.valueOf(e17), java.lang.Float.valueOf(e18), java.lang.Float.valueOf(e19));
        if (!i17.isEmpty()) {
            java.util.Iterator it = i17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                float floatValue = ((java.lang.Number) it.next()).floatValue();
                if (floatValue <= 0.0f || floatValue >= 10000.0f) {
                    z17 = true;
                    break;
                }
            }
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        if (!valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            return;
        }
        java.lang.Float valueOf2 = java.lang.Float.valueOf(e17);
        org.json.JSONObject jSONObject = this.f394570b;
        jSONObject.put("oppoTempAvg", valueOf2);
        jSONObject.put("oppoTempMax", java.lang.Float.valueOf(e18));
        jSONObject.put("oppoTempMin", java.lang.Float.valueOf(e19));
    }
}
