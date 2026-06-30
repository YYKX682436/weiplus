package cw2;

/* loaded from: classes.dex */
public final class x8 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f305644e;

    public x8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f, float f17) {
        this.f305643d = c15196x85976f5f;
        this.f305644e = f17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.view.View m61460x51de1d06;
        android.view.View m61460x51de1d062;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305643d;
        m61460x51de1d06 = c15196x85976f5f.m61460x51de1d06();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(this.f305644e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m61460x51de1d06, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m61460x51de1d06.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(m61460x51de1d06, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m61460x51de1d062 = c15196x85976f5f.m61460x51de1d06();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m61460x51de1d062, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m61460x51de1d062.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m61460x51de1d062, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
