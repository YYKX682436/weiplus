package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes3.dex */
public final class w3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea f211976d;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea c15151xe87c41ea) {
        this.f211976d = c15151xe87c41ea;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View m61128x623e5088 = this.f211976d.m61128x623e5088();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m61128x623e5088, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m61128x623e5088.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m61128x623e5088, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View m61128x623e5088 = this.f211976d.m61128x623e5088();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m61128x623e5088, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m61128x623e5088.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m61128x623e5088, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View m61128x623e5088 = this.f211976d.m61128x623e5088();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m61128x623e5088, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m61128x623e5088.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m61128x623e5088, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
