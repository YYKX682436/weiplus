package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class l8 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f103902e;

    public l8(yz5.l isRealFinderFavInfo) {
        kotlin.jvm.internal.o.g(isRealFinderFavInfo, "isRealFinderFavInfo");
        this.f103902e = isRealFinderFavInfo;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b8q;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.c1 item = (so2.c1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (!(list == null || list.isEmpty())) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b(it.next(), 1)) {
                    n(item, holder, i17);
                }
            }
            return;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (item.f410290f != null) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.i1t);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p18 = holder.p(com.tencent.mm.R.id.u4z);
            if (p18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p19 = holder.p(com.tencent.mm.R.id.tu_);
            if (p19 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.r(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a, p19, item.f410290f, "like_panel_red_envelope_banner", item.f410289e, 2, null, 32, null);
            }
            android.view.View p27 = holder.p(com.tencent.mm.R.id.tu7);
            if (p27 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p28 = holder.p(com.tencent.mm.R.id.tu8);
            if (p28 == null) {
                return;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        r45.t11 t11Var = item.f410291g;
        com.tencent.mm.api.IEmojiInfo a17 = t11Var != null ? hc2.w.a(t11Var) : null;
        h0Var.f310123d = a17;
        android.content.Context context = holder.f293121e;
        if (a17 != null) {
            android.view.View p29 = holder.p(com.tencent.mm.R.id.i1t);
            if (p29 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(p29, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p29.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p37 = holder.p(com.tencent.mm.R.id.tu_);
            if (p37 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(p37, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p37.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p38 = holder.p(com.tencent.mm.R.id.u4z);
            if (p38 != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(p38, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p38.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p38 != null) {
                com.tencent.mm.api.IEmojiInfo iEmojiInfo = (com.tencent.mm.api.IEmojiInfo) h0Var.f310123d;
                com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
                lz5.m mVar = new lz5.m();
                mVar.put("like_panel", 2);
                mVar.put("feedid", item.f410289e);
                mVar.put("easter_egg_emoji_md5", iEmojiInfo != null ? iEmojiInfo.getMd5() : null);
                d2Var.n(p38, "like_panel_like_easter_egg", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.b1.b(mVar), (r20 & 128) != 0 ? null : null);
            }
            android.widget.ImageView imageView = p38 != null ? (android.widget.ImageView) p38.findViewById(com.tencent.mm.R.id.t7t) : null;
            if (imageView != null) {
                ox2.r0.a(imageView, (com.tencent.mm.api.IEmojiInfo) h0Var.f310123d, true, "Finder.FinderFeedFavConvert onBindViewHolder fav");
            }
            if (p38 != null) {
                p38.setOnClickListener(new com.tencent.mm.plugin.finder.convert.j8(context, h0Var));
            }
            android.view.View findViewById = p38 != null ? p38.findViewById(com.tencent.mm.R.id.f485357u54) : null;
            android.view.View findViewById2 = p38 != null ? p38.findViewById(com.tencent.mm.R.id.f485355u52) : null;
            if (((java.lang.Boolean) this.f103902e.invoke(java.lang.Integer.valueOf(i17 + 1))).booleanValue()) {
                if (findViewById != null) {
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
                    arrayList9.add(8);
                    java.util.Collections.reverse(arrayList9);
                    android.view.View view = findViewById;
                    yj0.a.d(view, arrayList9.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById2 == null) {
                    return;
                }
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
                arrayList10.add(0);
                java.util.Collections.reverse(arrayList10);
                android.view.View view2 = findViewById2;
                yj0.a.d(view2, arrayList10.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (findViewById != null) {
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal11 = zj0.c.f473285a;
                arrayList11.add(0);
                java.util.Collections.reverse(arrayList11);
                android.view.View view3 = findViewById;
                yj0.a.d(view3, arrayList11.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal12 = zj0.c.f473285a;
            arrayList12.add(8);
            java.util.Collections.reverse(arrayList12);
            android.view.View view4 = findViewById2;
            yj0.a.d(view4, arrayList12.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p39 = holder.p(com.tencent.mm.R.id.i1t);
        if (p39 != null) {
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal13 = zj0.c.f473285a;
            arrayList13.add(0);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(p39, arrayList13.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p39.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(p39, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p47 = holder.p(com.tencent.mm.R.id.u4z);
        if (p47 != null) {
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal14 = zj0.c.f473285a;
            arrayList14.add(8);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(p47, arrayList14.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p47.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(p47, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p48 = holder.p(com.tencent.mm.R.id.tu_);
        if (p48 != null) {
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal15 = zj0.c.f473285a;
            arrayList15.add(8);
            java.util.Collections.reverse(arrayList15);
            yj0.a.d(p48, arrayList15.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p48.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
            yj0.a.f(p48, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f484473ed5);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        r45.s21 s21Var = item.f410288d;
        java.lang.String md6 = c61.yb.md(ybVar, s21Var.f385429g, s21Var.f385426d, false, 4, null);
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, md6));
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams2 = layoutParams instanceof com.google.android.flexbox.FlexboxLayout.LayoutParams ? (com.google.android.flexbox.FlexboxLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f44194i = (int) textView.getPaint().measureText(hc2.x0.f(textView.getText().toString(), 4));
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f484472ed4);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d l17 = g1Var.l();
        mn2.n nVar = new mn2.n(s21Var.f385427e, null, 2, null);
        kotlin.jvm.internal.o.d(imageView2);
        l17.c(nVar, imageView2, g1Var.h(mn2.f1.f329961o));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.frp);
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L1().r()).booleanValue()) {
            android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.tbk);
            if (weImageView != null && imageView3 != null) {
                com.tencent.mm.plugin.finder.assist.c3 c3Var = com.tencent.mm.plugin.finder.assist.c3.f102052a;
                r45.ub1 ub1Var = s21Var.f385440u;
                boolean z18 = ub1Var != null && ub1Var.getInteger(0) == 1;
                r45.ub1 ub1Var2 = s21Var.f385440u;
                com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = ub1Var2 != null ? (com.tencent.mm.protocal.protobuf.FinderAuthInfo) ub1Var2.getCustom(1) : null;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                c3Var.a(weImageView, imageView3, z18, finderAuthInfo, false, context);
            }
        } else if (weImageView != null) {
            r45.ub1 ub1Var3 = s21Var.f385440u;
            int i19 = ub1Var3 != null && ub1Var3.getInteger(0) == 1 ? 0 : 8;
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal16 = zj0.c.f473285a;
            arrayList16.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(weImageView, arrayList16.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(weImageView, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean b17 = kotlin.jvm.internal.o.b(s21Var.f385429g, c01.z1.r());
        java.util.LinkedList interaction_label_list = s21Var.f385439t;
        kotlin.jvm.internal.o.f(interaction_label_list, "interaction_label_list");
        java.util.ArrayList arrayList17 = new java.util.ArrayList();
        for (java.lang.Object obj : interaction_label_list) {
            int integer = ((r45.zb1) obj).getInteger(1);
            com.tencent.mm.plugin.finder.assist.d3 d3Var = com.tencent.mm.plugin.finder.assist.d3.f102076e;
            if (integer == 1) {
                arrayList17.add(obj);
            }
        }
        com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView finderInteractionLabelGroupView = (com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView) holder.p(com.tencent.mm.R.id.e5y);
        if (finderInteractionLabelGroupView != null) {
            int i27 = !b17 && (arrayList17.isEmpty() ^ true) ? 0 : 8;
            java.util.ArrayList arrayList18 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal17 = zj0.c.f473285a;
            arrayList18.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList18);
            yj0.a.d(finderInteractionLabelGroupView, arrayList18.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderInteractionLabelGroupView.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
            yj0.a.f(finderInteractionLabelGroupView, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (finderInteractionLabelGroupView.getVisibility() == 0) {
                finderInteractionLabelGroupView.a(arrayList17);
            }
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L1().r()).booleanValue()) {
            com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView finderInteractionLabelGroupView2 = (com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView) holder.p(com.tencent.mm.R.id.rdn);
            if (finderInteractionLabelGroupView2 != null) {
                finderInteractionLabelGroupView2.setVisibility(8);
            }
        } else {
            java.util.ArrayList arrayList19 = new java.util.ArrayList();
            for (java.lang.Object obj2 : interaction_label_list) {
                int integer2 = ((r45.zb1) obj2).getInteger(1);
                com.tencent.mm.plugin.finder.assist.d3 d3Var2 = com.tencent.mm.plugin.finder.assist.d3.f102076e;
                if (integer2 == 2) {
                    arrayList19.add(obj2);
                }
            }
            com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView finderInteractionLabelGroupView3 = (com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView) holder.p(com.tencent.mm.R.id.rdn);
            if (finderInteractionLabelGroupView3 != null) {
                int i28 = !b17 && (arrayList19.isEmpty() ^ true) ? 0 : 8;
                java.util.ArrayList arrayList20 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal18 = zj0.c.f473285a;
                arrayList20.add(java.lang.Integer.valueOf(i28));
                java.util.Collections.reverse(arrayList20);
                yj0.a.d(finderInteractionLabelGroupView3, arrayList20.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                finderInteractionLabelGroupView3.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                yj0.a.f(finderInteractionLabelGroupView3, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (finderInteractionLabelGroupView3.getVisibility() == 0) {
                    finderInteractionLabelGroupView3.a(arrayList19);
                }
            }
        }
        n(item, holder, i17);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.finder.assist.o3 o3Var = com.tencent.mm.plugin.finder.assist.o3.f102424f;
        o(itemView, item, holder, o3Var, be1.r0.CTRL_INDEX, 0);
        o(imageView2, item, holder, o3Var, 8, 1);
        o(textView, item, holder, o3Var, 8, 2);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final void n(so2.c1 item, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton = (com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton) holder.p(com.tencent.mm.R.id.o5q);
        if (finderThanksButton == null) {
            return;
        }
        r45.s21 s21Var = item.f410288d;
        kotlin.jvm.internal.o.g(s21Var, "<this>");
        java.lang.Integer a17 = ju2.r.a();
        int intValue = a17 != null ? a17.intValue() : s21Var.f385437r;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        finderThanksButton.setVisibility((kotlin.jvm.internal.o.b(s21Var.f385429g, c01.z1.r()) || !(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127660dc).getValue()).r()).intValue() == 1 || intValue == 1 || intValue == 2)) ? 8 : 0);
        if (finderThanksButton.getVisibility() == 8) {
            return;
        }
        java.lang.String str = s21Var.f385429g;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderFeedFavConvert", "favInfo.userName is null");
            return;
        }
        ju2.q qVar = new ju2.q(intValue, i17, null, null, null, null, null, null, null, null, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST, null);
        boolean z17 = s21Var.f385436q == 1;
        com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton.G(finderThanksButton, pm0.v.Z(item.f410289e), str, z17, 3, qVar, null, null, 0, null, null, 992, null);
        o(finderThanksButton, item, holder, com.tencent.mm.plugin.finder.assist.o3.f102423e, 8, z17 ? 4 : 3);
    }

    public final void o(android.view.View view, so2.c1 c1Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.assist.o3 o3Var, int i17, int i18) {
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "profile_feed_like_tabulation");
        ((cy1.a) aVar.ik(view, i17, 25496)).Ai(view, new com.tencent.mm.plugin.finder.convert.k8(this, c1Var, s0Var, o3Var, i18));
    }
}
