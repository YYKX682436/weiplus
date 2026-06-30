package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class y implements com.tencent.mm.plugin.appbrand.jsapi.file.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.charset.Charset f81141b = java.nio.charset.Charset.forName(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.a0
    public java.lang.String a(java.nio.ByteBuffer byteBuffer) {
        return new java.lang.String(ik1.f.a(byteBuffer), this.f81141b);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.a0
    public java.nio.ByteBuffer decode(java.lang.String str) {
        return java.nio.ByteBuffer.wrap(str.getBytes(this.f81141b));
    }
}
