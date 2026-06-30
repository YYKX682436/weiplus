package pk2;

/* loaded from: classes3.dex */
public final class c7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f437151a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f437152b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f437153c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f437154d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f437155e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f437156f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f437157g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f437158h;

    /* renamed from: i, reason: collision with root package name */
    public final pk2.w6 f437159i;

    /* renamed from: j, reason: collision with root package name */
    public final pk2.w6 f437160j;

    /* renamed from: k, reason: collision with root package name */
    public final pk2.w6 f437161k;

    /* renamed from: l, reason: collision with root package name */
    public final android.widget.TextView f437162l;

    /* renamed from: m, reason: collision with root package name */
    public db5.o4 f437163m;

    /* renamed from: n, reason: collision with root package name */
    public db5.o4 f437164n;

    /* renamed from: o, reason: collision with root package name */
    public db5.o4 f437165o;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
    }

    public c7(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f437151a = context;
        this.f437152b = z17;
        this.f437153c = jz5.h.b(new pk2.y6(this));
        this.f437154d = jz5.h.b(new pk2.b7(this));
        this.f437155e = jz5.h.b(new pk2.z6(this));
        this.f437156f = jz5.h.b(new pk2.a7(this));
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.am7, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f437157g = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.ejl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ejh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById2;
        this.f437158h = c1163xf1deaba4;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ejj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ejk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ejg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f437162l = textView;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.eji);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById4);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById6);
        pk2.w6 w6Var = new pk2.w6(this);
        this.f437159i = w6Var;
        pk2.w6 w6Var2 = new pk2.w6(this);
        this.f437160j = w6Var2;
        pk2.w6 w6Var3 = new pk2.w6(this);
        this.f437161k = w6Var3;
        b((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById, w6Var);
        b(c1163xf1deaba4, w6Var2);
        b((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById3, w6Var3);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 a() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3) ((jz5.n) this.f437153c).mo141623x754a37bb();
    }

    public final void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, pk2.w6 w6Var) {
        c1163xf1deaba4.setFocusable(false);
        c1163xf1deaba4.mo7960x6cab2c8d(w6Var);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(this.f437151a, 5));
    }
}
