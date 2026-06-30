package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class cr extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f103088e;

    public cr(boolean z17) {
        this.f103088e = z17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b4g;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.h4 item = (so2.h4) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        item.f410401e = i17;
        r45.yw2 yw2Var = item.f410400d;
        if (yw2Var.getInteger(6) != 4 || android.text.TextUtils.isEmpty(yw2Var.getString(7))) {
            android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.i_c);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.ho8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.ho8);
            android.view.View findViewById3 = holder.itemView.findViewById(com.tencent.mm.R.id.i_c);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(0);
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.a().c(new mn2.n(yw2Var.getString(7), null, 2, null), imageView, g1Var.h(mn2.f1.f329965s));
        }
        android.view.View findViewById4 = holder.itemView.findViewById(com.tencent.mm.R.id.k6_);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        boolean z18 = this.f103088e;
        if (z18) {
            findViewById4.setBackgroundColor(findViewById4.getResources().getColor(com.tencent.mm.R.color.f478512u));
        } else {
            findViewById4.setBackgroundColor(findViewById4.getResources().getColor(com.tencent.mm.R.color.BW_100));
        }
        android.view.View findViewById5 = holder.itemView.findViewById(com.tencent.mm.R.id.k6b);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        if (z18) {
            textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9_Night_Mode));
            textView.setTextSize(0, i65.a.f(textView.getContext(), com.tencent.mm.R.dimen.f480434xt) * i65.a.q(textView.getContext()));
        }
        if (android.text.TextUtils.isEmpty(yw2Var.getString(1))) {
            return;
        }
        holder.s(com.tencent.mm.R.id.k6b, yw2Var.getString(1));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
