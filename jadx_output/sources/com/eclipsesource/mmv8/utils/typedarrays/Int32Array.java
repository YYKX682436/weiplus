package com.eclipsesource.mmv8.utils.typedarrays;

/* loaded from: classes7.dex */
public class Int32Array extends com.eclipsesource.mmv8.utils.typedarrays.TypedArray {
    public Int32Array(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public int get(int i17) {
        return this.buffer.asIntBuffer().get(i17);
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int getType() {
        return 1;
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int length() {
        return this.buffer.asIntBuffer().limit();
    }

    public void put(int i17, int i18) {
        this.buffer.asIntBuffer().put(i17, i18);
    }

    public Int32Array(com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
