package com.eclipsesource.mmv8.utils.typedarrays;

/* loaded from: classes7.dex */
public class UInt8Array extends com.eclipsesource.mmv8.utils.typedarrays.TypedArray {
    public UInt8Array(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public short get(int i17) {
        return (short) (this.buffer.get(i17) & 255);
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int getType() {
        return 11;
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int length() {
        return this.buffer.limit();
    }

    public void put(int i17, short s17) {
        this.buffer.put(i17, (byte) (s17 & 255));
    }

    public UInt8Array(com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
