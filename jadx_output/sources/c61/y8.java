package c61;

/* loaded from: classes.dex */
public final class y8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f39430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f39431e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(android.graphics.Bitmap bitmap, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        super(0);
        this.f39430d = bitmap;
        this.f39431e = weImageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f39430d;
        if (bitmap != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f39431e;
            weImageView.setImageBitmap(bitmap);
            weImageView.setIconColor(i65.a.d(weImageView.getContext(), com.tencent.mm.R.color.a0c));
        }
        return jz5.f0.f302826a;
    }
}
