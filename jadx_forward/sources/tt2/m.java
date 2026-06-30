package tt2;

/* loaded from: classes3.dex */
public final class m extends ym5.n0 {
    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f408797s;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("commerceAction", 1065);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            ml2.r0.hj(r0Var, b4Var, r26.i0.t(jSONObject2, ",", ";", false), 0L, null, null, null, null, null, 252, null);
        }
    }
}
