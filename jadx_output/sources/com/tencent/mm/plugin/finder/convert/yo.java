package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class yo extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.et f105029e;

    /* renamed from: f, reason: collision with root package name */
    public final float f105030f;

    public yo(com.tencent.mm.plugin.finder.feed.et presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f105029e = presenter;
        this.f105030f = 1.1666666f;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.akt;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        java.lang.String str;
        java.lang.String str2;
        java.util.Iterator it;
        int i19;
        int i27;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo;
        r45.xk a17;
        so2.k item = (so2.k) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.storage.o90 o90Var = item.f410451d.f126993b;
        if (o90Var == null) {
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.mgh);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.mgu);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.mgt);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.mgf);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.mgs);
        kotlin.jvm.internal.o.d(imageView);
        int i28 = 0;
        imageView.setVisibility(0);
        int integer = o90Var.c().getInteger(8);
        java.lang.String str3 = "";
        android.content.Context context = holder.f293121e;
        switch (integer) {
            case 1:
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_me, context.getResources().getColor(com.tencent.mm.R.color.BW_70)));
                break;
            case 2:
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_location, context.getResources().getColor(com.tencent.mm.R.color.BW_70)));
                break;
            case 3:
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.finder_filled_fire, context.getResources().getColor(com.tencent.mm.R.color.BW_70)));
                break;
            case 4:
                if (!com.tencent.mm.ui.bk.C() ? (string = o90Var.c().getString(6)) == null : (string = o90Var.c().getString(7)) == null) {
                    string = "";
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                }
                r45.mb4 mb4Var = new r45.mb4();
                char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.b(string.getBytes()));
                mb4Var.set(0, string);
                mb4Var.set(1, string);
                java.lang.String k17 = hc2.l.k(string);
                mb4Var.set(46, k17);
                mb4Var.set(47, k17);
                ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null))).c(imageView);
                break;
            case 5:
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.finder_icons_filled_topic, context.getResources().getColor(com.tencent.mm.R.color.BW_70)));
                break;
            case 6:
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.finder_icons_filled_sight, context.getResources().getColor(com.tencent.mm.R.color.BW_70)));
                break;
            case 7:
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.finder_icons_filled_food, context.getResources().getColor(com.tencent.mm.R.color.BW_70)));
                break;
            case 8:
            default:
                imageView.setVisibility(8);
                break;
            case 9:
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_nearby, context.getResources().getColor(com.tencent.mm.R.color.BW_70)));
                break;
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String d17 = o90Var.d();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, d17));
        java.lang.String string2 = o90Var.c().getString(5);
        if (string2 == null) {
            string2 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            java.lang.String string3 = o90Var.c().getString(5);
            if (string3 == null) {
                string3 = "";
            }
            textView2.setText(string3);
        }
        int i29 = 2;
        java.lang.String string4 = o90Var.c().getString(2);
        if (string4 == null) {
            string4 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            java.lang.String string5 = o90Var.c().getString(2);
            if (string5 == null) {
                string5 = "";
            }
            textView3.setText(string5);
        }
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.clear();
            android.view.View p18 = holder.p(com.tencent.mm.R.id.mgn);
            kotlin.jvm.internal.o.f(p18, "getView(...)");
            arrayList.add(p18);
            android.view.View p19 = holder.p(com.tencent.mm.R.id.mgo);
            kotlin.jvm.internal.o.f(p19, "getView(...)");
            arrayList.add(p19);
            android.view.View p27 = holder.p(com.tencent.mm.R.id.mgp);
            kotlin.jvm.internal.o.f(p27, "getView(...)");
            arrayList.add(p27);
            int b17 = (context.getResources().getDisplayMetrics().widthPixels - i65.a.b(context, 32)) / 3;
            int i37 = (int) (b17 * this.f105030f);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                android.view.View view = (android.view.View) it6.next();
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = b17;
                layoutParams.height = i37;
                view.setLayoutParams(layoutParams);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
                java.util.LinkedList linkedList = o90Var.f127299b;
                if (i38 >= linkedList.size()) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
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
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList4.add(java.lang.Integer.valueOf(i28));
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList4.get(i28)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.ImageView imageView2 = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.mgr);
                    android.widget.ImageView imageView3 = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.mgj);
                    android.widget.TextView textView4 = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.mgq);
                    android.widget.ImageView imageView4 = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.mgi);
                    java.lang.Object obj = linkedList.get(i38);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
                    r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.Z(baseFinderFeed.getFeedObject().getMediaList());
                    imageView2.setImageResource(com.tencent.mm.R.color.BW_97);
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    str = str3;
                    if (mb4Var2 != null) {
                        if (mb4Var2.getInteger(i29) != 4) {
                            g1Var.e().c(new mn2.c1(mb4Var2, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null), imageView2, g1Var.h(mn2.f1.f329953d));
                        } else if (com.tencent.mm.sdk.platformtools.t8.K0(mb4Var2.getString(16))) {
                            g1Var.e().c(new mn2.c1(mb4Var2, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null), imageView2, g1Var.h(mn2.f1.f329953d));
                        } else {
                            g1Var.e().c(new mn2.r3(mb4Var2, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null), imageView2, g1Var.h(mn2.f1.f329953d));
                        }
                    }
                    com.tencent.mm.protocal.protobuf.FinderContact contact = baseFinderFeed.getFeedObject().getFeedObject().getContact();
                    imageView3.setImageResource(com.tencent.mm.R.color.BW_97);
                    vo0.d a18 = g1Var.a();
                    if (contact == null || (str2 = contact.getHeadUrl()) == null) {
                        str2 = str;
                    }
                    it = it7;
                    i19 = 2;
                    a18.c(new mn2.n(str2, null, 2, null), imageView3, g1Var.h(mn2.f1.f329957h));
                    java.lang.CharSequence nickNameSpan = baseFinderFeed.getFeedObject().getNickNameSpan();
                    if (nickNameSpan == null) {
                        nickNameSpan = str;
                    }
                    textView4.setText(nickNameSpan);
                    kotlin.jvm.internal.o.d(imageView4);
                    i27 = 0;
                    if (contact == null || (a17 = ya2.d.a(contact, false)) == null || (authInfo = ya2.d.e(a17)) == null) {
                        if (contact != null) {
                            authInfo = contact.getAuthInfo();
                        } else {
                            finderAuthInfo = null;
                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                            zy2.tb.a(ya2.m1.f460511a, imageView4, finderAuthInfo, 0, 4, null);
                            view2.setOnClickListener(new com.tencent.mm.plugin.finder.convert.wo(o90Var, i38, view2, baseFinderFeed, holder, this));
                        }
                    }
                    finderAuthInfo = authInfo;
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    zy2.tb.a(ya2.m1.f460511a, imageView4, finderAuthInfo, 0, 4, null);
                    view2.setOnClickListener(new com.tencent.mm.plugin.finder.convert.wo(o90Var, i38, view2, baseFinderFeed, holder, this));
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
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p17, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList5.get(i47)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseMixFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.p(com.tencent.mm.R.id.mgg).setOnClickListener(new com.tencent.mm.plugin.finder.convert.xo(o90Var, holder, this));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
