package nf;

/* loaded from: classes7.dex */
public class a extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.nio.ByteBuffer f418105d;

    /* renamed from: e, reason: collision with root package name */
    public int f418106e;

    public a(java.nio.ByteBuffer byteBuffer) {
        this.f418105d = byteBuffer;
    }

    public static void a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.getClass().getName().equals("java.nio.DirectByteBuffer")) {
            try {
                d56.b.h(d56.b.h(byteBuffer).b("cleaner", new java.lang.Object[0]).f308165b).b("clean", new java.lang.Object[0]);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f418105d.remaining();
    }

    public synchronized void b(int i17) {
        this.f418105d.position(i17);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        a(this.f418105d);
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i17) {
        this.f418106e = this.f418105d.position();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        java.nio.ByteBuffer byteBuffer = this.f418105d;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f418105d.position(this.f418106e);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        java.nio.ByteBuffer byteBuffer = this.f418105d;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = java.lang.Math.min(i18, byteBuffer.remaining());
        byteBuffer.get(bArr, i17, min);
        return min;
    }
}
