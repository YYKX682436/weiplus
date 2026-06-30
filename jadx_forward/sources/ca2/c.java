package ca2;

/* loaded from: classes2.dex */
public final class c extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.adq;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.view.View findViewById;
        z92.a item = (z92.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        r45.iw2 iw2Var = item.f552394d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) iw2Var.m75936x14adae67(0);
        if (c19782x23db1cfa == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567568jy5);
        if (textView != null) {
            textView.setText(c19782x23db1cfa.m76184x8010e5e4());
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567565jy2);
        if (imageView != null) {
            java.lang.String m76175x6d346f39 = c19782x23db1cfa.m76175x6d346f39();
            if (!(m76175x6d346f39 == null || m76175x6d346f39.length() == 0)) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                g1Var.a().c(new mn2.n(m76175x6d346f39, null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
            }
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567564jy1);
        if (imageView2 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc e17 = ya2.d.e(ya2.d.a(c19782x23db1cfa, false));
            if (e17 == null) {
                e17 = c19782x23db1cfa.m76160xd133dfec();
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.tb.a(ya2.m1.f542044a, imageView2, e17, 0, 4, null);
        }
        r45.yi2 yi2Var = (r45.yi2) iw2Var.m75936x14adae67(3);
        int m75939xb282bd08 = yi2Var != null ? yi2Var.m75939xb282bd08(0) : 0;
        hc2.f1.y((android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567566jy3), com.p314xaae8f345.mm.R.C30867xcad56011.f573474eq2, m75939xb282bd08, 0, false, 12, null);
        r45.yi2 yi2Var2 = (r45.yi2) iw2Var.m75936x14adae67(3);
        int m75939xb282bd082 = yi2Var2 != null ? yi2Var2.m75939xb282bd08(1) : 0;
        hc2.f1.y((android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567567jy4), com.p314xaae8f345.mm.R.C30867xcad56011.f573476eq4, m75939xb282bd082, 0, false, 12, null);
        if ((m75939xb282bd08 == 0 || m75939xb282bd082 == 0) && (findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jy6)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567563jy0);
        if (iw2Var.m75939xb282bd08(1) != 1) {
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
        if (m76197x6c03c64c == null || m76197x6c03c64c.length() == 0) {
            holder.f3639x46306858.setOnClickListener(new ca2.a(holder, item));
        } else {
            holder.f3639x46306858.setOnClickListener(new ca2.b(holder, m76197x6c03c64c));
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
