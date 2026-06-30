package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.a {
    public android.view.View A;
    public android.view.View B;
    public android.widget.LinearLayout C;

    /* renamed from: n, reason: collision with root package name */
    public final kn2.d f202282n;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f202283o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f202284p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 f202285q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x f202286r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f202287s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f202288t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f202289u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f202290v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f202291w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f202292x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f202293y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f202294z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, p012xc85e97e9.p093xedfae76a.y owner, kn2.c serviceLive, kn2.d viewEvent) {
        super(context, owner, false, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceLive, "serviceLive");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewEvent, "viewEvent");
        this.f202282n = viewEvent;
    }

    public final void A(boolean z17) {
        android.view.View view = this.A;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveWishEditTipsGroup");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
        android.content.Context context = this.f199914d;
        if (z17) {
            layoutParams2.f92426h = -1;
            android.view.View view2 = this.f202294z;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishLayout");
                throw null;
            }
            layoutParams2.f92428i = view2.getId();
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        } else {
            layoutParams2.f92426h = 0;
            layoutParams2.f92428i = -1;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        }
        android.view.View view3 = this.A;
        if (view3 != null) {
            view3.setLayoutParams(layoutParams2);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveWishEditTipsGroup");
            throw null;
        }
    }

    public final void B() {
        android.view.View view = this.f202294z;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "hideInteractionWishLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "hideInteractionWishLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        A(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View c() {
        android.widget.TextView textView = new android.widget.TextView(this.f199914d);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        com.p314xaae8f345.mm.ui.fk.a(textView);
        textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dkb));
        return textView;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.anp;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ln2.d dVar;
        java.lang.String str;
        java.lang.Integer num;
        java.lang.String str2;
        pf5.u uVar;
        android.content.Context context;
        java.lang.Class<mn2.i4> cls;
        java.lang.Class<zy2.b6> cls2;
        java.lang.Integer num2;
        java.lang.String str3;
        java.lang.Class<mn2.i4> cls3;
        pf5.u uVar2;
        java.lang.Class<zy2.b6> cls4;
        java.lang.Throwable th6;
        java.lang.Object obj2;
        ln2.d dVar2;
        pf5.u uVar3;
        java.lang.Class<mn2.i4> cls5;
        java.lang.Class<zy2.b6> cls6;
        int i17;
        r45.kv1 kv1Var;
        int i18;
        int i19;
        ln2.d dVar3 = (ln2.d) obj;
        java.lang.String str4 = "WishAnchorPanelWidget";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishAnchorPanelWidget", "onChanged: " + dVar3);
        int i27 = 0;
        java.lang.Integer num3 = 0;
        boolean z17 = dVar3 != null && dVar3.f401412b;
        pf5.u uVar4 = pf5.u.f435469a;
        java.lang.Class<mn2.i4> cls7 = mn2.i4.class;
        java.lang.Class<zy2.b6> cls8 = zy2.b6.class;
        android.content.Context context2 = this.f199914d;
        java.lang.String str5 = "";
        if (z17) {
            r45.vu1 vu1Var = dVar3.f401411a;
            if (vu1Var != null) {
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f202283o;
                if (c1073x7e08a787 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                    throw null;
                }
                c1073x7e08a787.removeAllViews();
                if (vu1Var.m75942xfb822ef2(3) >= vu1Var.m75942xfb822ef2(2)) {
                    x("", "");
                    android.view.View view = this.f202289u;
                    if (view == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allFinishGroup");
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(num3);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = this.f202288t;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sumValueGroup");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (vu1Var.m75942xfb822ef2(2) == 0) {
                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = this.f202283o;
                        if (c1073x7e08a7872 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                            throw null;
                        }
                        c1073x7e08a7872.setVisibility(8);
                        android.view.View view3 = this.f202288t;
                        if (view3 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sumValueGroup");
                            throw null;
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View view4 = this.f202289u;
                        if (view4 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allFinishGroup");
                            throw null;
                        }
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    android.view.View view5 = this.f202289u;
                    if (view5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allFinishGroup");
                        throw null;
                    }
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view6 = this.f202288t;
                    if (view6 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sumValueGroup");
                        throw null;
                    }
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(num3);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = this.f202283o;
                    if (c1073x7e08a7873 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                        throw null;
                    }
                    c1073x7e08a7873.setVisibility(0);
                }
                java.lang.String string = context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ekt);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                this.f199917g.d(string);
                java.util.LinkedList m75941xfb821914 = vu1Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getWish_list(...)");
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    r45.kv1 kv1Var2 = (r45.kv1) ((r45.z94) obj2).m75936x14adae67(i27);
                    if (kv1Var2 != null) {
                        i19 = kv1Var2.m75939xb282bd08(12);
                        i18 = 8;
                    } else {
                        i18 = 8;
                        i19 = 0;
                    }
                    if (pm0.v.z(i19, i18)) {
                        break;
                    } else {
                        i27 = 0;
                    }
                }
                boolean z18 = obj2 != null;
                int i28 = 1;
                java.util.LinkedList m75941xfb8219142 = vu1Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getWish_list(...)");
                java.util.Iterator it6 = m75941xfb8219142.iterator();
                int i29 = 0;
                while (it6.hasNext()) {
                    r45.z94 z94Var = (r45.z94) it6.next();
                    long m75942xfb822ef2 = z94Var.m75942xfb822ef2(i28);
                    r45.kv1 kv1Var3 = (r45.kv1) z94Var.m75936x14adae67(0);
                    float m75938x746dc8a6 = kv1Var3 != null ? kv1Var3.m75938x746dc8a6(9) : 0.0f;
                    java.lang.String str6 = str5;
                    java.util.Iterator it7 = it6;
                    int i37 = i29 + ((int) (m75938x746dc8a6 * m75942xfb822ef2));
                    android.view.LayoutInflater from = android.view.LayoutInflater.from(context2);
                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7874 = this.f202283o;
                    if (c1073x7e08a7874 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                        throw null;
                    }
                    android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ann, (android.view.ViewGroup) c1073x7e08a7874, false);
                    android.widget.ImageView giftView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f0o);
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566181f11);
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.pn8);
                    android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569272pn4);
                    android.content.Context context3 = context2;
                    android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mlf);
                    java.lang.Integer num4 = num3;
                    android.view.View tagView = inflate.findViewById(com.p314xaae8f345.mm.R.id.f3g);
                    java.lang.String str7 = str4;
                    inflate.setId(z94Var.hashCode());
                    r45.kv1 kv1Var4 = (r45.kv1) z94Var.m75936x14adae67(0);
                    if (kv1Var4 != null) {
                        dVar2 = dVar3;
                        cls5 = cls7;
                        uVar3 = uVar4;
                        cls6 = cls8;
                        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar4.e(cls8).c(cls7))).H).mo141623x754a37bb()).a(new mn2.q3(kv1Var4.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(giftView, "giftView");
                        ((wo0.b) a17).c(giftView);
                        i17 = 8;
                        textView.setText(kv1Var4.m75945x2fec8307(8));
                    } else {
                        dVar2 = dVar3;
                        uVar3 = uVar4;
                        cls5 = cls7;
                        cls6 = cls8;
                        i17 = 8;
                    }
                    textView4.setVisibility(i17);
                    textView2.setText("/" + z94Var.m75942xfb822ef2(1));
                    long m75942xfb822ef22 = z94Var.m75942xfb822ef2(2);
                    textView3.setText(m75942xfb822ef22 > 1000000 ? "100万+" : java.lang.String.valueOf(m75942xfb822ef22));
                    zl2.r4 r4Var = zl2.r4.f555483a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tagView, "tagView");
                    r45.kv1 kv1Var5 = (r45.kv1) z94Var.m75936x14adae67(0);
                    r4Var.P2(tagView, kv1Var5 != null ? ce2.i.U1.b(kv1Var5) : null);
                    if (z18 && (kv1Var = (r45.kv1) z94Var.m75936x14adae67(0)) != null) {
                        if (pm0.v.z(kv1Var.m75939xb282bd08(12), 8)) {
                            textView4.setVisibility(0);
                        } else {
                            textView4.setVisibility(4);
                        }
                    }
                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7875 = this.f202283o;
                    if (c1073x7e08a7875 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                        throw null;
                    }
                    c1073x7e08a7875.addView(inflate);
                    it6 = it7;
                    i29 = i37;
                    str5 = str6;
                    context2 = context3;
                    num3 = num4;
                    str4 = str7;
                    dVar3 = dVar2;
                    cls7 = cls5;
                    uVar4 = uVar3;
                    cls8 = cls6;
                    i28 = 1;
                }
                dVar = dVar3;
                str = str4;
                num = num3;
                str2 = str5;
                uVar = uVar4;
                context = context2;
                cls = cls7;
                cls2 = cls8;
                th6 = null;
                android.widget.TextView textView5 = this.f202287s;
                if (textView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sumValueText");
                    throw null;
                }
                textView5.setText(java.lang.String.valueOf(i29));
            } else {
                dVar = dVar3;
                str = "WishAnchorPanelWidget";
                num = num3;
                str2 = "";
                uVar = uVar4;
                context = context2;
                cls = cls7;
                cls2 = cls8;
                th6 = null;
            }
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7876 = this.f202283o;
            if (c1073x7e08a7876 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                throw th6;
            }
            z(c1073x7e08a7876);
        } else {
            dVar = dVar3;
            str = "WishAnchorPanelWidget";
            num = num3;
            str2 = "";
            uVar = uVar4;
            context = context2;
            cls = cls7;
            cls2 = cls8;
        }
        ln2.d dVar4 = dVar;
        if (dVar != null && dVar4.f401414d) {
            r45.xs1 xs1Var = dVar4.f401413c;
            if (xs1Var == null) {
                str3 = str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "handleInteractionWishUpdate hideInteractionWishLayout: data.interactionWishResp is null");
                B();
            } else {
                str3 = str;
                if (xs1Var.m75933x41a8a7f2(3)) {
                    r45.c04 c04Var = (r45.c04) xs1Var.m75936x14adae67(1);
                    if (c04Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "handleInteractionWishUpdate hideInteractionWishLayout: cur_wish_config is null");
                        B();
                    } else {
                        ln2.a aVar = ln2.b.f401409a;
                        if (aVar.a(c04Var)) {
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f202290v;
                            if (c22699x3dcdb352 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishIcon");
                                throw null;
                            }
                            c22699x3dcdb352.setImageResource(aVar.c((int) c04Var.m75942xfb822ef2(0), com.p314xaae8f345.mm.R.raw.f79297xeb90d885));
                            zl2.r4 r4Var2 = zl2.r4.f555483a;
                            java.lang.String S = zl2.r4.S(r4Var2, c04Var.m75942xfb822ef2(2), 0, 2, null);
                            java.lang.String S2 = zl2.r4.S(r4Var2, c04Var.m75942xfb822ef2(1), 0, 2, null);
                            android.widget.TextView textView6 = this.f202291w;
                            if (textView6 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishDesc");
                                throw null;
                            }
                            android.content.Context context4 = this.f199914d;
                            int m75942xfb822ef23 = (int) c04Var.m75942xfb822ef2(0);
                            java.lang.String m75945x2fec8307 = c04Var.m75945x2fec8307(4);
                            textView6.setText(ln2.a.b(aVar, context4, m75942xfb822ef23, S2, m75945x2fec8307 == null ? str2 : m75945x2fec8307, null, 16, null));
                            android.widget.TextView textView7 = this.f202292x;
                            if (textView7 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishCurrentCount");
                                throw null;
                            }
                            textView7.setText(S);
                            android.widget.TextView textView8 = this.f202293y;
                            if (textView8 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishTargetCount");
                                throw null;
                            }
                            textView8.setText("/".concat(S2));
                            android.view.View view7 = this.f202294z;
                            if (view7 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactionWishLayout");
                                throw null;
                            }
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                            num2 = num;
                            arrayList7.add(num2);
                            java.util.Collections.reverse(arrayList7);
                            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                            yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            A(true);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "handleInteractionWishUpdate hideInteractionWishLayout: invalid wish config.");
                            B();
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "handleInteractionWishUpdate hideInteractionWishLayout: enableFlag=" + xs1Var.m75933x41a8a7f2(3));
                    B();
                }
            }
            num2 = num;
        } else {
            num2 = num;
            str3 = str;
        }
        if (dVar4 != null && dVar4.f401416f) {
            java.util.List<r45.hn> list = dVar4.f401415e;
            if (list == null || list.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "hideBoardEventLayout: entries is null or empty");
                android.view.View view8 = this.B;
                if (view8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("boardEventLayout");
                    throw null;
                }
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.widget.LinearLayout linearLayout = this.C;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("boardEventListContainer");
                throw null;
            }
            linearLayout.removeAllViews();
            for (r45.hn hnVar : list) {
                android.view.LayoutInflater from2 = android.view.LayoutInflater.from(context);
                android.widget.LinearLayout linearLayout2 = this.C;
                if (linearLayout2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("boardEventListContainer");
                    throw null;
                }
                android.view.View inflate2 = from2.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570397e94, (android.view.ViewGroup) linearLayout2, false);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.tgm);
                android.widget.TextView textView9 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.tgl);
                android.widget.TextView textView10 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.tgk);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate2.findViewById(com.p314xaae8f345.mm.R.id.tgj);
                android.content.Context context5 = context;
                textView9.setTextColor(b3.l.m9702x7444d5ad(context5, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                textView10.setTextColor(b3.l.m9702x7444d5ad(context5, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                c22699x3dcdb3522.m82040x7541828(b3.l.m9702x7444d5ad(context5, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setColor(167772160);
                gradientDrawable.setCornerRadius(context5.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
                inflate2.setBackground(gradientDrawable);
                java.lang.String m75945x2fec83072 = hnVar.m75945x2fec8307(0);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = str2;
                }
                textView9.setText(m75945x2fec83072);
                java.lang.String m75945x2fec83073 = hnVar.m75945x2fec8307(1);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = str2;
                }
                textView10.setText(m75945x2fec83073);
                java.lang.String m75945x2fec83074 = hnVar.m75945x2fec8307(3);
                if (m75945x2fec83074 == null || m75945x2fec83074.length() == 0) {
                    cls3 = cls;
                    uVar2 = uVar;
                    cls4 = cls2;
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                    uVar2 = uVar;
                    cls4 = cls2;
                    cls3 = cls;
                    ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar2.e(cls4).c(cls3))).H).mo141623x754a37bb()).a(new mn2.q3(m75945x2fec83074, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f))).c(imageView);
                }
                inflate2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.o(hnVar, this));
                android.widget.LinearLayout linearLayout3 = this.C;
                if (linearLayout3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("boardEventListContainer");
                    throw null;
                }
                linearLayout3.addView(inflate2);
                uVar = uVar2;
                context = context5;
                cls2 = cls4;
                cls = cls3;
            }
            android.view.View view9 = this.B;
            if (view9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("boardEventLayout");
                throw null;
            }
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList9.add(num2);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.pn7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f202285q = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570) findViewById;
        android.content.Context context = this.f199914d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.anq, (android.view.ViewGroup) null, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f202284p = inflate;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.frh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f202283o = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById2;
        android.view.View view = this.f202284p;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.f569252pk1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f202287s = (android.widget.TextView) findViewById3;
        android.view.View view2 = this.f202284p;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById4 = view2.findViewById(com.p314xaae8f345.mm.R.id.frj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f202288t = findViewById4;
        android.view.View view3 = this.f202284p;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById5 = view3.findViewById(com.p314xaae8f345.mm.R.id.fre);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.view.View view4 = this.f202284p;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById6 = view4.findViewById(com.p314xaae8f345.mm.R.id.frd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f202289u = findViewById6;
        android.view.View view5 = this.f202284p;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById7 = view5.findViewById(com.p314xaae8f345.mm.R.id.tj6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f202290v = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById7;
        android.view.View view6 = this.f202284p;
        if (view6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById8 = view6.findViewById(com.p314xaae8f345.mm.R.id.f566211tj3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f202291w = (android.widget.TextView) findViewById8;
        android.view.View view7 = this.f202284p;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById9 = view7.findViewById(com.p314xaae8f345.mm.R.id.f566210tj2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f202292x = (android.widget.TextView) findViewById9;
        android.view.View view8 = this.f202284p;
        if (view8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById10 = view8.findViewById(com.p314xaae8f345.mm.R.id.tjk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f202293y = (android.widget.TextView) findViewById10;
        android.view.View view9 = this.f202284p;
        if (view9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById11 = view9.findViewById(com.p314xaae8f345.mm.R.id.tj7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.f202294z = findViewById11;
        android.view.View view10 = this.f202284p;
        if (view10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById12 = view10.findViewById(com.p314xaae8f345.mm.R.id.frk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.A = findViewById12;
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570398e95, (android.view.ViewGroup) null, false);
        android.view.View findViewById13 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.tgn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        this.B = findViewById13;
        android.view.View findViewById14 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.tgo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        this.C = (android.widget.LinearLayout) findViewById14;
        android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.tgp);
        if (textView != null) {
            textView.setTextColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
        if (this.f202286r == null) {
            this.f202286r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar = this.f202286r;
        if (xVar != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c5570 = this.f202285q;
            if (c22843x6b8c5570 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentRv");
                throw null;
            }
            android.view.View view11 = this.f202284p;
            if (view11 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wishHeaderView");
                throw null;
            }
            xVar.f(c22843x6b8c5570, view11, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.p(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar2 = this.f202286r;
        if (xVar2 == null || (c22848x6ddd90cf = xVar2.f202198b) == null) {
            return;
        }
        c22848x6ddd90cf.O(inflate2, 4, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar = this.f202286r;
        if (xVar != null) {
            xVar.h();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void v() {
        a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) this.f202282n;
        wn0Var.z1().E();
        ln2.d dVar = (ln2.d) wn0Var.x1().y().mo3195x754a37bb();
        java.util.LinkedList linkedList = null;
        wn0Var.z1().F(dVar != null ? dVar.f401413c : null);
        r45.vu1 vu1Var = dVar != null ? dVar.f401411a : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 z17 = wn0Var.z1();
        java.util.LinkedList m75941xfb821914 = vu1Var != null ? vu1Var.m75941xfb821914(1) : null;
        if (vu1Var != null) {
            if (!vu1Var.m75933x41a8a7f2(8)) {
                vu1Var = null;
            }
            if (vu1Var != null) {
                linkedList = vu1Var.m75941xfb821914(7);
            }
        }
        z17.G(m75941xfb821914, linkedList);
        wn0Var.z1().w();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar = this.f202286r;
        if (xVar != null) {
            xVar.f202213q.mo48813x58998cd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar2 = this.f202286r;
        if (xVar2 != null) {
            xVar2.k(this.f202216m);
        }
        super.w();
    }
}
