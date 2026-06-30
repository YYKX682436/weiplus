package vd2;

/* loaded from: classes3.dex */
public final class y4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.z4 f517565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f517566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f517567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ km2.m f517568g;

    public y4(vd2.z4 z4Var, int i17, int i18, km2.m mVar) {
        this.f517565d = z4Var;
        this.f517566e = i17;
        this.f517567f = i18;
        this.f517568g = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        gk2.e eVar;
        r45.nw1 nw1Var;
        gk2.e eVar2;
        vd2.z4 z4Var = this.f517565d;
        z4Var.getClass();
        int i17 = this.f517566e;
        if (i17 == -1 || i17 == this.f517567f) {
            return;
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = z4Var.f517587e;
        android.content.Context context = c14353xe7c1f419 != null ? c14353xe7c1f419.getContext() : null;
        r0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        km2.m mVar = this.f517568g;
        if (mVar == null || (eVar2 = mVar.f390663e) == null || (str = ((mm2.c1) eVar2.a(mm2.c1.class)).f410385o) == null) {
            str = "";
        }
        jSONObject.put(dm.i4.f66875xa013b0d5, str);
        long m75942xfb822ef2 = (mVar == null || (eVar = mVar.f390663e) == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        jSONObject.put("liveId", b52.b.q(m75942xfb822ef2));
        ml2.r0.hj(r0Var, ml2.b4.f408795r, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        ml2.e4 e4Var = ml2.e4.f408913i;
        km2.n nVar = dk2.ef.H;
        ml2.r0.Ck(r0Var, context, e4Var, nVar != null ? nVar.f390693l : null, false, null, 24, null);
    }
}
