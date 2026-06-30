package cl1;

/* loaded from: classes8.dex */
public class e0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 f124396d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 abstractGestureDetectorOnGestureListenerC12768x381d68c7) {
        this.f124396d = abstractGestureDetectorOnGestureListenerC12768x381d68c7;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 abstractGestureDetectorOnGestureListenerC12768x381d68c7 = this.f124396d;
        abstractGestureDetectorOnGestureListenerC12768x381d68c7.removeView(abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172644o);
        abstractGestureDetectorOnGestureListenerC12768x381d68c7.j();
        abstractGestureDetectorOnGestureListenerC12768x381d68c7.mo53360x389f1734(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
