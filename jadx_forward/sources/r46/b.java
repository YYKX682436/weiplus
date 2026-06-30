package r46;

/* loaded from: classes13.dex */
public class b extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.InputStream f474033d;

    /* renamed from: e, reason: collision with root package name */
    public long f474034e;

    public b(java.io.InputStream inputStream, long j17) {
        this.f474033d = inputStream;
        this.f474034e = j17;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.InputStream
    public int read() {
        long j17 = this.f474034e;
        if (j17 <= 0) {
            return -1;
        }
        this.f474034e = j17 - 1;
        return this.f474033d.read();
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        long skip = this.f474033d.skip(java.lang.Math.min(this.f474034e, j17));
        this.f474034e -= skip;
        return skip;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        long j17 = this.f474034e;
        if (j17 == 0) {
            return -1;
        }
        if (i18 > j17) {
            i18 = (int) j17;
        }
        int read = this.f474033d.read(bArr, i17, i18);
        if (read >= 0) {
            this.f474034e -= read;
        }
        return read;
    }
}
