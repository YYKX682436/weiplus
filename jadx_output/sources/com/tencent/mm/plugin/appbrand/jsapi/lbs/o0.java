package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class o0 implements o91.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f81474c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 f81475d;

    public o0(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var, java.lang.String str, com.tencent.mm.plugin.appbrand.e9 e9Var, android.widget.ImageView imageView) {
        this.f81475d = v0Var;
        this.f81472a = str;
        this.f81473b = e9Var;
        this.f81474c = imageView;
    }

    @Override // o91.c
    public void a(java.io.InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        java.lang.String str = this.f81472a;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "decode bitmap from stream: %s", str);
        this.f81475d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "fetchBitmapFromStream:%s", str);
        java.io.InputStream a17 = ya1.b.a(inputStream);
        "HUAWEI".equals(android.os.Build.MANUFACTURER);
        a17.mark(8388608);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        final android.graphics.Bitmap bitmap = null;
        try {
            com.tencent.mm.plugin.appbrand.jsapi.media.y1.a().Va(a17, null, options);
            try {
                a17.reset();
                if (options.inSampleSize <= 1) {
                    options.inSampleSize = 1;
                }
                while (true) {
                    int i17 = options.outHeight * options.outWidth;
                    int i18 = options.inSampleSize;
                    if ((i17 / i18) / i18 <= 2764800) {
                        break;
                    } else {
                        options.inSampleSize = i18 + 1;
                    }
                }
                options.inJustDecodeBounds = false;
                options.inMutable = true;
                bitmap = com.tencent.mm.plugin.appbrand.jsapi.media.y1.a().Va(a17, null, options);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenMapApp", "decodeBitmapFromStream, exist exception, url=%s", str);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenMapApp", th6, "", new java.lang.Object[0]);
            }
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenMapApp", "decodeBitmapFromStream, exist exception, url=%s", str);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenMapApp", e17, "[CAUGHT EXCEPTION]", new java.lang.Object[0]);
        }
        s46.d.a(inputStream);
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        final android.widget.ImageView imageView = this.f81474c;
        this.f81473b.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.lbs.o0$$a
            @Override // java.lang.Runnable
            public final void run() {
                imageView.setImageBitmap(bitmap);
            }
        });
    }
}
