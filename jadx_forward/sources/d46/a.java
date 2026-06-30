package d46;

/* loaded from: classes13.dex */
public class a extends a46.b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f307999g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.InputStream f308000e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.zip.Inflater f308001f;

    public a(java.io.InputStream inputStream) {
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(false);
        this.f308001f = inflater;
        this.f308000e = new java.util.zip.InflaterInputStream(new r46.g(inputStream), inflater);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f308000e.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.util.zip.Inflater inflater = this.f308001f;
        try {
            this.f308000e.close();
        } finally {
            inflater.end();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f308000e.read();
        a(read == -1 ? 0 : 1);
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        return r46.h.b(this.f308000e, j17);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        int read = this.f308000e.read(bArr, i17, i18);
        a(read);
        return read;
    }
}
