package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes8.dex */
public class e4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.n4 f291906d;

    public e4(com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var, com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var) {
        this.f291906d = n4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var = this.f291906d;
        if (n4Var instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.o4) {
            ((com.p314xaae8f345.mm.ui.p2740x696c9db.o4) n4Var).b(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
