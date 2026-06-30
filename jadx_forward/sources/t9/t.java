package t9;

/* loaded from: classes7.dex */
public final class t extends java.io.BufferedOutputStream {

    /* renamed from: d, reason: collision with root package name */
    public boolean f498080d;

    public void a(java.io.OutputStream outputStream) {
        t9.a.d(this.f498080d);
        ((java.io.BufferedOutputStream) this).out = outputStream;
        ((java.io.BufferedOutputStream) this).count = 0;
        this.f498080d = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f498080d = true;
        try {
            flush();
            th = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            ((java.io.BufferedOutputStream) this).out.close();
        } catch (java.lang.Throwable th7) {
            if (th == null) {
                th = th7;
            }
        }
        if (th == null) {
            return;
        }
        int i17 = t9.d0.f498031a;
        throw th;
    }
}
