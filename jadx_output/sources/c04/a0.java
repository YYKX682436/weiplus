package c04;

/* loaded from: classes13.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView f37668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView f37669e;

    public a0(com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView, android.view.TextureView textureView) {
        this.f37668d = scanGoodsMaskView;
        this.f37669e = textureView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView = this.f37668d;
            int i17 = com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView.A1;
            scanGoodsMaskView.x();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.graphics.Bitmap bitmap = this.f37669e.getBitmap();
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsMaskView", "updatePreviewBitmap getBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            ((ku5.t0) ku5.t0.f312615d).B(new c04.z(this.f37668d, bitmap));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanGoodsMaskView", e17, "updatePreviewBitmap exception", new java.lang.Object[0]);
        }
    }
}
