package com.eclipsesource.mmv8.utils.typedarrays;

/* loaded from: classes7.dex */
public class UInt8ClampedArray extends com.eclipsesource.mmv8.utils.typedarrays.TypedArray {
    public UInt8ClampedArray(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public short get(int i17) {
        return (short) (this.buffer.get(i17) & 255);
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int getType() {
        return 12;
    }

    @Override // com.eclipsesource.mmv8.utils.typedarrays.TypedArray
    public int length() {
        return this.buffer.limit();
    }

    public void put(int i17, short s17) {
        if (s17 > 255) {
            this.buffer.put(i17, (byte) -1);
        } else if (s17 < 0) {
            this.buffer.put(i17, (byte) 0);
        } else {
            this.buffer.put(i17, (byte) s17);
        }
    }

    public UInt8ClampedArray(com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
