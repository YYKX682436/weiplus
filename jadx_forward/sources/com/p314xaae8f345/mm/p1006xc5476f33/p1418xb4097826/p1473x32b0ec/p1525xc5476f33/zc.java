package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class zc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad f196857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f196858e;

    public zc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar, android.view.View view) {
        this.f196857d = adVar;
        this.f196858e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.graphics.drawable.Drawable background;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar = this.f196857d;
        if (adVar.x0()) {
            android.view.ViewGroup viewGroup = adVar.f193400w;
            if (viewGroup != null && (background = viewGroup.getBackground()) != null) {
                adVar.E = background;
            }
            android.view.ViewGroup viewGroup2 = adVar.f193400w;
            if (viewGroup2 != null) {
                viewGroup2.setBackground(null);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad.t1(adVar);
            android.view.View view = this.f196858e;
            if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showFinishBg but costInnerContainer size:");
                sb6.append(view.getMeasuredWidth());
                sb6.append('-');
                sb6.append(view.getMeasuredHeight());
                sb6.append(",freeTimeOverPag:");
                com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c653 = adVar.D;
                sb6.append((c22787x6853c653 == null || (layoutParams2 = c22787x6853c653.getLayoutParams()) == null) ? null : java.lang.Integer.valueOf(layoutParams2.width));
                sb6.append('-');
                com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6532 = adVar.D;
                sb6.append((c22787x6853c6532 == null || (layoutParams = c22787x6853c6532.getLayoutParams()) == null) ? null : java.lang.Integer.valueOf(layoutParams.height));
                sb6.append('!');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargePayLazyPlugin", sb6.toString());
                view.getViewTreeObserver().addOnGlobalLayoutListener((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pc) ((jz5.n) adVar.F).mo141623x754a37bb());
            }
            android.graphics.drawable.Drawable background2 = view.getBackground();
            if (background2 != null) {
                adVar.E = background2;
            }
            view.setBackground(null);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6533 = adVar.D;
        if (c22787x6853c6533 != null) {
            c22787x6853c6533.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6534 = adVar.D;
        if (c22787x6853c6534 != null) {
            c22787x6853c6534.g();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6535 = adVar.D;
        if (c22787x6853c6535 != null) {
            c22787x6853c6535.setAlpha(0.0f);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6536 = adVar.D;
        if (c22787x6853c6536 == null || (animate = c22787x6853c6536.animate()) == null || (alpha = animate.alpha(1.0f)) == null) {
            return;
        }
        alpha.start();
    }
}
