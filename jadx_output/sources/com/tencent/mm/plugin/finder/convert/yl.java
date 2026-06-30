package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class yl extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final long f105026e;

    public yl(long j17) {
        this.f105026e = j17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488827al0;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.h0 item = (so2.h0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View element = holder.p(com.tencent.mm.R.id.eii);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ein);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = holder.p(com.tencent.mm.R.id.i1e);
        java.lang.String string = item.f410374d.getString(0);
        ya2.b2 b17 = ya2.h.f460484a.b(string);
        jz5.f0 f0Var = null;
        if (b17 != null) {
            java.lang.String avatarUrl = b17.getAvatarUrl();
            if (!(avatarUrl.length() > 0)) {
                avatarUrl = null;
            }
            if (avatarUrl != null) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d l17 = g1Var.l();
                mn2.n nVar = new mn2.n(avatarUrl, null, 2, null);
                kotlin.jvm.internal.o.f(element, "element");
                l17.c(nVar, (android.widget.ImageView) element, g1Var.h(mn2.f1.f329961o));
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            ng5.a.a((android.widget.ImageView) element, string);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String md6 = c61.yb.md((c61.yb) c17, string, null, false, 4, null);
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(holder.f293121e, md6));
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.vl(string, this, holder));
        android.view.View view = (android.view.View) h0Var.f310123d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderCommentFriendInfoData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderCommentFriendInfoData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!item.f410375e || item.f410376f) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveLikeConvert", "begin blink animation " + i17);
        item.f410376f = true;
        android.view.View view2 = (android.view.View) h0Var.f310123d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderCommentFriendInfoData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderCommentFriendInfoData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = (android.view.View) h0Var.f310123d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderCommentFriendInfoData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderCommentFriendInfoData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ((android.view.View) h0Var.f310123d).post(new com.tencent.mm.plugin.finder.convert.xl(h0Var, this, i17));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
