package sc2;

/* loaded from: classes2.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.vt0 f487933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487934g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487935h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f487936i;

    public z(in5.s0 s0Var, sc2.h1 h1Var, r45.vt0 vt0Var, android.view.View view, android.view.View view2, r45.t01 t01Var) {
        this.f487931d = s0Var;
        this.f487932e = h1Var;
        this.f487933f = vt0Var;
        this.f487934g = view;
        this.f487935h = view2;
        this.f487936i = t01Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$onBindView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f487931d;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int i17 = nyVar != null ? nyVar.f216913n : 0;
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        sc2.h1 h1Var = this.f487932e;
        long j17 = h1Var.f84678f;
        java.lang.String str3 = h1Var.f84679g;
        r45.vt0 vt0Var = this.f487933f;
        java.util.LinkedList m75941xfb821914 = vt0Var != null ? vt0Var.m75941xfb821914(5) : null;
        if (m75941xfb821914 == null) {
            m75941xfb821914 = new java.util.LinkedList();
        }
        java.util.LinkedList linkedList = m75941xfb821914;
        if (vt0Var == null || (str = vt0Var.m75945x2fec8307(2)) == null) {
            str = "";
        }
        if (vt0Var == null || (str2 = vt0Var.m75945x2fec8307(3)) == null) {
            str2 = "";
        }
        h1Var.Z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2(context2, j17, str3, linkedList, i17, str, str2, r45.i3.AdFeedbackBusinessType_PreMovieAd);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var = h1Var.Z;
        if (s2Var != null) {
            s2Var.f214541p = new sc2.x(s0Var, vt0Var, this.f487935h, h1Var);
        }
        if (s2Var != null) {
            s2Var.f214540o = new sc2.y(h1Var, s0Var, this.f487936i);
        }
        if (s2Var != null) {
            s2Var.setFocusable(true);
        }
        sc2.h1.G(h1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var2 = h1Var.Z;
        if (s2Var2 != null) {
            android.view.View anchor = this.f487934g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
            if (!s2Var2.f214543r) {
                s2Var2.getContentView().measure(0, 0);
                s2Var2.f214543r = true;
            }
            int measuredWidth = s2Var2.getContentView().getMeasuredWidth();
            int measuredHeight = s2Var2.getContentView().getMeasuredHeight();
            s2Var2.setWidth(measuredWidth);
            s2Var2.setHeight(measuredHeight);
            anchor.getLocationInWindow(new int[2]);
            android.view.View findViewById = s2Var2.getContentView().findViewById(com.p314xaae8f345.mm.R.id.a4x);
            android.view.View findViewById2 = s2Var2.getContentView().findViewById(com.p314xaae8f345.mm.R.id.a4q);
            android.view.View contentView = s2Var2.getContentView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contentView, "getContentView(...)");
            contentView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight2 = contentView.getMeasuredHeight();
            int[] iArr = new int[2];
            anchor.getLocationOnScreen(iArr);
            android.graphics.Rect rect = new android.graphics.Rect();
            int i18 = iArr[0];
            rect.left = i18;
            rect.top = iArr[1];
            rect.right = i18 + anchor.getMeasuredWidth();
            rect.bottom = rect.top + anchor.getMeasuredHeight();
            android.graphics.Rect rect2 = new android.graphics.Rect();
            anchor.getWindowVisibleDisplayFrame(rect2);
            int i19 = rect.bottom + measuredHeight2 > rect2.height() ? -(measuredHeight2 + rect.height()) : 0;
            int measuredWidth2 = (anchor.getMeasuredWidth() - findViewById.getMeasuredWidth()) / 2;
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.rightMargin = measuredWidth2 - s2Var2.f214542q;
            } else {
                marginLayoutParams = null;
            }
            findViewById.setLayoutParams(marginLayoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.rightMargin = measuredWidth2 - s2Var2.f214542q;
            } else {
                marginLayoutParams2 = null;
            }
            findViewById2.setLayoutParams(marginLayoutParams2);
            if (i19 < 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            s2Var2.setAnimationStyle(i19 < 0 ? com.p314xaae8f345.mm.R.C30868x68b1db1.f575995np : com.p314xaae8f345.mm.R.C30868x68b1db1.f575996nq);
            s2Var2.showAsDropDown(anchor, 0, i19, 8388613);
            float f17 = com.p314xaae8f345.mm.ui.bk.C() ? 0.1f : 0.5f;
            try {
                android.view.View rootView = s2Var2.getContentView().getRootView();
                java.lang.Object systemService = s2Var2.f214527b.getSystemService("window");
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
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$onBindView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
