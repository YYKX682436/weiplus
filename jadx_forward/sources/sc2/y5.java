package sc2;

/* loaded from: classes.dex */
public final class y5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f487923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f487924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f487923d = imageView;
        this.f487924e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = this.f487923d;
        float measuredHeight = imageView.getMeasuredHeight();
        android.graphics.Bitmap bitmap = this.f487924e;
        imageView.getLayoutParams().width = (int) ((measuredHeight / bitmap.getHeight()) * bitmap.getWidth());
        imageView.requestLayout();
        return jz5.f0.f384359a;
    }
}
