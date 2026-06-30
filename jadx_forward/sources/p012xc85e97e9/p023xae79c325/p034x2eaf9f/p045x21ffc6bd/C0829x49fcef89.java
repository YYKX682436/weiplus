package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd;

/* renamed from: androidx.camera.core.internal.ByteBufferOutputStream */
/* loaded from: classes13.dex */
public final class C0829x49fcef89 extends java.io.OutputStream {

    /* renamed from: mByteBuffer */
    private final java.nio.ByteBuffer f2055xdcc5f3b5;

    public C0829x49fcef89(java.nio.ByteBuffer byteBuffer) {
        this.f2055xdcc5f3b5 = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i17) {
        if (this.f2055xdcc5f3b5.hasRemaining()) {
            this.f2055xdcc5f3b5.put((byte) i17);
            return;
        }
        throw new java.io.EOFException("Output ByteBuffer has no bytes remaining.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        int i19;
        bArr.getClass();
        if (i17 < 0 || i17 > bArr.length || i18 < 0 || (i19 = i17 + i18) > bArr.length || i19 < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i18 == 0) {
            return;
        }
        if (this.f2055xdcc5f3b5.remaining() >= i18) {
            this.f2055xdcc5f3b5.put(bArr, i17, i18);
            return;
        }
        throw new java.io.EOFException("Output ByteBuffer has insufficient bytes remaining.");
    }
}
