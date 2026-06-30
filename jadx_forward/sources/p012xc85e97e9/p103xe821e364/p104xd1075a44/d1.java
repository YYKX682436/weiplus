package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public abstract class d1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final float f93519d;

    /* renamed from: e, reason: collision with root package name */
    public final float f93520e;

    /* renamed from: f, reason: collision with root package name */
    public final float f93521f;

    /* renamed from: g, reason: collision with root package name */
    public final float f93522g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f93523h;

    /* renamed from: i, reason: collision with root package name */
    public final int f93524i;

    /* renamed from: m, reason: collision with root package name */
    public final android.animation.ValueAnimator f93525m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f93526n;

    /* renamed from: o, reason: collision with root package name */
    public float f93527o;

    /* renamed from: p, reason: collision with root package name */
    public float f93528p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f93529q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f93530r = false;

    /* renamed from: s, reason: collision with root package name */
    public float f93531s;

    public d1(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, int i18, float f17, float f18, float f19, float f27) {
        this.f93524i = i18;
        this.f93523h = k3Var;
        this.f93519d = f17;
        this.f93520e = f18;
        this.f93521f = f19;
        this.f93522g = f27;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f93525m = ofFloat;
        ofFloat.addUpdateListener(new p012xc85e97e9.p103xe821e364.p104xd1075a44.c1(this));
        ofFloat.setTarget(k3Var.f3639x46306858);
        ofFloat.addListener(this);
        this.f93531s = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f93531s = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (!this.f93530r) {
            this.f93523h.m8206x3c5056b8(true);
        }
        this.f93530r = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
