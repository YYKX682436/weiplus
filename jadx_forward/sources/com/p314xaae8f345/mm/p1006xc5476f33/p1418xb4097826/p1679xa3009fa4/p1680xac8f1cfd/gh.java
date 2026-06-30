package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class gh {
    public gh(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(in5.s0 holder, android.widget.FrameLayout feedHeaderBar, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedHeaderBar, "feedHeaderBar");
        android.view.View findViewById = feedHeaderBar.findViewById(com.p314xaae8f345.mm.R.id.gae);
        if (findViewById.getVisibility() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$Companion", "resetHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/widget/FrameLayout;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$Companion", "resetHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/widget/FrameLayout;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) feedHeaderBar.findViewById(com.p314xaae8f345.mm.R.id.gag);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            com.p314xaae8f345.mm.ui.fk.a(textView);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jze);
            textView.setTextColor(holder.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            android.view.View findViewById2 = feedHeaderBar.findViewById(com.p314xaae8f345.mm.R.id.gac);
            findViewById2.setBackground(feedHeaderBar.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.abg));
            findViewById2.setPadding(findViewById2.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn), findViewById2.getPaddingTop(), findViewById2.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn), findViewById2.getPaddingBottom());
        }
        android.view.View findViewById3 = feedHeaderBar.findViewById(com.p314xaae8f345.mm.R.id.gac);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$Companion", "resetHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/widget/FrameLayout;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$Companion", "resetHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/widget/FrameLayout;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setOnClickListener(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15219x2dffe629 c15219x2dffe629 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15219x2dffe629) feedHeaderBar.findViewById(com.p314xaae8f345.mm.R.id.a8p);
        if (c15219x2dffe629 != null) {
            c15219x2dffe629.setTextSize(0, c15219x2dffe629.b() ? feedHeaderBar.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9) : feedHeaderBar.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
        }
        boolean z17 = feedHeaderBar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15227x1ef48268;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15227x1ef48268 c15227x1ef48268 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15227x1ef48268) feedHeaderBar : null;
        if (c15227x1ef48268 != null) {
            c15227x1ef48268.m61646xcba4d8d8(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15227x1ef48268 c15227x1ef482682 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15227x1ef48268) feedHeaderBar : null;
        if (c15227x1ef482682 != null) {
            c15227x1ef482682.m61645x764a1520((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) holder.f374658i);
        }
        ((android.widget.TextView) feedHeaderBar.findViewById(com.p314xaae8f345.mm.R.id.gag)).setTextSize(0, feedHeaderBar.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9));
        android.view.View findViewById4 = feedHeaderBar.findViewById(com.p314xaae8f345.mm.R.id.che);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15221x8467a6e1 c15221x8467a6e1 = findViewById4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15221x8467a6e1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15221x8467a6e1) findViewById4 : null;
        if (c15221x8467a6e1 != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15221x8467a6e1.f212385n;
            c15221x8467a6e1.b(0, j17, 0);
        }
    }
}
