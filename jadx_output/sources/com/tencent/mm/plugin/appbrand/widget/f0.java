package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public interface f0 {
    static /* synthetic */ void e0(com.tencent.mm.plugin.appbrand.widget.f0 f0Var, com.tencent.mm.plugin.appbrand.widget.c0 c0Var, android.animation.AnimatorListenerAdapter animatorListenerAdapter, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateContainer");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        f0Var.Z(c0Var, animatorListenerAdapter, z17);
    }

    void T(int i17);

    boolean U(android.view.MotionEvent motionEvent);

    void V(int i17, int i18, int i19, int i27);

    boolean W(android.animation.Animator.AnimatorListener animatorListener);

    void X(int i17, int i18);

    void Y();

    void Z(com.tencent.mm.plugin.appbrand.widget.c0 c0Var, android.animation.AnimatorListenerAdapter animatorListenerAdapter, boolean z17);

    boolean a0(android.view.MotionEvent motionEvent);

    void b0(com.tencent.mm.plugin.appbrand.widget.e0 e0Var);

    void c0(boolean z17);

    void d0(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29);

    com.tencent.mm.plugin.appbrand.widget.o0 getCurrentStatus();
}
