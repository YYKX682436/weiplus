package x36;

/* loaded from: classes16.dex */
public final class u implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.InputStream f533245d;

    /* renamed from: e, reason: collision with root package name */
    public final x36.j0 f533246e;

    public u(java.io.InputStream input, x36.j0 timeout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeout, "timeout");
        this.f533245d = input;
        this.f533246e = timeout;
    }

    @Override // x36.h0
    public long B(x36.k sink, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        if (j17 == 0) {
            return 0L;
        }
        if (!(j17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j17).toString());
        }
        try {
            this.f533246e.f();
            x36.c0 w17 = sink.w(1);
            int read = this.f533245d.read(w17.f533190a, w17.f533192c, (int) java.lang.Math.min(j17, 8192 - w17.f533192c));
            if (read != -1) {
                w17.f533192c += read;
                long j18 = read;
                sink.f533227e += j18;
                return j18;
            }
            if (w17.f533191b != w17.f533192c) {
                return -1L;
            }
            sink.f533226d = w17.a();
            x36.d0.a(w17);
            return -1L;
        } catch (java.lang.AssertionError e17) {
            if (x36.v.c(e17)) {
                throw new java.io.IOException(e17);
            }
            throw e17;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f533245d.close();
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f533246e;
    }

    /* renamed from: toString */
    public java.lang.String m174979x9616526c() {
        return "source(" + this.f533245d + ')';
    }
}
