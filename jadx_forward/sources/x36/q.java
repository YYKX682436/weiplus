package x36;

/* loaded from: classes14.dex */
public abstract class q implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.h0 f533234d;

    public q(x36.h0 delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f533234d = delegate;
    }

    @Override // x36.h0
    public long B(x36.k sink, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        return this.f533234d.B(sink, j17);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f533234d.close();
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f533234d.h();
    }

    /* renamed from: toString */
    public java.lang.String m174978x9616526c() {
        return getClass().getSimpleName() + '(' + this.f533234d + ')';
    }
}
