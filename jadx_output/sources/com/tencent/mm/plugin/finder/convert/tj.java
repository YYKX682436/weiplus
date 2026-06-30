package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class tj implements k20.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.uj f104631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104632c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104633d;

    public tj(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.uj ujVar, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f104630a = s0Var;
        this.f104631b = ujVar;
        this.f104632c = h0Var;
        this.f104633d = h0Var2;
    }

    public void a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        in5.s0 s0Var = this.f104630a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int i17 = nyVar != null ? nyVar.f135380n : 0;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
        if (itemId == 0) {
            return;
        }
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        kotlin.jvm.internal.o.d(baseFinderFeed);
        java.util.Map n17 = this.f104631b.n(context2, baseFinderFeed, (java.lang.String) this.f104632c.f310123d);
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        java.lang.String w17 = baseFinderFeed.w();
        bw5.qf qfVar = (bw5.qf) this.f104633d.f310123d;
        com.tencent.mm.plugin.finder.view.ei eiVar = new com.tencent.mm.plugin.finder.view.ei(context3, itemId, w17, i17, n17, "", qfVar != null ? qfVar.f32067d : 0L, null, 128, null);
        eiVar.setFocusable(true);
        if (!eiVar.f132017l) {
            eiVar.getContentView().measure(0, 0);
            eiVar.f132017l = true;
        }
        int measuredWidth = eiVar.getContentView().getMeasuredWidth();
        int measuredHeight = eiVar.getContentView().getMeasuredHeight();
        eiVar.setWidth(measuredWidth);
        eiVar.setHeight(-2);
        view.getLocationInWindow(new int[2]);
        android.view.View findViewById = eiVar.getContentView().findViewById(com.tencent.mm.R.id.a4x);
        android.view.View findViewById2 = eiVar.getContentView().findViewById(com.tencent.mm.R.id.a4q);
        android.view.View contentView = eiVar.getContentView();
        kotlin.jvm.internal.o.f(contentView, "getContentView(...)");
        contentView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight2 = contentView.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        int i18 = iArr[0];
        rect.left = i18;
        rect.top = iArr[1];
        rect.right = i18 + view.getMeasuredWidth();
        rect.bottom = rect.top + view.getMeasuredHeight();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        int i19 = rect.bottom + measuredHeight2 > rect2.height() ? -(measuredHeight2 + rect.height()) : 0;
        int measuredWidth2 = (view.getMeasuredWidth() - findViewById.getMeasuredWidth()) / 2;
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.rightMargin = measuredWidth2 + 0;
        } else {
            marginLayoutParams = null;
        }
        findViewById.setLayoutParams(marginLayoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = measuredWidth2 - 0;
        } else {
            marginLayoutParams2 = null;
        }
        findViewById2.setLayoutParams(marginLayoutParams2);
        if (i19 < 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        eiVar.setAnimationStyle(i19 < 0 ? com.tencent.mm.R.style.f494462np : com.tencent.mm.R.style.f494463nq);
        eiVar.showAsDropDown(view, 0, i19, 8388613);
        float f17 = com.tencent.mm.ui.bk.C() ? 0.1f : 0.5f;
        try {
            android.view.View rootView = eiVar.getContentView().getRootView();
            java.lang.Object systemService = eiVar.f132007b.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
            android.view.ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            android.view.WindowManager.LayoutParams layoutParams4 = layoutParams3 instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.flags |= 2;
                layoutParams4.dimAmount = f17;
                windowManager.updateViewLayout(rootView, layoutParams4);
            }
        } catch (java.lang.Throwable unused) {
        }
        kotlin.jvm.internal.o.f(java.lang.String.format("pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight)}, 2)), "format(...)");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("product_feed_feedback", "view_clk", n17, 1, false);
    }
}
