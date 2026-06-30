package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.y1 f256636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f256637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.bz2 f256638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f256639g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wm4.y f256640h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f256641i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.f03 f256642m;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.y1 y1Var, android.view.View view, r45.bz2 bz2Var, int i17, wm4.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var) {
        this.f256636d = y1Var;
        this.f256637e = view;
        this.f256638f = bz2Var;
        this.f256639g = i17;
        this.f256640h = yVar;
        this.f256641i = jbVar;
        this.f256642m = f03Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStoryTabBubbleUIC", "after tabview post delayed");
        android.view.View tabViewContainer = this.f256637e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tabViewContainer, "$tabViewContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.y1 y1Var = this.f256636d;
        wm4.y yVar = this.f256640h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.u1 u1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.u1(y1Var, this.f256639g, yVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.w1 w1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.w1(y1Var, yVar, this.f256641i, this.f256642m, this.f256637e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.y1 y1Var2 = this.f256636d;
        y1Var2.getClass();
        r45.bz2 bz2Var = this.f256638f;
        r45.f03 f03Var = bz2Var.f452701e;
        java.lang.String str = f03Var != null ? f03Var.f455422f : null;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStoryTabBubbleUIC", "[doShowTips] title.isNullOrEmpty");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18766xb71d9084 c18766xb71d9084 = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18766xb71d9084(com.p314xaae8f345.mm.ui.id.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dor, (android.view.ViewGroup) null));
        c18766xb71d9084.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576152w4);
        c18766xb71d9084.setOutsideTouchable(true);
        android.graphics.Rect rect = new android.graphics.Rect();
        tabViewContainer.getGlobalVisibleRect(rect);
        c18766xb71d9084.setTouchInterceptor(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.q1(y1Var2, rect, c18766xb71d9084));
        c18766xb71d9084.setFocusable(false);
        c18766xb71d9084.getContentView().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.r1(c18766xb71d9084, u1Var));
        c18766xb71d9084.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.s1(w1Var));
        android.widget.TextView textView = (android.widget.TextView) c18766xb71d9084.getContentView().findViewById(com.p314xaae8f345.mm.R.id.f568913r93);
        i95.m c17 = i95.n0.c(zy2.s6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.text.SpannableString l66 = zy2.s6.l6((zy2.s6) c17, str, (int) textView.getTextSize(), false, null, 0, false, null, 120, null);
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        textView.setText(l66);
        android.widget.ImageView imageView = (android.widget.ImageView) c18766xb71d9084.getContentView().findViewById(com.p314xaae8f345.mm.R.id.f568910r90);
        android.widget.ImageView imageView2 = (android.widget.ImageView) c18766xb71d9084.getContentView().findViewById(com.p314xaae8f345.mm.R.id.f568911r91);
        android.widget.ImageView imageView3 = (android.widget.ImageView) c18766xb71d9084.getContentView().findViewById(com.p314xaae8f345.mm.R.id.f568912r92);
        r45.f03 f03Var2 = bz2Var.f452701e;
        java.lang.String str2 = f03Var2 != null ? f03Var2.f455423g : null;
        if (str2 == null || str2.length() == 0) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
            imageView3.setVisibility(0);
        } else {
            imageView.setVisibility(0);
            imageView2.setVisibility(0);
            imageView3.setVisibility(8);
            int h17 = i65.a.h(y1Var2.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            gk0.k kVar = new gk0.k(h17, h17);
            r45.f03 f03Var3 = bz2Var.f452701e;
            java.lang.Integer valueOf = f03Var3 != null ? java.lang.Integer.valueOf(f03Var3.f455420d) : null;
            if ((valueOf != null && valueOf.intValue() == 11) || (valueOf != null && valueOf.intValue() == 13)) {
                z17 = true;
            } else {
                if ((valueOf == null || valueOf.intValue() != 12) && valueOf != null) {
                    valueOf.intValue();
                }
                z17 = false;
            }
            if (z17) {
                kVar.f353966d = 0.5f;
            } else {
                kVar.f353965c = i65.a.a(y1Var2.m80379x76847179(), 2.4f);
            }
            kVar.f353967e = com.p314xaae8f345.mm.R.C30861xcebc809e.bhm;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            if (str2 == null) {
                str2 = "";
            }
            ((h83.g) n0Var).wi(imageView, str2, kVar);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        c18766xb71d9084.f256812k = tabViewContainer;
        if (c18766xb71d9084.getBackground() == null) {
            c18766xb71d9084.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
        android.view.View contentView = c18766xb71d9084.getContentView();
        if (contentView != null) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = layoutParams.leftMargin;
            layoutParams2.rightMargin = layoutParams.rightMargin;
            layoutParams2.topMargin = layoutParams.topMargin;
            layoutParams2.bottomMargin = layoutParams.bottomMargin;
            contentView.setLayoutParams(layoutParams2);
            com.p314xaae8f345.mm.ui.bk.t();
            int i17 = com.p314xaae8f345.mm.ui.bk.t().heightPixels;
            int[] iArr = new int[2];
            tabViewContainer.getLocationInWindow(iArr);
            c18766xb71d9084.setWidth(-2);
            c18766xb71d9084.setHeight(-2);
            c18766xb71d9084.f256805d = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561234cx);
            c18766xb71d9084.f256806e = (i17 - iArr[1]) - tabViewContainer.getHeight();
            android.widget.FrameLayout frameLayout = c18766xb71d9084.f256802a;
            frameLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(c18766xb71d9084.f256805d, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)), android.view.View.MeasureSpec.makeMeasureSpec(c18766xb71d9084.f256806e, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)));
            c18766xb71d9084.setWidth(java.lang.Math.min(frameLayout.getMeasuredWidth(), c18766xb71d9084.f256805d));
            c18766xb71d9084.setHeight(java.lang.Math.min(frameLayout.getMeasuredHeight(), c18766xb71d9084.f256806e));
            frameLayout.getMeasuredWidth();
            frameLayout.getMeasuredHeight();
            tabViewContainer.getLocationInWindow(new int[2]);
            c18766xb71d9084.f256803b = 0;
            c18766xb71d9084.f256804c = 0;
            c18766xb71d9084.f256803b = (-(frameLayout.getMeasuredWidth() - tabViewContainer.getWidth())) / 2;
            c18766xb71d9084.f256804c -= com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            c18766xb71d9084.f256809h = 0;
            c18766xb71d9084.f256810i = new in4.c0(c18766xb71d9084, tabViewContainer);
            tabViewContainer.getViewTreeObserver().addOnGlobalLayoutListener(c18766xb71d9084.f256810i);
            if (c18766xb71d9084.isShowing()) {
                c18766xb71d9084.update(tabViewContainer, c18766xb71d9084.f256803b, c18766xb71d9084.f256804c, c18766xb71d9084.getWidth(), c18766xb71d9084.getHeight());
            } else {
                c18766xb71d9084.showAsDropDown(tabViewContainer, c18766xb71d9084.f256803b, c18766xb71d9084.f256804c);
            }
        }
        tabViewContainer.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.t1(c18766xb71d9084), 5000L);
    }
}
