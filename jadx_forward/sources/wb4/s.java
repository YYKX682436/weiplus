package wb4;

/* loaded from: classes4.dex */
public class s implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb4.u f525957d;

    public s(wb4.u uVar) {
        this.f525957d = uVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$1");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue != 0.0f) {
            wb4.u uVar = this.f525957d;
            wb4.u.b(uVar).f310323t.setScaleX(floatValue);
            wb4.u.b(uVar).f310323t.setScaleY(floatValue);
            wb4.u.b(uVar).f310323t.setAlpha(floatValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$1");
    }
}
