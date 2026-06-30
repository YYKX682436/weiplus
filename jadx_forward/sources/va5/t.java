package va5;

/* loaded from: classes8.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f515983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f515984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f515985f;

    public t(android.widget.ImageView imageView, long j17, android.graphics.drawable.Drawable drawable) {
        this.f515983d = imageView;
        this.f515984e = j17;
        this.f515985f = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f515983d;
        float pivotX = imageView.getPivotX();
        float pivotY = imageView.getPivotY();
        imageView.setPivotX(imageView.getWidth() / 2.0f);
        imageView.setPivotY(imageView.getHeight() / 2.0f);
        oa5.b.b(imageView).e(0.1f).f(0.1f).g(this.f515984e / 2).o(new va5.s(this.f515983d, this.f515985f, this.f515984e, pivotX, pivotY)).l();
    }
}
