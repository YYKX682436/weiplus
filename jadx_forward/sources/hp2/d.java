package hp2;

/* loaded from: classes2.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final hp2.d f364457d = new hp2.d();

    public d() {
        super(3);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ((java.lang.Number) obj).intValue();
        android.view.View view = (android.view.View) obj2;
        android.graphics.Rect rect = (android.graphics.Rect) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        return java.lang.Boolean.valueOf(rect.height() == view.getHeight() && rect.top > 0);
    }
}
