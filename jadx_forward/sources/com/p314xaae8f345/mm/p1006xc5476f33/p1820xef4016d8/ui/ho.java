package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes5.dex */
public final class ho implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jo f228538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo f228539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f228540f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f228541g;

    public ho(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jo joVar, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo moVar, android.widget.TextView textView, android.widget.ImageView imageView) {
        this.f228538d = joVar;
        this.f228539e = moVar;
        this.f228540f = textView;
        this.f228541g = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jo joVar = this.f228538d;
        if (joVar.m80379x76847179().isFinishing() || joVar.m80379x76847179().isDestroyed()) {
            return;
        }
        android.widget.TextView actionOptionTv = this.f228540f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(actionOptionTv, "$actionOptionTv");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo moVar = this.f228539e;
        moVar.getClass();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        moVar.f228742l = actionOptionTv;
        if (moVar.getBackground() == null) {
            moVar.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
        android.view.View contentView = moVar.getContentView();
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = layoutParams.leftMargin;
        layoutParams2.rightMargin = layoutParams.rightMargin;
        layoutParams2.topMargin = layoutParams.topMargin;
        layoutParams2.bottomMargin = layoutParams.bottomMargin;
        contentView.setLayoutParams(layoutParams2);
        com.p314xaae8f345.mm.ui.bk.t();
        int i17 = com.p314xaae8f345.mm.ui.bk.t().heightPixels;
        int[] iArr = new int[2];
        actionOptionTv.getLocationInWindow(iArr);
        moVar.setWidth(-2);
        moVar.setHeight(-2);
        moVar.f228735e = iArr[0] + actionOptionTv.getWidth();
        moVar.f228736f = (i17 - iArr[1]) - actionOptionTv.getHeight();
        android.widget.FrameLayout frameLayout = moVar.f228732b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
        frameLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(moVar.f228735e, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)), android.view.View.MeasureSpec.makeMeasureSpec(moVar.f228736f, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)));
        moVar.setWidth(java.lang.Math.min(frameLayout.getMeasuredWidth(), moVar.f228735e));
        moVar.setHeight(java.lang.Math.min(frameLayout.getMeasuredHeight(), moVar.f228736f));
        frameLayout.getMeasuredWidth();
        frameLayout.getMeasuredHeight();
        actionOptionTv.getLocationInWindow(new int[2]);
        moVar.f228733c = 0;
        moVar.f228734d = 0;
        moVar.f228733c = ((-(frameLayout.getMeasuredWidth() - actionOptionTv.getWidth())) / 2) + (actionOptionTv.getWidth() / 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(moVar.f228731a, "[computePosition] x: " + moVar.f228733c + ",anchor.width: " + actionOptionTv.getWidth() + "、anchor.height: " + actionOptionTv.getHeight() + ", contentWrapView!!.measuredWidth: " + frameLayout.getMeasuredWidth());
        moVar.f228734d = moVar.f228734d - com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
        moVar.f228739i = 0;
        moVar.f228740j = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.lo(actionOptionTv, moVar);
        actionOptionTv.getViewTreeObserver().addOnGlobalLayoutListener(moVar.f228740j);
        if (moVar.isShowing()) {
            moVar.update(actionOptionTv, moVar.f228733c, moVar.f228734d, moVar.getWidth(), moVar.getHeight());
        } else {
            moVar.showAsDropDown(actionOptionTv, moVar.f228733c, moVar.f228734d);
        }
        actionOptionTv.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.go(joVar, moVar, actionOptionTv, this.f228541g), 50L);
    }
}
