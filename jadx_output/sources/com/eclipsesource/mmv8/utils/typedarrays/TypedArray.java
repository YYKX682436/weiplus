package com.eclipsesource.mmv8.utils.typedarrays;

/* loaded from: classes7.dex */
public abstract class TypedArray {
    protected java.nio.ByteBuffer buffer;

    public TypedArray(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
        }
        if (byteBuffer.limit() % com.eclipsesource.mmv8.V8TypedArray.getStructureSize(getType()) != 0) {
            throw new java.lang.IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
        }
        this.buffer = byteBuffer;
    }

    public java.nio.ByteBuffer getByteBuffer() {
        return this.buffer;
    }

    public abstract int getType();

    public abstract int length();
}
