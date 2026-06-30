package lm4;

/* loaded from: classes14.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2304x373aa5.AbstractGestureDetectorOnGestureListenerC18733xe073c388 f401097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f401098e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2304x373aa5.AbstractGestureDetectorOnGestureListenerC18733xe073c388 abstractGestureDetectorOnGestureListenerC18733xe073c388, float f17) {
        this.f401097d = abstractGestureDetectorOnGestureListenerC18733xe073c388;
        this.f401098e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f401097d.i(this.f401098e, "settle");
    }
}
