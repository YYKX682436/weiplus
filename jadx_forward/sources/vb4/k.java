package vb4;

/* loaded from: classes4.dex */
public class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f516352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb4.n f516353e;

    public k(vb4.n nVar, android.animation.ValueAnimator valueAnimator) {
        this.f516353e = nVar;
        this.f516352d = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$2");
        vb4.n nVar = this.f516353e;
        if (nVar.f516329c != null) {
            nVar.f516329c.b(((java.lang.Float) this.f516352d.getAnimatedValue()).floatValue());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$2");
    }
}
