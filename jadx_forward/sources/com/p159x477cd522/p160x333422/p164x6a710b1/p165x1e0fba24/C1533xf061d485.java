package com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24;

/* renamed from: com.eclipsesource.mmv8.utils.typedarrays.Int16Array */
/* loaded from: classes7.dex */
public class C1533xf061d485 extends com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f {
    public C1533xf061d485(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public short get(int i17) {
        return this.f5065xaddb9440.asShortBuffer().get(i17);
    }

    @Override // com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f
    /* renamed from: getType */
    public int mo16707xfb85f7b0() {
        return 13;
    }

    @Override // com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f
    /* renamed from: length */
    public int mo16708xbe0e3ae6() {
        return this.f5065xaddb9440.asShortBuffer().limit();
    }

    public void put(int i17, short s17) {
        this.f5065xaddb9440.asShortBuffer().put(i17, s17);
    }

    public C1533xf061d485(com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9 c1530x71a3b3d9) {
        this(c1530x71a3b3d9.m16703xeed4b35e());
    }
}
