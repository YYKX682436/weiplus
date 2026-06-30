package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 f186815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj2 f186816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f186817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186818g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var, r45.qj2 qj2Var, long j17, java.lang.String str) {
        super(1);
        this.f186815d = e0Var;
        this.f186816e = qj2Var;
        this.f186817f = j17;
        this.f186818g = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar != null) {
            int i18 = fVar.f152148a;
            final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var = this.f186815d;
            if (i18 == 0 && fVar.f152149b == 0) {
                android.app.Activity context = e0Var.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.j) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.j.class)).O6((r45.qj2) ((r45.v81) fVar.f152151d).m75936x14adae67(1), (r45.nj2) ((r45.v81) fVar.f152151d).m75936x14adae67(4));
                android.widget.FrameLayout frameLayout = e0Var.f186751e;
                if (frameLayout == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                    throw null;
                }
                frameLayout.setVisibility(8);
                android.view.View view = e0Var.f186753g;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
                    throw null;
                }
                view.setOnClickListener(null);
                r45.qj2 qj2Var = this.f186816e;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
                long j17 = this.f186817f;
                java.lang.String str = this.f186818g;
                int intExtra = e0Var.m158359x1e885992().getIntExtra("native_drama_init_position", 0);
                int intExtra2 = e0Var.m158359x1e885992().getIntExtra("native_drama_enter_promotion_comment_scene", -1);
                java.lang.String stringExtra = e0Var.m158359x1e885992().getStringExtra("native_drama_session_buffer");
                java.util.LinkedList m75941xfb821914 = ((r45.v81) resp).m75941xfb821914(2);
                java.util.ArrayList arrayList = e0Var.f186759p;
                java.util.ArrayList arrayList2 = e0Var.f186758o;
                if (m75941xfb821914 != null) {
                    java.util.Iterator it = m75941xfb821914.iterator();
                    int i19 = 0;
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        int i27 = i19 + 1;
                        if (i19 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.pj2 pj2Var = (r45.pj2) next;
                        java.util.Iterator it6 = it;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pj2Var);
                        arrayList2.add(new zb2.c(pj2Var));
                        java.util.LinkedList m75941xfb8219142 = pj2Var.m75941xfb821914(1);
                        if (m75941xfb8219142 != null) {
                            i17 = intExtra;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
                            for (java.util.Iterator it7 = m75941xfb8219142.iterator(); it7.hasNext(); it7 = it7) {
                                r45.oj2 oj2Var = (r45.oj2) it7.next();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oj2Var);
                                arrayList3.add(new zb2.b(oj2Var));
                            }
                            arrayList.addAll(arrayList3);
                        } else {
                            i17 = intExtra;
                        }
                        it = it6;
                        i19 = i27;
                        intExtra = i17;
                    }
                }
                int i28 = intExtra;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = e0Var.f186761r;
                if (c1163xf1deaba4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeRv");
                    throw null;
                }
                c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(e0Var.m80379x76847179(), 0, false));
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = e0Var.f186761r;
                if (c1163xf1deaba42 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeRv");
                    throw null;
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.drama.drawer.FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$2
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0.this);
                    }
                }, arrayList2, false);
                c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.q(e0Var, qj2Var);
                c1163xf1deaba42.mo7960x6cab2c8d(c22848x6ddd90cf);
                if (arrayList2.isEmpty()) {
                    android.widget.FrameLayout frameLayout2 = e0Var.f186751e;
                    if (frameLayout2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                        throw null;
                    }
                    frameLayout2.setVisibility(0);
                    android.view.View view2 = e0Var.f186752f;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                        throw null;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = e0Var.f186753g;
                    if (view3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
                        throw null;
                    }
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = e0Var.f186755i;
                if (c1163xf1deaba43 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("episodeRv");
                    throw null;
                }
                c1163xf1deaba43.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(e0Var.m80379x76847179(), 0, false));
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = e0Var.f186755i;
                if (c1163xf1deaba44 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("episodeRv");
                    throw null;
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.drama.drawer.FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$4
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0.this);
                    }
                }, arrayList, false);
                c22848x6ddd90cf2.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.r(e0Var, qj2Var, j17, str, intExtra2, stringExtra);
                c1163xf1deaba44.mo7960x6cab2c8d(c22848x6ddd90cf2);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba45 = e0Var.f186755i;
                if (c1163xf1deaba45 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("episodeRv");
                    throw null;
                }
                c1163xf1deaba45.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.t(e0Var));
                e0Var.f186762s = i28;
                e0Var.P6(i28);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba46 = e0Var.f186755i;
                if (c1163xf1deaba46 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("episodeRv");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba46.mo7946xf939df19();
                if (mo7946xf939df19 != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba47 = e0Var.f186756m;
                if (c1163xf1deaba47 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendRv");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(e0Var.m80379x76847179(), 3);
                c1161x57298f5d.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.u(e0Var);
                c1163xf1deaba47.mo7967x900dcbe1(c1161x57298f5d);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba48 = e0Var.f186756m;
                if (c1163xf1deaba48 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendRv");
                    throw null;
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.drama.drawer.FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$8
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        if (type != 1) {
                            return type != 2 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2() : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.o();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0.this;
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.n(e0Var2, ((java.lang.Number) ((jz5.n) e0Var2.f186766w).mo141623x754a37bb()).intValue());
                    }
                }, e0Var.f186760q, false);
                c22848x6ddd90cf3.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.v(e0Var, intExtra2);
                c1163xf1deaba48.mo7960x6cab2c8d(c22848x6ddd90cf3);
                android.view.ViewGroup viewGroup = e0Var.f186757n;
                if (viewGroup == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("episodeTitleLayout");
                    throw null;
                }
                viewGroup.setVisibility(0);
                android.widget.TextView textView = e0Var.f186754h;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allEpisodeTv");
                    throw null;
                }
                textView.setText(e0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyd, java.lang.Integer.valueOf(arrayList.size())));
                android.widget.TextView textView2 = e0Var.f186754h;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allEpisodeTv");
                    throw null;
                }
                textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.p(e0Var, qj2Var, j17, str, intExtra2, stringExtra));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.w(e0Var, this.f186816e);
                e0Var.getClass();
                android.widget.FrameLayout frameLayout3 = e0Var.f186751e;
                if (frameLayout3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                    throw null;
                }
                frameLayout3.setVisibility(0);
                android.view.View view4 = e0Var.f186752f;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                    throw null;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view4, arrayList6.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = e0Var.f186753g;
                if (view5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
                    throw null;
                }
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view5, arrayList7.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view6 = e0Var.f186753g;
                if (view6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
                    throw null;
                }
                view6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.d0(wVar));
            }
        }
        return jz5.f0.f384359a;
    }
}
