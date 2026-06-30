package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class kh extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f185366e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f185367f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f185368g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f185369h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f185370i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f185371m;

    public kh(boolean z17, yz5.a getFinderObj, yz5.a isSelfLike, yz5.l selfLikeClick, yz5.a onRefresh, yz5.l isRealFinderLikeInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getFinderObj, "getFinderObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isSelfLike, "isSelfLike");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfLikeClick, "selfLikeClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRefresh, "onRefresh");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isRealFinderLikeInfo, "isRealFinderLikeInfo");
        this.f185366e = z17;
        this.f185367f = getFinderObj;
        this.f185368g = isSelfLike;
        this.f185369h = selfLikeClick;
        this.f185370i = onRefresh;
        this.f185371m = isRealFinderLikeInfo;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b8v;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.f1 item = (so2.f1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (!(list == null || list.isEmpty())) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.next(), 1)) {
                    p(item, holder, i17);
                }
            }
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ein);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        r45.md1 md1Var = item.f491869d;
        java.lang.String md6 = c61.yb.md(ybVar, md1Var.m75945x2fec8307(5), md1Var.m75945x2fec8307(0), false, 4, null);
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(holder.f374654e, md6));
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams layoutParams2 = layoutParams instanceof com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams ? (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f125727i = (int) textView.getPaint().measureText(hc2.x0.f(textView.getText().toString(), 4));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.eii);
        if (n(item)) {
            ng5.a.a(imageView, c01.z1.r());
        } else {
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d l17 = g1Var.l();
            mn2.n nVar = new mn2.n(md1Var.m75945x2fec8307(1), null, 2, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            l17.c(nVar, imageView, g1Var.h(mn2.f1.f411494o));
        }
        o(item, holder, i17);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final boolean n(so2.f1 f1Var) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f1Var.f491869d.m75945x2fec8307(5), c01.z1.r());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(so2.f1 f1Var, in5.s0 s0Var, int i17) {
        java.lang.String str;
        r45.vl2 vl2Var;
        r45.ql2 ql2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        int i18 = 0;
        if (f1Var.f491874i != null) {
            android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.i1t);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.prb);
            if (p18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p19 = s0Var.p(com.p314xaae8f345.mm.R.id.u4z);
            if (p19 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p27 = s0Var.p(com.p314xaae8f345.mm.R.id.tu_);
            if (p27 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a, p27, f1Var.f491874i, "like_panel_red_envelope_banner", f1Var.f491870e, 1, null, 32, null);
                i18 = 0;
            }
        } else {
            r45.t11 t11Var = f1Var.f491875m;
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb a17 = t11Var != null ? hc2.w.a(t11Var) : null;
            h0Var.f391656d = a17;
            if (a17 != null) {
                android.view.View p28 = s0Var.p(com.p314xaae8f345.mm.R.id.i1t);
                if (p28 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p29 = s0Var.p(com.p314xaae8f345.mm.R.id.prb);
                if (p29 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(p29, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p29.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p37 = s0Var.p(com.p314xaae8f345.mm.R.id.tu_);
                if (p37 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(p37, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p37.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p38 = s0Var.p(com.p314xaae8f345.mm.R.id.u4z);
                if (p38 != null) {
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(p38, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p38.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (p38 != null) {
                    com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
                    lz5.m mVar = new lz5.m();
                    mVar.put("like_panel", 1);
                    mVar.put("feedid", f1Var.f491870e);
                    mVar.put("easter_egg_emoji_md5", interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42933xb5885648() : null);
                    d2Var.n(p38, "like_panel_like_easter_egg", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.b1.b(mVar), (r20 & 128) != 0 ? null : null);
                }
                android.widget.ImageView imageView = p38 != null ? (android.widget.ImageView) p38.findViewById(com.p314xaae8f345.mm.R.id.t7t) : null;
                if (imageView != null) {
                    ox2.r0.a(imageView, (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d, true, "Finder.FinderFeedLikeConvert onBindViewHolder like");
                }
                if (p38 != null) {
                    p38.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fh(s0Var.f374654e, h0Var));
                }
                android.view.View findViewById = p38 != null ? p38.findViewById(com.p314xaae8f345.mm.R.id.f566890u54) : null;
                android.view.View findViewById2 = p38 != null ? p38.findViewById(com.p314xaae8f345.mm.R.id.f566888u52) : null;
                if (((java.lang.Boolean) this.f185371m.mo146xb9724478(java.lang.Integer.valueOf(i17 + 1))).booleanValue()) {
                    if (findViewById != null) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
                        arrayList9.add(8);
                        java.util.Collections.reverse(arrayList9);
                        android.view.View view = findViewById;
                        yj0.a.d(view, arrayList9.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (findViewById2 != null) {
                        java.util.ArrayList arrayList10 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
                        arrayList10.add(0);
                        java.util.Collections.reverse(arrayList10);
                        android.view.View view2 = findViewById2;
                        yj0.a.d(view2, arrayList10.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    if (findViewById != null) {
                        java.util.ArrayList arrayList11 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal11 = zj0.c.f554818a;
                        arrayList11.add(0);
                        java.util.Collections.reverse(arrayList11);
                        android.view.View view3 = findViewById;
                        yj0.a.d(view3, arrayList11.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (findViewById2 != null) {
                        java.util.ArrayList arrayList12 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal12 = zj0.c.f554818a;
                        arrayList12.add(8);
                        java.util.Collections.reverse(arrayList12);
                        android.view.View view4 = findViewById2;
                        yj0.a.d(view4, arrayList12.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } else if (this.f185366e && n(f1Var)) {
                android.view.View p39 = s0Var.p(com.p314xaae8f345.mm.R.id.u4z);
                if (p39 != null) {
                    java.util.ArrayList arrayList13 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal13 = zj0.c.f554818a;
                    arrayList13.add(8);
                    java.util.Collections.reverse(arrayList13);
                    yj0.a.d(p39, arrayList13.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p39.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                    yj0.a.f(p39, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (((java.lang.Boolean) this.f185368g.mo152xb9724478()).booleanValue()) {
                    android.view.View p47 = s0Var.p(com.p314xaae8f345.mm.R.id.f567748kn0);
                    if (p47 != null) {
                        java.util.ArrayList arrayList14 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal14 = zj0.c.f554818a;
                        arrayList14.add(8);
                        java.util.Collections.reverse(arrayList14);
                        yj0.a.d(p47, arrayList14.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p47.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                        yj0.a.f(p47, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View p48 = s0Var.p(com.p314xaae8f345.mm.R.id.mkw);
                    if (p48 != null) {
                        java.util.ArrayList arrayList15 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal15 = zj0.c.f554818a;
                        arrayList15.add(0);
                        java.util.Collections.reverse(arrayList15);
                        yj0.a.d(p48, arrayList15.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p48.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                        yj0.a.f(p48, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View p49 = s0Var.p(com.p314xaae8f345.mm.R.id.i1t);
                    if (p49 != null) {
                        java.util.ArrayList arrayList16 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal16 = zj0.c.f554818a;
                        arrayList16.add(0);
                        java.util.Collections.reverse(arrayList16);
                        yj0.a.d(p49, arrayList16.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p49.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                        yj0.a.f(p49, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View p57 = s0Var.p(com.p314xaae8f345.mm.R.id.prb);
                    if (p57 != null) {
                        java.util.ArrayList arrayList17 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal17 = zj0.c.f554818a;
                        arrayList17.add(8);
                        java.util.Collections.reverse(arrayList17);
                        yj0.a.d(p57, arrayList17.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p57.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
                        yj0.a.f(p57, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View p58 = s0Var.p(com.p314xaae8f345.mm.R.id.f565994ec3);
                    if (p58 != null) {
                        p58.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gh(this, f1Var, s0Var, i17));
                    }
                } else {
                    android.view.View p59 = s0Var.p(com.p314xaae8f345.mm.R.id.i1t);
                    if (p59 != null) {
                        java.util.ArrayList arrayList18 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal18 = zj0.c.f554818a;
                        arrayList18.add(8);
                        java.util.Collections.reverse(arrayList18);
                        yj0.a.d(p59, arrayList18.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p59.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
                        yj0.a.f(p59, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View p66 = s0Var.p(com.p314xaae8f345.mm.R.id.prb);
                    if (p66 != null) {
                        java.util.ArrayList arrayList19 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal19 = zj0.c.f554818a;
                        arrayList19.add(0);
                        java.util.Collections.reverse(arrayList19);
                        yj0.a.d(p66, arrayList19.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p66.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
                        yj0.a.f(p66, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View p67 = s0Var.p(com.p314xaae8f345.mm.R.id.prb);
                    if (p67 != null) {
                        p67.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.hh(this, f1Var, s0Var, i17));
                    }
                    android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.pra);
                    if (textView != null) {
                        textView.setText(s0Var.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3o));
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.prc);
                    zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
                    zy2.p6 p6Var = new zy2.p6();
                    p6Var.f559060a = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) this.f185367f.mo152xb9724478();
                    ht2.y0 y0Var = (ht2.y0) s6Var;
                    y0Var.getClass();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = p6Var.f559060a;
                    if (c19792x256d2725 != null) {
                        c22699x3dcdb352.setLayerPaint(null);
                        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560654qk));
                        y0Var.vj(c19792x256d2725);
                        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
                        if (m76806xdef68064 == null || (vl2Var = (r45.vl2) m76806xdef68064.m75936x14adae67(27)) == null || (ql2Var = (r45.ql2) vl2Var.m75936x14adae67(0)) == null || (str = ql2Var.m75945x2fec8307(1)) == null) {
                            str = "";
                        }
                        if (str.length() > 0) {
                            c22699x3dcdb352.setImageDrawable(null);
                            y0Var.fj(str, false, new ht2.k(c22699x3dcdb352, y0Var, p6Var));
                        } else {
                            c22699x3dcdb352.setImageDrawable(m95.a.e(c22699x3dcdb352.getContext().getResources(), com.p314xaae8f345.mm.R.raw.f79562xfeb10c8c, 0.0f));
                        }
                    }
                    this.f185370i.mo152xb9724478();
                }
                android.view.View p68 = s0Var.p(com.p314xaae8f345.mm.R.id.tu_);
                if (p68 != null) {
                    java.util.ArrayList arrayList20 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal20 = zj0.c.f554818a;
                    arrayList20.add(8);
                    java.util.Collections.reverse(arrayList20);
                    yj0.a.d(p68, arrayList20.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p68.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                    yj0.a.f(p68, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.view.View p69 = s0Var.p(com.p314xaae8f345.mm.R.id.f567748kn0);
                if (p69 != null) {
                    java.util.ArrayList arrayList21 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal21 = zj0.c.f554818a;
                    arrayList21.add(0);
                    java.util.Collections.reverse(arrayList21);
                    yj0.a.d(p69, arrayList21.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p69.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
                    yj0.a.f(p69, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p76 = s0Var.p(com.p314xaae8f345.mm.R.id.mkw);
                if (p76 != null) {
                    java.util.ArrayList arrayList22 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal22 = zj0.c.f554818a;
                    arrayList22.add(8);
                    java.util.Collections.reverse(arrayList22);
                    yj0.a.d(p76, arrayList22.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p76.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
                    yj0.a.f(p76, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p77 = s0Var.p(com.p314xaae8f345.mm.R.id.i1t);
                if (p77 != null) {
                    java.util.ArrayList arrayList23 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal23 = zj0.c.f554818a;
                    arrayList23.add(0);
                    java.util.Collections.reverse(arrayList23);
                    yj0.a.d(p77, arrayList23.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p77.setVisibility(((java.lang.Integer) arrayList23.get(0)).intValue());
                    yj0.a.f(p77, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p78 = s0Var.p(com.p314xaae8f345.mm.R.id.prb);
                if (p78 != null) {
                    java.util.ArrayList arrayList24 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal24 = zj0.c.f554818a;
                    arrayList24.add(8);
                    java.util.Collections.reverse(arrayList24);
                    yj0.a.d(p78, arrayList24.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p78.setVisibility(((java.lang.Integer) arrayList24.get(0)).intValue());
                    yj0.a.f(p78, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p79 = s0Var.p(com.p314xaae8f345.mm.R.id.u4z);
                if (p79 != null) {
                    java.util.ArrayList arrayList25 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal25 = zj0.c.f554818a;
                    arrayList25.add(8);
                    java.util.Collections.reverse(arrayList25);
                    yj0.a.d(p79, arrayList25.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p79.setVisibility(((java.lang.Integer) arrayList25.get(0)).intValue());
                    yj0.a.f(p79, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p86 = s0Var.p(com.p314xaae8f345.mm.R.id.f565994ec3);
                if (p86 != null) {
                    java.util.ArrayList arrayList26 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal26 = zj0.c.f554818a;
                    arrayList26.add(8);
                    java.util.Collections.reverse(arrayList26);
                    yj0.a.d(p86, arrayList26.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p86.setVisibility(((java.lang.Integer) arrayList26.get(0)).intValue());
                    yj0.a.f(p86, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p87 = s0Var.p(com.p314xaae8f345.mm.R.id.tu_);
                if (p87 != null) {
                    java.util.ArrayList arrayList27 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal27 = zj0.c.f554818a;
                    arrayList27.add(8);
                    java.util.Collections.reverse(arrayList27);
                    yj0.a.d(p87, arrayList27.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p87.setVisibility(((java.lang.Integer) arrayList27.get(0)).intValue());
                    yj0.a.f(p87, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        android.view.View view5 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.frp);
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L1().r()).booleanValue();
        r45.md1 md1Var = f1Var.f491869d;
        if (booleanValue) {
            android.widget.ImageView imageView2 = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.tbk);
            if (view5 != null && imageView2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c3 c3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c3.f183585a;
                r45.ub1 ub1Var = (r45.ub1) md1Var.m75936x14adae67(19);
                boolean z17 = (ub1Var == null || ub1Var.m75939xb282bd08(i18) != 1) ? i18 : 1;
                r45.ub1 ub1Var2 = (r45.ub1) md1Var.m75936x14adae67(19);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = ub1Var2 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc) ub1Var2.m75936x14adae67(1) : null;
                android.content.Context context = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                c3Var.a(view5, imageView2, z17, c19780xceb4c4dc, false, context);
            }
        } else if (view5 != null) {
            r45.ub1 ub1Var3 = (r45.ub1) md1Var.m75936x14adae67(19);
            int i19 = ((ub1Var3 == null || ub1Var3.m75939xb282bd08(i18) != 1) ? i18 : 1) != 0 ? i18 : 8;
            java.util.ArrayList arrayList28 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal28 = zj0.c.f554818a;
            arrayList28.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList28);
            yj0.a.d(view5, arrayList28.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList28.get(i18)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean n17 = n(f1Var);
        java.util.LinkedList m75941xfb821914 = md1Var.m75941xfb821914(18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getInteraction_label_list(...)");
        java.util.ArrayList arrayList29 = new java.util.ArrayList();
        for (java.lang.Object obj : m75941xfb821914) {
            int m75939xb282bd08 = ((r45.zb1) obj).m75939xb282bd08(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3 d3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3.f183609e;
            if ((m75939xb282bd08 == 1 ? 1 : i18) != 0) {
                arrayList29.add(obj);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c c15301xb3484a3c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c) s0Var.p(com.p314xaae8f345.mm.R.id.e5y);
        if (c15301xb3484a3c != null) {
            int i27 = ((n17 || !(arrayList29.isEmpty() ^ true)) ? i18 : 1) != 0 ? i18 : 8;
            java.util.ArrayList arrayList30 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal29 = zj0.c.f554818a;
            arrayList30.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList30);
            yj0.a.d(c15301xb3484a3c, arrayList30.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c15301xb3484a3c.setVisibility(((java.lang.Integer) arrayList30.get(i18)).intValue());
            yj0.a.f(c15301xb3484a3c, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if ((c15301xb3484a3c.getVisibility() == 0 ? 1 : i18) != 0) {
                c15301xb3484a3c.a(arrayList29);
            }
        }
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L1().r()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c c15301xb3484a3c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c) s0Var.p(com.p314xaae8f345.mm.R.id.rdn);
            if (c15301xb3484a3c2 != null) {
                c15301xb3484a3c2.setVisibility(8);
            }
        } else {
            java.util.LinkedList m75941xfb8219142 = md1Var.m75941xfb821914(18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getInteraction_label_list(...)");
            java.util.ArrayList arrayList31 = new java.util.ArrayList();
            for (java.lang.Object obj2 : m75941xfb8219142) {
                int m75939xb282bd082 = ((r45.zb1) obj2).m75939xb282bd08(1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3 d3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3.f183609e;
                if ((m75939xb282bd082 == 2 ? 1 : i18) != 0) {
                    arrayList31.add(obj2);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c c15301xb3484a3c3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c) s0Var.p(com.p314xaae8f345.mm.R.id.rdn);
            if (c15301xb3484a3c3 != null) {
                int i28 = ((n17 || !(arrayList31.isEmpty() ^ true)) ? i18 : 1) != 0 ? i18 : 8;
                java.util.ArrayList arrayList32 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal30 = zj0.c.f554818a;
                arrayList32.add(java.lang.Integer.valueOf(i28));
                java.util.Collections.reverse(arrayList32);
                yj0.a.d(c15301xb3484a3c3, arrayList32.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c15301xb3484a3c3.setVisibility(((java.lang.Integer) arrayList32.get(i18)).intValue());
                yj0.a.f(c15301xb3484a3c3, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if ((c15301xb3484a3c3.getVisibility() != 0 ? i18 : 1) != 0) {
                    c15301xb3484a3c3.a(arrayList31);
                }
            }
        }
        p(f1Var, s0Var, i17);
        android.view.View itemView = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o3 o3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o3.f183957f;
        q(itemView, f1Var, s0Var, o3Var, be1.r0.f4232x366c91de, 0);
        android.view.View p88 = s0Var.p(com.p314xaae8f345.mm.R.id.eii);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p88, "getView(...)");
        q(p88, f1Var, s0Var, o3Var, 8, 1);
        android.view.View p89 = s0Var.p(com.p314xaae8f345.mm.R.id.ein);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p89, "getView(...)");
        q(p89, f1Var, s0Var, o3Var, 8, 2);
    }

    public final void p(so2.f1 item, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1) holder.p(com.p314xaae8f345.mm.R.id.o5q);
        if (c15003x1d0c0ec1 == null) {
            return;
        }
        r45.md1 md1Var = item.f491869d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md1Var, "<this>");
        java.lang.Integer a17 = ju2.r.a();
        int intValue = a17 != null ? a17.intValue() : md1Var.m75939xb282bd08(16);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        c15003x1d0c0ec1.setVisibility((n(item) || !(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209193dc).mo141623x754a37bb()).r()).intValue() == 1 || intValue == 1 || intValue == 2)) ? 8 : 0);
        if (c15003x1d0c0ec1.getVisibility() == 8) {
            return;
        }
        java.lang.String m75945x2fec8307 = md1Var.m75945x2fec8307(5);
        if (m75945x2fec8307 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderFeedLikeConvert", "likeObj.wxUsername is null");
            return;
        }
        long Z = pm0.v.Z(item.f491870e);
        boolean z17 = md1Var.m75939xb282bd08(15) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1.G(c15003x1d0c0ec1, Z, m75945x2fec8307, z17, 2, new ju2.q(intValue, i17, null, null, null, java.lang.Float.valueOf(12.0f), null, null, null, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s6.f34739x366c91de, null), null, null, 0, null, null, 992, null);
        c15003x1d0c0ec1.m60875xc6cf6336(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ih(holder));
        q(c15003x1d0c0ec1, item, holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o3.f183956e, 8, z17 ? 4 : 3);
    }

    public final void q(android.view.View view, so2.f1 f1Var, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o3 o3Var, int i17, int i18) {
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "profile_feed_like_tabulation");
        ((cy1.a) aVar.ik(view, i17, 25496)).Ai(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jh(this, f1Var, s0Var, o3Var, i18));
    }
}
