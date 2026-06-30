package n36;

/* loaded from: classes16.dex */
public abstract class l extends x36.p {

    /* renamed from: e, reason: collision with root package name */
    public boolean f416388e;

    @Override // x36.p, x36.f0
    public void U(x36.k kVar, long j17) {
        if (this.f416388e) {
            kVar.mo174960x35e57f(j17);
            return;
        }
        try {
            super.U(kVar, j17);
        } catch (java.io.IOException e17) {
            this.f416388e = true;
            a(e17);
        }
    }

    public abstract void a(java.io.IOException iOException);

    @Override // x36.p, x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f416388e) {
            return;
        }
        try {
            super.close();
        } catch (java.io.IOException e17) {
            this.f416388e = true;
            a(e17);
        }
    }

    @Override // x36.p, x36.f0, java.io.Flushable
    public void flush() {
        if (this.f416388e) {
            return;
        }
        try {
            super.flush();
        } catch (java.io.IOException e17) {
            this.f416388e = true;
            a(e17);
        }
    }
}
