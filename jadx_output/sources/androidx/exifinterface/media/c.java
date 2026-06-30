package androidx.exifinterface.media;

/* loaded from: classes13.dex */
public class c extends java.io.FilterOutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.DataOutputStream f11182d;

    /* renamed from: e, reason: collision with root package name */
    public java.nio.ByteOrder f11183e;

    public c(java.io.OutputStream outputStream, java.nio.ByteOrder byteOrder) {
        super(outputStream);
        this.f11182d = new java.io.DataOutputStream(outputStream);
        this.f11183e = byteOrder;
    }

    public void a(int i17) {
        this.f11182d.write(i17);
    }

    public void b(int i17) {
        java.nio.ByteOrder byteOrder = this.f11183e;
        java.nio.ByteOrder byteOrder2 = java.nio.ByteOrder.LITTLE_ENDIAN;
        java.io.DataOutputStream dataOutputStream = this.f11182d;
        if (byteOrder == byteOrder2) {
            dataOutputStream.write((i17 >>> 0) & 255);
            dataOutputStream.write((i17 >>> 8) & 255);
            dataOutputStream.write((i17 >>> 16) & 255);
            dataOutputStream.write((i17 >>> 24) & 255);
            return;
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            dataOutputStream.write((i17 >>> 24) & 255);
            dataOutputStream.write((i17 >>> 16) & 255);
            dataOutputStream.write((i17 >>> 8) & 255);
            dataOutputStream.write((i17 >>> 0) & 255);
        }
    }

    public void c(short s17) {
        java.nio.ByteOrder byteOrder = this.f11183e;
        java.nio.ByteOrder byteOrder2 = java.nio.ByteOrder.LITTLE_ENDIAN;
        java.io.DataOutputStream dataOutputStream = this.f11182d;
        if (byteOrder == byteOrder2) {
            dataOutputStream.write((s17 >>> 0) & 255);
            dataOutputStream.write((s17 >>> 8) & 255);
        } else if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            dataOutputStream.write((s17 >>> 8) & 255);
            dataOutputStream.write((s17 >>> 0) & 255);
        }
    }

    public void f(long j17) {
        if (j17 > io.flutter.embedding.android.KeyboardMap.kValueMask) {
            throw new java.lang.IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }
        b((int) j17);
    }

    public void i(int i17) {
        if (i17 > 65535) {
            throw new java.lang.IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }
        c((short) i17);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.f11182d.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        this.f11182d.write(bArr, i17, i18);
    }
}
