package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class i6 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f213819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f213820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213821f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f213822g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213823h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f213824i;

    public i6(p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, yz5.a aVar, android.view.View view, yz5.a aVar2, android.view.View view2, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2) {
        this.f213819d = g0Var;
        this.f213820e = aVar;
        this.f213821f = view;
        this.f213822g = aVar2;
        this.f213823h = view2;
        this.f213824i = g0Var2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f213822g.mo152xb9724478();
        this.f213823h.setScaleX(1.0f);
        android.view.View view = this.f213823h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter$getSwitchAvatarAnimatorSet$lambda$15$$inlined$addListener$default$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$getSwitchAvatarAnimatorSet$lambda$15$$inlined$addListener$default$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.System.currentTimeMillis();
        long j17 = this.f213819d.f391654d;
        this.f213820e.mo152xb9724478();
        this.f213821f.setScaleX(1.0f);
        android.view.View view = this.f213821f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter$getSwitchAvatarAnimatorSet$lambda$15$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$getSwitchAvatarAnimatorSet$lambda$15$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        java.lang.System.currentTimeMillis();
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f213824i;
        long j17 = g0Var.f391654d;
        g0Var.f391654d = java.lang.System.currentTimeMillis();
    }
}
