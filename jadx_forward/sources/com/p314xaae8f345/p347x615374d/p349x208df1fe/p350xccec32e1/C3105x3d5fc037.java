package com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1;

/* renamed from: com.tencent.kinda.framework.animate.KindaGlobalAnimator */
/* loaded from: classes15.dex */
public class C3105x3d5fc037 {

    /* renamed from: animateDuration */
    private static long f11846x5bde7395;

    /* renamed from: animateInterpolator */
    private static android.view.animation.Interpolator f11847x8a178648;

    /* renamed from: isAnimated */
    private static boolean f11848xa151d0ed;

    /* renamed from: animList */
    private static java.util.List<android.animation.Animator> f11844xd090764f = new java.util.ArrayList();

    /* renamed from: animSet */
    private static android.animation.AnimatorSet f11845xccebfc91 = null;

    /* renamed from: onComplete */
    private static java.lang.Runnable f11849x815f5438 = null;

    /* renamed from: addAnimator */
    public static void m24902x9687d6a8(android.animation.Animator animator) {
        f11844xd090764f.add(animator);
    }

    /* renamed from: animateDuration */
    public static long m24903x5bde7395() {
        return f11846x5bde7395;
    }

    /* renamed from: animateInterpolator */
    public static android.view.animation.Interpolator m24904x8a178648() {
        return f11847x8a178648;
    }

    /* renamed from: hasAnimate */
    public static boolean m24905x460ff6e7() {
        return f11848xa151d0ed && f11846x5bde7395 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupAnimate */
    public static void m24906x4a3e39a4(long j17, java.lang.Runnable runnable) {
        f11848xa151d0ed = true;
        f11846x5bde7395 = j17;
        f11849x815f5438 = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startAnimInternal */
    public static void m24908x8e29e170() {
        f11848xa151d0ed = false;
        f11846x5bde7395 = 0L;
        f11847x8a178648 = null;
        if (f11844xd090764f.size() > 0) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            f11845xccebfc91 = animatorSet;
            animatorSet.playTogether(f11844xd090764f);
            final java.lang.Runnable runnable = f11849x815f5438;
            if (runnable != null) {
                f11845xccebfc91.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.tencent.kinda.framework.animate.KindaGlobalAnimator.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        runnable.run();
                    }
                });
            }
            f11845xccebfc91.start();
            f11845xccebfc91 = null;
            f11844xd090764f.clear();
            f11849x815f5438 = null;
        }
    }

    /* renamed from: startAnimate */
    public static void m24909xc4e8b41f(final long j17, final java.lang.Runnable runnable) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.m24895x3498a0(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaGlobalAnimator.2
            @Override // java.lang.Runnable
            public void run() {
                long j18 = j17;
                if (j18 <= 0 || runnable == null) {
                    return;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24906x4a3e39a4(j18, null);
                runnable.run();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24908x8e29e170();
            }
        });
    }

    /* renamed from: startAnimateWithInterpolator */
    public static void m24911x719b2eec(final long j17, final java.lang.Runnable runnable, final android.view.animation.Interpolator interpolator) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.m24895x3498a0(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaGlobalAnimator.4
            @Override // java.lang.Runnable
            public void run() {
                long j18 = j17;
                if (j18 <= 0 || runnable == null) {
                    return;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24907x4a3e39a4(j18, null, interpolator);
                runnable.run();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24908x8e29e170();
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.f11849x815f5438 != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.f11849x815f5438.run();
                    java.lang.Runnable unused = com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.f11849x815f5438 = null;
                }
            }
        });
    }

    /* renamed from: startAnimate */
    public static void m24910xc4e8b41f(final long j17, final java.lang.Runnable runnable, final java.lang.Runnable runnable2) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.m24895x3498a0(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaGlobalAnimator.3
            @Override // java.lang.Runnable
            public void run() {
                long j18 = j17;
                if (j18 <= 0 || runnable == null) {
                    return;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24906x4a3e39a4(j18, runnable2);
                runnable.run();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24908x8e29e170();
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.f11849x815f5438 != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.f11849x815f5438.run();
                    java.lang.Runnable unused = com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.f11849x815f5438 = null;
                }
            }
        });
    }

    /* renamed from: startAnimateWithInterpolator */
    public static void m24912x719b2eec(final long j17, final java.lang.Runnable runnable, final java.lang.Runnable runnable2, final android.view.animation.Interpolator interpolator) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.m24895x3498a0(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.KindaGlobalAnimator.5
            @Override // java.lang.Runnable
            public void run() {
                long j18 = j17;
                if (j18 <= 0 || runnable == null) {
                    return;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24907x4a3e39a4(j18, runnable2, interpolator);
                runnable.run();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.m24908x8e29e170();
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.f11849x815f5438 != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.f11849x815f5438.run();
                    java.lang.Runnable unused = com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3105x3d5fc037.f11849x815f5438 = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupAnimate */
    public static void m24907x4a3e39a4(long j17, java.lang.Runnable runnable, android.view.animation.Interpolator interpolator) {
        f11848xa151d0ed = true;
        f11846x5bde7395 = j17;
        f11849x815f5438 = runnable;
        f11847x8a178648 = interpolator;
    }
}
