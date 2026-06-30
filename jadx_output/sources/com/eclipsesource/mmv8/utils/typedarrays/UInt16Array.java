package com.eclipsesource.mmv8.utils.typedarrays;

/* loaded from: classes7.dex */
public class UInt16Array extends com.eclipsesource.mmv8.utils.typedarrays.TypedArray {
    public UInt16Array(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public int get(int i17) {
        return this.buffer.asShortBuffer().get(i17) & 65535;
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int getType() {
        return 14;
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int length() {
        return this.buffer.asShortBuffer().limit();
    }

    public void put(int i17, int i18) {
        this.buffer.asShortBuffer().put(i17, (short) (i18 & 65535));
    }

    public UInt16Array(com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
