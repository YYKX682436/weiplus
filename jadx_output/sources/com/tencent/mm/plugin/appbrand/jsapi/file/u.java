package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes13.dex */
public class u implements com.tencent.mm.plugin.appbrand.jsapi.file.a0 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.a0
    public java.lang.String a(java.nio.ByteBuffer byteBuffer) {
        return new java.math.BigInteger(1, ik1.f.a(byteBuffer)).toString(16);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.a0
    public java.nio.ByteBuffer decode(java.lang.String str) {
        return java.nio.ByteBuffer.wrap(new java.math.BigInteger(str, 16).toByteArray());
    }
}
