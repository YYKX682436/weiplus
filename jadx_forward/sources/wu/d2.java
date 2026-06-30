package wu;

/* loaded from: classes.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final wu.d2 f531091d = new wu.d2();

    public d2() {
        super(3);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        hu.b item = (hu.b) obj;
        android.widget.ImageView icon = (android.widget.ImageView) obj2;
        android.widget.TextView title = (android.widget.TextView) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon, "icon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        java.lang.String string = title.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.odn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        title.setText(string);
        return jz5.f0.f384359a;
    }
}
