package jj3;

/* loaded from: classes14.dex */
public final class j implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f381552d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.ArrayMap f381553e;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.ArrayMap f381554f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f381555g;

    public j(p3325xe03a0797.p3326xc267989b.y0 glScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(glScope, "glScope");
        this.f381552d = glScope;
        this.f381553e = new android.util.ArrayMap();
        this.f381554f = new android.util.ArrayMap();
    }

    public final void a(jj3.c renderTarget) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f381552d;
        ij3.l lVar = ij3.m.f373245e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderTarget, "renderTarget");
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, new ij3.m(new ij3.h(renderTarget)), null, new jj3.i(renderTarget, null), 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f381555g = true;
        this.f381554f.clear();
        this.f381553e.clear();
    }
}
