package com.eclipsesource.mmv8.utils.typedarrays;

/* loaded from: classes7.dex */
public class Float32Array extends com.eclipsesource.mmv8.utils.typedarrays.TypedArray {
    public Float32Array(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public float get(int i17) {
        return this.buffer.asFloatBuffer().get(i17);
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int getType() {
        return 16;
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int length() {
        return this.buffer.asFloatBuffer().limit();
    }

    public void put(int i17, float f17) {
        this.buffer.asFloatBuffer().put(i17, f17);
    }

    public Float32Array(com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
