package x36;

/* loaded from: classes16.dex */
public abstract class p implements x36.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.f0 f533233d;

    public p(x36.f0 delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f533233d = delegate;
    }

    @Override // x36.f0
    public void U(x36.k source, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f533233d.U(source, j17);
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f533233d.close();
    }

    @Override // x36.f0, java.io.Flushable
    public void flush() {
        this.f533233d.flush();
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f533233d.h();
    }

    /* renamed from: toString */
    public java.lang.String m174977x9616526c() {
        return getClass().getSimpleName() + '(' + this.f533233d + ')';
    }
}
