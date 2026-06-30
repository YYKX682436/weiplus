package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public class q2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 f284130d;

    public q2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16) {
        this.f284130d = c21614x5c06ae16;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        android.animation.ObjectAnimator objectAnimator;
        android.animation.ObjectAnimator objectAnimator2;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16 = this.f284130d;
        if (c21614x5c06ae16.Q) {
            if (c21614x5c06ae16.I == null) {
                c21614x5c06ae16.I = new android.view.animation.LinearInterpolator();
            }
            if (c21614x5c06ae16.f279722J == null) {
                c21614x5c06ae16.f279722J = new android.view.animation.LinearInterpolator();
            }
            float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            int i17 = c21614x5c06ae16.K;
            if (i17 == 2) {
                c21614x5c06ae16.H = c21614x5c06ae16.f279728i - c21614x5c06ae16.L;
            } else if (i17 == 3) {
                float f17 = c21614x5c06ae16.f279728i;
                c21614x5c06ae16.G = c21614x5c06ae16.C * f17;
                c21614x5c06ae16.H = f17 * c21614x5c06ae16.D;
            }
            float f18 = c21614x5c06ae16.E;
            float interpolation = f18 + ((c21614x5c06ae16.F - f18) * c21614x5c06ae16.I.getInterpolation(floatValue));
            float f19 = c21614x5c06ae16.G;
            float interpolation2 = f19 + ((c21614x5c06ae16.H - f19) * c21614x5c06ae16.f279722J.getInterpolation(floatValue));
            com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = c21614x5c06ae16.f279737u;
            if (c16077xb54fe366 != null) {
                c16077xb54fe366.setX(interpolation);
                c21614x5c06ae16.f279737u.setY(interpolation2);
                boolean z17 = c21614x5c06ae16.f279741y;
                float f27 = c21614x5c06ae16.f279740x;
                if (!z17 && floatValue > f27) {
                    c21614x5c06ae16.f279741y = true;
                    if (c21614x5c06ae16.f279737u != null && (objectAnimator2 = c21614x5c06ae16.T) != null && c21614x5c06ae16.Q) {
                        objectAnimator2.start();
                    }
                }
                if (c21614x5c06ae16.f279742z || floatValue <= f27 * 3.0f) {
                    return;
                }
                c21614x5c06ae16.f279742z = true;
                if (c21614x5c06ae16.f279737u == null || (objectAnimator = c21614x5c06ae16.T) == null || !c21614x5c06ae16.Q) {
                    return;
                }
                objectAnimator.start();
            }
        }
    }
}
