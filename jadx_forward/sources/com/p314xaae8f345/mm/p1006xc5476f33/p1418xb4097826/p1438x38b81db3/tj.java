package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class tj implements k20.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uj f186164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f186165c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f186166d;

    public tj(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uj ujVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f186163a = s0Var;
        this.f186164b = ujVar;
        this.f186165c = h0Var;
        this.f186166d = h0Var2;
    }

    public void a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        in5.s0 s0Var = this.f186163a;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int i17 = nyVar != null ? nyVar.f216913n : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i;
        long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
        if (mo2128x1ed62e84 == 0) {
            return;
        }
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC14490x69736cb5);
        java.util.Map n17 = this.f186164b.n(context2, abstractC14490x69736cb5, (java.lang.String) this.f186165c.f391656d);
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        java.lang.String w17 = abstractC14490x69736cb5.w();
        bw5.qf qfVar = (bw5.qf) this.f186166d.f391656d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ei eiVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ei(context3, mo2128x1ed62e84, w17, i17, n17, "", qfVar != null ? qfVar.f113600d : 0L, null, 128, null);
        eiVar.setFocusable(true);
        if (!eiVar.f213550l) {
            eiVar.getContentView().measure(0, 0);
            eiVar.f213550l = true;
        }
        int measuredWidth = eiVar.getContentView().getMeasuredWidth();
        int measuredHeight = eiVar.getContentView().getMeasuredHeight();
        eiVar.setWidth(measuredWidth);
        eiVar.setHeight(-2);
        view.getLocationInWindow(new int[2]);
        android.view.View findViewById = eiVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.a4x);
        android.view.View findViewById2 = eiVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.a4q);
        android.view.View contentView = eiVar.getContentView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contentView, "getContentView(...)");
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
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
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
        eiVar.setAnimationStyle(i19 < 0 ? com.p314xaae8f345.mm.R.C30868x68b1db1.f575995np : com.p314xaae8f345.mm.R.C30868x68b1db1.f575996nq);
        eiVar.showAsDropDown(view, 0, i19, 8388613);
        float f17 = com.p314xaae8f345.mm.ui.bk.C() ? 0.1f : 0.5f;
        try {
            android.view.View rootView = eiVar.getContentView().getRootView();
            java.lang.Object systemService = eiVar.f213540b.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.lang.String.format("pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight)}, 2)), "format(...)");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("product_feed_feedback", "view_clk", n17, 1, false);
    }
}
