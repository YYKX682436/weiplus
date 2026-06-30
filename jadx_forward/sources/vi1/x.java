package vi1;

/* loaded from: classes7.dex */
public final class x extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final vi1.y f519022d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f519023e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f519024f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f519025g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(vi1.y adapter, android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f519022d = adapter;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.kun);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f519023e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.kuo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f519024f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.kup);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f519025g = (android.widget.TextView) findViewById3;
    }
}
