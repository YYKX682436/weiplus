package pa5;

/* loaded from: classes3.dex */
public final class n extends u3.t {
    public n() {
        super("scale");
    }

    @Override // u3.t
    public float a(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return view.getScaleX();
    }

    @Override // u3.t
    public void b(java.lang.Object obj, float f17) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        view.setScaleX(f17);
        view.setScaleY(f17);
    }
}
