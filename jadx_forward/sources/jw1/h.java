package jw1;

/* loaded from: classes14.dex */
public final class h implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f383835d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public boolean f383836e = true;

    /* renamed from: f, reason: collision with root package name */
    public final lw1.f f383837f;

    /* renamed from: g, reason: collision with root package name */
    public final qw1.j f383838g;

    /* renamed from: h, reason: collision with root package name */
    public final qw1.b f383839h;

    /* renamed from: i, reason: collision with root package name */
    public final mw1.e f383840i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f383841m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f383842n;

    public h() {
        rs0.h hVar;
        lw1.f fVar = new lw1.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "create new worker");
        iw1.f fVar2 = new iw1.f(0, 1, null);
        iw1.f fVar3 = fVar.f403085e;
        android.opengl.EGLContext eGLContext = (fVar3 == null || (hVar = fVar3.f376741e) == null || (eGLContext = hVar.f480827c) == null) ? android.opengl.EGL14.EGL_NO_CONTEXT : eGLContext;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar2.f376737a, "bindGLEnvironment");
        ((android.os.HandlerThread) ((jz5.n) fVar2.f376739c).mo141623x754a37bb()).start();
        ((android.os.Handler) ((jz5.n) fVar2.f376740d).mo141623x754a37bb()).post(new iw1.b(fVar2, eGLContext));
        fVar.f403085e = fVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "create main GLThread");
        a(this, fVar, null, 1, 1, null);
        this.f383837f = fVar;
        qw1.j jVar = new qw1.j(fVar);
        a(this, jVar, fVar.mo7096x348d9a(lw1.m.f403094f), 0, 2, null);
        this.f383838g = jVar;
        qw1.b bVar = new qw1.b();
        a(this, bVar, null, 0, 3, null);
        this.f383839h = bVar;
        mw1.e eVar = new mw1.e(p3325xe03a0797.p3326xc267989b.z0.a(fVar.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null))));
        a(this, eVar, null, 0, 3, null);
        this.f383840i = eVar;
        this.f383841m = jz5.h.b(new jw1.e(this));
        this.f383842n = jz5.h.b(new jw1.g(this));
        jz5.h.b(new jw1.f(this));
    }

    public static java.lang.Object a(jw1.h hVar, java.lang.Object obj, oz5.l lVar, int i17, int i18, java.lang.Object obj2) {
        if ((i18 & 1) != 0) {
            lVar = null;
        }
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        hVar.getClass();
        if ((obj instanceof java.io.Closeable ? (java.io.Closeable) obj : null) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MTRContext", "register " + obj);
            hVar.f383835d.add(new jw1.b((java.io.Closeable) obj, lVar, i17));
        }
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MTRContext", "close");
        this.f383836e = false;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new jw1.d(this, null), 3, null);
    }
}
