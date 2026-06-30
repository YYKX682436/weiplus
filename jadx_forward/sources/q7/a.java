package q7;

/* loaded from: classes7.dex */
public class a extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.nio.ByteBuffer f441818d;

    /* renamed from: e, reason: collision with root package name */
    public int f441819e = -1;

    public a(java.nio.ByteBuffer byteBuffer) {
        this.f441818d = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f441818d.remaining();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i17) {
        this.f441819e = this.f441818d.position();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        java.nio.ByteBuffer byteBuffer = this.f441818d;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        int i17 = this.f441819e;
        if (i17 == -1) {
            throw new java.io.IOException("Cannot reset to unset mark position");
        }
        this.f441818d.position(i17);
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        java.nio.ByteBuffer byteBuffer = this.f441818d;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long min = java.lang.Math.min(j17, available());
        byteBuffer.position((int) (byteBuffer.position() + min));
        return min;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        java.nio.ByteBuffer byteBuffer = this.f441818d;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = java.lang.Math.min(i18, available());
        byteBuffer.get(bArr, i17, min);
        return min;
    }
}
