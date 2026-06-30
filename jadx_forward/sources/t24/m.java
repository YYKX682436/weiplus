package t24;

/* loaded from: classes.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final t24.m f496859d = new t24.m();

    public m() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
        android.widget.ImageView view = (android.widget.ImageView) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        view.setLayerPaint(null);
        view.setImageDrawable(drawable);
        return jz5.f0.f384359a;
    }
}
