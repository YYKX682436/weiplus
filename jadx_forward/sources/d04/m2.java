package d04;

/* loaded from: classes8.dex */
public final class m2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17346xe5e5429e f306997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f306998e;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17346xe5e5429e c17346xe5e5429e, float f17) {
        this.f306997d = c17346xe5e5429e;
        this.f306998e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17346xe5e5429e c17346xe5e5429e = this.f306997d;
        if (animatedFraction <= 0.3f) {
            c17346xe5e5429e.setAlpha(animatedFraction / 0.3f);
            c17346xe5e5429e.setScaleX(1.0f);
            c17346xe5e5429e.setScaleY(1.0f);
        } else {
            float f17 = this.f306998e;
            if (animatedFraction <= 0.5f) {
                float f18 = 1 + (((animatedFraction - 0.3f) / 0.2f) * f17);
                c17346xe5e5429e.setAlpha(1.0f);
                c17346xe5e5429e.setScaleX(f18);
                c17346xe5e5429e.setScaleY(f18);
            } else if (animatedFraction <= 0.7f) {
                float f19 = 1 + (((0.7f - animatedFraction) / 0.2f) * f17);
                c17346xe5e5429e.setAlpha(1.0f);
                c17346xe5e5429e.setScaleX(f19);
                c17346xe5e5429e.setScaleY(f19);
            } else {
                c17346xe5e5429e.setAlpha(1.0f);
                c17346xe5e5429e.setScaleX(1.0f);
                c17346xe5e5429e.setScaleY(1.0f);
            }
        }
        c17346xe5e5429e.getAlpha();
        c17346xe5e5429e.getScaleY();
    }
}
