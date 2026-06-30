package gi;

/* renamed from: gi.w0$$e */
/* loaded from: classes12.dex */
public final /* synthetic */ class C28413x6a34aac implements wh.u0 {
    @Override // wh.u0
    /* renamed from: apply */
    public final java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        int intValue;
        rh.c3 c3Var = (rh.c3) obj;
        if (pj.h.f436442a) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("com.oplus.util.OplusHoraeThermalHelper");
                intValue = ((java.lang.Integer) cls.getDeclaredMethod("getThermalStatus", new java.lang.Class[0]).invoke(cls.getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]), new java.lang.Object[0])).intValue();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("", "getThermalStatus failed: " + th6.getMessage());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f476879g + " " + c3Var.f476873a + ", val = " + intValue);
            return java.lang.Integer.valueOf(intValue);
        }
        intValue = -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f476879g + " " + c3Var.f476873a + ", val = " + intValue);
        return java.lang.Integer.valueOf(intValue);
    }
}
