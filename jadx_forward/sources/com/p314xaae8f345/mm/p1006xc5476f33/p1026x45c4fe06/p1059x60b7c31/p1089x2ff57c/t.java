package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class t implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0
    public java.lang.String a(java.nio.ByteBuffer byteBuffer) {
        return new java.lang.String(android.util.Base64.encode(ik1.f.a(byteBuffer), 2), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0.f162570a);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0
    /* renamed from: decode */
    public java.nio.ByteBuffer mo50953xb06291ee(java.lang.String str) {
        return java.nio.ByteBuffer.wrap(android.util.Base64.decode(str.getBytes(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0.f162570a), 2));
    }
}
