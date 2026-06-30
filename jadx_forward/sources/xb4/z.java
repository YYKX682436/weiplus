package xb4;

/* loaded from: classes4.dex */
public class z implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.d0 f534536d;

    public z(xb4.d0 d0Var) {
        this.f534536d = d0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$1");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue != 0.0f) {
            xb4.d0 d0Var = this.f534536d;
            xb4.d0.b(d0Var).E0.setScaleX(floatValue);
            xb4.d0.b(d0Var).E0.setScaleY(floatValue);
            xb4.d0.b(d0Var).E0.setAlpha(floatValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$1");
    }
}
