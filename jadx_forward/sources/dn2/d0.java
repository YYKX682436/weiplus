package dn2;

/* loaded from: classes3.dex */
public final class d0 implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f323434a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f323435b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f323436c;

    /* renamed from: d, reason: collision with root package name */
    public cn2.k f323437d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f323438e;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566107er2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f323434a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b1u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f323435b = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f565048b23);
        android.widget.ImageView imageView = (android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.r5f);
        e(1, 1);
        android.widget.TextView textView = this.f323435b;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        textView.setTextColor(rootView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        android.view.View view = this.f323434a;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
            throw null;
        }
        view.setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
        android.widget.ImageView imageView2 = (android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.f565045b20);
        java.lang.Object D = liveMsg.D();
        r45.tj1 tj1Var = D instanceof r45.tj1 ? (r45.tj1) D : null;
        if (tj1Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            r45.tj1 tj1Var2 = tj1Var;
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeRealTimeBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeRealTimeBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView2.setVisibility(0);
            imageView.setVisibility(0);
            ng5.a.a(imageView2, tj1Var2.m75945x2fec8307(0));
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = zl2.q4.f555466a.p(tj1Var2.m75945x2fec8307(0), null, false);
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context = rootView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.widget.TextView textView2 = this.f323435b;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            android.text.TextPaint paint = textView2.getPaint();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
            java.lang.String obj = c61.yb.nf(ybVar, context, paint, (java.lang.CharSequence) h0Var.f391656d, 0, 8, null).toString();
            h0Var.f391656d = obj;
            android.widget.TextView textView3 = this.f323435b;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            textView3.setText(obj);
            android.content.Context context2 = rootView.getContext();
            android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
            if (activity != null) {
                java.lang.Object Ej = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ej(activity, new dn2.c0(widget, this, rootView));
                android.view.View view2 = this.f323434a;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                    throw null;
                }
                view2.setOnClickListener(new dn2.a0(this, Ej, tj1Var2, h0Var));
            }
            android.widget.TextView textView4 = this.f323435b;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i17 = cn2.d0.f125022b;
                marginLayoutParams.setMargins(cn2.d0.f125023c, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            android.view.View view3 = this.f323434a;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                throw null;
            }
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                throw null;
            }
            view3.setBackgroundDrawable(view3.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cs8));
            imageView.setVisibility(0);
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = c1Var != null ? c1Var.f410379n : null;
            zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
            zy2.r6 r6Var = new zy2.r6();
            r6Var.f559091i = c19792x256d2725;
            android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79233x8ecb0cec, i65.a.d(imageView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getColorDrawable(...)");
            ((ht2.y0) s6Var).sj(imageView, r6Var, e17);
        }
        return rootView;
    }

    @Override // dn2.e
    public void d(cn2.k curConfig, yz5.l continueAnim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curConfig, "curConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continueAnim, "continueAnim");
        this.f323436c = continueAnim;
        this.f323437d = curConfig;
    }

    public final void e(int i17, int i18) {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.J2;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.o("friend_like_cnt", i18);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // dn2.e
    /* renamed from: getLayoutId */
    public int mo125815x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570399ba5;
    }
}
