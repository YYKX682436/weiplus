package com.p159x477cd522.p160x333422.p164x6a710b1.p165x1e0fba24;

/* renamed from: com.eclipsesource.mmv8.utils.typedarrays.TypedArray */
/* loaded from: classes7.dex */
public abstract class AbstractC1536x3c38b82f {

    /* renamed from: buffer */
    protected java.nio.ByteBuffer f5065xaddb9440;

    public AbstractC1536x3c38b82f(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
        }
        if (byteBuffer.limit() % com.p159x477cd522.p160x333422.C1487x63ed6051.m16462xb01a4c5e(mo16707xfb85f7b0()) != 0) {
            throw new java.lang.IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
        }
        this.f5065xaddb9440 = byteBuffer;
    }

    /* renamed from: getByteBuffer */
    public java.nio.ByteBuffer m16709xeed4b35e() {
        return this.f5065xaddb9440;
    }

    /* renamed from: getType */
    public abstract int mo16707xfb85f7b0();

    /* renamed from: length */
    public abstract int mo16708xbe0e3ae6();
}
