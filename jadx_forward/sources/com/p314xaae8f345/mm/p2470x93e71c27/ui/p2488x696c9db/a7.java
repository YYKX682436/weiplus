package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes3.dex */
public final class a7 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee f273047d;

    public a7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee c19739x911a23ee) {
        this.f273047d = c19739x911a23ee;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee c19739x911a23ee = this.f273047d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee.SeekBarCircleView seekBarCircleView = c19739x911a23ee.P;
        if (seekBarCircleView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBarPointNew");
            throw null;
        }
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        seekBarCircleView.setScaleX(((java.lang.Float) animatedValue).floatValue());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee.SeekBarCircleView seekBarCircleView2 = c19739x911a23ee.P;
        if (seekBarCircleView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBarPointNew");
            throw null;
        }
        java.lang.Object animatedValue2 = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        seekBarCircleView2.setScaleY(((java.lang.Float) animatedValue2).floatValue());
    }
}
