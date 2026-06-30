package vb4;

/* loaded from: classes4.dex */
public class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f516350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb4.n f516351e;

    public j(vb4.n nVar, android.view.View view) {
        this.f516351e = nVar;
        this.f516350d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$1");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
        this.f516351e.f516357o = floatValue;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
        this.f516350d.invalidateOutline();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$1");
    }
}
