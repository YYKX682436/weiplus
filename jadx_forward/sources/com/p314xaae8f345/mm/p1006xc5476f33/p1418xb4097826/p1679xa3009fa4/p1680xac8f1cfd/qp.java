package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class qp extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 implements zy2.b9 {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f217259f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f217260g;

    /* renamed from: h, reason: collision with root package name */
    public final so2.c f217261h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217259f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.np.f216874d);
        this.f217260g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.op.f217014d);
        this.f217261h = so2.c.f491817n;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void O6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        super.O6(holder, animationType);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public android.view.View R6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.trv);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.p314xaae8f345.mm.R.id.trz);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        if (inflate != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderMultiImageDescCommentUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderMultiImageDescCommentUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public so2.c S6() {
        return this.f217261h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public boolean X6(in5.s0 holder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = holder.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMultiImageDescCommentUIC", "isNeedShow false, feedId is null!");
            return false;
        }
        java.util.List list = (java.util.List) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.c0) ((jz5.n) this.f217259f).mo141623x754a37bb()).b(java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
        if (list == null || list.isEmpty()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209255gh).mo141623x754a37bb()).r()).booleanValue() || R6(holder) != null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void Y6(in5.s0 holder, android.content.res.Configuration newConfig) {
        android.view.ViewTreeObserver viewTreeObserver;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.Y6(holder, newConfig);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.trv);
        android.view.ViewParent parent = p17 != null ? p17.getParent() : null;
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pp(this, holder, view));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void Z6(in5.s0 holder, boolean z17, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209255gh).mo141623x754a37bb()).r()).booleanValue()) {
            return;
        }
        d7(holder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void c7(in5.s0 holder) {
        r45.e60 m76061x92825f2a;
        java.util.LinkedList m75941xfb821914;
        r45.j60 j60Var;
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = holder.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 != null) {
            long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
            android.view.View R6 = R6(holder);
            if (R6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMultiImageDescCommentUIC", "beforeShow contentView is null");
            } else {
                java.util.List list = (java.util.List) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.c0) ((jz5.n) this.f217259f).mo141623x754a37bb()).b(java.lang.Long.valueOf(mo2128x1ed62e84));
                java.util.List list2 = list != null ? (java.util.List) kz5.n0.Z(list) : null;
                if (list2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderMultiImageDescCommentUIC", "beforeShow commentList is null, feedId=".concat(pm0.v.u(mo2128x1ed62e84)));
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                    if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209255gh).mo141623x754a37bb()).r()).booleanValue()) {
                        d7(holder);
                    }
                    java.lang.Integer num = (java.lang.Integer) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.c0) ((jz5.n) this.f217260g).mo141623x754a37bb()).b(java.lang.Long.valueOf(mo2128x1ed62e84));
                    android.widget.TextView textView = (android.widget.TextView) R6.findViewById(com.p314xaae8f345.mm.R.id.oqh);
                    if (textView != null) {
                        android.content.Context context = holder.f374654e;
                        if (num == null || num.intValue() <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMultiImageDescCommentUIC", "beforeShow commentCount:" + num);
                            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.owt);
                        } else {
                            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ows, num);
                        }
                        textView.setText(string);
                    }
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) R6.findViewById(com.p314xaae8f345.mm.R.id.h8v);
                    if (viewGroup != null) {
                        ym5.a1.h(viewGroup, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ip(abstractC14490x69736cb5, list2));
                    }
                    if (viewGroup != null) {
                        q26.h hVar = new q26.h((q26.i) q26.h0.i(q26.h0.i(new n3.r1(viewGroup), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gp.f216076d), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jp.f216409d));
                        int i17 = 0;
                        int i18 = 0;
                        while (hVar.hasNext()) {
                            java.lang.Object next = hVar.next();
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) next;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.trw);
                            if (c22628xfde5d61d == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMultiImageDescCommentUIC", "finder_multi_image_desc_comment_image_item image is null, index=" + i18);
                            } else {
                                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.f81553try);
                                if (progressBar != null) {
                                    progressBar.setVisibility(i17);
                                }
                                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) kz5.n0.a0(list2, i18);
                                if (c19781xd1c47b87 != null && (m76061x92825f2a = c19781xd1c47b87.m76061x92825f2a()) != null && (m75941xfb821914 = m76061x92825f2a.m75941xfb821914(1)) != null && (j60Var = (r45.j60) kz5.n0.Z(m75941xfb821914)) != null) {
                                    java.lang.String m75945x2fec83073 = j60Var.m75945x2fec8307(7);
                                    if (((m75945x2fec83073 == null || m75945x2fec83073.length() == 0) ? 1 : i17) != 0) {
                                        m75945x2fec8307 = j60Var.m75945x2fec8307(i17);
                                        m75945x2fec83072 = j60Var.m75945x2fec8307(1);
                                    } else {
                                        m75945x2fec8307 = j60Var.m75945x2fec8307(7);
                                        m75945x2fec83072 = j60Var.m75945x2fec8307(8);
                                    }
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    sb6.append(m75945x2fec8307);
                                    if (m75945x2fec83072 == null) {
                                        m75945x2fec83072 = "";
                                    }
                                    sb6.append(m75945x2fec83072);
                                    java.lang.String sb7 = sb6.toString();
                                    mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
                                    i95.m c17 = i95.n0.c(zy2.b6.class);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                                    wo0.c a17 = d1Var.a(ya2.l.f542035a.e(sb7, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
                                    a17.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lp(progressBar, sb7);
                                    ((wo0.b) a17).c(c22628xfde5d61d);
                                    c22628xfde5d61d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mp(i18, c22628xfde5d61d, abstractC14490x69736cb5, c19781xd1c47b87, this, holder));
                                }
                            }
                            i18 = i19;
                            i17 = 0;
                        }
                    }
                }
            }
        }
        super.c7(holder);
    }

    public final void d7(in5.s0 s0Var) {
        android.view.View R6 = R6(s0Var);
        if (R6 == null) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) R6.findViewById(com.p314xaae8f345.mm.R.id.trv);
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) R6.findViewById(com.p314xaae8f345.mm.R.id.h8v);
        if (viewGroup3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMultiImageDescCommentUIC", "calculateImageViewSize imageContainer is null");
            return;
        }
        if (viewGroup2 != null) {
            int width = viewGroup2.getWidth();
            if (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
                int max = java.lang.Math.max(0, (((viewGroup2.getWidth() - viewGroup2.getPaddingLeft()) - viewGroup2.getPaddingRight()) - i65.a.f(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561245an5)) / 2);
                android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = max;
                    marginLayoutParams.rightMargin = max;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMultiImageDescCommentUIC", "adjust for pad containerMargin " + max);
            }
            int f17 = i65.a.f(s0Var.f374654e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            int paddingLeft = (((width - viewGroup2.getPaddingLeft()) - viewGroup2.getPaddingRight()) - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i17 = paddingLeft - (marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0);
            android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i18 = ((i17 - (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) - (f17 * 4)) / 5;
            n3.t1 t1Var = new n3.t1(viewGroup3);
            int i19 = 0;
            while (t1Var.hasNext()) {
                if ((((android.view.View) t1Var.next()).getId() == com.p314xaae8f345.mm.R.id.trx) && (i19 = i19 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
            int max2 = java.lang.Math.max(0, 5 - i19);
            for (int i27 = 0; i27 < max2; i27++) {
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(m80379x76847179());
                frameLayout.setId(com.p314xaae8f345.mm.R.id.trx);
                android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(i18, i18);
                if (i27 > 0) {
                    layoutParams4.leftMargin = f17;
                }
                frameLayout.setLayoutParams(layoutParams4);
                frameLayout.setBackgroundColor(b3.l.m9702x7444d5ad(m80379x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77663x8b2be3dc));
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d(m80379x76847179());
                c22628xfde5d61d.setId(com.p314xaae8f345.mm.R.id.trw);
                c22628xfde5d61d.m81387x205ac394(m80379x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj));
                c22628xfde5d61d.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                c22628xfde5d61d.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                android.view.View progressBar = new android.widget.ProgressBar(m80379x76847179(), null, 0, com.p314xaae8f345.mm.R.C30868x68b1db1.f576351x4);
                progressBar.setId(com.p314xaae8f345.mm.R.id.f81553try);
                android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                progressBar.setLayoutParams(layoutParams5);
                frameLayout.addView(c22628xfde5d61d);
                frameLayout.addView(progressBar);
                viewGroup3.addView(frameLayout);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMultiImageDescCommentUIC", "calculateWidth imageWidth=" + i18);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.c0) ((jz5.n) this.f217259f).mo141623x754a37bb()).a();
    }
}
