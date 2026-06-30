package vw2;

/* loaded from: classes2.dex */
public final class h implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f522377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f522378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vw2.b f522379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f522380g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f522381h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vw2.b f522382i;

    public h(yz5.a aVar, in5.s0 s0Var, vw2.b bVar, yz5.a aVar2, in5.s0 s0Var2, vw2.b bVar2) {
        this.f522377d = aVar;
        this.f522378e = s0Var;
        this.f522379f = bVar;
        this.f522380g = aVar2;
        this.f522381h = s0Var2;
        this.f522382i = bVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f522380g.mo152xb9724478();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ToolbarButtonCarouselAnimationHelper", "getSingleButtonEduAnimator: single animation onCancel. holder=" + this.f522381h + ", data=" + this.f522382i);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f522377d.mo152xb9724478();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ToolbarButtonCarouselAnimationHelper", "getSingleButtonEduAnimator: single animation onEnd. holder=" + this.f522378e + ", data=" + this.f522379f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
