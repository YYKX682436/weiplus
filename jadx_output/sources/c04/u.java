package c04;

/* loaded from: classes13.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.api.ScanGoodsRequest f37692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView f37693e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.scanner.api.ScanGoodsRequest scanGoodsRequest, com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView) {
        super(1);
        this.f37692d = scanGoodsRequest;
        this.f37693e = scanGoodsMaskView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        android.graphics.Bitmap a17 = com.tencent.mm.plugin.scanner.model.n1.f158959a.a(this.f37692d.f158672q);
        if (a17 == null || a17.isRecycled()) {
            km5.u.b().a(nm5.j.c(java.lang.Boolean.FALSE, "successView getResouce failed"));
            z17 = false;
        } else {
            android.widget.ImageView imageView = this.f37693e.G;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("customSuccessView");
                throw null;
            }
            imageView.setImageBitmap(a17);
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
