package b46;

/* loaded from: classes13.dex */
public class a extends a46.b {

    /* renamed from: e, reason: collision with root package name */
    public final org.brotli.dec.BrotliInputStream f17825e;

    public a(java.io.InputStream inputStream) {
        this.f17825e = new org.brotli.dec.BrotliInputStream(new r46.g(inputStream));
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f17825e.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17825e.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i17) {
        this.f17825e.mark(i17);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f17825e.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.f17825e.read(bArr);
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f17825e.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        return r46.h.b(this.f17825e, j17);
    }

    public java.lang.String toString() {
        return this.f17825e.toString();
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f17825e.read();
        a(read == -1 ? 0 : 1);
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int read = this.f17825e.read(bArr, i17, i18);
        a(read);
        return read;
    }
}
