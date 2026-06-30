package c04;

/* loaded from: classes13.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView f37700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f37701e;

    public z(com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView, android.graphics.Bitmap bitmap) {
        this.f37700d = scanGoodsMaskView;
        this.f37701e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bz3.l lVar = bz3.l.f36802d;
        com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView = this.f37700d;
        scanGoodsMaskView.S = true;
        scanGoodsMaskView.T = true;
        scanGoodsMaskView.x();
        android.graphics.Bitmap bitmap = this.f37701e;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsMaskView", "updatePreview bitmap width: %d, height: %d, showPreviewImage: %b, animateShowPreviewImage: %b", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Boolean.valueOf(scanGoodsMaskView.S), java.lang.Boolean.valueOf(scanGoodsMaskView.T));
            scanGoodsMaskView.V = bitmap;
            android.widget.ImageView imageView = scanGoodsMaskView.B;
            if (imageView == null) {
                kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
                throw null;
            }
            imageView.setImageBitmap(bitmap);
            if (scanGoodsMaskView.S) {
                android.widget.ImageView imageView2 = scanGoodsMaskView.B;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
                    throw null;
                }
                imageView2.setVisibility(0);
                if (scanGoodsMaskView.T) {
                    android.widget.ImageView imageView3 = scanGoodsMaskView.B;
                    if (imageView3 == null) {
                        kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
                        throw null;
                    }
                    imageView3.setAlpha(0.0f);
                } else {
                    android.widget.ImageView imageView4 = scanGoodsMaskView.B;
                    if (imageView4 == null) {
                        kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
                        throw null;
                    }
                    imageView4.setAlpha(1.0f);
                }
            } else {
                android.widget.ImageView imageView5 = scanGoodsMaskView.B;
                if (imageView5 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
                    throw null;
                }
                imageView5.setVisibility(8);
            }
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsMaskView", "setPreviewBitmap width: %d, height: %d", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
        new c04.m(scanGoodsMaskView, bitmap, false).invoke();
    }
}
