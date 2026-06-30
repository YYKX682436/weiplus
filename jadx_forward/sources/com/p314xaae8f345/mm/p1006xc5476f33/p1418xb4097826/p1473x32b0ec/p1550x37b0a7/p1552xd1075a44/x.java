package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.a {
    public android.view.View A;
    public android.widget.LinearLayout B;

    /* renamed from: n, reason: collision with root package name */
    public final kn2.c f202331n;

    /* renamed from: o, reason: collision with root package name */
    public final kn2.d f202332o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f202333p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x f202334q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 f202335r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f202336s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f202337t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f202338u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f202339v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f202340w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f202341x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f202342y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f202343z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, p012xc85e97e9.p093xedfae76a.y owner, kn2.c serviceLive, kn2.d viewEvent) {
        super(context, owner, false, true);
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceLive, "serviceLive");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewEvent, "viewEvent");
        this.f202331n = serviceLive;
        this.f202332o = viewEvent;
        if (context.getResources().getConfiguration().orientation == 2) {
            wd2.g gVar = this.f199917g;
            android.view.View findViewById = (gVar == null || (view = gVar.f526370d) == null) ? null : view.findViewById(com.p314xaae8f345.mm.R.id.f6b);
            if (findViewById != null) {
                findViewById.setRotation(0.0f);
            }
        }
        android.view.View findViewById2 = this.f199917g.f526369c.b().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.jhc);
        if (findViewById2 != null) {
            findViewById2.setImportantForAccessibility(2);
        }
        android.view.View findViewById3 = this.f199917g.f526370d.findViewById(com.p314xaae8f345.mm.R.id.f6b);
        if (findViewById3 == null) {
            return;
        }
        findViewById3.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ekn));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570387ao0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ekm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.String str;
        ln2.e eVar = (ln2.e) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishAudiencePanelWidget", "onChanged: " + eVar);
        int i17 = 1;
        if (eVar != null && eVar.f401418b) {
            r45.vu1 vu1Var = eVar.f401417a;
            if (vu1Var != null) {
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f202333p;
                if (c1073x7e08a787 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                    throw null;
                }
                c1073x7e08a787.removeAllViews();
                java.util.LinkedList m75941xfb821914 = vu1Var.m75941xfb821914(1);
                if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = this.f202333p;
                    if (c1073x7e08a7872 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                        throw null;
                    }
                    c1073x7e08a7872.setVisibility(8);
                    android.view.View view = this.f202337t;
                    if (view == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subTitleView");
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    java.util.LinkedList<r45.z94> m75941xfb8219142 = vu1Var.m75941xfb821914(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getWish_list(...)");
                    for (r45.z94 z94Var : m75941xfb8219142) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z94Var);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.s(this, z94Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.u(this, eVar.f401417a));
                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = this.f202333p;
                        if (c1073x7e08a7873 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                            throw null;
                        }
                        android.view.View rootView = sVar.f202303c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "rootView");
                        c1073x7e08a7873.addView(rootView);
                    }
                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7874 = this.f202333p;
                    if (c1073x7e08a7874 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                        throw null;
                    }
                    c1073x7e08a7874.setVisibility(0);
                    android.view.View view2 = this.f202337t;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subTitleView");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7875 = this.f202333p;
            if (c1073x7e08a7875 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                throw null;
            }
            z(c1073x7e08a7875);
        }
        boolean z17 = eVar != null && eVar.f401420d;
        android.content.Context context = this.f199914d;
        if (z17) {
            dk2.z7 z7Var = eVar.f401419c;
            if (z7Var != null) {
                boolean z18 = z7Var.f315958b;
                if (z18) {
                    ln2.a aVar = ln2.b.f401409a;
                    r45.c04 c04Var = z7Var.f315957a;
                    if (aVar.a(c04Var)) {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f202338u;
                        if (c22699x3dcdb352 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishIcon");
                            throw null;
                        }
                        c22699x3dcdb352.setImageResource(aVar.c((int) c04Var.m75942xfb822ef2(0), com.p314xaae8f345.mm.R.raw.f79297xeb90d885));
                        zl2.r4 r4Var = zl2.r4.f555483a;
                        java.lang.String S = zl2.r4.S(r4Var, c04Var.m75942xfb822ef2(2), 0, 2, null);
                        java.lang.String S2 = zl2.r4.S(r4Var, c04Var.m75942xfb822ef2(1), 0, 2, null);
                        android.widget.TextView textView = this.f202339v;
                        if (textView == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishDesc");
                            throw null;
                        }
                        android.content.Context context2 = this.f199914d;
                        int m75942xfb822ef2 = (int) c04Var.m75942xfb822ef2(0);
                        java.lang.String m75945x2fec8307 = c04Var.m75945x2fec8307(4);
                        textView.setText(ln2.a.b(aVar, context2, m75942xfb822ef2, S2, m75945x2fec8307 == null ? "" : m75945x2fec8307, null, 16, null));
                        android.widget.TextView textView2 = this.f202340w;
                        if (textView2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishCurrentCount");
                            throw null;
                        }
                        textView2.setText(S);
                        android.widget.TextView textView3 = this.f202341x;
                        if (textView3 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishTargetCount");
                            throw null;
                        }
                        textView3.setText("/".concat(S2));
                        android.widget.TextView textView4 = this.f202343z;
                        if (textView4 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishActionBtn");
                            throw null;
                        }
                        int m75942xfb822ef22 = (int) c04Var.m75942xfb822ef2(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                        if (m75942xfb822ef22 == 1) {
                            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oqz);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                        } else if (m75942xfb822ef22 == 2) {
                            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oqo);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                        } else if (m75942xfb822ef22 == 3) {
                            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575249or3);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("InteractionWishDataHelper", "getInteractionTypeActionText: unknown interactionType=" + m75942xfb822ef22 + ", using defaultString=\"\"");
                            str = "";
                        }
                        textView4.setText(str);
                        android.view.View view3 = this.f202342y;
                        if (view3 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishLayout");
                            throw null;
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        f0Var = jz5.f0.f384359a;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishAudiencePanelWidget", "hideInteractionWishLayout: enableFlag=" + z18);
                android.view.View view4 = this.f202342y;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishLayout");
                    throw null;
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishAudiencePanelWidget", "hideInteractionWishLayout: data.interactionWishInfo is null");
                android.view.View view5 = this.f202342y;
                if (view5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishLayout");
                    throw null;
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (eVar != null && eVar.f401422f) {
            java.util.List<r45.hn> list = eVar.f401421e;
            if (list == null || list.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishAudiencePanelWidget", "hideBoardEventLayout: entries is null or empty");
                android.view.View view6 = this.A;
                if (view6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("boardEventLayout");
                    throw null;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.widget.LinearLayout linearLayout = this.B;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("boardEventListContainer");
                throw null;
            }
            linearLayout.removeAllViews();
            for (r45.hn hnVar : list) {
                android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
                android.widget.LinearLayout linearLayout2 = this.B;
                if (linearLayout2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("boardEventListContainer");
                    throw null;
                }
                android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570397e94, (android.view.ViewGroup) linearLayout2, false);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.tgm);
                android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.tgl);
                android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.tgk);
                java.lang.String m75945x2fec83072 = hnVar.m75945x2fec8307(0);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                textView5.setText(m75945x2fec83072);
                java.lang.String m75945x2fec83073 = hnVar.m75945x2fec8307(i17);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                textView6.setText(m75945x2fec83073);
                java.lang.String m75945x2fec83074 = hnVar.m75945x2fec8307(3);
                if (((m75945x2fec83074 == null || m75945x2fec83074.length() == 0) ? i17 : 0) == 0) {
                    imageView.setVisibility(0);
                    ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(m75945x2fec83074, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f))).c(imageView);
                } else {
                    imageView.setVisibility(8);
                }
                inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t(hnVar, this));
                android.widget.LinearLayout linearLayout3 = this.B;
                if (linearLayout3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("boardEventListContainer");
                    throw null;
                }
                linearLayout3.addView(inflate);
                i17 = 1;
            }
            android.view.View view7 = this.A;
            if (view7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("boardEventLayout");
                throw null;
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.pn7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f202335r = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570) findViewById;
        android.content.Context context = this.f199914d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b1j, (android.view.ViewGroup) null, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f202336s = inflate;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.frh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f202333p = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById2;
        android.view.View view = this.f202336s;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.fri);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f202337t = findViewById3;
        android.view.View view2 = this.f202336s;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById4 = view2.findViewById(com.p314xaae8f345.mm.R.id.tj6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f202338u = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById4;
        android.view.View view3 = this.f202336s;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById5 = view3.findViewById(com.p314xaae8f345.mm.R.id.f566211tj3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f202339v = (android.widget.TextView) findViewById5;
        android.view.View view4 = this.f202336s;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById6 = view4.findViewById(com.p314xaae8f345.mm.R.id.f566210tj2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f202340w = (android.widget.TextView) findViewById6;
        android.view.View view5 = this.f202336s;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById7 = view5.findViewById(com.p314xaae8f345.mm.R.id.tjk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f202341x = (android.widget.TextView) findViewById7;
        android.view.View view6 = this.f202336s;
        if (view6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById8 = view6.findViewById(com.p314xaae8f345.mm.R.id.tj7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f202342y = findViewById8;
        android.view.View view7 = this.f202336s;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById9 = view7.findViewById(com.p314xaae8f345.mm.R.id.u5d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById9;
        this.f202343z = textView;
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.v(this));
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570398e95, (android.view.ViewGroup) null, false);
        android.view.View findViewById10 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.tgn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.A = findViewById10;
        android.view.View findViewById11 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.tgo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.B = (android.widget.LinearLayout) findViewById11;
        if (this.f202334q == null) {
            this.f202334q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x();
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) rootView.findViewById(com.p314xaae8f345.mm.R.id.f3v);
        android.view.View inflate3 = viewStub != null ? viewStub.inflate() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar = this.f202334q;
        if (xVar != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c5570 = this.f202335r;
            if (c22843x6b8c5570 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentRv");
                throw null;
            }
            android.view.View view8 = this.f202336s;
            if (view8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
                throw null;
            }
            xVar.f(c22843x6b8c5570, view8, inflate3, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.w(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar2 = this.f202334q;
        if (xVar2 == null || (c22848x6ddd90cf = xVar2.f202198b) == null) {
            return;
        }
        c22848x6ddd90cf.O(inflate2, 4, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar = this.f202334q;
        if (xVar != null) {
            xVar.h();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar = this.f202334q;
        if (xVar != null) {
            xVar.f202213q.mo48813x58998cd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar2 = this.f202334q;
        if (xVar2 != null) {
            xVar2.k(this.f202216m);
        }
        super.w();
    }
}
