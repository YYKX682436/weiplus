package dn2;

/* loaded from: classes3.dex */
public final class m implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f323471a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f323472b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f323473c;

    /* renamed from: d, reason: collision with root package name */
    public cn2.k f323474d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f323475e;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        java.lang.String str;
        df2.cn cnVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566107er2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f323471a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b1u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f323472b = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f565048b23);
        android.widget.ImageView imageView = (android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.r5f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e != null && (cnVar = (df2.cn) c14197x319b1b9e.m56798x25fe639c(df2.cn.class)) != null) {
            cnVar.s7(7, null);
        }
        android.widget.TextView textView = this.f323472b;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        textView.setTextColor(rootView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        android.view.View view = this.f323471a;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
            throw null;
        }
        view.setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
        jz5.g b17 = jz5.h.b(new dn2.l(rootView));
        java.lang.Object D = liveMsg.D();
        r45.qq1 qq1Var = D instanceof r45.qq1 ? (r45.qq1) D : null;
        if (qq1Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            r45.qq1 qq1Var2 = qq1Var;
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LikeRecommendBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LikeRecommendBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            jz5.n nVar = (jz5.n) b17;
            for (android.widget.ImageView imageView2 : (android.widget.ImageView[]) nVar.mo141623x754a37bb()) {
                imageView2.setVisibility(8);
            }
            java.util.LinkedList m75941xfb821914 = qq1Var2.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFriend_list(...)");
            java.util.Collections.reverse(m75941xfb821914);
            android.content.Context context = rootView.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                java.lang.Object Ej = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ej(activity, new dn2.k(widget, this, qq1Var2, rootView));
                android.view.View view2 = this.f323471a;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                    throw null;
                }
                view2.setOnClickListener(new dn2.i(this, qq1Var2, Ej));
            }
            java.util.LinkedList m75941xfb8219142 = qq1Var2.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getFriend_list(...)");
            java.util.List L0 = kz5.n0.L0(m75941xfb8219142, 3);
            int i17 = 0;
            for (java.lang.Object obj : L0) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.xj5 xj5Var = (r45.xj5) obj;
                android.widget.ImageView imageView3 = ((android.widget.ImageView[]) nVar.mo141623x754a37bb())[i17];
                imageView3.setVisibility(0);
                java.lang.String m75945x2fec8307 = xj5Var.m75945x2fec8307(0);
                if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                    ng5.a.a(imageView3, xj5Var.m75945x2fec8307(1));
                } else {
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    g1Var.l().c(new mn2.n(xj5Var.m75945x2fec8307(0), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.X), imageView3, g1Var.h(mn2.f1.f411494o));
                }
                i17 = i18;
            }
            r45.xj5 xj5Var2 = (r45.xj5) kz5.n0.k0(L0);
            if (xj5Var2 != null) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                java.lang.String m75945x2fec83072 = xj5Var2.m75945x2fec8307(1);
                java.lang.String m75945x2fec83073 = xj5Var2.m75945x2fec8307(2);
                ((c61.l7) b6Var).getClass();
                str = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ri(m75945x2fec83072, m75945x2fec83073, false);
            } else {
                str = "";
            }
            java.lang.String str2 = str;
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context2 = rootView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            android.widget.TextView textView2 = this.f323472b;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            android.text.TextPaint paint = textView2.getPaint();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
            java.lang.String obj2 = c61.yb.nf(ybVar, context2, paint, str2, 0, 8, null).toString();
            java.lang.String m75945x2fec83074 = qq1Var2.m75945x2fec8307(1);
            if (!(m75945x2fec83074 == null || m75945x2fec83074.length() == 0) || qq1Var2.m75941xfb821914(0).size() > 1) {
                java.lang.String m75945x2fec83075 = qq1Var2.m75945x2fec8307(1);
                if (!(!(m75945x2fec83075 == null || m75945x2fec83075.length() == 0))) {
                    m75945x2fec83075 = null;
                }
                if (m75945x2fec83075 == null) {
                    android.view.View view3 = this.f323471a;
                    if (view3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                        throw null;
                    }
                    m75945x2fec83075 = view3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqu, java.lang.Integer.valueOf(qq1Var2.m75941xfb821914(0).size()));
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec83075);
                android.widget.TextView textView3 = this.f323472b;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                    throw null;
                }
                textView3.setText(obj2 + ' ' + m75945x2fec83075);
            } else {
                android.widget.TextView textView4 = this.f323472b;
                if (textView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                    throw null;
                }
                textView4.setText(java.lang.String.valueOf(obj2));
            }
            e(1, qq1Var2.m75941xfb821914(0).size());
            android.widget.TextView textView5 = this.f323472b;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = textView5.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(cn2.d0.f125023c, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            android.view.View view4 = this.f323471a;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                throw null;
            }
            view4.setBackgroundDrawable(view4.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cs8));
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
        this.f323473c = continueAnim;
        this.f323474d = curConfig;
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
