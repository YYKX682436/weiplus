package c04;

/* loaded from: classes13.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView f37681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f37682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f37683f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView, android.graphics.Bitmap bitmap, boolean z17) {
        super(0);
        this.f37681d = scanGoodsMaskView;
        this.f37682e = bitmap;
        this.f37683f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView.A1;
        com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView = this.f37681d;
        boolean z17 = scanGoodsMaskView.getMScanSource() == 2;
        boolean z18 = scanGoodsMaskView.getMScanSource() == 2;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            scanGoodsMaskView.U = com.tencent.mm.sdk.platformtools.x.W(this.f37682e, 0.1f, 10, true, 200L);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsMaskView", "blurBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanGoodsMaskView", e17, "blurBitmap exception", new java.lang.Object[0]);
        }
        android.graphics.Bitmap bitmap = scanGoodsMaskView.U;
        if (bitmap != null && !bitmap.isRecycled()) {
            android.graphics.Bitmap bitmap2 = scanGoodsMaskView.U;
            kotlin.jvm.internal.o.d(bitmap2);
            bitmap2.getWidth();
            android.graphics.Bitmap bitmap3 = scanGoodsMaskView.U;
            kotlin.jvm.internal.o.d(bitmap3);
            bitmap3.getHeight();
            if (z17) {
                android.graphics.Bitmap bitmap4 = scanGoodsMaskView.U;
                kotlin.jvm.internal.o.d(bitmap4);
                int width = bitmap4.getWidth();
                android.graphics.Bitmap bitmap5 = scanGoodsMaskView.U;
                kotlin.jvm.internal.o.d(bitmap5);
                int height = bitmap5.getHeight();
                int measuredWidth = scanGoodsMaskView.getMeasuredWidth();
                int measuredHeight = scanGoodsMaskView.getMeasuredHeight();
                float f17 = width;
                float f18 = height;
                float f19 = (measuredWidth * 1.0f) / measuredHeight;
                android.graphics.Point point = (f17 * 1.0f) / f18 < f19 ? width < measuredWidth ? new android.graphics.Point(width, (int) (f17 / f19)) : new android.graphics.Point(measuredWidth, measuredHeight) : height < measuredHeight ? new android.graphics.Point((int) (f19 * f18), height) : new android.graphics.Point(measuredWidth, measuredHeight);
                android.graphics.Bitmap S = com.tencent.mm.sdk.platformtools.x.S(scanGoodsMaskView.U, point.y, point.x, true, true);
                scanGoodsMaskView.U = S;
                if (S != null) {
                    S.getWidth();
                }
                android.graphics.Bitmap bitmap6 = scanGoodsMaskView.U;
                if (bitmap6 != null) {
                    bitmap6.getHeight();
                }
            }
            c04.l lVar = new c04.l(scanGoodsMaskView, z18);
            if (this.f37683f) {
                scanGoodsMaskView.post(new c04.k(lVar));
            } else {
                lVar.invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
