package gx2;

/* loaded from: classes2.dex */
public final class u extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1 f358920d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1 abstractGestureDetectorOnGestureListenerC15396x3fa945f1) {
        this.f358920d = abstractGestureDetectorOnGestureListenerC15396x3fa945f1;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f358920d.m62650xcc16a5ca(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        gx2.s sVar = gx2.s.f358916g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1 abstractGestureDetectorOnGestureListenerC15396x3fa945f1 = this.f358920d;
        abstractGestureDetectorOnGestureListenerC15396x3fa945f1.m62640xee20281a(sVar);
        abstractGestureDetectorOnGestureListenerC15396x3fa945f1.m62650xcc16a5ca(false);
    }
}
