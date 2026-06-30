package com.eclipsesource.mmv8.utils.typedarrays;

/* loaded from: classes7.dex */
public class Int16Array extends com.eclipsesource.mmv8.utils.typedarrays.TypedArray {
    public Int16Array(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public short get(int i17) {
        return this.buffer.asShortBuffer().get(i17);
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int getType() {
        return 13;
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int length() {
        return this.buffer.asShortBuffer().limit();
    }

    public void put(int i17, short s17) {
        this.buffer.asShortBuffer().put(i17, s17);
    }

    public Int16Array(com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
