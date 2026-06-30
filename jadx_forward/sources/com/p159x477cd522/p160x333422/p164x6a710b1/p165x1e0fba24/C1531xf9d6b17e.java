package com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24;

/* renamed from: com.eclipsesource.mmv8.utils.typedarrays.Float32Array */
/* loaded from: classes7.dex */
public class C1531xf9d6b17e extends com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f {
    public C1531xf9d6b17e(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public float get(int i17) {
        return this.f5065xaddb9440.asFloatBuffer().get(i17);
    }

    @Override // com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f
    /* renamed from: getType */
    public int mo16707xfb85f7b0() {
        return 16;
    }

    @Override // com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.AbstractC1536x3c38b82f
    /* renamed from: length */
    public int mo16708xbe0e3ae6() {
        return this.f5065xaddb9440.asFloatBuffer().limit();
    }

    public void put(int i17, float f17) {
        this.f5065xaddb9440.asFloatBuffer().put(i17, f17);
    }

    public C1531xf9d6b17e(com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24.C1530x71a3b3d9 c1530x71a3b3d9) {
        this(c1530x71a3b3d9.m16703xeed4b35e());
    }
}
