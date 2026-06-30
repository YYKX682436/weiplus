package dn2;

/* loaded from: classes3.dex */
public final class j0 implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f323462a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f323463b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f323464c = jz5.h.b(new dn2.i0(this));

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        java.lang.String str;
        int i17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566107er2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f323462a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b1u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f323463b = (android.widget.TextView) findViewById2;
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.widget.TextView textView = this.f323463b;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        android.content.Context context = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.widget.TextView textView2 = this.f323463b;
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
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" ");
        android.view.View view = this.f323462a;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
            throw null;
        }
        sb6.append(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ehh, nf6));
        java.lang.String sb7 = sb6.toString();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.view.View view2 = this.f323462a;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
            throw null;
        }
        android.content.Context context2 = view2.getContext();
        ((ke0.e) xVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, sb7));
        android.widget.TextView textView3 = this.f323463b;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            k0Var.m57691xa0fa63f9();
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) dk2.ef.f314944z.get("16_white");
        if (bitmap != null) {
            android.content.Context context3 = textView3.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            int e17 = e();
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context3.getResources(), bitmap);
            try {
                i17 = (int) ((e17 * bitmap.getWidth()) / bitmap.getHeight());
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShoppingUtil", "buildImageSpan " + e18.getMessage());
                i17 = e17 * 2;
            }
            bitmapDrawable.setBounds(0, 0, i17, e17);
            f0Var.c(new al5.w(bitmapDrawable, 1), 0, 1, 33);
        } else {
            f0Var.c((al5.w) ((jz5.n) this.f323464c).mo141623x754a37bb(), 0, 1, 33);
        }
        android.widget.TextView textView4 = this.f323463b;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        android.view.ViewParent parent = textView4.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            int i18 = cn2.d0.f125022b;
            viewGroup.setPadding(cn2.d0.f125023c, viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        }
        android.widget.TextView textView5 = this.f323463b;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        textView5.setText(f0Var);
        android.widget.TextView textView6 = this.f323463b;
        if (textView6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        textView6.setTextColor(rootView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        android.view.View view3 = this.f323462a;
        if (view3 != null) {
            view3.setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563317j9));
            return rootView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
        throw null;
    }

    public final int e() {
        if (zl2.r4.f555483a.w1()) {
            int i17 = cn2.d0.f125022b;
            return cn2.d0.f125026f;
        }
        int i18 = cn2.d0.f125022b;
        return cn2.d0.f125025e;
    }

    @Override // dn2.e
    /* renamed from: getLayoutId */
    public int mo125815x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570400dj3;
    }
}
