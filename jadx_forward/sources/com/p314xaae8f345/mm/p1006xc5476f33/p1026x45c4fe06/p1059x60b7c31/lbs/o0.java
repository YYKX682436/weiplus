package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class o0 implements o91.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f163006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f163007c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 f163008d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 v0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, android.widget.ImageView imageView) {
        this.f163008d = v0Var;
        this.f163005a = str;
        this.f163006b = e9Var;
        this.f163007c = imageView;
    }

    @Override // o91.c
    public void a(java.io.InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        java.lang.String str = this.f163005a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMapApp", "decode bitmap from stream: %s", str);
        this.f163008d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMapApp", "fetchBitmapFromStream:%s", str);
        java.io.InputStream a17 = ya1.b.a(inputStream);
        "HUAWEI".equals(android.os.Build.MANUFACTURER);
        a17.mark(8388608);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        final android.graphics.Bitmap bitmap = null;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y1.a().Va(a17, null, options);
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
                bitmap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y1.a().Va(a17, null, options);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenMapApp", "decodeBitmapFromStream, exist exception, url=%s", str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenMapApp", th6, "", new java.lang.Object[0]);
            }
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenMapApp", "decodeBitmapFromStream, exist exception, url=%s", str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenMapApp", e17, "[CAUGHT EXCEPTION]", new java.lang.Object[0]);
        }
        s46.d.a(inputStream);
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        final android.widget.ImageView imageView = this.f163007c;
        this.f163006b.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.lbs.o0$$a
            @Override // java.lang.Runnable
            public final void run() {
                imageView.setImageBitmap(bitmap);
            }
        });
    }
}
