package uu3;

/* loaded from: classes5.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6 f512803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f512804e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6 abstractGestureDetectorOnGestureListenerC17037xc8d40da6, float f17) {
        this.f512803d = abstractGestureDetectorOnGestureListenerC17037xc8d40da6;
        this.f512804e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f512803d.k(this.f512804e, "settle");
    }
}
