package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class l8 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f185435e;

    public l8(yz5.l isRealFinderFavInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isRealFinderFavInfo, "isRealFinderFavInfo");
        this.f185435e = isRealFinderFavInfo;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b8q;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.c1 item = (so2.c1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (!(list == null || list.isEmpty())) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.next(), 1)) {
                    n(item, holder, i17);
                }
            }
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (item.f491823f != null) {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.i1t);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.u4z);
            if (p18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.tu_);
            if (p19 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a, p19, item.f491823f, "like_panel_red_envelope_banner", item.f491822e, 2, null, 32, null);
            }
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.tu7);
            if (p27 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.tu8);
            if (p28 == null) {
                return;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        r45.t11 t11Var = item.f491824g;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb a17 = t11Var != null ? hc2.w.a(t11Var) : null;
        h0Var.f391656d = a17;
        android.content.Context context = holder.f374654e;
        if (a17 != null) {
            android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.i1t);
            if (p29 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(p29, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p29.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.tu_);
            if (p37 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(p37, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p37.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p38 = holder.p(com.p314xaae8f345.mm.R.id.u4z);
            if (p38 != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(p38, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p38.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p38 != null) {
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
                lz5.m mVar = new lz5.m();
                mVar.put("like_panel", 2);
                mVar.put("feedid", item.f491822e);
                mVar.put("easter_egg_emoji_md5", interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42933xb5885648() : null);
                d2Var.n(p38, "like_panel_like_easter_egg", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.b1.b(mVar), (r20 & 128) != 0 ? null : null);
            }
            android.widget.ImageView imageView = p38 != null ? (android.widget.ImageView) p38.findViewById(com.p314xaae8f345.mm.R.id.t7t) : null;
            if (imageView != null) {
                ox2.r0.a(imageView, (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d, true, "Finder.FinderFeedFavConvert onBindViewHolder fav");
            }
            if (p38 != null) {
                p38.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.j8(context, h0Var));
            }
            android.view.View findViewById = p38 != null ? p38.findViewById(com.p314xaae8f345.mm.R.id.f566890u54) : null;
            android.view.View findViewById2 = p38 != null ? p38.findViewById(com.p314xaae8f345.mm.R.id.f566888u52) : null;
            if (((java.lang.Boolean) this.f185435e.mo146xb9724478(java.lang.Integer.valueOf(i17 + 1))).booleanValue()) {
                if (findViewById != null) {
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
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
                java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
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
                java.lang.ThreadLocal threadLocal11 = zj0.c.f554818a;
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
            java.lang.ThreadLocal threadLocal12 = zj0.c.f554818a;
            arrayList12.add(8);
            java.util.Collections.reverse(arrayList12);
            android.view.View view4 = findViewById2;
            yj0.a.d(view4, arrayList12.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p39 = holder.p(com.p314xaae8f345.mm.R.id.i1t);
        if (p39 != null) {
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal13 = zj0.c.f554818a;
            arrayList13.add(0);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(p39, arrayList13.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p39.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(p39, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p47 = holder.p(com.p314xaae8f345.mm.R.id.u4z);
        if (p47 != null) {
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal14 = zj0.c.f554818a;
            arrayList14.add(8);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(p47, arrayList14.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p47.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(p47, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p48 = holder.p(com.p314xaae8f345.mm.R.id.tu_);
        if (p48 != null) {
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal15 = zj0.c.f554818a;
            arrayList15.add(8);
            java.util.Collections.reverse(arrayList15);
            yj0.a.d(p48, arrayList15.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p48.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
            yj0.a.f(p48, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f566006ed5);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        r45.s21 s21Var = item.f491821d;
        java.lang.String md6 = c61.yb.md(ybVar, s21Var.f466962g, s21Var.f466959d, false, 4, null);
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, md6));
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams layoutParams2 = layoutParams instanceof com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams ? (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f125727i = (int) textView.getPaint().measureText(hc2.x0.f(textView.getText().toString(), 4));
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f566005ed4);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d l17 = g1Var.l();
        mn2.n nVar = new mn2.n(s21Var.f466960e, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
        l17.c(nVar, imageView2, g1Var.h(mn2.f1.f411494o));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.frp);
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L1().r()).booleanValue()) {
            android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.tbk);
            if (c22699x3dcdb352 != null && imageView3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c3 c3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c3.f183585a;
                r45.ub1 ub1Var = s21Var.f466973u;
                boolean z18 = ub1Var != null && ub1Var.m75939xb282bd08(0) == 1;
                r45.ub1 ub1Var2 = s21Var.f466973u;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = ub1Var2 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc) ub1Var2.m75936x14adae67(1) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                c3Var.a(c22699x3dcdb352, imageView3, z18, c19780xceb4c4dc, false, context);
            }
        } else if (c22699x3dcdb352 != null) {
            r45.ub1 ub1Var3 = s21Var.f466973u;
            int i19 = ub1Var3 != null && ub1Var3.m75939xb282bd08(0) == 1 ? 0 : 8;
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal16 = zj0.c.f554818a;
            arrayList16.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(c22699x3dcdb352, arrayList16.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(c22699x3dcdb352, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s21Var.f466962g, c01.z1.r());
        java.util.LinkedList interaction_label_list = s21Var.f466972t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(interaction_label_list, "interaction_label_list");
        java.util.ArrayList arrayList17 = new java.util.ArrayList();
        for (java.lang.Object obj : interaction_label_list) {
            int m75939xb282bd08 = ((r45.zb1) obj).m75939xb282bd08(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3 d3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3.f183609e;
            if (m75939xb282bd08 == 1) {
                arrayList17.add(obj);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c c15301xb3484a3c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c) holder.p(com.p314xaae8f345.mm.R.id.e5y);
        if (c15301xb3484a3c != null) {
            int i27 = !b17 && (arrayList17.isEmpty() ^ true) ? 0 : 8;
            java.util.ArrayList arrayList18 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal17 = zj0.c.f554818a;
            arrayList18.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList18);
            yj0.a.d(c15301xb3484a3c, arrayList18.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c15301xb3484a3c.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
            yj0.a.f(c15301xb3484a3c, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (c15301xb3484a3c.getVisibility() == 0) {
                c15301xb3484a3c.a(arrayList17);
            }
        }
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L1().r()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c c15301xb3484a3c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c) holder.p(com.p314xaae8f345.mm.R.id.rdn);
            if (c15301xb3484a3c2 != null) {
                c15301xb3484a3c2.setVisibility(8);
            }
        } else {
            java.util.ArrayList arrayList19 = new java.util.ArrayList();
            for (java.lang.Object obj2 : interaction_label_list) {
                int m75939xb282bd082 = ((r45.zb1) obj2).m75939xb282bd08(1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3 d3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3.f183609e;
                if (m75939xb282bd082 == 2) {
                    arrayList19.add(obj2);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c c15301xb3484a3c3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c) holder.p(com.p314xaae8f345.mm.R.id.rdn);
            if (c15301xb3484a3c3 != null) {
                int i28 = !b17 && (arrayList19.isEmpty() ^ true) ? 0 : 8;
                java.util.ArrayList arrayList20 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal18 = zj0.c.f554818a;
                arrayList20.add(java.lang.Integer.valueOf(i28));
                java.util.Collections.reverse(arrayList20);
                yj0.a.d(c15301xb3484a3c3, arrayList20.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c15301xb3484a3c3.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                yj0.a.f(c15301xb3484a3c3, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (c15301xb3484a3c3.getVisibility() == 0) {
                    c15301xb3484a3c3.a(arrayList19);
                }
            }
        }
        n(item, holder, i17);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o3 o3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o3.f183957f;
        o(itemView, item, holder, o3Var, be1.r0.f4232x366c91de, 0);
        o(imageView2, item, holder, o3Var, 8, 1);
        o(textView, item, holder, o3Var, 8, 2);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final void n(so2.c1 item, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1) holder.p(com.p314xaae8f345.mm.R.id.o5q);
        if (c15003x1d0c0ec1 == null) {
            return;
        }
        r45.s21 s21Var = item.f491821d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s21Var, "<this>");
        java.lang.Integer a17 = ju2.r.a();
        int intValue = a17 != null ? a17.intValue() : s21Var.f466970r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        c15003x1d0c0ec1.setVisibility((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s21Var.f466962g, c01.z1.r()) || !(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209193dc).mo141623x754a37bb()).r()).intValue() == 1 || intValue == 1 || intValue == 2)) ? 8 : 0);
        if (c15003x1d0c0ec1.getVisibility() == 8) {
            return;
        }
        java.lang.String str = s21Var.f466962g;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderFeedFavConvert", "favInfo.userName is null");
            return;
        }
        ju2.q qVar = new ju2.q(intValue, i17, null, null, null, null, null, null, null, null, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c, null);
        boolean z17 = s21Var.f466969q == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1.G(c15003x1d0c0ec1, pm0.v.Z(item.f491822e), str, z17, 3, qVar, null, null, 0, null, null, 992, null);
        o(c15003x1d0c0ec1, item, holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o3.f183956e, 8, z17 ? 4 : 3);
    }

    public final void o(android.view.View view, so2.c1 c1Var, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o3 o3Var, int i17, int i18) {
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "profile_feed_like_tabulation");
        ((cy1.a) aVar.ik(view, i17, 25496)).Ai(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.k8(this, c1Var, s0Var, o3Var, i18));
    }
}
