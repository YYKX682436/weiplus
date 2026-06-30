package va5;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f515978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f515979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f515980f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f515981g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f515982h;

    public s(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, long j17, float f17, float f18) {
        this.f515978d = imageView;
        this.f515979e = drawable;
        this.f515980f = j17;
        this.f515981g = f17;
        this.f515982h = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.drawable.Drawable drawable = this.f515979e;
        android.widget.ImageView imageView = this.f515978d;
        imageView.setImageDrawable(drawable);
        oa5.b.b(imageView).e(1.0f).f(1.0f).g(this.f515980f / 2).o(new va5.r(imageView, this.f515981g, this.f515982h)).l();
    }
}
