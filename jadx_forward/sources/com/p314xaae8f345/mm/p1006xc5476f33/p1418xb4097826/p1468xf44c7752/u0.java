package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.u0 f192946a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.u0();

    public final void a(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22604x4b44d306 c22604x4b44d306 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22604x4b44d306) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.g9g);
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        c22604x4b44d306.m81268x8e6ff544(((android.app.Activity) context).getBaseContext().getResources().getDisplayMetrics().widthPixels);
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.gbz);
        if (p17 != null) {
            android.view.View findViewById = p17.findViewById(com.p314xaae8f345.mm.R.id.msw);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = p17.findViewById(com.p314xaae8f345.mm.R.id.c79);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = p17.findViewById(com.p314xaae8f345.mm.R.id.f568621ng5);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById4 = p17.findViewById(com.p314xaae8f345.mm.R.id.a_x);
            findViewById4.setEnabled(false);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById4.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561184bp);
            marginLayoutParams.setMarginEnd(0);
            marginLayoutParams.rightMargin = 0;
            findViewById4.setLayoutParams(marginLayoutParams);
            ((android.widget.TextView) p17.findViewById(com.p314xaae8f345.mm.R.id.i1g)).setTextColor(color);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) p17.findViewById(com.p314xaae8f345.mm.R.id.h6i)).m82040x7541828(color);
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            if (p18 != null) {
                p18.setEnabled(false);
            }
            if (p18 != null) {
                p18.setClickable(false);
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.a8p);
            if (textView != null) {
                textView.setEnabled(false);
            }
            if (textView != null) {
                textView.setClickable(false);
            }
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.ghd);
        if (p19 != null && (p19 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) p19).m61279x4d828856(true);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567094i44);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ggt);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.gac);
        if (p27 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.lkf);
        if (p28 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById5 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.gac);
        if (findViewById5 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) holder.p(com.p314xaae8f345.mm.R.id.f568811o45);
        if (c23001x9d3a0bdc != null) {
            c23001x9d3a0bdc.m84175x8dd5167d(1);
        }
        if (c23001x9d3a0bdc != null) {
            c23001x9d3a0bdc.m84166xb86dec4b(android.text.TextUtils.TruncateAt.END);
        }
        if (c23001x9d3a0bdc != null) {
            c23001x9d3a0bdc.m84183x1c5c5ff4(color);
        }
        float dimension = context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        if (c23001x9d3a0bdc != null) {
            int i17 = (int) dimension;
            c23001x9d3a0bdc.setPadding(c23001x9d3a0bdc.getPaddingLeft(), i17, c23001x9d3a0bdc.getPaddingRight(), i17);
        }
        android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.dzo);
        android.view.ViewGroup.LayoutParams layoutParams2 = p29.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.bottomMargin = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561184bp);
        layoutParams3.rightMargin = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        layoutParams3.setMarginEnd((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db));
        p29.setLayoutParams(layoutParams3);
        android.view.View view = holder.f3639x46306858;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971) view : null;
        if (c15379x1d4ea971 != null) {
            c15379x1d4ea971.m62495x74caf26a(null);
            c15379x1d4ea971.m62498x957215f((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.hs) null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
        if (c15324x3354d808 != null) {
            c15324x3354d808.m62220x74caf26a(null);
            c15324x3354d808.m62222x957215f((ym5.f1) null);
        }
    }
}
