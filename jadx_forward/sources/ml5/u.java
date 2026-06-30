package ml5;

/* loaded from: classes10.dex */
public final class u implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ml5.j f409983d;

    public u(ml5.j jVar) {
        this.f409983d = jVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CropLayout", "onAnimationEnd!!");
        ml5.j jVar = this.f409983d;
        if (jVar != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d = ((al5.e4) jVar).f87418a;
            scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81478xba667661(false);
            scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.f292994h = true;
            scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.f292997n = false;
            al5.z3 doubleTapListener = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.getDoubleTapListener();
            if (doubleTapListener != null) {
                doubleTapListener.a();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ml5.j jVar = this.f409983d;
        if (jVar != null) {
            ((al5.e4) jVar).f87418a.m81478xba667661(true);
        }
    }
}
