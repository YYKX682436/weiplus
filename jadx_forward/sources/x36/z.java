package x36;

/* loaded from: classes16.dex */
public final class z implements x36.l {

    /* renamed from: d, reason: collision with root package name */
    public final x36.k f533256d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f533257e;

    /* renamed from: f, reason: collision with root package name */
    public final x36.f0 f533258f;

    public z(x36.f0 sink) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        this.f533258f = sink;
        this.f533256d = new x36.k();
    }

    @Override // x36.l
    public x36.l F0(java.lang.String string) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(string, "string");
        if (!(!this.f533257e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f533256d.O(string);
        z0();
        return this;
    }

    @Override // x36.l
    public x36.l G(long j17) {
        if (!(!this.f533257e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f533256d.G(j17);
        z0();
        return this;
    }

    @Override // x36.f0
    public void U(x36.k source, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (!(!this.f533257e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f533256d.U(source, j17);
        z0();
    }

    public x36.l a(byte[] source, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (!(!this.f533257e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f533256d.A(source, i17, i18);
        z0();
        return this;
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        x36.f0 f0Var = this.f533258f;
        if (this.f533257e) {
            return;
        }
        try {
            x36.k kVar = this.f533256d;
            long j17 = kVar.f533227e;
            if (j17 > 0) {
                f0Var.U(kVar, j17);
            }
            th = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            f0Var.close();
        } catch (java.lang.Throwable th7) {
            if (th == null) {
                th = th7;
            }
        }
        this.f533257e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // x36.l
    public x36.l e(int i17) {
        if (!(!this.f533257e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f533256d.F(i17);
        z0();
        return this;
    }

    @Override // x36.l, x36.f0, java.io.Flushable
    public void flush() {
        if (!(!this.f533257e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        x36.k kVar = this.f533256d;
        long j17 = kVar.f533227e;
        x36.f0 f0Var = this.f533258f;
        if (j17 > 0) {
            f0Var.U(kVar, j17);
        }
        f0Var.flush();
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f533258f.h();
    }

    @Override // x36.l
    public x36.l i0(long j17) {
        if (!(!this.f533257e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f533256d.i0(j17);
        return z0();
    }

    @Override // x36.l
    public x36.l i1(int i17) {
        if (!(!this.f533257e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f533256d.N(i17);
        z0();
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f533257e;
    }

    @Override // x36.l
    public x36.k m() {
        return this.f533256d;
    }

    @Override // x36.l
    public x36.l o(int i17) {
        if (!(!this.f533257e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f533256d.K(i17);
        return z0();
    }

    /* renamed from: toString */
    public java.lang.String m174982x9616526c() {
        return "buffer(" + this.f533258f + ')';
    }

    @Override // x36.l
    public x36.l w0() {
        if (!(!this.f533257e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        x36.k kVar = this.f533256d;
        long j17 = kVar.f533227e;
        if (j17 > 0) {
            this.f533258f.U(kVar, j17);
        }
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (!this.f533257e) {
            int write = this.f533256d.write(source);
            z0();
            return write;
        }
        throw new java.lang.IllegalStateException("closed".toString());
    }

    @Override // x36.l
    public x36.l z0() {
        if (!(!this.f533257e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        x36.k kVar = this.f533256d;
        long a17 = kVar.a();
        if (a17 > 0) {
            this.f533258f.U(kVar, a17);
        }
        return this;
    }

    @Override // x36.l
    /* renamed from: write */
    public x36.l mo174975x6c257df(byte[] source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (!this.f533257e) {
            this.f533256d.z(source);
            z0();
            return this;
        }
        throw new java.lang.IllegalStateException("closed".toString());
    }
}
