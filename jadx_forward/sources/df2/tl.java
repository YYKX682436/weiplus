package df2;

/* loaded from: classes3.dex */
public final class tl extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.hm f312988b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(df2.hm hmVar, java.lang.Class cls) {
        super(cls);
        this.f312988b = hmVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.vb2 result = (r45.vb2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        df2.hm hmVar = this.f312988b;
        hmVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateAnchorHeatTips ");
        boolean z17 = false;
        sb6.append(result.m75939xb282bd08(0));
        sb6.append(", lastStatus:");
        sb6.append(hmVar.f311870o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hmVar.f311868m, sb6.toString());
        if (result.m75939xb282bd08(0) == 0) {
            pm0.v.X(new df2.vl(hmVar));
            return;
        }
        if (result.m75939xb282bd08(0) == hmVar.f311870o) {
            return;
        }
        android.view.View b76 = hmVar.b7();
        if (b76 != null && b76.getVisibility() == 8) {
            z17 = true;
        }
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.I1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = hmVar.f311871p;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        hmVar.f311871p = null;
        pm0.v.X(new df2.am(hmVar, result));
    }
}
