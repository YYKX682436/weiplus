package xk3;

/* loaded from: classes3.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f536590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f536591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f536590d = imageView;
        this.f536591e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f536591e;
        float width = bitmap.getWidth() / bitmap.getHeight();
        android.widget.ImageView imageView = this.f536590d;
        imageView.setScaleType(width > ((float) imageView.getWidth()) / ((float) imageView.getHeight()) ? android.widget.ImageView.ScaleType.CENTER_INSIDE : android.widget.ImageView.ScaleType.CENTER_CROP);
        return jz5.f0.f384359a;
    }
}
