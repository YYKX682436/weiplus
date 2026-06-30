package ca2;

/* loaded from: classes2.dex */
public final class c extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.adq;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.view.View findViewById;
        z92.a item = (z92.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        r45.iw2 iw2Var = item.f470861d;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) iw2Var.getCustom(0);
        if (finderContact == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f486035jy5);
        if (textView != null) {
            textView.setText(finderContact.getNickname());
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.f486032jy2);
        if (imageView != null) {
            java.lang.String headUrl = finderContact.getHeadUrl();
            if (!(headUrl == null || headUrl.length() == 0)) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.a().c(new mn2.n(headUrl, null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
            }
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.f486031jy1);
        if (imageView2 != null) {
            com.tencent.mm.protocal.protobuf.FinderAuthInfo e17 = ya2.d.e(ya2.d.a(finderContact, false));
            if (e17 == null) {
                e17 = finderContact.getAuthInfo();
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.tb.a(ya2.m1.f460511a, imageView2, e17, 0, 4, null);
        }
        r45.yi2 yi2Var = (r45.yi2) iw2Var.getCustom(3);
        int integer = yi2Var != null ? yi2Var.getInteger(0) : 0;
        hc2.f1.y((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f486033jy3), com.tencent.mm.R.string.f491941eq2, integer, 0, false, 12, null);
        r45.yi2 yi2Var2 = (r45.yi2) iw2Var.getCustom(3);
        int integer2 = yi2Var2 != null ? yi2Var2.getInteger(1) : 0;
        hc2.f1.y((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f486034jy4), com.tencent.mm.R.string.f491943eq4, integer2, 0, false, 12, null);
        if ((integer == 0 || integer2 == 0) && (findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.jy6)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.f486030jy0);
        if (iw2Var.getInteger(1) != 1) {
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/activity/music/convert/FinderMusicArtistConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/data/FinderContactData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String username = finderContact.getUsername();
        if (username == null || username.length() == 0) {
            holder.itemView.setOnClickListener(new ca2.a(holder, item));
        } else {
            holder.itemView.setOnClickListener(new ca2.b(holder, username));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
