package yz1;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f550023a;

    /* renamed from: b, reason: collision with root package name */
    public byte f550024b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f550025c;

    /* renamed from: d, reason: collision with root package name */
    public long f550026d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f550027e;

    public static byte a(java.io.InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return (byte) read;
        }
        throw new java.io.EOFException();
    }

    public void b(java.io.BufferedOutputStream bufferedOutputStream) {
        bufferedOutputStream.write((byte) ((this.f550023a ? (byte) 128 : (byte) 0) | (this.f550024b & 15)));
        long j17 = this.f550026d;
        byte[] bArr = j17 <= 125 ? new byte[]{(byte) j17} : j17 <= 65535 ? new byte[]{126, (byte) ((j17 >> 8) & 255), (byte) (j17 & 255)} : new byte[]{Byte.MAX_VALUE, (byte) ((j17 >> 56) & 255), (byte) ((j17 >> 48) & 255), (byte) ((j17 >> 40) & 255), (byte) ((j17 >> 32) & 255), (byte) ((j17 >> 24) & 255), (byte) ((j17 >> 16) & 255), (byte) ((j17 >> 8) & 255), (byte) (j17 & 255)};
        if (this.f550025c) {
            bArr[0] = (byte) (128 | bArr[0]);
        }
        bufferedOutputStream.write(bArr, 0, bArr.length);
        if (this.f550025c) {
            throw new java.lang.UnsupportedOperationException("Writing masked data not implemented");
        }
        bufferedOutputStream.write(this.f550027e, 0, (int) this.f550026d);
    }
}
