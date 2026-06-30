package i46;

/* loaded from: classes13.dex */
public class a extends a46.b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f369954f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.InputStream f369955e;

    public a(java.io.InputStream inputStream, int i17) {
        try {
            this.f369955e = new org.tukaani.xz.LZMAInputStream(new r46.g(inputStream), i17);
        } catch (org.tukaani.xz.MemoryLimitException e17) {
            throw new z36.a(e17.getMemoryNeeded(), e17.getMemoryLimit(), e17);
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f369955e.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f369955e.close();
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f369955e.read();
        a(read == -1 ? 0 : 1);
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        return r46.h.b(this.f369955e, j17);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        int read = this.f369955e.read(bArr, i17, i18);
        a(read);
        return read;
    }
}
