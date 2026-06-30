package df2;

/* loaded from: classes3.dex */
public final class ul extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.hm f313070b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(df2.hm hmVar, java.lang.Class cls) {
        super(cls);
        this.f313070b = hmVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.tb2 result = (r45.tb2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        df2.hm hmVar = this.f313070b;
        hmVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hmVar.f311868m, "updateVisitorHeatTips " + result.m75939xb282bd08(1) + ", lastStatus:" + hmVar.f311870o);
        if (result.m75939xb282bd08(1) == 0) {
            pm0.v.X(new df2.bm(hmVar));
            return;
        }
        android.view.View b76 = hmVar.b7();
        if (b76 != null && b76.getVisibility() == 8) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.T1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = hmVar.f311871p;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        hmVar.f311871p = null;
        pm0.v.X(new df2.gm(hmVar, result));
    }
}
