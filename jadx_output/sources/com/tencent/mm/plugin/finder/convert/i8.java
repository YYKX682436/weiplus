package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class i8 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f103647e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f103648f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f103649g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f103650h;

    public /* synthetic */ i8(yz5.a aVar, yz5.a aVar2, yz5.a aVar3, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(aVar, (i17 & 2) != 0 ? null : aVar2, (i17 & 4) != 0 ? null : aVar3, (i17 & 8) != 0 ? false : z17);
    }

    @Override // in5.r
    public int e() {
        return this.f103650h ? com.tencent.mm.R.layout.b__ : com.tencent.mm.R.layout.b_9;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        boolean z18;
        int i19;
        int i27;
        boolean z19;
        int i28;
        float f17;
        so2.s item = (so2.s) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View view = holder.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        so2.s sVar = (so2.s) holder.f293125i;
        int i29 = item.f410584f;
        boolean z27 = i29 == 3 || i29 == 1 || i29 == 4 || i29 == 35 || i29 == 39;
        boolean z28 = this.f103650h;
        android.content.Context context = holder.f293121e;
        if (z27) {
            holder.itemView.setBackgroundColor(context.getResources().getColor((item.f410584f == 3 && ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.y0().r()).intValue() == 1) ? z28 ? com.tencent.mm.R.color.f478512u : com.tencent.mm.R.color.f479241tt : com.tencent.mm.R.color.f479160rk));
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.m2g);
            if (textView != null) {
                if (z28) {
                    textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479250u2));
                } else {
                    textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479256u8));
                }
            }
        }
        java.lang.Integer valueOf = sVar != null ? java.lang.Integer.valueOf(sVar.f410583e) : null;
        if (valueOf != null && valueOf.intValue() == -3) {
            kotlin.jvm.internal.o.d(sVar);
            android.view.View p17 = holder.p(com.tencent.mm.R.id.hzf);
            if (p17 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsSameCityPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsSameCityPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p18 = holder.p(com.tencent.mm.R.id.u9r);
            if (p18 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsSameCityPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsSameCityPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p19 = holder.p(com.tencent.mm.R.id.dfe);
            if (p19 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(p19, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsSameCityPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsSameCityPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p27 = holder.p(com.tencent.mm.R.id.u9p);
            if (p27 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(p27, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsSameCityPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsSameCityPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.u9t);
            if (textView2 != null) {
                f17 = 0.8f;
                com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
            } else {
                f17 = 0.8f;
            }
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.u9s);
            if (textView3 != null) {
                com.tencent.mm.ui.bk.r0(textView3.getPaint(), f17);
            }
            android.view.View p28 = holder.p(com.tencent.mm.R.id.u9q);
            if (sVar.f410585g != so2.g5.f410362d) {
                com.tencent.mars.xlog.Log.i("Finder.FeedEmptyConvert", "show lbs business location request page!");
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                if (p28 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(p28, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsSameCityPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p28.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsSameCityPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (p28 != null) {
                    p28.setOnClickListener(new com.tencent.mm.plugin.finder.convert.e8(this));
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.FeedEmptyConvert", "show lbs system location request page!");
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (p28 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(p28, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsSameCityPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p28.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsSameCityPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.d18);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.nnd, string);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            int L = r26.n0.L(string2, string, 0, false, 6, null);
            int length = string.length() + L;
            android.text.SpannableString spannableString = new android.text.SpannableString(string2);
            if (L <= 0 || length > string2.length()) {
                length = string2.length();
            } else {
                r13 = L;
            }
            spannableString.setSpan(new com.tencent.mm.plugin.finder.convert.d8(this, holder), r13, length, 33);
            if (textView3 != null) {
                textView3.setHighlightColor(context.getResources().getColor(android.R.color.transparent));
            }
            if (textView3 != null) {
                textView3.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
            if (textView3 == null) {
                return;
            }
            textView3.setText(spannableString);
            return;
        }
        if (valueOf != null && valueOf.intValue() == -4) {
            android.view.View p29 = holder.p(com.tencent.mm.R.id.hzf);
            if (p29 != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(p29, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setLbsForbidden", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p29.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setLbsForbidden", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p37 = holder.p(com.tencent.mm.R.id.u9r);
            if (p37 != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(0);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(p37, arrayList9.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setLbsForbidden", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p37.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setLbsForbidden", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p38 = holder.p(com.tencent.mm.R.id.dfe);
            if (p38 != null) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(8);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(p38, arrayList10.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setLbsForbidden", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p38.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setLbsForbidden", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p39 = holder.p(com.tencent.mm.R.id.u9p);
            if (p39 != null) {
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                arrayList11.add(8);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(p39, arrayList11.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setLbsForbidden", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p39.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(p39, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setLbsForbidden", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.u9s);
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            android.view.View p47 = holder.p(com.tencent.mm.R.id.u9q);
            if (p47 != null) {
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(8);
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(p47, arrayList12.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setLbsForbidden", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p47.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(p47, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setLbsForbidden", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.u9t);
            if (textView5 != null) {
                textView5.setText(context.getResources().getString(com.tencent.mm.R.string.nna));
                com.tencent.mm.ui.bk.r0(textView5.getPaint(), 0.8f);
                textView5.setVisibility(0);
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == -2) {
            int i37 = item.f410584f;
            if (i37 == 1001 || i37 == 1002 || i37 == 1005) {
                holder.p(com.tencent.mm.R.id.m7g).setBackground(context.getDrawable(z28 ? com.tencent.mm.R.color.f478512u : com.tencent.mm.R.color.BW_100));
            }
            android.view.View p48 = holder.p(com.tencent.mm.R.id.hzf);
            if (p48 != null) {
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                arrayList13.add(0);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(p48, arrayList13.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p48.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(p48, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p49 = holder.p(com.tencent.mm.R.id.u9r);
            if (p49 != null) {
                java.util.ArrayList arrayList14 = new java.util.ArrayList();
                arrayList14.add(8);
                java.util.Collections.reverse(arrayList14);
                yj0.a.d(p49, arrayList14.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p49.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                yj0.a.f(p49, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p57 = holder.p(com.tencent.mm.R.id.dfe);
            if (p57 != null) {
                java.util.ArrayList arrayList15 = new java.util.ArrayList();
                arrayList15.add(8);
                java.util.Collections.reverse(arrayList15);
                yj0.a.d(p57, arrayList15.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p57.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                yj0.a.f(p57, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setNoLbsPermission", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            holder.p(com.tencent.mm.R.id.hzg).setOnClickListener(new com.tencent.mm.plugin.finder.convert.c8(this));
            com.tencent.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.tencent.mm.R.id.hzg)).getPaint(), 0.8f);
            return;
        }
        kotlin.jvm.internal.o.d(sVar);
        android.view.View p58 = holder.p(com.tencent.mm.R.id.hzf);
        if (p58 != null) {
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            arrayList16.add(8);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(p58, arrayList16.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p58.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(p58, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p59 = holder.p(com.tencent.mm.R.id.u9r);
        if (p59 != null) {
            java.util.ArrayList arrayList17 = new java.util.ArrayList();
            arrayList17.add(8);
            java.util.Collections.reverse(arrayList17);
            yj0.a.d(p59, arrayList17.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p59.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
            yj0.a.f(p59, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p66 = holder.p(com.tencent.mm.R.id.dfe);
        if (p66 != null) {
            java.util.ArrayList arrayList18 = new java.util.ArrayList();
            arrayList18.add(0);
            java.util.Collections.reverse(arrayList18);
            yj0.a.d(p66, arrayList18.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p66.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
            yj0.a.f(p66, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p67 = holder.p(com.tencent.mm.R.id.oah);
        if (p67 != null) {
            java.util.ArrayList arrayList19 = new java.util.ArrayList();
            arrayList19.add(0);
            java.util.Collections.reverse(arrayList19);
            yj0.a.d(p67, arrayList19.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p67.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
            yj0.a.f(p67, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (item.f410582d.length() == 0) {
            android.view.View p68 = holder.p(com.tencent.mm.R.id.lbo);
            if (p68 != null) {
                java.util.ArrayList arrayList20 = new java.util.ArrayList();
                arrayList20.add(0);
                java.util.Collections.reverse(arrayList20);
                yj0.a.d(p68, arrayList20.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p68.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                yj0.a.f(p68, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p69 = holder.p(com.tencent.mm.R.id.m2g);
            if (p69 != null) {
                java.util.ArrayList arrayList21 = new java.util.ArrayList();
                arrayList21.add(8);
                java.util.Collections.reverse(arrayList21);
                yj0.a.d(p69, arrayList21.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p69.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
                yj0.a.f(p69, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p76 = holder.p(com.tencent.mm.R.id.m2c);
            if (p76 != null) {
                java.util.ArrayList arrayList22 = new java.util.ArrayList();
                arrayList22.add(8);
                java.util.Collections.reverse(arrayList22);
                yj0.a.d(p76, arrayList22.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p76.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
                yj0.a.f(p76, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p77 = holder.p(com.tencent.mm.R.id.gst);
            if (p77 == null) {
                return;
            }
            java.util.ArrayList arrayList23 = new java.util.ArrayList();
            arrayList23.add(8);
            java.util.Collections.reverse(arrayList23);
            yj0.a.d(p77, arrayList23.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p77.setVisibility(((java.lang.Integer) arrayList23.get(0)).intValue());
            yj0.a.f(p77, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p78 = holder.p(com.tencent.mm.R.id.lbo);
        if (p78 != null) {
            java.util.ArrayList arrayList24 = new java.util.ArrayList();
            arrayList24.add(8);
            java.util.Collections.reverse(arrayList24);
            yj0.a.d(p78, arrayList24.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p78.setVisibility(((java.lang.Integer) arrayList24.get(0)).intValue());
            yj0.a.f(p78, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p79 = holder.p(com.tencent.mm.R.id.m2g);
        if (p79 != null) {
            java.util.ArrayList arrayList25 = new java.util.ArrayList();
            arrayList25.add(0);
            java.util.Collections.reverse(arrayList25);
            yj0.a.d(p79, arrayList25.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p79.setVisibility(((java.lang.Integer) arrayList25.get(0)).intValue());
            yj0.a.f(p79, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (sVar.f410583e == -1) {
            android.view.View p86 = holder.p(com.tencent.mm.R.id.m2c);
            if (p86 != null) {
                java.util.ArrayList arrayList26 = new java.util.ArrayList();
                arrayList26.add(0);
                java.util.Collections.reverse(arrayList26);
                yj0.a.d(p86, arrayList26.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p86.setVisibility(((java.lang.Integer) arrayList26.get(0)).intValue());
                yj0.a.f(p86, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p87 = holder.p(com.tencent.mm.R.id.gst);
            if (p87 != null) {
                java.util.ArrayList arrayList27 = new java.util.ArrayList();
                arrayList27.add(8);
                java.util.Collections.reverse(arrayList27);
                yj0.a.d(p87, arrayList27.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p87.setVisibility(((java.lang.Integer) arrayList27.get(0)).intValue());
                yj0.a.f(p87, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            holder.s(com.tencent.mm.R.id.m2g, context.getResources().getString(com.tencent.mm.R.string.f8y));
            return;
        }
        android.view.View p88 = holder.p(com.tencent.mm.R.id.m2c);
        if (p88 != null) {
            java.util.ArrayList arrayList28 = new java.util.ArrayList();
            arrayList28.add(8);
            java.util.Collections.reverse(arrayList28);
            yj0.a.d(p88, arrayList28.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p88.setVisibility(((java.lang.Integer) arrayList28.get(0)).intValue());
            yj0.a.f(p88, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.s(com.tencent.mm.R.id.m2g, item.f410582d);
        int i38 = item.f410584f;
        if (i38 == 1 || i38 == 3) {
            pf5.u uVar = pf5.u.f353936a;
            java.lang.String O6 = i38 != 1 ? i38 != 3 ? "" : ((ey2.c2) ((xy2.n) uVar.e(zy2.b6.class).c(xy2.n.class))).O6("finderstream_wording_config", "follow_tab_end_wording") : ((ey2.c2) ((xy2.n) uVar.e(zy2.b6.class).c(xy2.n.class))).O6("finderstream_wording_config", "friend_tab_end_wording");
            if ((O6.length() == 0) && ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                O6 = context.getResources().getString(com.tencent.mm.R.string.erb);
                kotlin.jvm.internal.o.f(O6, "getString(...)");
            }
            if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                z18 = false;
                i28 = com.tencent.mm.R.id.gst;
                i27 = 1;
            } else {
                g92.b bVar = g92.b.f269769e;
                r45.ls2 ls2Var = (r45.ls2) bVar.k2().d().getCustom(26);
                if ((ls2Var != null && ls2Var.getInteger(0) == 1) || !hc2.e.a()) {
                    z18 = false;
                    i19 = com.tencent.mm.R.id.m2g;
                } else {
                    i19 = com.tencent.mm.R.id.m2g;
                    z18 = true;
                }
                android.view.View p89 = holder.p(i19);
                kotlin.jvm.internal.o.f(p89, "getView(...)");
                android.widget.TextView textView6 = (android.widget.TextView) p89;
                com.tencent.mm.plugin.finder.convert.z7 z7Var = new com.tencent.mm.plugin.finder.convert.z7(holder);
                r45.ls2 ls2Var2 = (r45.ls2) bVar.k2().d().getCustom(26);
                if (ls2Var2 != null) {
                    i27 = 1;
                    if (ls2Var2.getInteger(0) == 1) {
                        z19 = true;
                        if (z19 && hc2.e.a()) {
                            android.content.res.Resources resources = textView6.getContext().getResources();
                            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                            java.lang.String string3 = resources.getString(com.tencent.mm.R.string.d0j, t70Var.H2(4, ""));
                            kotlin.jvm.internal.o.f(string3, "getString(...)");
                            java.lang.String string4 = textView6.getContext().getResources().getString(com.tencent.mm.R.string.d0k, t70Var.H2(4, ""));
                            kotlin.jvm.internal.o.f(string4, "getString(...)");
                            int L2 = r26.n0.L(string3, string4, 0, false, 6, null);
                            int length2 = string4.length() + L2;
                            android.text.SpannableString spannableString2 = new android.text.SpannableString(string3);
                            if (L2 <= 0 || length2 > string3.length()) {
                                length2 = string3.length();
                                L2 = 0;
                            }
                            spannableString2.setSpan(new com.tencent.mm.plugin.finder.convert.f8(z7Var, z28, textView6), L2, length2, 33);
                            textView6.setHighlightColor(textView6.getContext().getResources().getColor(android.R.color.transparent));
                            textView6.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                            textView6.setText(spannableString2);
                        } else {
                            textView6.setText(textView6.getContext().getResources().getString(com.tencent.mm.R.string.erb));
                        }
                        i28 = com.tencent.mm.R.id.gst;
                    }
                } else {
                    i27 = 1;
                }
                z19 = false;
                if (z19) {
                }
                textView6.setText(textView6.getContext().getResources().getString(com.tencent.mm.R.string.erb));
                i28 = com.tencent.mm.R.id.gst;
            }
            android.view.View p96 = holder.p(i28);
            if (p96 != null) {
                int i39 = z18 ? 0 : 8;
                java.util.ArrayList arrayList29 = new java.util.ArrayList();
                arrayList29.add(java.lang.Integer.valueOf(i39));
                java.util.Collections.reverse(arrayList29);
                yj0.a.d(p96, arrayList29.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p96.setVisibility(((java.lang.Integer) arrayList29.get(0)).intValue());
                yj0.a.f(p96, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if ((O6.length() > 0 ? i27 : 0) != 0) {
                holder.s(com.tencent.mm.R.id.m2g, O6);
                return;
            }
            return;
        }
        if (i38 != 1001 && i38 != 1005) {
            android.view.View p97 = holder.p(com.tencent.mm.R.id.gst);
            java.util.ArrayList arrayList30 = new java.util.ArrayList();
            arrayList30.add(8);
            java.util.Collections.reverse(arrayList30);
            yj0.a.d(p97, arrayList30.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p97.setVisibility(((java.lang.Integer) arrayList30.get(0)).intValue());
            yj0.a.f(p97, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        holder.p(com.tencent.mm.R.id.m7g).setBackground(context.getDrawable(z28 ? com.tencent.mm.R.color.f478512u : com.tencent.mm.R.color.BW_100));
        int i47 = item.f410586h;
        if (i47 == 1000) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.m2g)).setText(item.f410582d);
            android.view.View p98 = holder.p(com.tencent.mm.R.id.gst);
            java.util.ArrayList arrayList31 = new java.util.ArrayList();
            arrayList31.add(8);
            java.util.Collections.reverse(arrayList31);
            yj0.a.d(p98, arrayList31.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p98.setVisibility(((java.lang.Integer) arrayList31.get(0)).intValue());
            yj0.a.f(p98, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i47 == 2000) {
            android.view.View p99 = holder.p(com.tencent.mm.R.id.m2g);
            kotlin.jvm.internal.o.f(p99, "getView(...)");
            android.widget.TextView textView7 = (android.widget.TextView) p99;
            java.lang.String tabName = item.f410582d.toString();
            com.tencent.mm.plugin.finder.convert.a8 a8Var = new com.tencent.mm.plugin.finder.convert.a8(item);
            kotlin.jvm.internal.o.g(tabName, "tabName");
            java.lang.String string5 = textView7.getContext().getResources().getString(com.tencent.mm.R.string.h6w);
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            java.lang.String string6 = textView7.getContext().getResources().getString(com.tencent.mm.R.string.h6x, tabName, string5);
            kotlin.jvm.internal.o.f(string6, "getString(...)");
            int L3 = r26.n0.L(string6, string5, 0, false, 6, null);
            int length3 = string5.length() + L3;
            android.text.SpannableString spannableString3 = new android.text.SpannableString(string6);
            if (L3 <= 0 || length3 > string6.length()) {
                length3 = string6.length();
            } else {
                r13 = L3;
            }
            spannableString3.setSpan(new com.tencent.mm.plugin.finder.convert.h8(a8Var, textView7, z28), r13, length3, 33);
            textView7.setHighlightColor(textView7.getContext().getResources().getColor(android.R.color.transparent));
            textView7.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            textView7.setText(spannableString3);
            return;
        }
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.m2g)).setText(context.getResources().getString(com.tencent.mm.R.string.erb));
            android.view.View p100 = holder.p(com.tencent.mm.R.id.gst);
            java.util.ArrayList arrayList32 = new java.util.ArrayList();
            arrayList32.add(8);
            java.util.Collections.reverse(arrayList32);
            yj0.a.d(p100, arrayList32.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p100.setVisibility(((java.lang.Integer) arrayList32.get(0)).intValue());
            yj0.a.f(p100, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert", "setDefaultViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p101 = holder.p(com.tencent.mm.R.id.m2g);
        kotlin.jvm.internal.o.f(p101, "getView(...)");
        android.widget.TextView textView8 = (android.widget.TextView) p101;
        com.tencent.mm.plugin.finder.convert.b8 b8Var = new com.tencent.mm.plugin.finder.convert.b8(holder);
        java.lang.String string7 = textView8.getContext().getResources().getString(com.tencent.mm.R.string.f492624h70);
        kotlin.jvm.internal.o.f(string7, "getString(...)");
        java.lang.String string8 = textView8.getContext().getResources().getString(com.tencent.mm.R.string.f492625h71, string7);
        kotlin.jvm.internal.o.f(string8, "getString(...)");
        int L4 = r26.n0.L(string8, string7, 0, false, 6, null);
        int length4 = string7.length() + L4;
        android.text.SpannableString spannableString4 = new android.text.SpannableString(string8);
        if (L4 <= 0 || length4 > string8.length()) {
            length4 = string8.length();
        } else {
            r13 = L4;
        }
        spannableString4.setSpan(new com.tencent.mm.plugin.finder.convert.g8(b8Var, textView8), r13, length4, 33);
        textView8.setHighlightColor(textView8.getContext().getResources().getColor(android.R.color.transparent));
        textView8.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView8.setText(spannableString4);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.y7(holder, this));
    }

    public i8(yz5.a aVar, yz5.a aVar2, yz5.a aVar3, boolean z17) {
        this.f103647e = aVar;
        this.f103648f = aVar2;
        this.f103649g = aVar3;
        this.f103650h = z17;
    }
}
