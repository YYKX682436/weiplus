package u95;

/* loaded from: classes12.dex */
public class a extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.RandomAccessFile f507420d;

    /* renamed from: e, reason: collision with root package name */
    public long f507421e;

    /* renamed from: f, reason: collision with root package name */
    public long f507422f;

    /* renamed from: g, reason: collision with root package name */
    public long f507423g;

    /* renamed from: h, reason: collision with root package name */
    public final long f507424h;

    public a(java.io.File file) {
        long length = file.length();
        this.f507421e = -1L;
        this.f507420d = new java.io.RandomAccessFile(file, "r");
        this.f507424h = file.length();
        a(0L, length);
    }

    public void a(long j17, long j18) {
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("rangeOffset must be >= 0");
        }
        if (j18 < 0) {
            throw new java.lang.IllegalArgumentException("rangeLength must be >= 0");
        }
        long j19 = j17 + j18;
        if (j19 > this.f507424h) {
            throw new java.lang.IllegalArgumentException("Read range exceeds file length");
        }
        if (j19 < 0) {
            throw new java.lang.IllegalArgumentException("Insane input size not supported");
        }
        this.f507422f = j17;
        this.f507423g = j18;
        this.f507421e = j17;
        reset();
        this.f507421e = -1L;
    }

    @Override // java.io.InputStream
    public int available() {
        long filePointer = this.f507423g - (this.f507420d.getFilePointer() - this.f507422f);
        if (filePointer > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) filePointer;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f507420d.close();
    }

    @Override // java.io.InputStream
    public void mark(int i17) {
        try {
            this.f507421e = this.f507420d.getFilePointer();
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        return this.f507420d.read();
    }

    @Override // java.io.InputStream
    public void reset() {
        long j17 = this.f507421e;
        if (j17 < 0) {
            throw new java.io.IOException("mark not set");
        }
        this.f507420d.seek(j17);
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        int available;
        if (j17 <= 0 || (available = available()) <= 0) {
            return 0L;
        }
        int min = (int) java.lang.Math.min(available, j17);
        java.io.RandomAccessFile randomAccessFile = this.f507420d;
        long j18 = min;
        randomAccessFile.seek(randomAccessFile.getFilePointer() + j18);
        return j18;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 <= 0) {
            return 0;
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        return this.f507420d.read(bArr, i17, java.lang.Math.min(i18, available));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
