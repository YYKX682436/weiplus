package xk3;

/* loaded from: classes3.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f536593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f536594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        super(0);
        this.f536593d = bitmap;
        this.f536594e = imageView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f536593d != null) {
            float width = r0.getWidth() / r0.getHeight();
            android.widget.ImageView imageView = this.f536594e;
            imageView.setScaleType(width > ((float) imageView.getWidth()) / ((float) imageView.getHeight()) ? android.widget.ImageView.ScaleType.CENTER_INSIDE : android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        return jz5.f0.f384359a;
    }
}
