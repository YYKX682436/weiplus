package dn2;

/* loaded from: classes3.dex */
public final class d implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f323432a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f323433b;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566107er2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f323432a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b1u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f323433b = (android.widget.TextView) findViewById2;
        dk2.w7 w7Var = liveMsg instanceof dk2.w7 ? (dk2.w7) liveMsg : null;
        java.lang.Object D = w7Var != null ? w7Var.D() : null;
        r45.qi1 qi1Var = D instanceof r45.qi1 ? (r45.qi1) D : null;
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.widget.TextView textView = this.f323433b;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        android.content.Context context = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.widget.TextView textView2 = this.f323433b;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        android.text.TextPaint paint = textView2.getPaint();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
        r45.xn1 r17 = liveMsg.r();
        if (r17 == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) r17.m75936x14adae67(0)) == null || (str = c19782x23db1cfa.m76184x8010e5e4()) == null) {
            str = "";
        }
        java.lang.CharSequence nf6 = c61.yb.nf(ybVar, context, paint, new android.text.SpannableString(str), 0, 8, null);
        int m75939xb282bd08 = qi1Var != null ? qi1Var.m75939xb282bd08(2) : 0;
        android.view.View view = this.f323432a;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
            throw null;
        }
        android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(new gm2.t1(gm2.c2.f354881g, gm2.e2.f354894g).i(m75939xb282bd08));
        drawable.setAlpha(230);
        view.setBackground(drawable);
        android.view.View view2 = this.f323432a;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
            throw null;
        }
        java.lang.String string = view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.onp, nf6, java.lang.Integer.valueOf(m75939xb282bd08));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GlobalLevelUpgradeBulletItem", "setBulletComment id:" + liveMsg.f() + ", msgContent: " + string + ", level:" + m75939xb282bd08);
        boolean z17 = m75939xb282bd08 >= 80;
        int i17 = z17 ? cn2.d0.f125022b : 0;
        gm2.c1 c1Var = gm2.c1.f354853a;
        android.widget.TextView textView3 = this.f323433b;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        android.text.style.ImageSpan b17 = c1Var.b(m75939xb282bd08, textView3, new gm2.t1(gm2.c2.f354884m, null, 2, null), i17, c1Var.k(), null);
        android.view.View view3 = this.f323432a;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
            throw null;
        }
        android.content.Context context2 = view3.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 q17 = c1Var.q(context2, string, kz5.b0.c(b17), true);
        int i18 = z17 ? 0 : cn2.d0.f125022b;
        android.widget.TextView textView4 = this.f323433b;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        android.view.ViewParent parent = textView4.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setPadding(i18, viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        }
        android.widget.TextView textView5 = this.f323433b;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        textView5.setText(q17);
        android.widget.TextView textView6 = this.f323433b;
        if (textView6 != null) {
            textView6.setTextColor(zl2.r4.f555483a.W0(m75939xb282bd08));
            return rootView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
        throw null;
    }

    @Override // dn2.e
    /* renamed from: getLayoutId */
    public int mo125815x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aox;
    }
}
