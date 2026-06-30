package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class x implements com.tencent.mm.plugin.appbrand.jsapi.file.a0 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.a0
    public java.lang.String a(java.nio.ByteBuffer byteBuffer) {
        return new java.lang.String(ik1.f.a(byteBuffer), com.tencent.mm.plugin.appbrand.jsapi.file.a0.f81037a);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.a0
    public java.nio.ByteBuffer decode(java.lang.String str) {
        return java.nio.ByteBuffer.wrap(str.getBytes(com.tencent.mm.plugin.appbrand.jsapi.file.a0.f81037a));
    }
}
