package kc2;

/* loaded from: classes8.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.g1 f388079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f388080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kc2.w1 f388081f;

    public z0(kc2.g1 g1Var, java.lang.String str, kc2.w1 w1Var) {
        this.f388079d = g1Var;
        this.f388080e = str;
        this.f388081f = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kc2.g1 g1Var = this.f388079d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6819xdc8f711b c6819xdc8f711b = g1Var.f387933x;
        if (c6819xdc8f711b != null) {
            java.lang.String str = this.f388080e;
            kc2.w1 w1Var = this.f388081f;
            kc2.q f17 = g1Var.f();
            kc2.g a17 = kc2.g.f387896e.a(str);
            int i17 = w1Var.f388050d;
            f17.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.util.List<kc2.g> labelBusiness = f17.f388010h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(labelBusiness, "labelBusiness");
            synchronized (labelBusiness) {
                for (kc2.g gVar : labelBusiness) {
                    jSONObject.put(java.lang.String.valueOf(gVar.f387908d), gVar == a17 ? i17 : 0);
                }
            }
            c6819xdc8f711b.f141433d = c6819xdc8f711b.b("label_info", kc2.l1.e(jSONObject), true);
            c6819xdc8f711b.k();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderKaraInfoManager", "report but pendingReportData is null!");
        }
        this.f388079d.f387933x = null;
    }
}
