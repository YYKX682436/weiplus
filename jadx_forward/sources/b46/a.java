package b46;

/* loaded from: classes13.dex */
public class a extends a46.b {

    /* renamed from: e, reason: collision with root package name */
    public final org.brotli.dec.BrotliInputStream f99358e;

    public a(java.io.InputStream inputStream) {
        this.f99358e = new org.brotli.dec.BrotliInputStream(new r46.g(inputStream));
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f99358e.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f99358e.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i17) {
        this.f99358e.mark(i17);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f99358e.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.f99358e.read(bArr);
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f99358e.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        return r46.h.b(this.f99358e, j17);
    }

    /* renamed from: toString */
    public java.lang.String m9821x9616526c() {
        return this.f99358e.toString();
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f99358e.read();
        a(read == -1 ? 0 : 1);
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int read = this.f99358e.read(bArr, i17, i18);
        a(read);
        return read;
    }
}
