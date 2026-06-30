package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class ar implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f193466d;

    public ar(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar) {
        this.f193466d = etVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f193466d;
        android.view.View view = etVar.E;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "access$getRoleView$p(...)");
        etVar.getClass();
        if (view.isShown()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_ROLE_CHANGE_TIPS_SHOWN_BOOLEAN_SYNC;
            if (c17.o(u3Var, false)) {
                android.view.View view2 = etVar.F;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "checkRoleTipsLocation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "checkRoleTipsLocation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i17 = b17.y;
            int i18 = b17.x;
            if (etVar.x0()) {
                i17 = i18;
            }
            int[] t17 = pm0.v.t(view);
            int i19 = t17[0];
            int i27 = t17[1];
            android.content.Context context = etVar.R;
            float dimension = (i17 - i27) - context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
            android.view.View view3 = etVar.F;
            view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), (int) dimension);
            float width = i19 + ((view.getWidth() / 2) - (context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) / 2));
            android.view.View view4 = etVar.G;
            android.view.ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = (int) width;
                view4.setLayoutParams(layoutParams2);
            }
            android.view.View view5 = etVar.F;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "checkRoleTipsLocation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "checkRoleTipsLocation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            etVar.H.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hr(etVar));
            view3.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ir(etVar));
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ((ml2.r0) c18).Cj(ml2.g5.C, null);
        }
    }
}
