package com.eclipsesource.mmv8.utils.typedarrays;

/* loaded from: classes7.dex */
public class Int8Array extends com.eclipsesource.mmv8.utils.typedarrays.TypedArray {
    public Int8Array(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public byte get(int i17) {
        return this.buffer.get(i17);
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int getType() {
        return 9;
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int length() {
        return this.buffer.limit();
    }

    public void put(int i17, byte b17) {
        this.buffer.put(i17, b17);
    }

    public Int8Array(com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
