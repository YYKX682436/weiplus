package androidx.camera.core.impl.utils;

/* loaded from: classes13.dex */
class ByteOrderedDataOutputStream extends java.io.FilterOutputStream {
    private java.nio.ByteOrder mByteOrder;
    final java.io.OutputStream mOutputStream;

    public ByteOrderedDataOutputStream(java.io.OutputStream outputStream, java.nio.ByteOrder byteOrder) {
        super(outputStream);
        this.mOutputStream = outputStream;
        this.mByteOrder = byteOrder;
    }

    public void setByteOrder(java.nio.ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.mOutputStream.write(bArr);
    }

    public void writeByte(int i17) {
        this.mOutputStream.write(i17);
    }

    public void writeInt(int i17) {
        java.nio.ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write((i17 >>> 0) & 255);
            this.mOutputStream.write((i17 >>> 8) & 255);
            this.mOutputStream.write((i17 >>> 16) & 255);
            this.mOutputStream.write((i17 >>> 24) & 255);
            return;
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((i17 >>> 24) & 255);
            this.mOutputStream.write((i17 >>> 16) & 255);
            this.mOutputStream.write((i17 >>> 8) & 255);
            this.mOutputStream.write((i17 >>> 0) & 255);
        }
    }

    public void writeShort(short s17) {
        java.nio.ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write((s17 >>> 0) & 255);
            this.mOutputStream.write((s17 >>> 8) & 255);
        } else if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((s17 >>> 8) & 255);
            this.mOutputStream.write((s17 >>> 0) & 255);
        }
    }

    public void writeUnsignedInt(long j17) {
        writeInt((int) j17);
    }

    public void writeUnsignedShort(int i17) {
        writeShort((short) i17);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        this.mOutputStream.write(bArr, i17, i18);
    }
}
