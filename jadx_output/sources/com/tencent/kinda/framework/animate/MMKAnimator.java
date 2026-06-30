package com.tencent.kinda.framework.animate;

/* loaded from: classes15.dex */
public class MMKAnimator implements com.tencent.kinda.gen.KindaAnimator {
    @Override // com.tencent.kinda.gen.KindaAnimator
    public void startAnimationImpl(float f17, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.startAnimate(f17 * 1000.0f, new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.MMKAnimator.1
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.kinda.gen.VoidCallback voidCallback2 = voidCallback;
                if (voidCallback2 != null) {
                    voidCallback2.call();
                }
            }
        });
    }

    @Override // com.tencent.kinda.gen.KindaAnimator
    public void startLinearAnimationImpl(float f17, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.startAnimateWithInterpolator(f17 * 1000.0f, new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.MMKAnimator.4
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.kinda.gen.VoidCallback voidCallback2 = voidCallback;
                if (voidCallback2 != null) {
                    voidCallback2.call();
                }
            }
        }, new android.view.animation.LinearInterpolator());
    }

    @Override // com.tencent.kinda.gen.KindaAnimator
    public void startShakeRotateImpl(com.tencent.kinda.gen.KView kView, com.tencent.kinda.gen.VoidCallback voidCallback) {
    }

    @Override // com.tencent.kinda.gen.KindaAnimator
    public void startAnimationImpl(float f17, final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2) {
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.startAnimate(f17 * 1000.0f, new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.MMKAnimator.2
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback;
                if (voidCallback3 != null) {
                    voidCallback3.call();
                }
            }
        }, new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.MMKAnimator.3
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback2;
                if (voidCallback3 != null) {
                    voidCallback3.call();
                }
            }
        });
    }

    @Override // com.tencent.kinda.gen.KindaAnimator
    public void startLinearAnimationImpl(float f17, final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2) {
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.startAnimateWithInterpolator(f17 * 1000.0f, new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.MMKAnimator.5
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback;
                if (voidCallback3 != null) {
                    voidCallback3.call();
                }
            }
        }, new java.lang.Runnable() { // from class: com.tencent.kinda.framework.animate.MMKAnimator.6
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback2;
                if (voidCallback3 != null) {
                    voidCallback3.call();
                }
            }
        }, new android.view.animation.LinearInterpolator());
    }
}
