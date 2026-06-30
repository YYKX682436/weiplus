package db5;

/* loaded from: classes8.dex */
public final class k9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f309957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21533x4baf88da f309958e;

    public k9(int i17, int i18, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21533x4baf88da c21533x4baf88da, float f17, float f18) {
        this.f309957d = i17;
        this.f309958e = c21533x4baf88da;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        float f17 = this.f309957d + ((0 - r0) * animatedFraction);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21533x4baf88da c21533x4baf88da = this.f309958e;
        android.view.ViewGroup.LayoutParams layoutParams = c21533x4baf88da.f279223g.getLayoutParams();
        layoutParams.height = (int) f17;
        c21533x4baf88da.f279223g.setLayoutParams(layoutParams);
        float f18 = 270.0f + ((-180.0f) * animatedFraction);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c21533x4baf88da.f279233t;
        if (c22699x3dcdb352 == null) {
            return;
        }
        c22699x3dcdb352.setRotation(f18);
    }
}
