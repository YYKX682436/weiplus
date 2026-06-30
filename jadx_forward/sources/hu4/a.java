package hu4;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final hu4.a f366756d = new hu4.a();

    public a() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.TextView textView = it instanceof android.widget.TextView ? (android.widget.TextView) it : null;
        return java.lang.Boolean.valueOf(!(java.lang.String.valueOf(textView != null ? textView.getText() : null).length() == 0));
    }
}
