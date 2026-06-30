package gj3;

/* loaded from: classes14.dex */
public final class h implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f353925d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public boolean f353926e = true;

    /* renamed from: f, reason: collision with root package name */
    public final ij3.f f353927f;

    /* renamed from: g, reason: collision with root package name */
    public final nj3.j f353928g;

    /* renamed from: h, reason: collision with root package name */
    public final nj3.b f353929h;

    /* renamed from: i, reason: collision with root package name */
    public final jj3.j f353930i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f353931m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f353932n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f353933o;

    public h() {
        rs0.h hVar;
        ij3.f fVar = new ij3.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "create new worker");
        fj3.f fVar2 = new fj3.f(0, 1, null);
        fj3.f fVar3 = fVar.f373237e;
        android.opengl.EGLContext eGLContext = (fVar3 == null || (hVar = fVar3.f344736e) == null || (eGLContext = hVar.f480827c) == null) ? android.opengl.EGL14.EGL_NO_CONTEXT : eGLContext;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar2.f344732a, "bindGLEnvironment");
        ((android.os.HandlerThread) ((jz5.n) fVar2.f344734c).mo141623x754a37bb()).start();
        ((android.os.Handler) ((jz5.n) fVar2.f344735d).mo141623x754a37bb()).post(new fj3.b(fVar2, eGLContext));
        fVar.f373237e = fVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "create main GLThread");
        b(this, fVar, null, 1, 1, null);
        this.f353927f = fVar;
        nj3.j jVar = new nj3.j(fVar);
        b(this, jVar, fVar.mo7096x348d9a(ij3.m.f373246f), 0, 2, null);
        this.f353928g = jVar;
        nj3.b bVar = new nj3.b();
        b(this, bVar, null, 0, 3, null);
        this.f353929h = bVar;
        jj3.j jVar2 = new jj3.j(p3325xe03a0797.p3326xc267989b.z0.a(fVar.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null))));
        b(this, jVar2, null, 0, 3, null);
        this.f353930i = jVar2;
        this.f353931m = jz5.h.b(new gj3.e(this));
        this.f353932n = jz5.h.b(new gj3.g(this));
        this.f353933o = jz5.h.b(new gj3.f(this));
    }

    public static java.lang.Object b(gj3.h hVar, java.lang.Object obj, oz5.l lVar, int i17, int i18, java.lang.Object obj2) {
        if ((i18 & 1) != 0) {
            lVar = null;
        }
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        hVar.getClass();
        if ((obj instanceof java.io.Closeable ? (java.io.Closeable) obj : null) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MTRContext", "register " + obj);
            hVar.f353925d.add(new gj3.b((java.io.Closeable) obj, lVar, i17));
        }
        return obj;
    }

    public final fj3.k a() {
        return (fj3.k) ((jz5.n) this.f353932n).mo141623x754a37bb();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MTRContext", "close");
        this.f353926e = false;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new gj3.d(this, null), 3, null);
    }
}
