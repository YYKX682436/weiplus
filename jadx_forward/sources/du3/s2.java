package du3;

/* loaded from: classes3.dex */
public final class s2 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f325230f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f325231g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f325232h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f325233i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f325234m;

    /* renamed from: n, reason: collision with root package name */
    public hk0.z0 f325235n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f325236o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f325230f = parent;
        this.f325231g = jz5.h.b(new du3.n2(this));
        this.f325232h = jz5.h.b(new du3.h2(this));
        this.f325233i = jz5.h.b(new du3.m2(this));
        this.f325234m = jz5.h.b(new du3.i2(this));
        this.f325235n = hk0.z0.f363396e;
        this.f325236o = jz5.h.b(new du3.r2(this));
    }

    public final android.widget.FrameLayout A() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f325232h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.FrameLayout) mo141623x754a37bb;
    }

    public final android.widget.FrameLayout B() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f325234m).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.FrameLayout) mo141623x754a37bb;
    }

    public final android.widget.FrameLayout C() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f325233i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.FrameLayout) mo141623x754a37bb;
    }

    public final hk0.u0 D() {
        return (hk0.u0) ((jz5.n) this.f325236o).mo141623x754a37bb();
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        D().Z6(5, new du3.o2(this));
        hk0.u0 D = D();
        du3.p2 p2Var = new du3.p2(this);
        D.getClass();
        D.f363350h.mo7806x9d92d11c(D.f363346d, p2Var);
        D().a7(1, new du3.q2(this));
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        B().setBackground(null);
        hk0.z0 z0Var = this.f325235n;
        if (z0Var == hk0.z0.f363397f) {
            A().setScaleX(1.0f);
            A().setScaleY(1.0f);
        } else if (z0Var == hk0.z0.f363396e) {
            C().setScaleX(1.0f);
            C().setScaleY(1.0f);
        }
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        A().setOnClickListener(new du3.j2(this));
        C().setOnClickListener(new du3.k2(this));
        B().setOnClickListener(new du3.l2(this));
        C().setScaleX(1.4f);
        C().setScaleY(1.4f);
    }

    public final void z(android.view.View view, float f17) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", f17);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", f17);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
