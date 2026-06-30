package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class w implements com.tencent.mm.plugin.appbrand.jsapi.file.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.nio.charset.Charset f81135b;

    public w(java.nio.charset.Charset charset) {
        this.f81135b = charset;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.a0
    public java.lang.String a(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return new java.lang.String(ik1.f.a(byteBuffer), this.f81135b);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.a0
    public java.nio.ByteBuffer decode(java.lang.String str) {
        return java.nio.ByteBuffer.wrap(str.getBytes(this.f81135b)).order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }
}
