package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class mh implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15335x24ba89b5 f214195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f214196e;

    public mh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15335x24ba89b5 c15335x24ba89b5, int i17) {
        this.f214195d = c15335x24ba89b5;
        this.f214196e = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15335x24ba89b5 c15335x24ba89b5 = this.f214195d;
        c15335x24ba89b5.d((int) (c15335x24ba89b5.f212937o + ((c15335x24ba89b5.f212938p - r1) * animatedFraction)), (int) (c15335x24ba89b5.f212939q + ((c15335x24ba89b5.f212940r - r2) * animatedFraction)));
        int i17 = c15335x24ba89b5.f212941s;
        int i18 = c15335x24ba89b5.f212942t;
        float f17 = i17 + ((i18 - i17) * animatedFraction);
        int i19 = c15335x24ba89b5.f212943u;
        int i27 = c15335x24ba89b5.f212946x;
        int i28 = (int) f17;
        android.widget.FrameLayout frameLayout = c15335x24ba89b5.f212930e;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = i28;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = i28;
        layoutParams2.setMarginStart((int) (i19 + ((i27 - i19) * animatedFraction)));
        frameLayout.setLayoutParams(layoutParams2);
        c15335x24ba89b5.f212931f.m82734xe2eaa4ac(i27 + ((c15335x24ba89b5.f212948z - i27) * animatedFraction));
        int i29 = c15335x24ba89b5.f212944v;
        int i37 = c15335x24ba89b5.f212945w;
        c15335x24ba89b5.m62344xc1c57552((int) (i29 + ((i37 - i29) * animatedFraction)));
        c15335x24ba89b5.f212933h.setTextSize(1, 15.0f - (1.0f * animatedFraction));
        c15335x24ba89b5.f212934i.setHeight((int) (this.f214196e + ((0 - r4) * animatedFraction)));
        float f18 = i29 + ((i37 - i29) * animatedFraction);
        float f19 = c15335x24ba89b5.f212947y + ((i19 - r2) * animatedFraction);
        float f27 = i18 + ((i27 - i18) * animatedFraction);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c15335x24ba89b5.f212935m;
        android.view.ViewGroup.LayoutParams layoutParams3 = c22699x3dcdb352.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams4 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams3;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).width = (int) f18;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).height = (int) f19;
        layoutParams4.setMarginEnd((int) f27);
        c22699x3dcdb352.setLayoutParams(layoutParams4);
    }
}
