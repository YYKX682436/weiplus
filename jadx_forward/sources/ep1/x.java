package ep1;

/* loaded from: classes14.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f337220a;

    /* renamed from: b, reason: collision with root package name */
    public android.animation.Animator f337221b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.Animator f337222c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Vector f337223d = new java.util.Vector();

    public x(android.view.View view) {
        this.f337220a = view;
    }

    public android.animation.Animator a(boolean z17, int i17, boolean z18, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.view.View view = this.f337220a;
        android.animation.ObjectAnimator ofFloat = z17 ? z18 ? android.animation.ObjectAnimator.ofFloat(view, "translationX", -i17, 0.0f) : android.animation.ObjectAnimator.ofFloat(view, "translationX", i17, 0.0f) : z18 ? android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, -i17) : android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, i17);
        ofFloat.setDuration(300L);
        animatorSet.playTogether(ofFloat);
        if (animatorListenerAdapter != null) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        return animatorSet;
    }

    public void b() {
        java.util.Vector vector = this.f337223d;
        if (vector.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "firePendingTasks, size:%s", java.lang.Integer.valueOf(vector.size()));
        java.util.Iterator it = vector.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        vector.clear();
    }

    public boolean c() {
        android.animation.Animator animator = this.f337222c;
        return animator != null && animator.isRunning();
    }

    public boolean d() {
        android.animation.Animator animator = this.f337221b;
        return animator != null && animator.isRunning();
    }

    public void e(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        android.view.View view = this.f337220a;
        if (view == null) {
            return;
        }
        if (c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingHide");
            return;
        }
        if (d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "cancel show animator");
            this.f337221b.cancel();
        }
        ep1.v vVar = new ep1.v(this, view, animatorListenerAdapter);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(100L);
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(vVar);
        this.f337222c = animatorSet;
        animatorSet.start();
    }

    public void f(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        android.view.View view = this.f337220a;
        if (view == null) {
            return;
        }
        if (d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingShow");
            return;
        }
        if (c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "cancel hide animator");
            this.f337222c.cancel();
        }
        ep1.w wVar = new ep1.w(this, view, animatorListenerAdapter);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(200L);
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(wVar);
        this.f337221b = animatorSet;
        animatorSet.start();
        android.view.View view2 = this.f337220a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler", "playShowAnimation", "(Landroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler", "playShowAnimation", "(Landroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
