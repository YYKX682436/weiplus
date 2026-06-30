package p50;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final p50.a f433524d = new p50.a();

    public a() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        android.widget.TextView textView;
        java.lang.CharSequence text;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Context context = it.getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.view.ViewParent parent = it.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null || (textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.kbq)) == null || (text = textView.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        objArr[0] = str;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j1u, objArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }
}
