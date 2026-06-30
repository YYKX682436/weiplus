package vw2;

/* loaded from: classes2.dex */
public final class m implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f522395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f522396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f522397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f522398g;

    public m(int i17, in5.s0 s0Var, int i18, in5.s0 s0Var2) {
        this.f522395d = i17;
        this.f522396e = s0Var;
        this.f522397f = i18;
        this.f522398g = s0Var2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        vw2.n.f522401g.remove(java.lang.Integer.valueOf(this.f522397f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ToolbarButtonCarouselAnimationHelper", "startButtonEduAnimation: animation onCancel. holder=" + this.f522398g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        vw2.n.f522401g.remove(java.lang.Integer.valueOf(this.f522395d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ToolbarButtonCarouselAnimationHelper", "startButtonEduAnimation: animation onEnd. holder=" + this.f522396e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
