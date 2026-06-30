package bn1;

/* loaded from: classes14.dex */
public final class c extends bn1.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313 f104321d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313 abstractGestureDetectorOnGestureListenerC12829xf500c313) {
        this.f104321d = abstractGestureDetectorOnGestureListenerC12829xf500c313;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f104321d.m53927xcc16a5ca(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f104321d.m53927xcc16a5ca(false);
    }
}
