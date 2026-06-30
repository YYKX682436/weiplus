package ul5;

/* loaded from: classes15.dex */
public final class x extends y9.i {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f510183n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f510184o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f510185p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f510186q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f510187r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f510188s;

    /* renamed from: t, reason: collision with root package name */
    public int f510189t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context) {
        super(context, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        jz5.g b17 = jz5.h.b(new ul5.v(this));
        this.f510183n = b17;
        jz5.g b18 = jz5.h.b(new ul5.t(this));
        this.f510184o = b18;
        jz5.g b19 = jz5.h.b(new ul5.u(this));
        this.f510185p = b19;
        jz5.g b27 = jz5.h.b(new ul5.w(this));
        this.f510186q = b27;
        jz5.g b28 = jz5.h.b(new ul5.s(this));
        this.f510187r = b28;
        jz5.g b29 = jz5.h.b(new ul5.r(this));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bog, (android.view.ViewGroup) null, false);
        this.f510188s = inflate;
        setContentView(inflate);
        java.lang.Object mo141623x754a37bb = ((jz5.n) b17).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.widget.EditText) mo141623x754a37bb).setText(java.lang.String.valueOf(ul5.y.f510193d));
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) b18).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.widget.EditText) mo141623x754a37bb2).setText(java.lang.String.valueOf(ul5.y.f510194e));
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) b27).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((android.widget.EditText) mo141623x754a37bb3).setText(java.lang.String.valueOf(ul5.y.f510192c));
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) b19).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        ((android.widget.EditText) mo141623x754a37bb4).setText(java.lang.String.valueOf(ul5.y.f510191b));
        java.lang.Object mo141623x754a37bb5 = ((jz5.n) b28).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
        ((android.widget.EditText) mo141623x754a37bb5).setText(java.lang.String.valueOf(ul5.y.f510190a));
        java.lang.Object mo141623x754a37bb6 = ((jz5.n) b29).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb6, "getValue(...)");
        ((android.widget.Button) mo141623x754a37bb6).setOnClickListener(new ul5.o(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("default");
        arrayList.add("scale");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kk9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        int i17 = ul5.y.f510195f;
        this.f510189t = i17;
        textView.setText((java.lang.CharSequence) arrayList.get(i17));
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f567734kk4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.Button");
        ((android.widget.Button) findViewById2).setOnClickListener(new ul5.q(this, arrayList, textView));
    }
}
