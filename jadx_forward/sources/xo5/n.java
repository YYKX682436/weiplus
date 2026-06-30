package xo5;

/* loaded from: classes14.dex */
public final class n implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f537326d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final yo5.e f537327e;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f537328f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f537329g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f537330h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f537331i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f537332m;

    /* renamed from: n, reason: collision with root package name */
    public final cp5.j f537333n;

    /* renamed from: o, reason: collision with root package name */
    public final cp5.b f537334o;

    /* renamed from: p, reason: collision with root package name */
    public final bp5.k f537335p;

    public n() {
        yo5.e eVar = new yo5.e(0, "gl_main", 1, null);
        eVar.N(android.opengl.EGL14.EGL_NO_CONTEXT);
        b(this, eVar, null, 1, 1, null);
        this.f537327e = eVar;
        p3325xe03a0797.p3326xc267989b.y0 a17 = p3325xe03a0797.p3326xc267989b.z0.a(eVar.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.f537328f = a17;
        jz5.i iVar = jz5.i.f384363e;
        this.f537329g = jz5.h.a(iVar, new xo5.i(this));
        this.f537330h = jz5.h.a(iVar, new xo5.j(this));
        this.f537331i = jz5.h.a(iVar, new xo5.l(this));
        this.f537332m = jz5.h.a(iVar, new xo5.m(this));
        cp5.j jVar = new cp5.j(eVar);
        a(jVar, eVar, 0);
        this.f537333n = jVar;
        cp5.b bVar = new cp5.b();
        b(this, bVar, null, 0, 1, null);
        this.f537334o = bVar;
        bp5.k kVar = new bp5.k(a17);
        b(this, kVar, null, 0, 1, null);
        this.f537335p = kVar;
    }

    public static /* synthetic */ java.lang.Object b(xo5.n nVar, java.lang.Object obj, oz5.l lVar, int i17, int i18, java.lang.Object obj2) {
        if ((i18 & 1) != 0) {
            lVar = null;
        }
        if ((i18 & 2) != 0) {
            i17 = 1;
        }
        nVar.a(obj, lVar, i17);
        return obj;
    }

    public final java.lang.Object a(java.lang.Object obj, oz5.l lVar, int i17) {
        if ((obj instanceof java.io.Closeable ? (java.io.Closeable) obj : null) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.RenderComponentManager", "register " + obj);
            this.f537326d.add(new xo5.b((java.io.Closeable) obj, lVar, i17));
        }
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.RenderComponentManager", "close");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new xo5.g(this, null), 3, null);
    }
}
