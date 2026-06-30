package cl2;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f42928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f42929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.graphics.Bitmap bitmap, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        super(0);
        this.f42928d = bitmap;
        this.f42929e = weImageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f42928d;
        if (bitmap != null) {
            android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, 8.0f);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f42929e;
            weImageView.setImageBitmap(s07);
            weImageView.setVisibility(0);
        }
        return jz5.f0.f302826a;
    }
}
