package ht2;

/* loaded from: classes2.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f366458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f366459e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable) {
        super(2);
        this.f366458d = imageView;
        this.f366459e = drawable;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((java.lang.String) obj, "<anonymous parameter 0>");
        android.widget.ImageView imageView = this.f366458d;
        if (bitmap != null) {
            imageView.setAlpha(0.8f);
            imageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(imageView.getResources(), bitmap));
        } else {
            imageView.setAlpha(1.0f);
            imageView.setImageDrawable(this.f366459e);
        }
        return jz5.f0.f384359a;
    }
}
