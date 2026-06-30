package ox2;

/* loaded from: classes2.dex */
public final class i0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.r6 f431204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f431205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431206f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f431207g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f431208h;

    public i0(zy2.r6 r6Var, android.view.ViewGroup viewGroup, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var) {
        this.f431204d = r6Var;
        this.f431205e = viewGroup;
        this.f431206f = view;
        this.f431207g = qeVar;
        this.f431208h = s0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f431204d.getClass();
        android.view.ViewGroup viewGroup = this.f431205e;
        android.view.View view = this.f431206f;
        viewGroup.addView(view);
        view.post(new ox2.n0(view, this.f431207g, this.f431208h));
        if (view instanceof com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) {
            ((com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) view).g();
        }
    }
}
