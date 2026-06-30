package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public abstract class d1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final float f11986d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11987e;

    /* renamed from: f, reason: collision with root package name */
    public final float f11988f;

    /* renamed from: g, reason: collision with root package name */
    public final float f11989g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.k3 f11990h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11991i;

    /* renamed from: m, reason: collision with root package name */
    public final android.animation.ValueAnimator f11992m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11993n;

    /* renamed from: o, reason: collision with root package name */
    public float f11994o;

    /* renamed from: p, reason: collision with root package name */
    public float f11995p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11996q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11997r = false;

    /* renamed from: s, reason: collision with root package name */
    public float f11998s;

    public d1(androidx.recyclerview.widget.k3 k3Var, int i17, int i18, float f17, float f18, float f19, float f27) {
        this.f11991i = i18;
        this.f11990h = k3Var;
        this.f11986d = f17;
        this.f11987e = f18;
        this.f11988f = f19;
        this.f11989g = f27;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11992m = ofFloat;
        ofFloat.addUpdateListener(new androidx.recyclerview.widget.c1(this));
        ofFloat.setTarget(k3Var.itemView);
        ofFloat.addListener(this);
        this.f11998s = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f11998s = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (!this.f11997r) {
            this.f11990h.setIsRecyclable(true);
        }
        this.f11997r = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
