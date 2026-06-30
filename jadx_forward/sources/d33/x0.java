package d33;

/* loaded from: classes.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final d33.x0 f307833d = new d33.x0();

    public x0() {
        super(3);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String mediaPath = (java.lang.String) obj;
        android.widget.ImageView imageView = (android.widget.ImageView) obj2;
        yz5.p loadedCallback = (yz5.p) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaPath, "mediaPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedCallback, "loadedCallback");
        pm0.v.K(null, new d33.w0(mediaPath, imageView, loadedCallback));
        return jz5.f0.f384359a;
    }
}
