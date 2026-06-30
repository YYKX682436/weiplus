package dn2;

/* loaded from: classes3.dex */
public final class b implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f323419a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f323420b;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        if (!(liveMsg instanceof dk2.w5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CommentTopAreaBulletItem", "invalid livemsg:" + liveMsg);
            return rootView;
        }
        android.content.Context context = rootView.getContext();
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566107er2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f323419a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b1u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f323420b = (android.widget.TextView) findViewById2;
        android.view.View view = this.f323419a;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
            throw null;
        }
        view.setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0);
        android.widget.TextView textView = this.f323420b;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        textView.setTextColor(color);
        r45.dj1 dj1Var = ((dk2.w5) liveMsg).f315812b;
        java.lang.String m75945x2fec8307 = dj1Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) dj1Var.m75936x14adae67(3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show FinderLiveEnterRoomBulletAppMsg, tips:");
        sb6.append(m75945x2fec8307);
        sb6.append(" hasJumpInfo:");
        sb6.append(c19786x6a1e2862 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommentTopAreaBulletItem", sb6.toString());
        if (c19786x6a1e2862 != null) {
            android.widget.TextView textView2 = this.f323420b;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            textView2.setOnClickListener(new dn2.a(this, m75945x2fec8307, c19786x6a1e2862));
            android.text.SpannableString spannableString = new android.text.SpannableString(m75945x2fec8307.concat("arrow"));
            android.graphics.drawable.Drawable e17 = m95.a.e(context.getResources(), com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1, 0.0f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getSVGDrawable(...)");
            e17.setColorFilter(new android.graphics.PorterDuffColorFilter(color, android.graphics.PorterDuff.Mode.SRC_ATOP));
            e17.setBounds(0, 0, es.h.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8), es.h.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq sqVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq(e17);
            e06.k kVar = new e06.k(spannableString.length() - 5, spannableString.length());
            spannableString.setSpan(sqVar, kVar.h().intValue(), kVar.g().intValue(), 17);
            android.widget.TextView textView3 = this.f323420b;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            textView3.setText(spannableString);
        } else {
            android.widget.TextView textView4 = this.f323420b;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            textView4.setOnClickListener(null);
            android.widget.TextView textView5 = this.f323420b;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            textView5.setText(m75945x2fec8307);
        }
        if (dj1Var.m75939xb282bd08(0) == 2) {
            android.widget.TextView textView6 = this.f323420b;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            textView6.setMaxLines(3);
            android.view.ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
            layoutParams.height = -2;
            rootView.setMinimumHeight((int) rootView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db));
            rootView.setLayoutParams(layoutParams);
            android.view.View view2 = this.f323419a;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                throw null;
            }
            int b17 = i65.a.b(context, 3);
            view2.setPadding(view2.getPaddingLeft(), b17, view2.getPaddingRight(), b17);
        }
        return rootView;
    }

    @Override // dn2.e
    /* renamed from: getLayoutId */
    public int mo125815x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570400dj3;
    }
}
