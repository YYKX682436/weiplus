package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class x8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104934f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104935g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104936h;

    public x8(in5.s0 s0Var, android.view.View view, android.view.View view2, android.view.View view3, com.tencent.mm.plugin.finder.convert.qe qeVar) {
        this.f104932d = s0Var;
        this.f104933e = view;
        this.f104934f = view2;
        this.f104935g = view3;
        this.f104936h = qeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup;
        android.view.View view;
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.convert.bv bvVar = com.tencent.mm.plugin.finder.convert.bv.f103000a;
        in5.s0 holder = this.f104932d;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View banner = this.f104933e;
        kotlin.jvm.internal.o.g(banner, "banner");
        android.view.View seekLayout = this.f104934f;
        kotlin.jvm.internal.o.g(seekLayout, "seekLayout");
        android.view.View partTopLayout = this.f104935g;
        kotlin.jvm.internal.o.g(partTopLayout, "partTopLayout");
        if (com.tencent.mm.plugin.finder.convert.bv.f103002c == 0) {
            android.content.Context context = holder.f293121e;
            com.tencent.mm.plugin.finder.convert.bv.f103002c = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479723df);
            com.tencent.mm.plugin.finder.convert.bv.f103003d = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
            com.tencent.mm.plugin.finder.convert.bv.f103004e = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.gbz);
        if (p17 == null || (viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.f484486ee3)) == null) {
            s0Var = holder;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            boolean z17 = false;
            yj0.a.d(seekLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSeekLayoutHelper", "adjustSeekLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            seekLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(seekLayout, "com/tencent/mm/plugin/finder/convert/FinderSeekLayoutHelper", "adjustSeekLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            int[] s17 = pm0.v.s(itemView);
            bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " itemView location in window: offset=[" + s17[0] + ", " + s17[1] + ']');
            int[] s18 = pm0.v.s(banner);
            bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " banner location in window: rect=[" + s18[0] + ", " + s18[1] + ']');
            s18[0] = s18[0] - s17[0];
            s18[1] = s18[1] - s17[1];
            bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " banner location relative to itemView: rect=[" + s18[0] + ", " + s18[1] + "], banner.height=" + banner.getHeight());
            int childCount = viewGroup.getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount) {
                    view = p17;
                    break;
                }
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt.getVisibility() == 0) {
                    if (childAt.getAlpha() == 0.0f ? true : z17) {
                        continue;
                    } else if (!com.tencent.mm.plugin.finder.convert.bv.f103001b.contains(java.lang.Integer.valueOf(childAt.getId()))) {
                        view = childAt;
                        break;
                    }
                }
                i17++;
                z17 = false;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adjustSeekLayout ");
            s0Var = holder;
            sb6.append(hc2.b0.h(baseFinderFeed, false, 1, null));
            sb6.append(" first visible child in footer: viewId=");
            sb6.append(view.getId());
            sb6.append(", viewClass=");
            sb6.append(view.getClass().getSimpleName());
            bvVar.a(sb6.toString());
            int[] s19 = pm0.v.s(view);
            bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " first visible child location in window: rect1=[" + s19[0] + ", " + s19[1] + ']');
            s19[0] = s19[0] - s17[0];
            s19[1] = s19[1] - s17[1];
            bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " first visible child location relative to itemView: rect1=[" + s19[0] + ", " + s19[1] + ']');
            int i18 = s19[1];
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("adjustSeekLayout ");
            sb7.append(hc2.b0.h(baseFinderFeed, false, 1, null));
            sb7.append(" minY (footer top boundary)=");
            sb7.append(i18);
            bvVar.a(sb7.toString());
            android.view.ViewGroup.LayoutParams layoutParams = seekLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            int i19 = layoutParams2.topMargin;
            bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " old seekLayout topMargin=" + i19);
            int height = partTopLayout.getHeight();
            int height2 = seekLayout.getHeight();
            int i27 = height2 - height;
            bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " partTopLayout.height=" + height + ", seekLayout.height=" + height2 + ", spaceHeight=" + i27);
            int i28 = com.tencent.mm.plugin.finder.convert.bv.f103002c;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("adjustSeekLayout ");
            sb8.append(hc2.b0.h(baseFinderFeed, false, 1, null));
            sb8.append(" default footerPaddingTop=");
            sb8.append(i28);
            sb8.append(" (Edge_6A)");
            bvVar.a(sb8.toString());
            int height3 = s18[1] + banner.getHeight();
            int i29 = height + height3;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("adjustSeekLayout ");
            sb9.append(hc2.b0.h(baseFinderFeed, false, 1, null));
            sb9.append(" bannerBottom=");
            sb9.append(height3);
            sb9.append(", needSpaceAboveFooter=");
            sb9.append(i29);
            sb9.append(", minY=");
            sb9.append(i18);
            sb9.append(", condition=");
            sb9.append(i29 > i18);
            bvVar.a(sb9.toString());
            if (i29 > i18) {
                int i37 = com.tencent.mm.plugin.finder.convert.bv.f103003d;
                bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " SCENE_1: not enough space, marginToMedia=" + i37 + " (Edge_A)");
                layoutParams2.topMargin = (i18 - height2) - i37;
                bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " SCENE_1: calculated topMargin=minY - seekLayoutHeight - marginToMedia = " + i18 + " - " + height2 + " - " + i37 + " = " + layoutParams2.topMargin);
                i28 += height2 + i37;
                bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " SCENE_1: new footerPaddingTop=defaultPaddingTop + seekLayoutHeight + marginToMedia = " + com.tencent.mm.plugin.finder.convert.bv.f103002c + " + " + height2 + " + " + i37 + " = " + i28);
                viewGroup.setPadding(viewGroup.getPaddingLeft(), i28, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
                bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " SCENE_1: set footer padding: left=" + viewGroup.getPaddingLeft() + ", top=" + i28 + ", right=" + viewGroup.getPaddingRight() + ", bottom=" + viewGroup.getPaddingBottom());
            } else {
                int i38 = com.tencent.mm.plugin.finder.convert.bv.f103004e;
                bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " SCENE_2: enough space, marginToMedia=" + i38 + " (Edge_1_5_A)");
                layoutParams2.topMargin = ((s18[1] + banner.getHeight()) - i27) + i38;
                bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " SCENE_2: calculated topMargin=bannerBottom - spaceHeight + marginToMedia = " + height3 + " - " + i27 + " + " + i38 + " = " + layoutParams2.topMargin);
                viewGroup.setPadding(viewGroup.getPaddingLeft(), i28, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
                bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " SCENE_2: set footer padding: left=" + viewGroup.getPaddingLeft() + ", top=" + i28 + ", right=" + viewGroup.getPaddingRight() + ", bottom=" + viewGroup.getPaddingBottom());
            }
            bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " RESULT: final seekLayout topMargin=" + layoutParams2.topMargin + ", oldTopMargin=" + i19 + ", footerPaddingTop=" + i28);
            if (layoutParams2.topMargin != i19) {
                seekLayout.requestLayout();
                bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " topMargin changed, requestLayout called");
            } else {
                bvVar.a("adjustSeekLayout " + hc2.b0.h(baseFinderFeed, false, 1, null) + " topMargin unchanged, skip requestLayout");
            }
        }
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f104936h;
        in5.s0 s0Var2 = s0Var;
        qeVar.s(s0Var2);
        qeVar.u(s0Var2);
        qeVar.x1(s0Var2);
    }
}
