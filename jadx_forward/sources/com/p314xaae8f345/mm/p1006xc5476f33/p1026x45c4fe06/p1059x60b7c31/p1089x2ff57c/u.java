package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes13.dex */
public class u implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0
    public java.lang.String a(java.nio.ByteBuffer byteBuffer) {
        return new java.math.BigInteger(1, ik1.f.a(byteBuffer)).toString(16);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0
    /* renamed from: decode */
    public java.nio.ByteBuffer mo50953xb06291ee(java.lang.String str) {
        return java.nio.ByteBuffer.wrap(new java.math.BigInteger(str, 16).toByteArray());
    }
}
