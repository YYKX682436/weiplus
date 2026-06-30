package xb4;

/* loaded from: classes4.dex */
public class b0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.d0 f534449d;

    public b0(xb4.d0 d0Var) {
        this.f534449d = d0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$3");
        xb4.d0.b(this.f534449d).F0.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$3");
    }
}
