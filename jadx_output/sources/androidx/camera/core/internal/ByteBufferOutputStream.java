package androidx.camera.core.internal;

/* loaded from: classes13.dex */
public final class ByteBufferOutputStream extends java.io.OutputStream {
    private final java.nio.ByteBuffer mByteBuffer;

    public ByteBufferOutputStream(java.nio.ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i17) {
        if (this.mByteBuffer.hasRemaining()) {
            this.mByteBuffer.put((byte) i17);
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
        if (this.mByteBuffer.remaining() >= i18) {
            this.mByteBuffer.put(bArr, i17, i18);
            return;
        }
        throw new java.io.EOFException("Output ByteBuffer has insufficient bytes remaining.");
    }
}
