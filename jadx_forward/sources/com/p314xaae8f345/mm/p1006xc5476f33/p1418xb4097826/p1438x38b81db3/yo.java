package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class yo extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.et f186562e;

    /* renamed from: f, reason: collision with root package name */
    public final float f186563f;

    public yo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.et presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f186562e = presenter;
        this.f186563f = 1.1666666f;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.akt;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String m75945x2fec8307;
        java.lang.String str;
        java.lang.String str2;
        java.util.Iterator it;
        int i19;
        int i27;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc m76160xd133dfec;
        r45.xk a17;
        so2.k item = (so2.k) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.o90 o90Var = item.f491984d.f208526b;
        if (o90Var == null) {
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.mgh);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.mgu);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.mgt);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.mgf);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.mgs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        int i28 = 0;
        imageView.setVisibility(0);
        int m75939xb282bd08 = o90Var.c().m75939xb282bd08(8);
        java.lang.String str3 = "";
        android.content.Context context = holder.f374654e;
        switch (m75939xb282bd08) {
            case 1:
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79799x34afe6b0, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77689x3cb0703)));
                break;
            case 2:
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79787x448e46cd, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77689x3cb0703)));
                break;
            case 3:
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79154xff5dc5a, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77689x3cb0703)));
                break;
            case 4:
                if (!com.p314xaae8f345.mm.ui.bk.C() ? (m75945x2fec8307 = o90Var.c().m75945x2fec8307(6)) == null : (m75945x2fec8307 = o90Var.c().m75945x2fec8307(7)) == null) {
                    m75945x2fec8307 = "";
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                }
                r45.mb4 mb4Var = new r45.mb4();
                char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec8307.getBytes()));
                mb4Var.set(0, m75945x2fec8307);
                mb4Var.set(1, m75945x2fec8307);
                java.lang.String k17 = hc2.l.k(m75945x2fec8307);
                mb4Var.set(46, k17);
                mb4Var.set(47, k17);
                ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null))).c(imageView);
                break;
            case 5:
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79185x284addd0, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77689x3cb0703)));
                break;
            case 6:
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79182x2839ea3e, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77689x3cb0703)));
                break;
            case 7:
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79174x4356e39d, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77689x3cb0703)));
                break;
            case 8:
            default:
                imageView.setVisibility(8);
                break;
            case 9:
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79832xf9dfb797, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77689x3cb0703)));
                break;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String d17 = o90Var.d();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, d17));
        java.lang.String m75945x2fec83072 = o90Var.c().m75945x2fec8307(5);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec83072)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            java.lang.String m75945x2fec83073 = o90Var.c().m75945x2fec8307(5);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            textView2.setText(m75945x2fec83073);
        }
        int i29 = 2;
        java.lang.String m75945x2fec83074 = o90Var.c().m75945x2fec8307(2);
        if (m75945x2fec83074 == null) {
            m75945x2fec83074 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec83074)) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            java.lang.String m75945x2fec83075 = o90Var.c().m75945x2fec8307(2);
            if (m75945x2fec83075 == null) {
                m75945x2fec83075 = "";
            }
            textView3.setText(m75945x2fec83075);
        }
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.clear();
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.mgn);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
            arrayList.add(p18);
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.mgo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p19, "getView(...)");
            arrayList.add(p19);
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.mgp);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p27, "getView(...)");
            arrayList.add(p27);
            int b17 = (context.getResources().getDisplayMetrics().widthPixels - i65.a.b(context, 32)) / 3;
            int i37 = (int) (b17 * this.f186563f);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                android.view.View view = (android.view.View) it6.next();
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = b17;
                layoutParams.height = i37;
                view.setLayoutParams(layoutParams);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.util.Iterator it7 = arrayList.iterator();
            int i38 = 0;
            while (it7.hasNext()) {
                java.lang.Object next = it7.next();
                int i39 = i38 + 1;
                if (i38 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.view.View view2 = (android.view.View) next;
                java.util.LinkedList linkedList = o90Var.f208832b;
                if (i38 >= linkedList.size()) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(i28)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i19 = i29;
                    str = str3;
                    it = it7;
                    i27 = i28;
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList4.add(java.lang.Integer.valueOf(i28));
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList4.get(i28)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.ImageView imageView2 = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.mgr);
                    android.widget.ImageView imageView3 = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.mgj);
                    android.widget.TextView textView4 = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.mgq);
                    android.widget.ImageView imageView4 = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.mgi);
                    java.lang.Object obj = linkedList.get(i38);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
                    r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.Z(abstractC14490x69736cb5.getFeedObject().m59264x7efe73ec());
                    imageView2.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77702x3cb0748);
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    str = str3;
                    if (mb4Var2 != null) {
                        if (mb4Var2.m75939xb282bd08(i29) != 4) {
                            g1Var.e().c(new mn2.c1(mb4Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null), imageView2, g1Var.h(mn2.f1.f411486d));
                        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var2.m75945x2fec8307(16))) {
                            g1Var.e().c(new mn2.c1(mb4Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null), imageView2, g1Var.h(mn2.f1.f411486d));
                        } else {
                            g1Var.e().c(new mn2.r3(mb4Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null), imageView2, g1Var.h(mn2.f1.f411486d));
                        }
                    }
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76760x76845fea();
                    imageView3.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77702x3cb0748);
                    vo0.d a18 = g1Var.a();
                    if (m76760x76845fea == null || (str2 = m76760x76845fea.m76175x6d346f39()) == null) {
                        str2 = str;
                    }
                    it = it7;
                    i19 = 2;
                    a18.c(new mn2.n(str2, null, 2, null), imageView3, g1Var.h(mn2.f1.f411490h));
                    java.lang.CharSequence nickNameSpan = abstractC14490x69736cb5.getFeedObject().getNickNameSpan();
                    if (nickNameSpan == null) {
                        nickNameSpan = str;
                    }
                    textView4.setText(nickNameSpan);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView4);
                    i27 = 0;
                    if (m76760x76845fea == null || (a17 = ya2.d.a(m76760x76845fea, false)) == null || (m76160xd133dfec = ya2.d.e(a17)) == null) {
                        if (m76760x76845fea != null) {
                            m76160xd133dfec = m76760x76845fea.m76160xd133dfec();
                        } else {
                            c19780xceb4c4dc = null;
                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                            zy2.tb.a(ya2.m1.f542044a, imageView4, c19780xceb4c4dc, 0, 4, null);
                            view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wo(o90Var, i38, view2, abstractC14490x69736cb5, holder, this));
                        }
                    }
                    c19780xceb4c4dc = m76160xd133dfec;
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    zy2.tb.a(ya2.m1.f542044a, imageView4, c19780xceb4c4dc, 0, 4, null);
                    view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wo(o90Var, i38, view2, abstractC14490x69736cb5, holder, this));
                }
                str3 = str;
                i29 = i19;
                i28 = i27;
                i38 = i39;
                it7 = it;
            }
        }
        int i47 = i28;
        if (o90Var.a() == 0) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p17, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList5.get(i47)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.p(com.p314xaae8f345.mm.R.id.mgg).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xo(o90Var, holder, this));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
