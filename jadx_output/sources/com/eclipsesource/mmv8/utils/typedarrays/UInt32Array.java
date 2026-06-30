package com.eclipsesource.mmv8.utils.typedarrays;

/* loaded from: classes7.dex */
public class UInt32Array extends com.eclipsesource.mmv8.utils.typedarrays.TypedArray {
    public UInt32Array(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public long get(int i17) {
        return this.buffer.asIntBuffer().get(i17) & (-1);
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int getType() {
        return 15;
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int length() {
        return this.buffer.asIntBuffer().limit();
    }

    public void put(int i17, long j17) {
        this.buffer.asIntBuffer().put(i17, (int) (j17 & (-1)));
    }

    public UInt32Array(com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
