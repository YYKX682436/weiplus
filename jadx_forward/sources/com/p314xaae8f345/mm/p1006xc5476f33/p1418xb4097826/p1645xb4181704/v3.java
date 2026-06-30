package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes3.dex */
public final class v3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea f211969d;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea c15151xe87c41ea) {
        this.f211969d = c15151xe87c41ea;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((java.lang.Integer) animatedValue).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea c15151xe87c41ea = this.f211969d;
        android.view.ViewGroup.LayoutParams layoutParams = c15151xe87c41ea.m61128x623e5088().getLayoutParams();
        layoutParams.width = a06.d.b(intValue);
        c15151xe87c41ea.m61128x623e5088().setLayoutParams(layoutParams);
        android.view.View m61128x623e5088 = c15151xe87c41ea.m61128x623e5088();
        float replyBtnWidth = intValue / c15151xe87c41ea.getReplyBtnWidth();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(replyBtnWidth));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m61128x623e5088, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m61128x623e5088.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(m61128x623e5088, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
