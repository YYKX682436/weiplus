package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class uh extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f186239e;

    public uh(int i17) {
        this.f186239e = i17;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ahw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uh uhVar;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        so2.j1 item = (so2.j1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = item.f491972d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
        if (m76760x76845fea == null || (str = m76760x76845fea.m76175x6d346f39()) == null) {
            str = "";
        }
        mn2.n nVar = new mn2.n(str, null, 2, null);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.iaj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f411490h));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.iam);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.text.TextPaint paint = ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.iam)).getPaint();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2 = c19792x256d2725.m76760x76845fea();
        if (m76760x76845fea2 == null || (str2 = m76760x76845fea2.m76184x8010e5e4()) == null) {
            str2 = "";
        }
        textView.setText(((c61.p2) ybVar).cj(context, paint, str2, 5));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f542044a;
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.f564832a85);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) p18;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea3 = c19792x256d2725.m76760x76845fea();
        zy2.tb.a(m1Var, imageView, m76760x76845fea3 != null ? m76760x76845fea3.m76160xd133dfec() : null, 0, 4, null);
        r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
        int m75939xb282bd08 = m76794xd0557130 != null ? m76794xd0557130.m75939xb282bd08(2) : 2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e);
        if (c19788xd7cfd73e == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
            sb6.append(m76794xd05571302 != null ? java.lang.Long.valueOf(m76794xd05571302.m75942xfb822ef2(0)) : null);
            sb6.append(" firstMedia is empty");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveListItemConvert", sb6.toString());
        }
        java.lang.String m76585x66e287ae = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76585x66e287ae() : null;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (m76585x66e287ae == null) {
            m76585x66e287ae = "";
        }
        java.lang.String m76587x815afa6b = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76587x815afa6b() : null;
        if (m76587x815afa6b == null) {
            m76587x815afa6b = "";
        }
        java.lang.String concat = m76585x66e287ae.concat(m76587x815afa6b);
        java.lang.String m76623xd93f812f = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76623xd93f812f() : null;
        if (m76623xd93f812f == null) {
            m76623xd93f812f = "";
        }
        java.lang.String m76624x4c9b7dca = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76624x4c9b7dca() : null;
        if (m76624x4c9b7dca == null) {
            m76624x4c9b7dca = "";
        }
        java.lang.String concat2 = m76623xd93f812f.concat(m76624x4c9b7dca);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
            concat = concat2;
        }
        ((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.o6z)).setImageBitmap(null);
        if (m75939xb282bd08 == 1) {
            wo0.c a18 = g1Var.e().a(new mn2.q3(concat, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e));
            a18.f529407e = new ap0.g(null, null, 3, null);
            a18.g(g1Var.h(mn2.f1.f411486d));
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.o6z);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p19, "getView(...)");
            a18.c((android.widget.ImageView) p19);
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.ffc);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p27, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.exx);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p28, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            uhVar = this;
            i19 = 1;
        } else {
            i95.m c17 = i95.n0.c(c61.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.zb zbVar = (c61.zb) c17;
            android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.o6z);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p29, "getView(...)");
            android.widget.ImageView imageView2 = (android.widget.ImageView) p29;
            i19 = 1;
            c61.zb.g7(zbVar, imageView2, concat, 0, 4, null);
            android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.ffc);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p37, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p37.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p38 = holder.p(com.p314xaae8f345.mm.R.id.exx);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p38, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p38.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            uhVar = this;
        }
        int i27 = uhVar.f186239e;
        if (i27 == 2) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bindLbsConfig recommendReason is empty:");
            java.lang.String m76818x5d49e3ea = c19792x256d2725.m76818x5d49e3ea();
            sb7.append((m76818x5d49e3ea == null || m76818x5d49e3ea.length() == 0) ? i19 : 0);
            sb7.append(",recommendReasonType:");
            sb7.append(c19792x256d2725.m76819x1ca9e244());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveListItemConvert", sb7.toString());
            java.lang.String m76818x5d49e3ea2 = c19792x256d2725.m76818x5d49e3ea();
            if (((m76818x5d49e3ea2 == null || m76818x5d49e3ea2.length() == 0) ? i19 : 0) == 0) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.cgz);
                android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.chb);
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565466ci4);
                java.lang.String m76818x5d49e3ea3 = c19792x256d2725.m76818x5d49e3ea();
                textView2.setText(m76818x5d49e3ea3 != null ? m76818x5d49e3ea3 : "");
                textView2.setVisibility(0);
                int m76819x1ca9e244 = c19792x256d2725.m76819x1ca9e244();
                if (m76819x1ca9e244 != i19) {
                    switch (m76819x1ca9e244) {
                        case 9:
                            linearLayout.setVisibility(0);
                            imageView3.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79799x34afe6b0, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
                            imageView3.setVisibility(0);
                            break;
                        case 10:
                            linearLayout.setVisibility(0);
                            imageView3.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79185x284addd0, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
                            imageView3.setVisibility(0);
                            break;
                        case 11:
                            linearLayout.setVisibility(0);
                            imageView3.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79182x2839ea3e, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
                            imageView3.setVisibility(0);
                            break;
                        case 12:
                            linearLayout.setVisibility(0);
                            imageView3.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79154xff5dc5a, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
                            imageView3.setVisibility(0);
                            break;
                        case 13:
                            linearLayout.setVisibility(0);
                            imageView3.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79174x4356e39d, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
                            imageView3.setVisibility(0);
                            break;
                        default:
                            linearLayout.setVisibility(8);
                            imageView3.setVisibility(8);
                            textView2.setVisibility(8);
                            break;
                    }
                } else {
                    linearLayout.setVisibility(0);
                    imageView3.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79787x448e46cd, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
                    imageView3.setVisibility(0);
                }
            }
        } else if (i27 == i19) {
            ((android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.cgz)).setVisibility(8);
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ger);
            textView3.setTextSize(i19, 10.0f);
            java.lang.String m76818x5d49e3ea4 = c19792x256d2725.m76818x5d49e3ea();
            if (((m76818x5d49e3ea4 == null || m76818x5d49e3ea4.length() == 0) ? i19 : 0) != 0) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                textView3.setText(c19792x256d2725.m76818x5d49e3ea());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveListItemConvert", "bindFriendConfig item:" + item);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveListItemConvert", "[updateLiveList]onBindViewHolder holder:" + holder + " tabType:" + i27 + ",position:" + i17 + ",type:" + i18 + ',' + item);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
