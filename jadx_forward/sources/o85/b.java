package o85;

/* loaded from: classes7.dex */
public final class b extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.InputStream f425205d;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f425206e;

    public b(java.io.InputStream delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f425205d = delegate;
        this.f425206e = 1073741824;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f425206e;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f425205d.close();
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f425205d.read();
        if (read == -1) {
            this.f425206e = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        return this.f425205d.skip(j17);
    }

    @Override // java.io.InputStream
    public int read(byte[] b17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b17, "b");
        int read = this.f425205d.read(b17);
        if (read == -1) {
            this.f425206e = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] b17, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b17, "b");
        int read = this.f425205d.read(b17, i17, i18);
        if (read == -1) {
            this.f425206e = 0;
        }
        return read;
    }
}
