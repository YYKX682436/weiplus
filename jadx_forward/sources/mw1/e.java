package mw1;

/* loaded from: classes14.dex */
public final class e implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f413229d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.ArrayMap f413230e;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.ArrayMap f413231f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f413232g;

    public e(p3325xe03a0797.p3326xc267989b.y0 glScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(glScope, "glScope");
        this.f413229d = glScope;
        this.f413230e = new android.util.ArrayMap();
        this.f413231f = new android.util.ArrayMap();
    }

    public final synchronized mw1.b a(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return (mw1.b) this.f413230e.get(key);
    }

    public final void b(mw1.b renderTarget) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f413229d;
        lw1.l lVar = lw1.m.f403093e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderTarget, "renderTarget");
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, new lw1.m(new lw1.h(renderTarget)), null, new mw1.d(renderTarget, null), 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f413232g = true;
        this.f413231f.clear();
        this.f413230e.clear();
    }
}
