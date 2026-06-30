package c04;

/* loaded from: classes9.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView f37691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView) {
        super(1);
        this.f37691d = scanGoodsMaskView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            km5.u.b().a(nm5.j.c(java.lang.Boolean.FALSE, "tipsImage roundBitmap is invalid"));
            z17 = false;
        } else {
            android.widget.ImageView imageView = this.f37691d.f159635J;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("customTipsImage");
                throw null;
            }
            imageView.setImageBitmap(bitmap);
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
