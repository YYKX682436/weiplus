package com.tencent.mm.plugin.appbrand.jsapi.media;

@j95.b
/* loaded from: classes7.dex */
public class h7 extends i95.w implements com.tencent.mm.plugin.appbrand.jsapi.media.z1 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.z1
    public android.graphics.Bitmap Bc(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        return com.tencent.mm.graphics.e.d(str, options);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.z1
    public android.graphics.Bitmap Lh(java.io.InputStream inputStream) {
        return com.tencent.mm.sdk.platformtools.x.O(inputStream);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.z1
    public android.graphics.Bitmap Va(java.io.InputStream inputStream, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        return com.tencent.mm.graphics.e.g(inputStream, rect, options);
    }
}
