package gx2;

/* loaded from: classes2.dex */
public final class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1 f358918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f358919e;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1 abstractGestureDetectorOnGestureListenerC15396x3fa945f1, float f17) {
        this.f358918d = abstractGestureDetectorOnGestureListenerC15396x3fa945f1;
        this.f358919e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f358918d.l(this.f358919e, "settle");
    }
}
