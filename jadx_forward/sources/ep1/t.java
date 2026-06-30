package ep1;

/* loaded from: classes3.dex */
public final class t extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f337204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f337205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337206f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337207g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f337208h;

    public t(android.animation.AnimatorListenerAdapter animatorListenerAdapter, int i17, android.view.View view, android.view.View view2, android.graphics.drawable.Drawable drawable) {
        this.f337204d = animatorListenerAdapter;
        this.f337205e = i17;
        this.f337206f = view;
        this.f337207g = view2;
        this.f337208h = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ep1.u uVar = ep1.u.f337209a;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f337204d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animation);
        }
        if (this.f337205e == 2) {
            android.view.View view = this.f337206f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f337206f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f337204d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animation);
        }
        if (this.f337205e != 2) {
            android.view.View view = this.f337207g;
            if (view != null) {
                view.setBackgroundColor(0);
            }
            if (view == null) {
                return;
            }
            view.setBackground(this.f337208h);
            return;
        }
        android.view.View view2 = this.f337206f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f337206f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f337204d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationPause(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f337204d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationRepeat(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f337204d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationResume(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallPageAnimator", "handlePageAnimation start onAnimationStart");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f337204d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animation);
        }
    }
}
