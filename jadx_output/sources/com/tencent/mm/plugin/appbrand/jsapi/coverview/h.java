package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes13.dex */
public class h implements o91.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.coverview.i f80684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MultiTouchImageView f80687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f80688e;

    public h(com.tencent.mm.plugin.appbrand.jsapi.coverview.i iVar, java.lang.String str, java.lang.String str2, com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView, float f17) {
        this.f80684a = iVar;
        this.f80685b = str;
        this.f80686c = str2;
        this.f80687d = multiTouchImageView;
        this.f80688e = f17;
    }

    @Override // o91.c
    public void a(java.io.InputStream inputStream) {
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f80687d;
        java.lang.String str = this.f80686c;
        java.lang.String str2 = this.f80685b;
        com.tencent.mm.plugin.appbrand.jsapi.coverview.i iVar = this.f80684a;
        if (inputStream == null) {
            if (iVar != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer) iVar).e(str2, "null InputStream, finalUrl: " + str);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ImagePreviewerUtils", "openRead failed, url=%s", str);
            return;
        }
        java.io.InputStream a17 = ya1.b.a(inputStream);
        "HUAWEI".equals(android.os.Build.MANUFACTURER);
        a17.mark(8388608);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.plugin.appbrand.jsapi.media.y1.a().Va(a17, null, options);
        java.lang.String str3 = options.outMimeType;
        str3.getClass();
        if (str3.equals("image/GIF") || str3.equals("image/gif")) {
            if (iVar != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer) iVar).e(str2, "not support gif");
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ImagePreviewerUtils", "not support gift image");
            return;
        }
        try {
            a17.reset();
            android.graphics.Bitmap Lh = com.tencent.mm.plugin.appbrand.jsapi.media.y1.a().Lh(a17);
            s46.d.a(a17);
            if (Lh != null && !Lh.isRecycled()) {
                multiTouchImageView.setImageBitmap(Lh);
                int width = Lh.getWidth();
                int height = Lh.getHeight();
                multiTouchImageView.f197651o = width;
                multiTouchImageView.f197652p = height;
                multiTouchImageView.postDelayed(new com.tencent.mm.plugin.appbrand.jsapi.coverview.g(this), 100L);
            } else if (iVar != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer) iVar).e(str2, "bmp is null or recycled");
            }
        } catch (java.lang.Throwable th6) {
            if (iVar != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer) iVar).e(str2, "exception found: " + th6.toString());
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ImagePreviewerUtils", "setImageBitmap failed, url=%s", str);
        }
    }
}
