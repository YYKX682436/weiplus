package cc2;

/* loaded from: classes3.dex */
public final class c implements pq.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f122008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ce0 f122009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gk2.e f122010c;

    public c(java.lang.ref.WeakReference weakReference, r45.ce0 ce0Var, gk2.e eVar) {
        this.f122008a = weakReference;
        this.f122009b = ce0Var;
        this.f122010c = eVar;
    }

    @Override // pq.b
    public void a(java.lang.Object appBundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBundle, "appBundle");
        android.content.Context context = (android.content.Context) this.f122008a.get();
        if (!(appBundle instanceof l81.b1) || context == null) {
            return;
        }
        l81.b1 b1Var = (l81.b1) appBundle;
        b1Var.f398565k = 1177;
        r45.ce0 page = this.f122009b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        android.content.res.Resources resources = context.getResources();
        boolean z17 = page.m75939xb282bd08(5) == 1;
        float f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation == 2) {
            f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        }
        b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, (int) ((ae2.in.f85221a.h0() / 100.0f) * f17), k91.s2.f387294e, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.z_), true, true, false, false, 24, null), true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig(context.getClass().getName(), k91.s2.f387293d), z17 ? k91.t2.f387300e : k91.t2.f387301f, false, z17, null, k91.y2.f387360d, !z17, true, null, true, 0, null, 0, 0, 0, false, false, false, null, false, zl2.q4.f555466a.h(page), (int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1), false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -469810176, 2047, null);
        mm2.f6 f6Var = (mm2.f6) this.f122010c.a(mm2.f6.class);
        java.lang.String appId = b1Var.f398547b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
        f6Var.A = appId;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5) ((s40.a1) i95.n0.c(s40.a1.class))).Ai(b1Var);
    }
}
