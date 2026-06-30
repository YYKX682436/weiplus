package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class t4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 f198224d;

    public t4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77) {
        this.f198224d = c14313x19517c77;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77 = this.f198224d;
        c14313x19517c77.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = c14313x19517c77.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = c14313x19517c77.getDefaultTranslationY();
        android.view.ViewGroup.LayoutParams layoutParams2 = c14313x19517c77.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(0);
        c14313x19517c77.setTranslationX(com.p314xaae8f345.mm.ui.bl.b(c14313x19517c77.getContext()).x / 2);
        c14313x19517c77.setBackground(c14313x19517c77.B);
        c14313x19517c77.getClass();
        c14313x19517c77.f197397r = 0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77 = this.f198224d;
        c14313x19517c77.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = c14313x19517c77.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = c14313x19517c77.getDefaultTranslationY();
        android.view.ViewGroup.LayoutParams layoutParams2 = c14313x19517c77.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(0);
        c14313x19517c77.setTranslationX(com.p314xaae8f345.mm.ui.bl.b(c14313x19517c77.getContext()).x / 2);
        c14313x19517c77.setBackground(c14313x19517c77.B);
        c14313x19517c77.getClass();
        c14313x19517c77.f197397r = 0;
    }
}
