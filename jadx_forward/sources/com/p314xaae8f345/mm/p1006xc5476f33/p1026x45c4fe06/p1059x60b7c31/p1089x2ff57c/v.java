package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class v implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.nio.charset.Charset f162667b;

    public v(java.nio.charset.Charset charset) {
        this.f162667b = charset;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0
    public java.lang.String a(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return new java.lang.String(ik1.f.a(byteBuffer), this.f162667b);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a0
    /* renamed from: decode */
    public java.nio.ByteBuffer mo50953xb06291ee(java.lang.String str) {
        return java.nio.ByteBuffer.wrap(str.getBytes(this.f162667b)).order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }
}
