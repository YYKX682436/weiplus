package o46;

/* loaded from: classes13.dex */
public class a extends a46.b {

    /* renamed from: e, reason: collision with root package name */
    public final com.github.luben.zstd.ZstdInputStream f424581e;

    public a(java.io.InputStream inputStream) {
        this.f424581e = new com.github.luben.zstd.ZstdInputStream(new r46.g(inputStream));
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f424581e.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f424581e.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i17) {
        this.f424581e.mark(i17);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f424581e.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f424581e.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        return r46.h.b(this.f424581e, j17);
    }

    /* renamed from: toString */
    public java.lang.String m150636x9616526c() {
        return this.f424581e.toString();
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f424581e.read();
        a(read == -1 ? 0 : 1);
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        int read = this.f424581e.read(bArr, i17, i18);
        a(read);
        return read;
    }
}
