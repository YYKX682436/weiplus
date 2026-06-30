package kw2;

/* loaded from: classes12.dex */
public final class i0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kw2.m0 f394561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f394562b;

    public i0(kw2.m0 m0Var, org.json.JSONObject jSONObject) {
        this.f394561a = m0Var;
        this.f394562b = jSONObject;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.b3 b3Var = (rh.b3) obj;
        double d17 = b3Var.f476849h;
        kw2.m0 m0Var = this.f394561a;
        float e17 = kw2.m0.e(m0Var, d17);
        float e18 = kw2.m0.e(m0Var, b3Var.f476847f);
        float e19 = kw2.m0.e(m0Var, b3Var.f476848g);
        boolean z17 = true;
        java.util.List i17 = kz5.c0.i(java.lang.Float.valueOf(e17), java.lang.Float.valueOf(e18), java.lang.Float.valueOf(e19));
        if (!i17.isEmpty()) {
            java.util.Iterator it = i17.iterator();
            while (it.hasNext()) {
                if (android.os.Build.VERSION.SDK_INT < 29 || ((java.lang.Number) it.next()).floatValue() <= 0.0f) {
                    break;
                }
            }
        }
        z17 = false;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        if (!valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            return;
        }
        org.json.JSONObject jSONObject = this.f394562b;
        jSONObject.put("thermalStatusNon", 0);
        jSONObject.put("thermalStatusAvg", java.lang.Float.valueOf(e17));
        jSONObject.put("thermalStatusMax", java.lang.Float.valueOf(e18));
        jSONObject.put("thermalStatusMin", java.lang.Float.valueOf(e19));
    }
}
