package ri2;

/* loaded from: classes10.dex */
public final class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ri2.j f477583d;

    public f(ri2.j jVar) {
        this.f477583d = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ri2.j jVar = this.f477583d;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = jVar.f477592b.f498674d.f498680g;
        if (!(y0Var != null ? p3325xe03a0797.p3326xc267989b.z0.h(y0Var) : false) || (view = jVar.f477599i) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback$postStartUserHideAnimation$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback$postStartUserHideAnimation$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ri2.j jVar = this.f477583d;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = jVar.f477592b.f498674d.f498680g;
        if (!(y0Var != null ? p3325xe03a0797.p3326xc267989b.z0.h(y0Var) : false) || (view = jVar.f477599i) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback$postStartUserHideAnimation$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback$postStartUserHideAnimation$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
