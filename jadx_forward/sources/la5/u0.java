package la5;

/* loaded from: classes.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final la5.u0 f399176d = new la5.u0();

    public u0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.TextView textView;
        java.lang.CharSequence text;
        java.lang.String obj2;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.ViewParent parent = it.getParent().getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        return (viewGroup == null || (textView = (android.widget.TextView) viewGroup.findViewById(android.R.id.title)) == null || (text = textView.getText()) == null || (obj2 = text.toString()) == null) ? "" : obj2;
    }
}
