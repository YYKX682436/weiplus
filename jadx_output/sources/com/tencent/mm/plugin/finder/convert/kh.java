package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class kh extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f103833e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f103834f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f103835g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f103836h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f103837i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f103838m;

    public kh(boolean z17, yz5.a getFinderObj, yz5.a isSelfLike, yz5.l selfLikeClick, yz5.a onRefresh, yz5.l isRealFinderLikeInfo) {
        kotlin.jvm.internal.o.g(getFinderObj, "getFinderObj");
        kotlin.jvm.internal.o.g(isSelfLike, "isSelfLike");
        kotlin.jvm.internal.o.g(selfLikeClick, "selfLikeClick");
        kotlin.jvm.internal.o.g(onRefresh, "onRefresh");
        kotlin.jvm.internal.o.g(isRealFinderLikeInfo, "isRealFinderLikeInfo");
        this.f103833e = z17;
        this.f103834f = getFinderObj;
        this.f103835g = isSelfLike;
        this.f103836h = selfLikeClick;
        this.f103837i = onRefresh;
        this.f103838m = isRealFinderLikeInfo;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b8v;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.f1 item = (so2.f1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (!(list == null || list.isEmpty())) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b(it.next(), 1)) {
                    p(item, holder, i17);
                }
            }
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ein);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        r45.md1 md1Var = item.f410336d;
        java.lang.String md6 = c61.yb.md(ybVar, md1Var.getString(5), md1Var.getString(0), false, 4, null);
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(holder.f293121e, md6));
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams2 = layoutParams instanceof com.google.android.flexbox.FlexboxLayout.LayoutParams ? (com.google.android.flexbox.FlexboxLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f44194i = (int) textView.getPaint().measureText(hc2.x0.f(textView.getText().toString(), 4));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.eii);
        if (n(item)) {
            ng5.a.a(imageView, c01.z1.r());
        } else {
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d l17 = g1Var.l();
            mn2.n nVar = new mn2.n(md1Var.getString(1), null, 2, null);
            kotlin.jvm.internal.o.d(imageView);
            l17.c(nVar, imageView, g1Var.h(mn2.f1.f329961o));
        }
        o(item, holder, i17);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final boolean n(so2.f1 f1Var) {
        return kotlin.jvm.internal.o.b(f1Var.f410336d.getString(5), c01.z1.r());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(so2.f1 f1Var, in5.s0 s0Var, int i17) {
        java.lang.String str;
        r45.vl2 vl2Var;
        r45.ql2 ql2Var;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        int i18 = 0;
        if (f1Var.f410341i != null) {
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.i1t);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p18 = s0Var.p(com.tencent.mm.R.id.prb);
            if (p18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p19 = s0Var.p(com.tencent.mm.R.id.u4z);
            if (p19 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p27 = s0Var.p(com.tencent.mm.R.id.tu_);
            if (p27 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.r(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a, p27, f1Var.f410341i, "like_panel_red_envelope_banner", f1Var.f410337e, 1, null, 32, null);
                i18 = 0;
            }
        } else {
            r45.t11 t11Var = f1Var.f410342m;
            com.tencent.mm.api.IEmojiInfo a17 = t11Var != null ? hc2.w.a(t11Var) : null;
            h0Var.f310123d = a17;
            if (a17 != null) {
                android.view.View p28 = s0Var.p(com.tencent.mm.R.id.i1t);
                if (p28 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p29 = s0Var.p(com.tencent.mm.R.id.prb);
                if (p29 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(p29, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p29.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p37 = s0Var.p(com.tencent.mm.R.id.tu_);
                if (p37 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(p37, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p37.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p38 = s0Var.p(com.tencent.mm.R.id.u4z);
                if (p38 != null) {
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(p38, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p38.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (p38 != null) {
                    com.tencent.mm.api.IEmojiInfo iEmojiInfo = (com.tencent.mm.api.IEmojiInfo) h0Var.f310123d;
                    com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
                    lz5.m mVar = new lz5.m();
                    mVar.put("like_panel", 1);
                    mVar.put("feedid", f1Var.f410337e);
                    mVar.put("easter_egg_emoji_md5", iEmojiInfo != null ? iEmojiInfo.getMd5() : null);
                    d2Var.n(p38, "like_panel_like_easter_egg", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.b1.b(mVar), (r20 & 128) != 0 ? null : null);
                }
                android.widget.ImageView imageView = p38 != null ? (android.widget.ImageView) p38.findViewById(com.tencent.mm.R.id.t7t) : null;
                if (imageView != null) {
                    ox2.r0.a(imageView, (com.tencent.mm.api.IEmojiInfo) h0Var.f310123d, true, "Finder.FinderFeedLikeConvert onBindViewHolder like");
                }
                if (p38 != null) {
                    p38.setOnClickListener(new com.tencent.mm.plugin.finder.convert.fh(s0Var.f293121e, h0Var));
                }
                android.view.View findViewById = p38 != null ? p38.findViewById(com.tencent.mm.R.id.f485357u54) : null;
                android.view.View findViewById2 = p38 != null ? p38.findViewById(com.tencent.mm.R.id.f485355u52) : null;
                if (((java.lang.Boolean) this.f103838m.invoke(java.lang.Integer.valueOf(i17 + 1))).booleanValue()) {
                    if (findViewById != null) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
                        arrayList9.add(8);
                        java.util.Collections.reverse(arrayList9);
                        android.view.View view = findViewById;
                        yj0.a.d(view, arrayList9.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (findViewById2 != null) {
                        java.util.ArrayList arrayList10 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
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
                        java.lang.ThreadLocal threadLocal11 = zj0.c.f473285a;
                        arrayList11.add(0);
                        java.util.Collections.reverse(arrayList11);
                        android.view.View view3 = findViewById;
                        yj0.a.d(view3, arrayList11.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (findViewById2 != null) {
                        java.util.ArrayList arrayList12 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal12 = zj0.c.f473285a;
                        arrayList12.add(8);
                        java.util.Collections.reverse(arrayList12);
                        android.view.View view4 = findViewById2;
                        yj0.a.d(view4, arrayList12.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } else if (this.f103833e && n(f1Var)) {
                android.view.View p39 = s0Var.p(com.tencent.mm.R.id.u4z);
                if (p39 != null) {
                    java.util.ArrayList arrayList13 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal13 = zj0.c.f473285a;
                    arrayList13.add(8);
                    java.util.Collections.reverse(arrayList13);
                    yj0.a.d(p39, arrayList13.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p39.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                    yj0.a.f(p39, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (((java.lang.Boolean) this.f103835g.invoke()).booleanValue()) {
                    android.view.View p47 = s0Var.p(com.tencent.mm.R.id.f486215kn0);
                    if (p47 != null) {
                        java.util.ArrayList arrayList14 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal14 = zj0.c.f473285a;
                        arrayList14.add(8);
                        java.util.Collections.reverse(arrayList14);
                        yj0.a.d(p47, arrayList14.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p47.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                        yj0.a.f(p47, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View p48 = s0Var.p(com.tencent.mm.R.id.mkw);
                    if (p48 != null) {
                        java.util.ArrayList arrayList15 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal15 = zj0.c.f473285a;
                        arrayList15.add(0);
                        java.util.Collections.reverse(arrayList15);
                        yj0.a.d(p48, arrayList15.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p48.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                        yj0.a.f(p48, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View p49 = s0Var.p(com.tencent.mm.R.id.i1t);
                    if (p49 != null) {
                        java.util.ArrayList arrayList16 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal16 = zj0.c.f473285a;
                        arrayList16.add(0);
                        java.util.Collections.reverse(arrayList16);
                        yj0.a.d(p49, arrayList16.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p49.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                        yj0.a.f(p49, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View p57 = s0Var.p(com.tencent.mm.R.id.prb);
                    if (p57 != null) {
                        java.util.ArrayList arrayList17 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal17 = zj0.c.f473285a;
                        arrayList17.add(8);
                        java.util.Collections.reverse(arrayList17);
                        yj0.a.d(p57, arrayList17.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p57.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
                        yj0.a.f(p57, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View p58 = s0Var.p(com.tencent.mm.R.id.f484461ec3);
                    if (p58 != null) {
                        p58.setOnClickListener(new com.tencent.mm.plugin.finder.convert.gh(this, f1Var, s0Var, i17));
                    }
                } else {
                    android.view.View p59 = s0Var.p(com.tencent.mm.R.id.i1t);
                    if (p59 != null) {
                        java.util.ArrayList arrayList18 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal18 = zj0.c.f473285a;
                        arrayList18.add(8);
                        java.util.Collections.reverse(arrayList18);
                        yj0.a.d(p59, arrayList18.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p59.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
                        yj0.a.f(p59, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View p66 = s0Var.p(com.tencent.mm.R.id.prb);
                    if (p66 != null) {
                        java.util.ArrayList arrayList19 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal19 = zj0.c.f473285a;
                        arrayList19.add(0);
                        java.util.Collections.reverse(arrayList19);
                        yj0.a.d(p66, arrayList19.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p66.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
                        yj0.a.f(p66, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View p67 = s0Var.p(com.tencent.mm.R.id.prb);
                    if (p67 != null) {
                        p67.setOnClickListener(new com.tencent.mm.plugin.finder.convert.hh(this, f1Var, s0Var, i17));
                    }
                    android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.pra);
                    if (textView != null) {
                        textView.setText(s0Var.f293121e.getString(com.tencent.mm.R.string.f3o));
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.prc);
                    zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
                    kotlin.jvm.internal.o.d(weImageView);
                    zy2.p6 p6Var = new zy2.p6();
                    p6Var.f477527a = (com.tencent.mm.protocal.protobuf.FinderObject) this.f103834f.invoke();
                    ht2.y0 y0Var = (ht2.y0) s6Var;
                    y0Var.getClass();
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = p6Var.f477527a;
                    if (finderObject != null) {
                        weImageView.setLayerPaint(null);
                        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.f479121qk));
                        y0Var.vj(finderObject);
                        r45.dm2 object_extend = finderObject.getObject_extend();
                        if (object_extend == null || (vl2Var = (r45.vl2) object_extend.getCustom(27)) == null || (ql2Var = (r45.ql2) vl2Var.getCustom(0)) == null || (str = ql2Var.getString(1)) == null) {
                            str = "";
                        }
                        if (str.length() > 0) {
                            weImageView.setImageDrawable(null);
                            y0Var.fj(str, false, new ht2.k(weImageView, y0Var, p6Var));
                        } else {
                            weImageView.setImageDrawable(m95.a.e(weImageView.getContext().getResources(), com.tencent.mm.R.raw.icon_outlined_awesome, 0.0f));
                        }
                    }
                    this.f103837i.invoke();
                }
                android.view.View p68 = s0Var.p(com.tencent.mm.R.id.tu_);
                if (p68 != null) {
                    java.util.ArrayList arrayList20 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal20 = zj0.c.f473285a;
                    arrayList20.add(8);
                    java.util.Collections.reverse(arrayList20);
                    yj0.a.d(p68, arrayList20.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p68.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                    yj0.a.f(p68, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.view.View p69 = s0Var.p(com.tencent.mm.R.id.f486215kn0);
                if (p69 != null) {
                    java.util.ArrayList arrayList21 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal21 = zj0.c.f473285a;
                    arrayList21.add(0);
                    java.util.Collections.reverse(arrayList21);
                    yj0.a.d(p69, arrayList21.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p69.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
                    yj0.a.f(p69, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p76 = s0Var.p(com.tencent.mm.R.id.mkw);
                if (p76 != null) {
                    java.util.ArrayList arrayList22 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal22 = zj0.c.f473285a;
                    arrayList22.add(8);
                    java.util.Collections.reverse(arrayList22);
                    yj0.a.d(p76, arrayList22.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p76.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
                    yj0.a.f(p76, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p77 = s0Var.p(com.tencent.mm.R.id.i1t);
                if (p77 != null) {
                    java.util.ArrayList arrayList23 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal23 = zj0.c.f473285a;
                    arrayList23.add(0);
                    java.util.Collections.reverse(arrayList23);
                    yj0.a.d(p77, arrayList23.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p77.setVisibility(((java.lang.Integer) arrayList23.get(0)).intValue());
                    yj0.a.f(p77, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p78 = s0Var.p(com.tencent.mm.R.id.prb);
                if (p78 != null) {
                    java.util.ArrayList arrayList24 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal24 = zj0.c.f473285a;
                    arrayList24.add(8);
                    java.util.Collections.reverse(arrayList24);
                    yj0.a.d(p78, arrayList24.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p78.setVisibility(((java.lang.Integer) arrayList24.get(0)).intValue());
                    yj0.a.f(p78, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p79 = s0Var.p(com.tencent.mm.R.id.u4z);
                if (p79 != null) {
                    java.util.ArrayList arrayList25 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal25 = zj0.c.f473285a;
                    arrayList25.add(8);
                    java.util.Collections.reverse(arrayList25);
                    yj0.a.d(p79, arrayList25.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p79.setVisibility(((java.lang.Integer) arrayList25.get(0)).intValue());
                    yj0.a.f(p79, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p86 = s0Var.p(com.tencent.mm.R.id.f484461ec3);
                if (p86 != null) {
                    java.util.ArrayList arrayList26 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal26 = zj0.c.f473285a;
                    arrayList26.add(8);
                    java.util.Collections.reverse(arrayList26);
                    yj0.a.d(p86, arrayList26.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p86.setVisibility(((java.lang.Integer) arrayList26.get(0)).intValue());
                    yj0.a.f(p86, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p87 = s0Var.p(com.tencent.mm.R.id.tu_);
                if (p87 != null) {
                    java.util.ArrayList arrayList27 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal27 = zj0.c.f473285a;
                    arrayList27.add(8);
                    java.util.Collections.reverse(arrayList27);
                    yj0.a.d(p87, arrayList27.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p87.setVisibility(((java.lang.Integer) arrayList27.get(0)).intValue());
                    yj0.a.f(p87, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        android.view.View view5 = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.frp);
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L1().r()).booleanValue();
        r45.md1 md1Var = f1Var.f410336d;
        if (booleanValue) {
            android.widget.ImageView imageView2 = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.tbk);
            if (view5 != null && imageView2 != null) {
                com.tencent.mm.plugin.finder.assist.c3 c3Var = com.tencent.mm.plugin.finder.assist.c3.f102052a;
                r45.ub1 ub1Var = (r45.ub1) md1Var.getCustom(19);
                boolean z17 = (ub1Var == null || ub1Var.getInteger(i18) != 1) ? i18 : 1;
                r45.ub1 ub1Var2 = (r45.ub1) md1Var.getCustom(19);
                com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = ub1Var2 != null ? (com.tencent.mm.protocal.protobuf.FinderAuthInfo) ub1Var2.getCustom(1) : null;
                android.content.Context context = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                c3Var.a(view5, imageView2, z17, finderAuthInfo, false, context);
            }
        } else if (view5 != null) {
            r45.ub1 ub1Var3 = (r45.ub1) md1Var.getCustom(19);
            int i19 = ((ub1Var3 == null || ub1Var3.getInteger(i18) != 1) ? i18 : 1) != 0 ? i18 : 8;
            java.util.ArrayList arrayList28 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal28 = zj0.c.f473285a;
            arrayList28.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList28);
            yj0.a.d(view5, arrayList28.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList28.get(i18)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean n17 = n(f1Var);
        java.util.LinkedList list = md1Var.getList(18);
        kotlin.jvm.internal.o.f(list, "getInteraction_label_list(...)");
        java.util.ArrayList arrayList29 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            int integer = ((r45.zb1) obj).getInteger(1);
            com.tencent.mm.plugin.finder.assist.d3 d3Var = com.tencent.mm.plugin.finder.assist.d3.f102076e;
            if ((integer == 1 ? 1 : i18) != 0) {
                arrayList29.add(obj);
            }
        }
        com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView finderInteractionLabelGroupView = (com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView) s0Var.p(com.tencent.mm.R.id.e5y);
        if (finderInteractionLabelGroupView != null) {
            int i27 = ((n17 || !(arrayList29.isEmpty() ^ true)) ? i18 : 1) != 0 ? i18 : 8;
            java.util.ArrayList arrayList30 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal29 = zj0.c.f473285a;
            arrayList30.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList30);
            yj0.a.d(finderInteractionLabelGroupView, arrayList30.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderInteractionLabelGroupView.setVisibility(((java.lang.Integer) arrayList30.get(i18)).intValue());
            yj0.a.f(finderInteractionLabelGroupView, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if ((finderInteractionLabelGroupView.getVisibility() == 0 ? 1 : i18) != 0) {
                finderInteractionLabelGroupView.a(arrayList29);
            }
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L1().r()).booleanValue()) {
            com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView finderInteractionLabelGroupView2 = (com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView) s0Var.p(com.tencent.mm.R.id.rdn);
            if (finderInteractionLabelGroupView2 != null) {
                finderInteractionLabelGroupView2.setVisibility(8);
            }
        } else {
            java.util.LinkedList list2 = md1Var.getList(18);
            kotlin.jvm.internal.o.f(list2, "getInteraction_label_list(...)");
            java.util.ArrayList arrayList31 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                int integer2 = ((r45.zb1) obj2).getInteger(1);
                com.tencent.mm.plugin.finder.assist.d3 d3Var2 = com.tencent.mm.plugin.finder.assist.d3.f102076e;
                if ((integer2 == 2 ? 1 : i18) != 0) {
                    arrayList31.add(obj2);
                }
            }
            com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView finderInteractionLabelGroupView3 = (com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView) s0Var.p(com.tencent.mm.R.id.rdn);
            if (finderInteractionLabelGroupView3 != null) {
                int i28 = ((n17 || !(arrayList31.isEmpty() ^ true)) ? i18 : 1) != 0 ? i18 : 8;
                java.util.ArrayList arrayList32 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal30 = zj0.c.f473285a;
                arrayList32.add(java.lang.Integer.valueOf(i28));
                java.util.Collections.reverse(arrayList32);
                yj0.a.d(finderInteractionLabelGroupView3, arrayList32.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                finderInteractionLabelGroupView3.setVisibility(((java.lang.Integer) arrayList32.get(i18)).intValue());
                yj0.a.f(finderInteractionLabelGroupView3, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedLike;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if ((finderInteractionLabelGroupView3.getVisibility() != 0 ? i18 : 1) != 0) {
                    finderInteractionLabelGroupView3.a(arrayList31);
                }
            }
        }
        p(f1Var, s0Var, i17);
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.finder.assist.o3 o3Var = com.tencent.mm.plugin.finder.assist.o3.f102424f;
        q(itemView, f1Var, s0Var, o3Var, be1.r0.CTRL_INDEX, 0);
        android.view.View p88 = s0Var.p(com.tencent.mm.R.id.eii);
        kotlin.jvm.internal.o.f(p88, "getView(...)");
        q(p88, f1Var, s0Var, o3Var, 8, 1);
        android.view.View p89 = s0Var.p(com.tencent.mm.R.id.ein);
        kotlin.jvm.internal.o.f(p89, "getView(...)");
        q(p89, f1Var, s0Var, o3Var, 8, 2);
    }

    public final void p(so2.f1 item, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton = (com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton) holder.p(com.tencent.mm.R.id.o5q);
        if (finderThanksButton == null) {
            return;
        }
        r45.md1 md1Var = item.f410336d;
        kotlin.jvm.internal.o.g(md1Var, "<this>");
        java.lang.Integer a17 = ju2.r.a();
        int intValue = a17 != null ? a17.intValue() : md1Var.getInteger(16);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        finderThanksButton.setVisibility((n(item) || !(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127660dc).getValue()).r()).intValue() == 1 || intValue == 1 || intValue == 2)) ? 8 : 0);
        if (finderThanksButton.getVisibility() == 8) {
            return;
        }
        java.lang.String string = md1Var.getString(5);
        if (string == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderFeedLikeConvert", "likeObj.wxUsername is null");
            return;
        }
        long Z = pm0.v.Z(item.f410337e);
        boolean z17 = md1Var.getInteger(15) == 1;
        com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton.G(finderThanksButton, Z, string, z17, 2, new ju2.q(intValue, i17, null, null, null, java.lang.Float.valueOf(12.0f), null, null, null, null, com.tencent.mm.plugin.appbrand.jsapi.s6.CTRL_INDEX, null), null, null, 0, null, null, 992, null);
        finderThanksButton.setListener(new com.tencent.mm.plugin.finder.convert.ih(holder));
        q(finderThanksButton, item, holder, com.tencent.mm.plugin.finder.assist.o3.f102423e, 8, z17 ? 4 : 3);
    }

    public final void q(android.view.View view, so2.f1 f1Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.assist.o3 o3Var, int i17, int i18) {
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "profile_feed_like_tabulation");
        ((cy1.a) aVar.ik(view, i17, 25496)).Ai(view, new com.tencent.mm.plugin.finder.convert.jh(this, f1Var, s0Var, o3Var, i18));
    }
}
