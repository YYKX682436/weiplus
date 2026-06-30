package com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24;

/* renamed from: com.eclipsesource.mmv8.utils.typedarrays.Int8Array */
/* loaded from: classes7.dex */
public class C1535x45f0ad90 extends com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f {
    public C1535x45f0ad90(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public byte get(int i17) {
        return this.f5065xaddb9440.get(i17);
    }

    @Override // com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f
    /* renamed from: getType */
    public int mo16707xfb85f7b0() {
        return 9;
    }

    @Override // com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f
    /* renamed from: length */
    public int mo16708xbe0e3ae6() {
        return this.f5065xaddb9440.limit();
    }

    public void put(int i17, byte b17) {
        this.f5065xaddb9440.put(i17, b17);
    }

    public C1535x45f0ad90(com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9 c1530x71a3b3d9) {
        this(c1530x71a3b3d9.m16703xeed4b35e());
    }
}
