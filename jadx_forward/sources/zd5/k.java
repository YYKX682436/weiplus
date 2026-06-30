package zd5;

/* loaded from: classes9.dex */
public abstract class k extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f553224d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f553225e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f553226f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f553227g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f553228h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f553229i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.view.View convertView) {
        super(convertView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        this.f553224d = convertView;
        android.view.View findViewById = convertView.findViewById(com.p314xaae8f345.mm.R.id.gfx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f553225e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = convertView.findViewById(com.p314xaae8f345.mm.R.id.gfz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f553226f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = convertView.findViewById(com.p314xaae8f345.mm.R.id.f566602gg0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f553227g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = convertView.findViewById(com.p314xaae8f345.mm.R.id.gge);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f553228h = textView;
        android.view.View findViewById5 = convertView.findViewById(com.p314xaae8f345.mm.R.id.gft);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f553229i = findViewById5;
        textView.setSingleLine(false);
        textView.setMaxLines(2);
    }

    public final void i(android.widget.TextView view, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        view.setText(o13.q.c(view.getContext(), view.getText(), str));
    }
}
