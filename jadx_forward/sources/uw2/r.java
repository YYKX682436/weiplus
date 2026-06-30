package uw2;

/* loaded from: classes2.dex */
public final class r implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f513239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f513240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f513241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f513242g;

    public r(android.view.View view, boolean z17, boolean z18, android.view.View view2) {
        this.f513239d = view;
        this.f513240e = z17;
        this.f513241f = z18;
        this.f513242g = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        if (this.f513241f) {
            android.view.View view = this.f513242g;
            view.post(new uw2.u(view));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = this.f513239d;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        android.view.View view2 = this.f513239d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconDisappearAnimator$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconDisappearAnimator$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        android.view.View view3 = this.f513239d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconDisappearAnimator$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconDisappearAnimator$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f513240e) {
            view.post(new uw2.t(view));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
