package p84;

/* loaded from: classes4.dex */
public final class g extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17787x45e5e488 f434326e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17787x45e5e488 c17787x45e5e488) {
        this.f434326e = c17787x45e5e488;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView$startContentAppearAnim$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17787x45e5e488.f245041r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17787x45e5e488 c17787x45e5e488 = this.f434326e;
        java.lang.String str5 = c17787x45e5e488.f245042d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        if (this.f121239d) {
            str = "onAnimationEnd";
            str2 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView$startContentAppearAnim$1$1";
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$startArrowAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startArrowAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
            if (c17787x45e5e488.f245049n == null) {
                android.widget.ImageView imageView = c17787x45e5e488.f245047i;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mArrowIcon");
                    throw null;
                }
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, 0.0f);
                ofFloat.setDuration(500L);
                p84.a aVar = p84.e.f434311n;
                ofFloat.setInterpolator(aVar.a());
                android.widget.ImageView imageView2 = c17787x45e5e488.f245047i;
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mArrowIcon");
                    throw null;
                }
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView2, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(500L);
                ofFloat2.setInterpolator(aVar.a());
                float b17 = i65.a.b(c17787x45e5e488.getContext(), 4);
                android.widget.ImageView imageView3 = c17787x45e5e488.f245047i;
                if (imageView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mArrowIcon");
                    throw null;
                }
                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView3, "translationX", 0.0f, b17);
                str4 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView$startContentAppearAnim$1$1";
                ofFloat3.setDuration(500L);
                ofFloat3.setInterpolator(aVar.a());
                android.widget.ImageView imageView4 = c17787x45e5e488.f245047i;
                if (imageView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mArrowIcon");
                    throw null;
                }
                str3 = "onAnimationEnd";
                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView4, "translationX", b17, b17);
                ofFloat4.setDuration(500L);
                ofFloat4.setInterpolator(aVar.a());
                android.widget.ImageView imageView5 = c17787x45e5e488.f245047i;
                if (imageView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mArrowIcon");
                    throw null;
                }
                android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(imageView5, "alpha", 1.0f, 0.0f);
                ofFloat5.setDuration(500L);
                ofFloat5.setInterpolator(aVar.a());
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2);
                animatorSet.play(ofFloat3).after(ofFloat);
                animatorSet.play(ofFloat4).with(ofFloat5).after(ofFloat3);
                animatorSet.addListener(new p84.f(c17787x45e5e488));
                c17787x45e5e488.f245049n = animatorSet;
            } else {
                str3 = "onAnimationEnd";
                str4 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView$startContentAppearAnim$1$1";
            }
            android.animation.AnimatorSet animatorSet2 = c17787x45e5e488.f245049n;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startArrowAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$startArrowAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
            str = str3;
            str2 = str4;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }
}
