package x36;

/* loaded from: classes16.dex */
public final class x implements x36.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.OutputStream f533248d;

    /* renamed from: e, reason: collision with root package name */
    public final x36.j0 f533249e;

    public x(java.io.OutputStream out, x36.j0 timeout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeout, "timeout");
        this.f533248d = out;
        this.f533249e = timeout;
    }

    @Override // x36.f0
    public void U(x36.k source, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        x36.b.b(source.f533227e, 0L, j17);
        while (j17 > 0) {
            this.f533249e.f();
            x36.c0 c0Var = source.f533226d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
            int min = (int) java.lang.Math.min(j17, c0Var.f533192c - c0Var.f533191b);
            this.f533248d.write(c0Var.f533190a, c0Var.f533191b, min);
            int i17 = c0Var.f533191b + min;
            c0Var.f533191b = i17;
            long j18 = min;
            j17 -= j18;
            source.f533227e -= j18;
            if (i17 == c0Var.f533192c) {
                source.f533226d = c0Var.a();
                x36.d0.a(c0Var);
            }
        }
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f533248d.close();
    }

    @Override // x36.f0, java.io.Flushable
    public void flush() {
        this.f533248d.flush();
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f533249e;
    }

    /* renamed from: toString */
    public java.lang.String m174981x9616526c() {
        return "sink(" + this.f533248d + ')';
    }
}
