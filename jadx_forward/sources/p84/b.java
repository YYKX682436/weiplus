package p84;

/* loaded from: classes4.dex */
public final class b extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p84.e f434308e;

    public b(p84.e eVar) {
        this.f434308e = eVar;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mLabelContentDisappearListener$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        p84.e eVar = this.f434308e;
        java.lang.String str = eVar.f434312a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$startOutViewAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        eVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startOutViewAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        android.view.View view = eVar.f434318g;
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startOutViewAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        } else {
            if (view.getVisibility() == 0) {
                if (eVar.f434319h == null) {
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(eVar.f434318g, "translationX", -i65.a.b(eVar.f434317f.getContext(), 16), 0.0f);
                    ofFloat.setDuration(500L);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                    android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                    ofFloat.setInterpolator(pathInterpolator);
                    android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(eVar.f434318g, "alpha", 0.0f, 1.0f);
                    ofFloat2.setDuration(500L);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                    android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                    ofFloat2.setInterpolator(pathInterpolator2);
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    animatorSet.play(ofFloat).with(ofFloat2);
                    eVar.f434319h = animatorSet;
                }
                android.animation.AnimatorSet animatorSet2 = eVar.f434319h;
                if (animatorSet2 != null) {
                    animatorSet2.start();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startOutViewAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startOutViewAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$startOutViewAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mLabelContentDisappearListener$1");
    }
}
