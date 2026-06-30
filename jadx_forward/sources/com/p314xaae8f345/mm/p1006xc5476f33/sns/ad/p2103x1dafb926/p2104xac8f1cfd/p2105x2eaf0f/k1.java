package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f f244405d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f c17730x4c10861f) {
        this.f244405d = c17730x4c10861f;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        o44.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f c17730x4c10861f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f c17730x4c10861f2 = this.f244405d;
        c17730x4c10861f2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        if (c17730x4c10861f2.f244269w != 3 || c17730x4c10861f2.f244266t == null || (cVar = c17730x4c10861f2.f244265s) == null) {
            str = "run";
            str2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$5";
        } else {
            cVar.e();
            android.view.View view = c17730x4c10861f2.f244265s.f424398c;
            android.view.View view2 = c17730x4c10861f2.f244266t.f424398c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            if (view == null || view2 == null) {
                str = "run";
                str2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$5";
                c17730x4c10861f = c17730x4c10861f2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingHBCardComponent", "doDoubleCardDisappearAnim");
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, -i65.a.b(c17730x4c10861f2.f246582d, 300));
                ofFloat.setDuration(500L);
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                ofFloat2.setDuration(500L);
                ofFloat2.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.g1(c17730x4c10861f2, view));
                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view2, "scaleX", 1.0f, 1.05f);
                ofFloat3.setDuration(250L);
                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view2, "scaleY", 1.0f, 1.05f);
                ofFloat4.setDuration(250L);
                android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view2, "scaleX", 1.05f, 1.0f);
                str = "run";
                str2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$5";
                ofFloat5.setDuration(250L);
                android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view2, "scaleY", 1.05f, 1.0f);
                ofFloat6.setDuration(250L);
                android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(view2, "Rotation", 5.0f, 0.0f);
                c17730x4c10861f = c17730x4c10861f2;
                ofFloat7.setDuration(500L);
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat7);
                animatorSet.play(ofFloat3).with(ofFloat4);
                animatorSet.play(ofFloat5).with(ofFloat6);
                animatorSet.play(ofFloat5).after(ofFloat3);
                animatorSet.start();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            }
            c17730x4c10861f.C.e(2, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }
}
