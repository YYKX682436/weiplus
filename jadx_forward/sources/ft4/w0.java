package ft4;

/* loaded from: classes14.dex */
public final class w0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f348254d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f348255e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f348256f;

    /* renamed from: g, reason: collision with root package name */
    public final ft4.u f348257g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.view.View root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f348254d = root;
        android.view.View findViewById = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.pyn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f348255e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.pyl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f348256f = (android.widget.LinearLayout) findViewById2;
        android.view.View findViewById3 = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.q2m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f348257g = new ft4.u(context, (android.widget.LinearLayout) findViewById3);
    }
}
