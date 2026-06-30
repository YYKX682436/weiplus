package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class xh extends in5.r {
    public xh() {
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479651bp);
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f480429xo);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487840j;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        holder.p(com.tencent.mm.R.id.jto).setOnClickListener(new com.tencent.mm.plugin.finder.convert.wh(holder));
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.t item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_IS_BUBBLE_BOOLEAN_SYNC, true);
        com.tencent.mars.xlog.Log.i("Finder.FeedMsgNotifyConvert", "item count = " + item.f410598d + ",item avatar = " + item.f410602h + ", isEnableBubble:" + o17);
        if (item.f410598d <= 0 || !o17) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.jto);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.jto);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (com.tencent.mm.sdk.platformtools.t8.K0(item.f410602h)) {
            android.view.View p19 = holder.p(com.tencent.mm.R.id.jsx);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p27 = holder.p(com.tencent.mm.R.id.jsx);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d l17 = g1Var.l();
            mn2.q3 q3Var = new mn2.q3(item.f410602h, com.tencent.mm.plugin.finder.storage.y90.f128356f);
            android.view.View p28 = holder.p(com.tencent.mm.R.id.jsx);
            kotlin.jvm.internal.o.f(p28, "getView(...)");
            l17.c(q3Var, (android.widget.ImageView) p28, g1Var.h(mn2.f1.f329961o));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.jib);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.plugin.finder.feed.ew ewVar = com.tencent.mm.plugin.finder.feed.pz.M1;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        textView.setText(ewVar.d(context, item.f410601g, item.f410599e, item.f410600f, item.f410598d));
        int c17 = ewVar.c();
        android.view.ViewGroup.LayoutParams layoutParams = holder.p(com.tencent.mm.R.id.jto).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2.width != c17) {
            com.tencent.mars.xlog.Log.i("Finder.FeedMsgNotifyConvert", "change layoutParam calcWidth: " + c17 + " width:" + layoutParams2.width);
            layoutParams2.width = c17;
            holder.p(com.tencent.mm.R.id.jto).setLayoutParams(layoutParams2);
        }
    }
}
