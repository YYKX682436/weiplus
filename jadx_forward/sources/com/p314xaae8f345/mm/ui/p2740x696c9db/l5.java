package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public abstract class l5 {
    public static final void a(android.view.View view, long j17, float f17, float f18, com.p314xaae8f345.mm.ui.p2740x696c9db.k5 k5Var) {
        if (view == null || fp.h.a(14)) {
            return;
        }
        android.animation.Animator animator = (android.animation.Animator) view.getTag(com.p314xaae8f345.mm.R.id.lcg);
        if (animator != null) {
            animator.cancel();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Changelcai", "[animTran] target %s, duration:%s x:%s", view, java.lang.Long.valueOf(j17), java.lang.Float.valueOf(f17));
        view.animate().cancel();
        view.animate().setListener(null);
        android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(view.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559355cg);
        if (k5Var == null) {
            view.animate().setDuration(j17).translationX(f17).translationY(f18).setInterpolator(loadInterpolator);
        } else {
            view.animate().setDuration(j17).translationX(f17).translationY(f18).setInterpolator(loadInterpolator).setListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.j5(k5Var));
        }
    }

    public static void b(android.view.View view, android.animation.Animator.AnimatorListener animatorListener) {
        if (view == null || fp.h.a(11)) {
            return;
        }
        android.animation.Animator animator = (android.animation.Animator) view.getTag(com.p314xaae8f345.mm.R.id.lcg);
        if (animator != null) {
            animator.cancel();
        }
        android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(view.getContext(), com.p314xaae8f345.mm.R.C30855xd09a2ae7.f559493e);
        loadAnimator.setTarget(view);
        if (animatorListener != null) {
            loadAnimator.addListener(animatorListener);
        }
        loadAnimator.start();
        view.setTag(com.p314xaae8f345.mm.R.id.lcg, loadAnimator);
    }

    public static final void c(android.view.View view, float f17, float f18) {
        if (view == null || fp.h.a(14)) {
            return;
        }
        android.animation.Animator animator = (android.animation.Animator) view.getTag(com.p314xaae8f345.mm.R.id.lcg);
        if (animator != null) {
            animator.cancel();
        }
        view.animate().cancel();
        view.setTranslationX(f17);
        view.setTranslationY(f18);
    }
}
