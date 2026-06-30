package db5;

/* loaded from: classes8.dex */
public final class j9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f309946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21533x4baf88da f309947e;

    public j9(int i17, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21533x4baf88da c21533x4baf88da, float f17, float f18) {
        this.f309946d = i17;
        this.f309947e = c21533x4baf88da;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21533x4baf88da c21533x4baf88da = this.f309947e;
        android.view.ViewGroup.LayoutParams layoutParams = c21533x4baf88da.f279223g.getLayoutParams();
        layoutParams.height = (int) (this.f309946d * animatedFraction);
        c21533x4baf88da.f279223g.setLayoutParams(layoutParams);
        float f17 = 90.0f + (180.0f * animatedFraction);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c21533x4baf88da.f279233t;
        if (c22699x3dcdb352 == null) {
            return;
        }
        c22699x3dcdb352.setRotation(f17);
    }
}
