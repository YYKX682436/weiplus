package c04;

/* loaded from: classes13.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f37696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView f37697e;

    public x(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView) {
        this.f37696d = bitmap;
        this.f37697e = scanGoodsMaskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView = this.f37697e;
        android.widget.ImageView imageView = scanGoodsMaskView.F;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("customMaskView");
            throw null;
        }
        int i17 = scanGoodsMaskView.N;
        int i18 = scanGoodsMaskView.P;
        android.graphics.Bitmap bitmap = this.f37696d;
        if (bitmap == null || bitmap.isRecycled()) {
            imageView.setImageBitmap(null);
            z17 = false;
        } else {
            imageView.setImageBitmap(bitmap);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            imageView.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
            android.graphics.Matrix imageMatrix = imageView.getImageMatrix();
            float width = (i17 * 1.0f) / bitmap.getWidth();
            bitmap.getWidth();
            bitmap.getHeight();
            imageMatrix.postScale(width, width);
            imageMatrix.postTranslate(0.0f, i18 - (bitmap.getHeight() * width));
            matrix.set(imageMatrix);
            imageView.setImageMatrix(matrix);
            z17 = true;
        }
        if (!z17) {
            scanGoodsMaskView.w();
            return;
        }
        android.widget.ImageView imageView2 = scanGoodsMaskView.F;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("customMaskView");
            throw null;
        }
        imageView2.setVisibility(0);
        if (scanGoodsMaskView.getRequest() instanceof com.tencent.mm.plugin.scanner.api.ScanGoodsRequest) {
            com.tencent.mm.plugin.scanner.api.BaseScanRequest request = scanGoodsMaskView.getRequest();
            kotlin.jvm.internal.o.e(request, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.api.ScanGoodsRequest");
            com.tencent.mm.plugin.scanner.api.ScanGoodsRequest scanGoodsRequest = (com.tencent.mm.plugin.scanner.api.ScanGoodsRequest) request;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsMaskView", "onSetCustomBackgroundSuccess");
            km5.d g17 = ((km5.q) km5.u.d()).i(new c04.s(scanGoodsRequest)).g(true);
            kotlin.jvm.internal.o.f(g17, "serial(...)");
            km5.q qVar = (km5.q) pm0.v.T(pm0.v.T(g17, new c04.t(scanGoodsMaskView)), new c04.u(scanGoodsRequest, scanGoodsMaskView));
            qVar.s(new c04.v(scanGoodsMaskView));
            qVar.a(new c04.w(scanGoodsMaskView));
        }
    }
}
