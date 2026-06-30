package com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24;

/* renamed from: com.eclipsesource.mmv8.utils.typedarrays.UInt8ClampedArray */
/* loaded from: classes7.dex */
public class C1540xc1275f1d extends com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f {
    public C1540xc1275f1d(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public short get(int i17) {
        return (short) (this.f5065xaddb9440.get(i17) & 255);
    }

    @Override // com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f
    /* renamed from: getType */
    public int mo16707xfb85f7b0() {
        return 12;
    }

    @Override // com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f
    /* renamed from: length */
    public int mo16708xbe0e3ae6() {
        return this.f5065xaddb9440.limit();
    }

    public void put(int i17, short s17) {
        if (s17 > 255) {
            this.f5065xaddb9440.put(i17, (byte) -1);
        } else if (s17 < 0) {
            this.f5065xaddb9440.put(i17, (byte) 0);
        } else {
            this.f5065xaddb9440.put(i17, (byte) s17);
        }
    }

    public C1540xc1275f1d(com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9 c1530x71a3b3d9) {
        this(c1530x71a3b3d9.m16703xeed4b35e());
    }
}
