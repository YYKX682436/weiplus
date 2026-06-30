package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.gallery.u0 f111413a = new com.tencent.mm.plugin.finder.gallery.u0();

    public final void a(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.widget.FlowTextMixView flowTextMixView = (com.tencent.mm.ui.widget.FlowTextMixView) holder.itemView.findViewById(com.tencent.mm.R.id.g9g);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        flowTextMixView.setMaxWidth(((android.app.Activity) context).getBaseContext().getResources().getDisplayMetrics().widthPixels);
        int color = context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.gbz);
        if (p17 != null) {
            android.view.View findViewById = p17.findViewById(com.tencent.mm.R.id.msw);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = p17.findViewById(com.tencent.mm.R.id.c79);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = p17.findViewById(com.tencent.mm.R.id.f487088ng5);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById4 = p17.findViewById(com.tencent.mm.R.id.a_x);
            findViewById4.setEnabled(false);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById4.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479651bp);
            marginLayoutParams.setMarginEnd(0);
            marginLayoutParams.rightMargin = 0;
            findViewById4.setLayoutParams(marginLayoutParams);
            ((android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.i1g)).setTextColor(color);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) p17.findViewById(com.tencent.mm.R.id.h6i)).setIconColor(color);
            android.view.View p18 = holder.p(com.tencent.mm.R.id.a_4);
            if (p18 != null) {
                p18.setEnabled(false);
            }
            if (p18 != null) {
                p18.setClickable(false);
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.a8p);
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
        android.view.View p19 = holder.p(com.tencent.mm.R.id.ghd);
        if (p19 != null && (p19 instanceof com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout)) {
            ((com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) p19).setHidePrivateLike(true);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485561i44);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ggt);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        android.view.View p27 = holder.p(com.tencent.mm.R.id.gac);
        if (p27 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p28 = holder.p(com.tencent.mm.R.id.lkf);
        if (p28 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById5 = holder.itemView.findViewById(com.tencent.mm.R.id.gac);
        if (findViewById5 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) holder.p(com.tencent.mm.R.id.f487278o45);
        if (neatTextView != null) {
            neatTextView.setMaxLines(1);
        }
        if (neatTextView != null) {
            neatTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        }
        if (neatTextView != null) {
            neatTextView.setTextColor(color);
        }
        float dimension = context.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        if (neatTextView != null) {
            int i17 = (int) dimension;
            neatTextView.setPadding(neatTextView.getPaddingLeft(), i17, neatTextView.getPaddingRight(), i17);
        }
        android.view.View p29 = holder.p(com.tencent.mm.R.id.dzo);
        android.view.ViewGroup.LayoutParams layoutParams2 = p29.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.bottomMargin = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479651bp);
        layoutParams3.rightMargin = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        layoutParams3.setMarginEnd((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479718db));
        p29.setLayoutParams(layoutParams3);
        android.view.View view = holder.itemView;
        com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = view instanceof com.tencent.mm.plugin.finder.view.SimpleTouchableLayout ? (com.tencent.mm.plugin.finder.view.SimpleTouchableLayout) view : null;
        if (simpleTouchableLayout != null) {
            simpleTouchableLayout.setOnDoubleClickListener(null);
            simpleTouchableLayout.setOnLongClickListener((com.tencent.mm.plugin.finder.view.hs) null);
        }
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        if (finderMediaLayout != null) {
            finderMediaLayout.setOnDoubleClickListener(null);
            finderMediaLayout.setOnLongClickListener((ym5.f1) null);
        }
    }
}
