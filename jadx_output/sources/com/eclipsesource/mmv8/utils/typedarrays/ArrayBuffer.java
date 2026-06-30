package com.eclipsesource.mmv8.utils.typedarrays;

/* loaded from: classes7.dex */
public class ArrayBuffer {
    private java.nio.ByteBuffer byteBuffer;

    public ArrayBuffer(int i17) {
        this.byteBuffer = java.nio.ByteBuffer.allocateDirect(i17);
    }

    private java.nio.ByteBuffer validateByteBuffer(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        throw new java.lang.IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
    }

    public byte getByte(int i17) {
        return this.byteBuffer.get(i17);
    }

    public java.nio.ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    public short getUnsignedByte(int i17) {
        return (short) (this.byteBuffer.get(i17) & 255);
    }

    public int limit() {
        return this.byteBuffer.limit();
    }

    public void put(int i17, byte b17) {
        this.byteBuffer.put(i17, b17);
    }

    public java.lang.String toString() {
        return "[object ArrayBuffer]";
    }

    public ArrayBuffer(byte[] bArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
        this.byteBuffer = allocateDirect;
        allocateDirect.put(bArr, 0, bArr.length);
    }

    public ArrayBuffer(java.nio.ByteBuffer byteBuffer) {
        this.byteBuffer = validateByteBuffer(byteBuffer);
    }
}
