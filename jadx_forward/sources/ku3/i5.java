package ku3;

/* loaded from: classes3.dex */
public final class i5 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f393795d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f393796e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f393797f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f393798g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f393799h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f393800i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f393801m;

    /* renamed from: n, reason: collision with root package name */
    public final int f393802n;

    /* renamed from: o, reason: collision with root package name */
    public final int f393803o;

    /* renamed from: p, reason: collision with root package name */
    public final int f393804p;

    /* renamed from: q, reason: collision with root package name */
    public final int f393805q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f393806r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f393807s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f393808t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f393809u;

    /* renamed from: v, reason: collision with root package name */
    public float f393810v;

    /* renamed from: w, reason: collision with root package name */
    public int f393811w;

    public i5(zt3.a kitContext, android.view.ViewGroup parent, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kitContext, "kitContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f393795d = kitContext;
        this.f393796e = parent;
        this.f393797f = jz5.h.b(new ku3.e5(this));
        this.f393798g = jz5.h.b(new ku3.f5(this));
        this.f393799h = jz5.h.b(new ku3.h5(this));
        this.f393800i = jz5.h.b(new ku3.g5(this));
        this.f393801m = i65.a.i(parent.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562621ke);
        this.f393802n = i65.a.d(parent.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d);
        this.f393803o = i65.a.d(parent.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        this.f393804p = i65.a.f(parent.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        this.f393805q = i65.a.f(parent.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
        this.f393811w = 3;
    }

    public static final void a(ku3.i5 i5Var, android.widget.TextView textView) {
        android.widget.TextView textView2 = i5Var.f393809u;
        if (textView2 != null) {
            textView2.setTextColor(i5Var.f393802n);
        }
        android.widget.TextView textView3 = i5Var.f393809u;
        if (textView3 != null) {
            textView3.setTextSize(0, i5Var.f393804p);
        }
        i5Var.f393809u = textView;
        if (textView != null) {
            textView.setTextColor(i5Var.f393803o);
        }
        if (textView != null) {
            textView.setTextSize(0, i5Var.f393805q);
        }
    }

    public final android.view.View b() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393797f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393798g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    public final android.view.ViewGroup d() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393799h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.ViewGroup) mo141623x754a37bb;
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        ku3.t4 t4Var = new ku3.t4(this);
        zt3.a aVar = this.f393795d;
        aVar.Q6(14, t4Var);
        aVar.Q6(10, new ku3.v4(this));
        aVar.R6(new ku3.x4(this));
        b().setOnClickListener(ku3.y4.f394022d);
        jz5.g gVar = this.f393800i;
        java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.view.View) mo141623x754a37bb).setBackground(this.f393801m);
        c().s(com.p314xaae8f345.mm.R.raw.f79985x716f880e, com.p314xaae8f345.mm.R.C30859x5a72f63.f560306gt);
        android.view.ViewGroup viewGroup = this.f393796e;
        int b17 = i65.a.b(viewGroup.getContext(), 55);
        d().setPadding(b17, 0, b17, 0);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.view.View) mo141623x754a37bb2).setOnClickListener(new ku3.a5(this));
        java.lang.String r17 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hmh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
        textView.setText(r17);
        int i17 = this.f393802n;
        textView.setTextColor(i17);
        textView.setGravity(8388627);
        float f17 = this.f393804p;
        textView.setTextSize(0, f17);
        textView.setOnClickListener(new ku3.b5(this));
        this.f393806r = textView;
        java.lang.String r18 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hmi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r18, "getString(...)");
        android.widget.TextView textView2 = new android.widget.TextView(viewGroup.getContext());
        textView2.setText(r18);
        textView2.setTextColor(i17);
        textView2.setGravity(17);
        textView2.setTextSize(0, f17);
        textView2.setOnClickListener(new ku3.c5(this));
        this.f393807s = textView2;
        java.lang.String r19 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hmg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r19, "getString(...)");
        android.widget.TextView textView3 = new android.widget.TextView(viewGroup.getContext());
        textView3.setText(r19);
        textView3.setTextColor(this.f393803o);
        textView3.setGravity(8388629);
        textView3.setTextSize(0, this.f393805q);
        textView3.setOnClickListener(new ku3.d5(this));
        this.f393808t = textView3;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.gravity = 16;
        d().addView(this.f393806r, layoutParams);
        d().addView(this.f393807s, layoutParams);
        d().addView(this.f393808t, layoutParams);
        this.f393809u = this.f393808t;
    }
}
