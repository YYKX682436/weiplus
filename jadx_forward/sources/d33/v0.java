package d33;

/* loaded from: classes.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f307821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f307822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f307823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f307824g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f307825h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, int i17, int i18, yz5.p pVar) {
        super(0);
        this.f307821d = imageView;
        this.f307822e = bitmap;
        this.f307823f = i17;
        this.f307824g = i18;
        this.f307825h = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = this.f307821d;
        imageView.setImageBitmap(this.f307822e);
        int i17 = this.f307823f;
        int i18 = this.f307824g;
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
        this.f307825h.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return jz5.f0.f384359a;
    }
}
