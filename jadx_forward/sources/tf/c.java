package tf;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final eg.a f500320a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x0 f500321b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f500322c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f500323d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f500324e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f500325f = false;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.f0 f500326g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w f500327h = null;

    public c(eg.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x0 x0Var) {
        this.f500320a = aVar;
        this.f500321b = x0Var;
    }

    public abstract void a(java.lang.String str, sf.f fVar);

    public abstract boolean b();

    public void c(sf.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var;
        if (this.f500322c != null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = fVar.m();
        if (m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
            v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) m17;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "setPageView, component(" + m17 + ") is not AppBrandPageView");
            if (!(m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "setPageView, component(" + m17 + ") is not AppBrandService");
                return;
            }
            v5Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) m17).V0();
        }
        if (!this.f500325f) {
            if (this.f500326g == null) {
                this.f500326g = new tf.a(this);
                this.f500327h = new tf.b(this);
            }
            android.app.Activity v17 = v5Var.v1();
            if (v17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "listenOrientationChanged, null == activity");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.e0 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.e0.b(v17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.f0 orientationObserver = this.f500326g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orientationObserver, "orientationObserver");
                b17.a(true);
                ((java.util.concurrent.CopyOnWriteArrayList) b17.f169119f).add(orientationObserver);
                v5Var.w(this.f500327h);
                this.f500325f = true;
            }
        }
        this.f500322c = new java.lang.ref.WeakReference(v5Var);
    }
}
