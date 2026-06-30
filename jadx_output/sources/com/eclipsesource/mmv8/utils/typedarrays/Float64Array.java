package com.eclipsesource.mmv8.utils.typedarrays;

/* loaded from: classes7.dex */
public class Float64Array extends com.eclipsesource.mmv8.utils.typedarrays.TypedArray {
    public Float64Array(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public double get(int i17) {
        return this.buffer.asDoubleBuffer().get(i17);
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int getType() {
        return 2;
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int length() {
        return this.buffer.asDoubleBuffer().limit();
    }

    public void put(int i17, double d17) {
        this.buffer.asDoubleBuffer().put(i17, d17);
    }

    public Float64Array(com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
