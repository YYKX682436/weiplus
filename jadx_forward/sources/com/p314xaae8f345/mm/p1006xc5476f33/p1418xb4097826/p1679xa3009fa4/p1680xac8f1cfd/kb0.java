package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class kb0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Integer f216478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f216479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 f216480f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216481g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f216482h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 f216483i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f216484m;

    public kb0(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 mb0Var, in5.s0 s0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 db0Var, int i18) {
        this.f216479e = view;
        this.f216480f = mb0Var;
        this.f216481g = s0Var;
        this.f216482h = i17;
        this.f216483i = db0Var;
        this.f216484m = i18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        android.view.View view = this.f216479e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$showWithAnimation$2$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$showWithAnimation$2$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f216479e;
        view2.setTranslationY(0.0f);
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.height = this.f216482h;
        java.lang.Integer num = this.f216478d;
        if (this.f216483i == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0.f215651d && num != null && (layoutParams instanceof android.widget.FrameLayout.LayoutParams)) {
            ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = num.intValue();
        }
        view2.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 mb0Var = this.f216480f;
        mb0Var.f216692d = null;
        mb0Var.getClass();
        in5.s0 holder = this.f216481g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 c15447x4ebc90c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2) ((jz5.n) mb0Var.f216693e).mo141623x754a37bb();
        if (c15447x4ebc90c2 != null) {
            c15447x4ebc90c2.P6(holder);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        android.view.View view = this.f216479e;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = this.f216484m;
        if (this.f216483i == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0.f215651d && (layoutParams instanceof android.widget.FrameLayout.LayoutParams)) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            this.f216478d = java.lang.Integer.valueOf(layoutParams2.gravity);
            layoutParams2.gravity = 48;
        }
        view.setLayoutParams(layoutParams);
    }
}
