package com.tencent.kinda.framework.animate;

/* loaded from: classes15.dex */
public class KindaGlobalAnimator {
    private static long animateDuration;
    private static android.view.animation.Interpolator animateInterpolator;
    private static boolean isAnimated;
    private static java.util.List<android.animation.Animator> animList = new java.util.ArrayList();
    private static android.animation.AnimatorSet animSet = null;
    private static java.lang.Runnable onComplete = null;

    public static void addAnimator(android.animation.Animator animator) {
        animList.add(animator);
    }

    public static long animateDuration() {
        return animateDuration;
    }

    public static android.view.animation.Interpolator animateInterpolator() {
        return animateInterpolator;
    }

    public static boolean hasAnimate() {
        return isAnimated && animateDuration > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setupAnimate(long j17, java.lang.Runnable runnable) {
        isAnimated = true;
        animateDuration = j17;
        onComplete = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void startAnimInternal() {
        isAnimated = false;
        animateDuration = 0L;
        animateInterpolator = null;
        if (animList.size() > 0) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animSet = animatorSet;
            animatorSet.playTogether(animList);
            final java.lang.Runnable runnable = onComplete;
            if (runnable != null) {
                animSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.tencent.kinda.framework.animate.KindaGlobalAnimator.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        runnable.run();
                    }
                });
            }
            animSet.start();
            animSet = null;
            animList.clear();
            onComplete = null;
        }
    }

    public static void startAnimate(final long j17, final java.lang.Runnable runnable) {
        com.tencent.kinda.framework.animate.KindaAnimatorWatch.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaGlobalAnimator.2
            @Override // java.lang.Runnable
            public void run() {
                long j18 = j17;
                if (j18 <= 0 || runnable == null) {
                    return;
                }
                com.tencent.kinda.framework.animate.KindaGlobalAnimator.setupAnimate(j18, null);
                runnable.run();
                com.tencent.kinda.framework.animate.KindaGlobalAnimator.startAnimInternal();
            }
        });
    }

    public static void startAnimateWithInterpolator(final long j17, final java.lang.Runnable runnable, final android.view.animation.Interpolator interpolator) {
        com.tencent.kinda.framework.animate.KindaAnimatorWatch.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaGlobalAnimator.4
            @Override // java.lang.Runnable
            public void run() {
                long j18 = j17;
                if (j18 <= 0 || runnable == null) {
                    return;
                }
                com.tencent.kinda.framework.animate.KindaGlobalAnimator.setupAnimate(j18, null, interpolator);
                runnable.run();
                com.tencent.kinda.framework.animate.KindaGlobalAnimator.startAnimInternal();
                if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.onComplete != null) {
                    com.tencent.kinda.framework.animate.KindaGlobalAnimator.onComplete.run();
                    java.lang.Runnable unused = com.tencent.kinda.framework.animate.KindaGlobalAnimator.onComplete = null;
                }
            }
        });
    }

    public static void startAnimate(final long j17, final java.lang.Runnable runnable, final java.lang.Runnable runnable2) {
        com.tencent.kinda.framework.animate.KindaAnimatorWatch.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaGlobalAnimator.3
            @Override // java.lang.Runnable
            public void run() {
                long j18 = j17;
                if (j18 <= 0 || runnable == null) {
                    return;
                }
                com.tencent.kinda.framework.animate.KindaGlobalAnimator.setupAnimate(j18, runnable2);
                runnable.run();
                com.tencent.kinda.framework.animate.KindaGlobalAnimator.startAnimInternal();
                if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.onComplete != null) {
                    com.tencent.kinda.framework.animate.KindaGlobalAnimator.onComplete.run();
                    java.lang.Runnable unused = com.tencent.kinda.framework.animate.KindaGlobalAnimator.onComplete = null;
                }
            }
        });
    }

    public static void startAnimateWithInterpolator(final long j17, final java.lang.Runnable runnable, final java.lang.Runnable runnable2, final android.view.animation.Interpolator interpolator) {
        com.tencent.kinda.framework.animate.KindaAnimatorWatch.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaGlobalAnimator.5
            @Override // java.lang.Runnable
            public void run() {
                long j18 = j17;
                if (j18 <= 0 || runnable == null) {
                    return;
                }
                com.tencent.kinda.framework.animate.KindaGlobalAnimator.setupAnimate(j18, runnable2, interpolator);
                runnable.run();
                com.tencent.kinda.framework.animate.KindaGlobalAnimator.startAnimInternal();
                if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.onComplete != null) {
                    com.tencent.kinda.framework.animate.KindaGlobalAnimator.onComplete.run();
                    java.lang.Runnable unused = com.tencent.kinda.framework.animate.KindaGlobalAnimator.onComplete = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setupAnimate(long j17, java.lang.Runnable runnable, android.view.animation.Interpolator interpolator) {
        isAnimated = true;
        animateDuration = j17;
        onComplete = runnable;
        animateInterpolator = interpolator;
    }
}
