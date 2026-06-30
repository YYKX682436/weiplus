package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class sl extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569385s;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String m76084x8010e5e4;
        java.lang.String m76102x6c03c64c;
        java.lang.Throwable th6;
        java.util.Iterator it;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.i1q);
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77702x3cb0748);
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(item.getFeedObject().m59264x7efe73ec());
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (mb4Var != null) {
            if (mb4Var.m75939xb282bd08(2) == 4) {
                g1Var.e().c(new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null), imageView, g1Var.h(mn2.f1.f411486d));
            } else {
                g1Var.e().c(new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null), imageView, g1Var.h(mn2.f1.f411486d));
            }
        }
        java.lang.Throwable th7 = null;
        holder.f3639x46306858.setOnClickListener(null);
        java.util.List msgEventLikeList = item.getMsgEventLikeList();
        long m59251x5db1b11 = item.getFeedObject().m59251x5db1b11();
        java.lang.String m59276x6c285d75 = item.getFeedObject().m59276x6c285d75();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m76790x8e819aad = item.getFeedObject().getFeedObject().m76790x8e819aad();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLikeConvert", "onBindViewHolder name:" + item.getFeedObject().m59273x80025a04() + ", likeList size:" + msgEventLikeList.size() + ", jumpFeedId:" + m59251x5db1b11);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.lkg);
        if (p17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(holder.p(com.p314xaae8f345.mm.R.id.f566593ge5));
            arrayList3.add(holder.p(com.p314xaae8f345.mm.R.id.ge7));
            arrayList3.add(holder.p(com.p314xaae8f345.mm.R.id.ge9));
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(holder.p(com.p314xaae8f345.mm.R.id.ge6));
            arrayList4.add(holder.p(com.p314xaae8f345.mm.R.id.ge8));
            arrayList4.add(holder.p(com.p314xaae8f345.mm.R.id.ge_));
            java.util.Iterator it6 = arrayList3.iterator();
            int i19 = 0;
            while (true) {
                if (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        java.lang.Throwable th8 = th7;
                        kz5.c0.p();
                        throw th8;
                    }
                    android.widget.ImageView imageView2 = (android.widget.ImageView) next;
                    if (imageView2 != null) {
                        if (i19 >= msgEventLikeList.size()) {
                            android.view.View view = (android.view.View) arrayList4.get(i19);
                            if (view != null) {
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                arrayList5.add(8);
                                java.util.Collections.reverse(arrayList5);
                                yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                                yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            it = it6;
                            arrayList = arrayList4;
                        } else {
                            android.view.View view2 = (android.view.View) arrayList4.get(i19);
                            if (view2 == null) {
                                it = it6;
                                arrayList = arrayList4;
                            } else {
                                it = it6;
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                arrayList = arrayList4;
                                arrayList6.add(0);
                                java.util.Collections.reverse(arrayList6);
                                yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            java.lang.String m76074x6d346f39 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) msgEventLikeList.get(i19)).m76074x6d346f39();
                            java.lang.String str = m76074x6d346f39 != null ? m76074x6d346f39 : "";
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) msgEventLikeList.get(i19)).m76102x6c03c64c(), c01.z1.r())) {
                                ng5.a.a(imageView2, c01.z1.r());
                            } else {
                                th6 = null;
                                g1Var.a().c(new mn2.n(str, null, 2, null), imageView2, g1Var.h(mn2.f1.f411490h));
                            }
                        }
                        th6 = null;
                    } else {
                        th6 = th7;
                        it = it6;
                        arrayList = arrayList4;
                    }
                    it6 = it;
                    arrayList4 = arrayList;
                    th7 = th6;
                    i19 = i27;
                } else {
                    android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.lkh);
                    android.content.Context context = holder.f374654e;
                    if (textView != null) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) kz5.n0.Z(msgEventLikeList);
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        i95.m c17 = i95.n0.c(c61.yb.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        java.lang.String md6 = c61.yb.md((c61.yb) c17, (c19781xd1c47b87 == null || (m76102x6c03c64c = c19781xd1c47b87.m76102x6c03c64c()) == null) ? "" : m76102x6c03c64c, (c19781xd1c47b87 == null || (m76084x8010e5e4 = c19781xd1c47b87.m76084x8010e5e4()) == null) ? "" : m76084x8010e5e4, false, 4, null);
                        ((ke0.e) xVar).getClass();
                        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, md6));
                    }
                    android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.lke);
                    int msgEventFriendLikeCount = item.getMsgEventFriendLikeCount();
                    int msgEventIncCount = item.getMsgEventIncCount();
                    int i28 = msgEventFriendLikeCount - msgEventIncCount;
                    if (msgEventFriendLikeCount == 1) {
                        int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573571f11);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        textView2.setText(hc2.x0.k(string, context, '#', com.p314xaae8f345.mm.R.raw.f79668x47e8ad96, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null));
                    } else if (msgEventFriendLikeCount > 3 || msgEventIncCount > 0) {
                        if (msgEventIncCount > 0) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
                            n(i28, msgEventIncCount, holder, com.p314xaae8f345.mm.R.C30867xcad56011.f573570f10, textView2);
                        } else {
                            textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573570f10, java.lang.String.valueOf(msgEventFriendLikeCount).toString()));
                        }
                    } else if (msgEventIncCount > 0) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
                        n(i28, msgEventIncCount, holder, com.p314xaae8f345.mm.R.C30867xcad56011.f573573f13, textView2);
                    } else {
                        textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573573f13, java.lang.String.valueOf(msgEventFriendLikeCount).toString()));
                    }
                    holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ql(holder, item, m76790x8e819aad));
                }
            }
        }
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rl(m59251x5db1b11, m59276x6c285d75, m76790x8e819aad, holder, this));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.lkh);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.lke);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
    }

    public final void n(int i17, int i18, in5.s0 s0Var, int i19, android.widget.TextView textView) {
        int i27;
        java.lang.String str = i17 + " + " + i18;
        int length = str.length() - r26.n0.K(str, '+', 0, false, 6, null);
        int dimension = (int) s0Var.f374654e.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        android.content.Context context = s0Var.f374654e;
        java.lang.String string = context.getString(i19, i17 + " + " + i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.CharSequence k17 = hc2.x0.k(string, context, '#', com.p314xaae8f345.mm.R.raw.f79668x47e8ad96, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        int K = r26.n0.K(k17, '+', 0, false, 6, null);
        if (K <= 0 || (i27 = length + K) >= ((android.text.SpannableString) k17).length()) {
            textView.setText(k17);
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(k17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac)), K, i27, 17);
        textView.setText(spannableStringBuilder);
    }
}
