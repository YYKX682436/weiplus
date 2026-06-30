package cc2;

/* loaded from: classes3.dex */
public final class b implements pq.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f122001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f122002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.ce0 f122003c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f122004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f122005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f122006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122007g;

    public b(java.lang.ref.WeakReference weakReference, cm2.m0 m0Var, r45.ce0 ce0Var, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, gk2.e eVar, java.lang.String str) {
        this.f122001a = weakReference;
        this.f122002b = m0Var;
        this.f122003c = ce0Var;
        this.f122004d = z17;
        this.f122005e = f0Var;
        this.f122006f = eVar;
        this.f122007g = str;
    }

    @Override // pq.b
    public void a(java.lang.Object appBundle) {
        boolean z17;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBundle, "appBundle");
        android.content.Context context = (android.content.Context) this.f122001a.get();
        if (!(appBundle instanceof l81.b1) || context == null) {
            return;
        }
        cm2.m0 data = this.f122002b;
        r45.ce0 ce0Var = this.f122003c;
        boolean z18 = this.f122004d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.content.res.Resources resources = context.getResources();
        float f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation == 2) {
            f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        }
        int h07 = (int) ((ae2.in.f85221a.h0() / 100.0f) * f17);
        k91.s2 s2Var = k91.s2.f387293d;
        k91.t2 t2Var = z18 ? k91.t2.f387300e : k91.t2.f387301f;
        boolean z19 = !z18;
        k91.y2 y2Var = k91.y2.f387360d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo h17 = zl2.q4.f555466a.h(ce0Var);
        int dimension = (int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
        if (ce0Var != null) {
            z17 = ce0Var.m75939xb282bd08(6) == 1;
        } else {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, h07, s2Var, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.z_), true, true, false, false, 24, null), true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig(context.getClass().getName(), s2Var), t2Var, true, z18, null, y2Var, z19, false, null, true, 0, null, 0, 0, 0, !(ce0Var != null && ce0Var.m75933x41a8a7f2(8)), false, false, null, false, h17, dimension, z17, null, true, 0, false, z19, false, false, null, null, null, false, null, null, false, -1545640960, 2045, null);
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (r4Var.D1(data.f124901v)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l e17 = c11816x5915d2c1.e();
            i17 = 1;
            e17.f159067n = true;
            e17.f159064k = k91.t2.f387300e;
            c11816x5915d2c1 = e17.a();
        } else {
            i17 = 1;
        }
        l81.b1 b1Var = (l81.b1) appBundle;
        b1Var.G = c11816x5915d2c1;
        if (r4Var.D1(this.f122002b.f124901v)) {
            b1Var.Z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573016m81);
        }
        b1Var.f398565k = this.f122005e.f391649d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        cm2.m0 m0Var = this.f122002b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String m75945x2fec8307 = m0Var.f124901v.m75945x2fec8307(26);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        jSONObject.put("cookies", m75945x2fec8307);
        c11812xa040dc98.f158855d = i17;
        c11812xa040dc98.f158858g = jSONObject.toString();
        b1Var.f398574s = c11812xa040dc98;
        r45.hd5 hd5Var = (r45.hd5) this.f122002b.f124901v.m75936x14adae67(24);
        if (hd5Var != null) {
            if (((hd5Var.m75939xb282bd08(5) == 100 || hd5Var.m75939xb282bd08(5) == 2) ? i17 : 0) == 0) {
                hd5Var = null;
            }
            if (hd5Var != null) {
                long m75942xfb822ef2 = hd5Var.m75942xfb822ef2(4);
                gk2.e eVar = this.f122006f;
                cm2.m0 m0Var2 = this.f122002b;
                java.lang.String str = this.f122007g;
                b1Var.V = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.s8.class;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("finder_username", ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
                jSONObject2.put("productId", m0Var2.f124901v.m75942xfb822ef2(0));
                jSONObject2.put("replayId", m75942xfb822ef2);
                jSONObject2.put("session", str);
                jSONObject2.put("jumpId", m0Var2.f124920f);
                b1Var.W = jSONObject2.toString();
            }
        }
    }
}
