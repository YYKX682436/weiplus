package t24;

/* loaded from: classes.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final t24.v f496874d = new t24.v();

    public v() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String string = (java.lang.String) obj;
        android.widget.TextView view = (android.widget.TextView) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(string, "string");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        view.setText(string);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.ajw);
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), valueOf == null ? view.getPaddingRight() : i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, valueOf.intValue()), view.getPaddingBottom());
        return jz5.f0.f384359a;
    }
}
