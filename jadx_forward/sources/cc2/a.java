package cc2;

/* loaded from: classes3.dex */
public final class a implements pq.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f121996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f121997b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.ce0 f121998c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f121999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122000e;

    public a(java.lang.ref.WeakReference weakReference, cm2.m0 m0Var, r45.ce0 ce0Var, gk2.e eVar, java.lang.String str) {
        this.f121996a = weakReference;
        this.f121997b = m0Var;
        this.f121998c = ce0Var;
        this.f121999d = eVar;
        this.f122000e = str;
    }

    @Override // pq.b
    public void a(java.lang.Object appBundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBundle, "appBundle");
        android.content.Context context = (android.content.Context) this.f121996a.get();
        if (!(appBundle instanceof l81.b1) || context == null) {
            return;
        }
        cm2.m0 data = this.f121997b;
        r45.ce0 ce0Var = this.f121998c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.content.res.Resources resources = context.getResources();
        float f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation == 2) {
            f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        }
        int h07 = (int) ((ae2.in.f85221a.h0() / 100.0f) * f17);
        k91.s2 s2Var = k91.s2.f387294e;
        k91.t2 t2Var = k91.t2.f387301f;
        k91.y2 y2Var = k91.y2.f387361e;
        r45.ce0 ce0Var2 = data.E;
        l81.b1 b1Var = (l81.b1) appBundle;
        b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, h07, s2Var, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.z_), true, true, false, false, 24, null), true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig(context.getClass().getName(), k91.s2.f387293d), t2Var, false, false, null, y2Var, ce0Var2 != null && ce0Var2.m75939xb282bd08(5) == 1, false, null, true, 0, null, 0, 0, 0, false, false, false, null, false, zl2.q4.f555466a.h(ce0Var), (int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1), false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -201366272, 2047, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        cm2.m0 m0Var = this.f121997b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String m75945x2fec8307 = m0Var.f124901v.m75945x2fec8307(26);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        jSONObject.put("cookies", m75945x2fec8307);
        c11812xa040dc98.f158855d = 1;
        c11812xa040dc98.f158858g = jSONObject.toString();
        b1Var.f398574s = c11812xa040dc98;
        cc2.d dVar = cc2.d.f122011a;
        gk2.e eVar = this.f121999d;
        java.lang.String str = this.f122000e;
        java.lang.String appId = b1Var.f398547b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
        dVar.b(eVar, str, appId);
        mm2.f6 f6Var = (mm2.f6) this.f121999d.a(mm2.f6.class);
        java.lang.String appId2 = b1Var.f398547b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId2, "appId");
        f6Var.A = appId2;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5) ((s40.a1) i95.n0.c(s40.a1.class))).Ai(b1Var);
    }
}
