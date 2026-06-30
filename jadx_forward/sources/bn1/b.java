package bn1;

/* loaded from: classes14.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313 f104318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f104319e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313 abstractGestureDetectorOnGestureListenerC12829xf500c313, float f17) {
        this.f104318d = abstractGestureDetectorOnGestureListenerC12829xf500c313;
        this.f104319e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f104318d.i(this.f104319e, "settle");
    }
}
