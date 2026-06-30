package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes5.dex */
public final class e implements java.io.Closeable, p3325xe03a0797.p3326xc267989b.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f93153d;

    public e(oz5.l context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f93153d = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p3325xe03a0797.p3326xc267989b.v2.c(this.f93153d, null, 1, null);
    }

    @Override // p3325xe03a0797.p3326xc267989b.y0
    /* renamed from: getCoroutineContext */
    public oz5.l mo7786x54170f2d() {
        return this.f93153d;
    }
}
