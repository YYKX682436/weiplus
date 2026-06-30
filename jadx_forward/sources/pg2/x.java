package pg2;

/* loaded from: classes3.dex */
public final class x implements ug5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f435728a;

    public x(android.graphics.Bitmap bitmap) {
        this.f435728a = bitmap;
    }

    @Override // ug5.i
    public android.view.View b(android.content.Context context, android.widget.FrameLayout parent, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(this.f435728a);
        return imageView;
    }
}
