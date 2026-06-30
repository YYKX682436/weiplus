package nf2;

/* loaded from: classes5.dex */
public final class h1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.i1 f418281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f418282e;

    public h1(nf2.i1 i1Var, yz5.a aVar) {
        this.f418281d = i1Var;
        this.f418282e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f418281d.f418289e = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        nf2.i1 i1Var = this.f418281d;
        i1Var.f418289e = false;
        android.view.View view = i1Var.f418287c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator$animateExpand$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator$animateExpand$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        nf2.i1.a(i1Var, i1Var.f418287c);
        yz5.a aVar = this.f418282e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LyricsCollapseAnimator", "animateExpand: completed");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f418281d.f418289e = true;
    }
}
