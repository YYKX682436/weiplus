package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x f202154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f202155e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55) {
        this.f202154d = xVar;
        this.f202155e = c22646x1e9ca55;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.LinearLayout.LayoutParams layoutParams;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 avatarViewBg = this.f202155e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(avatarViewBg, "$avatarViewBg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar = this.f202154d;
        android.view.View view = xVar.f202208l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b17.y;
        int i18 = b17.x;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f3u);
        int[] t17 = pm0.v.t(avatarViewBg);
        int i19 = t17[0];
        int width = avatarViewBg.getWidth() + i19;
        int i27 = t17[1];
        float dimension = avatarViewBg.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null ? k0Var.m46546x9b8334b1() : false) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) ((i17 - i27) - dimension));
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f3w);
            float width2 = (i18 - width) + ((avatarViewBg.getWidth() / 2) - (view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) / 2));
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams3 != null) {
                layoutParams3.rightMargin = (int) width2;
                findViewById.setLayoutParams(layoutParams3);
            }
            int measureText = ((int) textView.getPaint().measureText(textView.getText().toString())) + textView.getPaddingLeft() + textView.getPaddingRight();
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c5570 = xVar.f202197a;
            int width3 = ((c22843x6b8c5570 != null ? c22843x6b8c5570.getWidth() : 0) / 2) - (measureText / 2);
            if (width3 < 0) {
                width3 = 0;
            }
            android.view.ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
            layoutParams = layoutParams4 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams4 : null;
            if (layoutParams != null) {
                layoutParams.rightMargin = width3;
                textView.setLayoutParams(layoutParams);
            }
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) ((i17 - i27) - dimension));
            float width4 = i19 + ((avatarViewBg.getWidth() / 2) - (view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) / 2));
            android.view.ViewGroup.LayoutParams layoutParams5 = findViewById.getLayoutParams();
            layoutParams = layoutParams5 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams != null) {
                layoutParams.leftMargin = (int) width4;
                findViewById.setLayoutParams(layoutParams);
            }
        }
        android.view.View view2 = xVar.f202208l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$GiftWallItemConvert$onBindViewHolder$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$GiftWallItemConvert$onBindViewHolder$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
