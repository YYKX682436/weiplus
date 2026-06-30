package qs1;

/* loaded from: classes8.dex */
public final class m implements rv.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f447761a;

    /* renamed from: b, reason: collision with root package name */
    public final int f447762b;

    /* renamed from: c, reason: collision with root package name */
    public final int f447763c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f447764d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f447765e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f447766f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f447767g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f447768h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f447769i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f447770j;

    /* renamed from: k, reason: collision with root package name */
    public final p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 f447771k;

    /* renamed from: l, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f447772l;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f447773m;

    /* renamed from: n, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f447774n;

    /* renamed from: o, reason: collision with root package name */
    public final qs1.c f447775o;

    /* renamed from: p, reason: collision with root package name */
    public final qs1.c f447776p;

    /* renamed from: q, reason: collision with root package name */
    public final qs1.c f447777q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f447778r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f447779s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f447780t;

    /* renamed from: u, reason: collision with root package name */
    public final qs1.a f447781u;

    /* renamed from: v, reason: collision with root package name */
    public final qs1.a f447782v;

    /* renamed from: w, reason: collision with root package name */
    public final qs1.a f447783w;

    /* renamed from: x, reason: collision with root package name */
    public db5.o4 f447784x;

    /* renamed from: y, reason: collision with root package name */
    public db5.o4 f447785y;

    /* renamed from: z, reason: collision with root package name */
    public db5.o4 f447786z;

    public m(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f447761a = context;
        this.f447762b = 6;
        this.f447763c = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        this.f447764d = jz5.h.b(new qs1.h(this));
        this.f447765e = jz5.h.b(new qs1.d(this));
        this.f447766f = jz5.h.b(new qs1.f(this));
        this.f447767g = jz5.h.b(new qs1.l(this));
        this.f447768h = jz5.h.b(new qs1.g(this));
        this.f447769i = jz5.h.b(new qs1.j(this));
        this.f447781u = new qs1.a(this);
        this.f447782v = new qs1.a(this);
        this.f447783w = new qs1.a(this);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dzc, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f447770j = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.sif);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f447771k = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.sil);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById2;
        this.f447772l = c1163xf1deaba4;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.sih);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById3;
        this.f447773m = c1163xf1deaba42;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.sij);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById4;
        this.f447774n = c1163xf1deaba43;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.sik);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f447778r = textView;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.sig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById6;
        this.f447779s = textView2;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.sii);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById7;
        this.f447780t = textView3;
        com.p314xaae8f345.mm.ui.fk.a(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView3);
        textView.setText("");
        textView.setVisibility(8);
        c1163xf1deaba4.setVisibility(8);
        textView2.setText("");
        textView2.setVisibility(8);
        c1163xf1deaba42.setVisibility(8);
        textView3.setText("");
        textView3.setVisibility(8);
        c1163xf1deaba43.setVisibility(8);
        qs1.c cVar = new qs1.c(this);
        this.f447775o = cVar;
        qs1.c cVar2 = new qs1.c(this);
        this.f447776p = cVar2;
        qs1.c cVar3 = new qs1.c(this);
        this.f447777q = cVar3;
        b(c1163xf1deaba4, cVar);
        b(c1163xf1deaba42, cVar2);
        b(c1163xf1deaba43, cVar3);
    }

    public final int a() {
        return ((java.lang.Number) this.f447764d.mo141623x754a37bb()).intValue();
    }

    public final void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, qs1.c cVar) {
        c1163xf1deaba4.setFocusable(false);
        c1163xf1deaba4.mo7960x6cab2c8d(cVar);
        jz5.g gVar = this.f447765e;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        android.content.Context context = this.f447761a;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, intValue));
        c1163xf1deaba4.setNestedScrollingEnabled(true);
        c1163xf1deaba4.setPadding(0, c1163xf1deaba4.getPaddingTop(), 0, c1163xf1deaba4.getPaddingBottom());
        c1163xf1deaba4.setClipToPadding(false);
        c1163xf1deaba4.N(new rs1.a(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), a(), (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn)));
    }
}
