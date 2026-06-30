package ku3;

/* loaded from: classes3.dex */
public final class e3 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f393737d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f393738e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f393739f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f393740g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f393741h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f393742i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f393743m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f393744n;

    /* renamed from: o, reason: collision with root package name */
    public final int f393745o;

    /* renamed from: p, reason: collision with root package name */
    public final int f393746p;

    /* renamed from: q, reason: collision with root package name */
    public final int f393747q;

    /* renamed from: r, reason: collision with root package name */
    public final int f393748r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f393749s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f393750t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f393751u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f393752v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f393753w;

    /* renamed from: x, reason: collision with root package name */
    public float f393754x;

    /* renamed from: y, reason: collision with root package name */
    public int f393755y;

    public e3(zt3.a kitContext, android.view.ViewGroup parent, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kitContext, "kitContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f393737d = kitContext;
        this.f393738e = parent;
        this.f393739f = jz5.h.b(new ku3.o2(this));
        this.f393740g = jz5.h.b(new ku3.p2(this));
        this.f393741h = jz5.h.b(new ku3.r2(this));
        this.f393742i = jz5.h.b(new ku3.q2(this));
        this.f393743m = i65.a.i(parent.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562620kd);
        this.f393744n = i65.a.i(parent.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562621ke);
        this.f393745o = i65.a.d(parent.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d);
        this.f393746p = i65.a.d(parent.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        this.f393747q = i65.a.f(parent.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        this.f393748r = i65.a.f(parent.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
        this.f393755y = 1;
    }

    public static final void a(ku3.e3 e3Var, android.widget.TextView textView) {
        android.widget.TextView textView2 = e3Var.f393753w;
        if (textView2 != null) {
            textView2.setTextColor(e3Var.f393745o);
        }
        android.widget.TextView textView3 = e3Var.f393753w;
        if (textView3 != null) {
            textView3.setTextSize(0, e3Var.f393747q);
        }
        e3Var.f393753w = textView;
        if (textView != null) {
            textView.setTextColor(e3Var.f393746p);
        }
        if (textView != null) {
            textView.setTextSize(0, e3Var.f393748r);
        }
    }

    public final android.widget.TextView b(java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(this.f393738e.getContext());
        textView.setText(str);
        return textView;
    }

    public final android.view.View c() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393739f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 d() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393740g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    public final android.view.View e() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393742i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.view.ViewGroup f() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393741h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.ViewGroup) mo141623x754a37bb;
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        ku3.z2 z2Var = new ku3.z2(this);
        zt3.a aVar = this.f393737d;
        aVar.Q6(13, z2Var);
        aVar.Q6(10, new ku3.b3(this));
        aVar.R6(new ku3.d3(this));
        c().setOnClickListener(ku3.s2.f393940d);
        e().setBackground(this.f393744n);
        d().s(com.p314xaae8f345.mm.R.raw.f79977x985fd9b7, com.p314xaae8f345.mm.R.C30859x5a72f63.f560306gt);
        android.view.ViewGroup viewGroup = this.f393738e;
        int b17 = i65.a.b(viewGroup.getContext(), 30);
        f().setPadding(b17, 0, b17, 0);
        e().setOnClickListener(new ku3.u2(this));
        java.lang.String r17 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hmf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        android.widget.TextView b18 = b(r17);
        b18.setTextColor(this.f393746p);
        b18.setTextSize(0, this.f393748r);
        b18.setGravity(17);
        b18.setOnClickListener(new ku3.v2(this));
        this.f393749s = b18;
        java.lang.String r18 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hmb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r18, "getString(...)");
        android.widget.TextView b19 = b(r18);
        int i17 = this.f393745o;
        b19.setTextColor(i17);
        b19.setGravity(17);
        float f17 = this.f393747q;
        b19.setTextSize(0, f17);
        b19.setOnClickListener(new ku3.w2(this));
        this.f393750t = b19;
        java.lang.String r19 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hmc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r19, "getString(...)");
        android.widget.TextView b27 = b(r19);
        b27.setTextColor(i17);
        b27.setGravity(17);
        b27.setTextSize(0, f17);
        b27.setOnClickListener(new ku3.x2(this));
        this.f393751u = b27;
        java.lang.String r27 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hma);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r27, "getString(...)");
        android.widget.TextView b28 = b(r27);
        b28.setTextColor(i17);
        b28.setGravity(17);
        b28.setTextSize(0, f17);
        b28.setOnClickListener(new ku3.y2(this));
        this.f393752v = b28;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.gravity = 16;
        f().addView(this.f393749s, layoutParams);
        f().addView(this.f393750t, layoutParams);
        f().addView(this.f393751u, layoutParams);
        f().addView(this.f393752v, layoutParams);
        this.f393753w = this.f393749s;
    }
}
