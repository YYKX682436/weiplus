package ut2;

/* loaded from: classes3.dex */
public final class d0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.a56 f512387a;

    public d0(r45.a56 a56Var) {
        this.f512387a = a56Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f408797s;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("commerceAction", 1075);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "live");
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0 r0Var2 = (ml2.r0) c18;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("commerceAction", 1034);
            r45.c33 c33Var = (r45.c33) this.f512387a.m75936x14adae67(3);
            if (c33Var == null || (str = c33Var.m75945x2fec8307(1)) == null) {
                str = "";
            }
            jSONObject2.put("url", str);
            ml2.r0.hj(r0Var2, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }
}
