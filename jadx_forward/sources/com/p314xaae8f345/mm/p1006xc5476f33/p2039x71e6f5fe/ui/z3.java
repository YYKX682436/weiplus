package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes13.dex */
public class z3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17315x949fc5b3 f241361d;

    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17315x949fc5b3 c17315x949fc5b3) {
        this.f241361d = c17315x949fc5b3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f241361d.f240995d.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
