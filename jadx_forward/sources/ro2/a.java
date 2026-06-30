package ro2;

/* loaded from: classes2.dex */
public final class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f479550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f479551f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f479552g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479553h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f479554i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f479555m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f479556n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f479557o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f479558p;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, android.view.View view, in5.s0 s0Var, android.widget.FrameLayout frameLayout, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar2, android.view.View view2, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, boolean z17, android.view.View view3, android.view.View view4) {
        this.f479549d = qeVar;
        this.f479550e = view;
        this.f479551f = s0Var;
        this.f479552g = frameLayout;
        this.f479553h = qeVar2;
        this.f479554i = view2;
        this.f479555m = c22789xd23e9a9b;
        this.f479556n = z17;
        this.f479557o = view3;
        this.f479558p = view4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f479549d.K1(this.f479550e, 8);
        ro2.r.g(this.f479551f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f479552g.setVisibility(0);
        this.f479553h.K1(this.f479554i, 0);
        this.f479555m.g();
        if (this.f479556n) {
            i95.m c17 = i95.n0.c(zy2.s6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((ht2.y0) ((zy2.s6) c17)).Ai(this.f479557o, this.f479558p);
        }
    }
}
