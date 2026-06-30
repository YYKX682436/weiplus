package ht2;

/* loaded from: classes2.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f366444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f366445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.q6 f366446f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.widget.ImageView imageView, ht2.y0 y0Var, zy2.q6 q6Var) {
        super(2);
        this.f366444d = imageView;
        this.f366445e = y0Var;
        this.f366446f = q6Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String url = (java.lang.String) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        android.widget.ImageView imageView = this.f366444d;
        if (bitmap != null) {
            imageView.setAlpha(0.8f);
            imageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(imageView.getResources(), bitmap));
        } else {
            imageView.setAlpha(1.0f);
            this.f366445e.qj(imageView, this.f366446f);
        }
        return jz5.f0.f384359a;
    }
}
