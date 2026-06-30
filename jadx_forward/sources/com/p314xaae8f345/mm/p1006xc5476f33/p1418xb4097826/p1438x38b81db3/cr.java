package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class cr extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f184621e;

    public cr(boolean z17) {
        this.f184621e = z17;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b4g;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.h4 item = (so2.h4) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        item.f491934e = i17;
        r45.yw2 yw2Var = item.f491933d;
        if (yw2Var.m75939xb282bd08(6) != 4 || android.text.TextUtils.isEmpty(yw2Var.m75945x2fec8307(7))) {
            android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.i_c);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ho8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ho8);
            android.view.View findViewById3 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.i_c);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(0);
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.a().c(new mn2.n(yw2Var.m75945x2fec8307(7), null, 2, null), imageView, g1Var.h(mn2.f1.f411498s));
        }
        android.view.View findViewById4 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.k6_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        boolean z18 = this.f184621e;
        if (z18) {
            findViewById4.setBackgroundColor(findViewById4.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
        } else {
            findViewById4.setBackgroundColor(findViewById4.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307));
        }
        android.view.View findViewById5 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.k6b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        if (z18) {
            textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77656x773eb619));
            textView.setTextSize(0, i65.a.f(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561967xt) * i65.a.q(textView.getContext()));
        }
        if (android.text.TextUtils.isEmpty(yw2Var.m75945x2fec8307(1))) {
            return;
        }
        holder.s(com.p314xaae8f345.mm.R.id.k6b, yw2Var.m75945x2fec8307(1));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
