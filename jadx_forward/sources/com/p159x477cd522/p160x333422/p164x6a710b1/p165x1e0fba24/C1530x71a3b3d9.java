package com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24;

/* renamed from: com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer */
/* loaded from: classes7.dex */
public class C1530x71a3b3d9 {

    /* renamed from: byteBuffer */
    private java.nio.ByteBuffer f5064x93fb68;

    public C1530x71a3b3d9(int i17) {
        this.f5064x93fb68 = java.nio.ByteBuffer.allocateDirect(i17);
    }

    /* renamed from: validateByteBuffer */
    private java.nio.ByteBuffer m16701x7c8b0d1e(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        throw new java.lang.IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
    }

    /* renamed from: getByte */
    public byte m16702xfb7dc97e(int i17) {
        return this.f5064x93fb68.get(i17);
    }

    /* renamed from: getByteBuffer */
    public java.nio.ByteBuffer m16703xeed4b35e() {
        return this.f5064x93fb68;
    }

    /* renamed from: getUnsignedByte */
    public short m16704xa4f84c13(int i17) {
        return (short) (this.f5064x93fb68.get(i17) & 255);
    }

    /* renamed from: limit */
    public int m16705x6234bbb() {
        return this.f5064x93fb68.limit();
    }

    public void put(int i17, byte b17) {
        this.f5064x93fb68.put(i17, b17);
    }

    /* renamed from: toString */
    public java.lang.String m16706x9616526c() {
        return "[object ArrayBuffer]";
    }

    public C1530x71a3b3d9(byte[] bArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
        this.f5064x93fb68 = allocateDirect;
        allocateDirect.put(bArr, 0, bArr.length);
    }

    public C1530x71a3b3d9(java.nio.ByteBuffer byteBuffer) {
        this.f5064x93fb68 = m16701x7c8b0d1e(byteBuffer);
    }
}
