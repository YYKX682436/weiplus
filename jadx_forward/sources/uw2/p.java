package uw2;

/* loaded from: classes.dex */
public final class p implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f513235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f513236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f513237f;

    public p(android.view.View view, android.view.MotionEvent motionEvent, float f17) {
        this.f513235d = view;
        this.f513236e = motionEvent;
        this.f513237f = f17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.view.View view = this.f513235d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconAppearAnimator$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconAppearAnimator$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f513235d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconAppearAnimator$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconAppearAnimator$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.MotionEvent motionEvent = this.f513236e;
        if (motionEvent != null) {
            android.view.View view3 = this.f513235d;
            view3.setTranslationX(0.0f);
            view3.setTranslationY(0.0f);
            view3.getLocationInWindow(new int[2]);
            view3.setTranslationX((motionEvent.getRawX() - r4[0]) - (view3.getWidth() / 2));
            view3.setTranslationY(((motionEvent.getRawY() - r4[1]) - (view3.getHeight() / 2)) + this.f513237f);
        }
        android.view.View view4 = this.f513235d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconAppearAnimator$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconAppearAnimator$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
