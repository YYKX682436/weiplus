package c04;

/* loaded from: classes13.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView f37679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f37680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView, boolean z17) {
        super(0);
        this.f37679d = scanGoodsMaskView;
        this.f37680e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView = this.f37679d;
        android.graphics.Bitmap bitmap = scanGoodsMaskView.U;
        if (bitmap != null && !bitmap.isRecycled()) {
            android.widget.ImageView imageView = scanGoodsMaskView.C;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("blurView");
                throw null;
            }
            imageView.setImageBitmap(scanGoodsMaskView.U);
            android.widget.ImageView imageView2 = scanGoodsMaskView.C;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("blurView");
                throw null;
            }
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            if (this.f37680e) {
                android.widget.ImageView imageView3 = scanGoodsMaskView.A;
                if (imageView3 == null) {
                    kotlin.jvm.internal.o.o("bottomBlurView");
                    throw null;
                }
                imageView3.setImageBitmap(scanGoodsMaskView.U);
                android.widget.ImageView imageView4 = scanGoodsMaskView.A;
                if (imageView4 == null) {
                    kotlin.jvm.internal.o.o("bottomBlurView");
                    throw null;
                }
                imageView4.setVisibility(0);
                android.widget.ImageView imageView5 = scanGoodsMaskView.A;
                if (imageView5 == null) {
                    kotlin.jvm.internal.o.o("bottomBlurView");
                    throw null;
                }
                imageView5.setAlpha(1.0f);
                android.widget.ImageView imageView6 = scanGoodsMaskView.A;
                if (imageView6 == null) {
                    kotlin.jvm.internal.o.o("bottomBlurView");
                    throw null;
                }
                imageView6.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
            scanGoodsMaskView.R = true;
        }
        return jz5.f0.f302826a;
    }
}
