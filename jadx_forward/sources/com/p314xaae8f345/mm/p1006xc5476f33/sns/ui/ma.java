package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public abstract class ma implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.la f251435d;

    /* renamed from: e, reason: collision with root package name */
    public final android.animation.AnimatorSet f251436e;

    public ma(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.la laVar, android.animation.AnimatorSet animatorSet) {
        this.f251435d = laVar;
        this.f251436e = animatorSet;
    }

    public abstract void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar, float f17);

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$SellAnimatorUpdateListener");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.la laVar = this.f251435d;
        laVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
        java.lang.ref.WeakReference weakReference = laVar.f251268a;
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
            obj = null;
        } else {
            obj = weakReference.get();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa) obj;
        if (paVar != null) {
            a(paVar, floatValue);
        } else {
            this.f251436e.cancel();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$SellAnimatorUpdateListener");
    }
}
