package cl1;

/* loaded from: classes8.dex */
public class h0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 f124405d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 abstractGestureDetectorOnGestureListenerC12768x381d68c7) {
        this.f124405d = abstractGestureDetectorOnGestureListenerC12768x381d68c7;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        float f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7.F;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 abstractGestureDetectorOnGestureListenerC12768x381d68c7 = this.f124405d;
        abstractGestureDetectorOnGestureListenerC12768x381d68c7.j();
        abstractGestureDetectorOnGestureListenerC12768x381d68c7.requestLayout();
        abstractGestureDetectorOnGestureListenerC12768x381d68c7.post(new java.lang.Runnable() { // from class: cl1.h0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 abstractGestureDetectorOnGestureListenerC12768x381d68c72 = cl1.h0.this.f124405d;
                abstractGestureDetectorOnGestureListenerC12768x381d68c72.f172650u.a();
                abstractGestureDetectorOnGestureListenerC12768x381d68c72.f172651v.a();
            }
        });
        if (abstractGestureDetectorOnGestureListenerC12768x381d68c7.A) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172639g;
            if (c1163xf1deaba4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12769x6c13eef8) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12769x6c13eef8) c1163xf1deaba4).m53375x628fcce5(false);
                abstractGestureDetectorOnGestureListenerC12768x381d68c7.A = false;
                abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172654y = false;
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
