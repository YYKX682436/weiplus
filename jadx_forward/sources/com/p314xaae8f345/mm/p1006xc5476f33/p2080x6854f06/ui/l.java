package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes12.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.k {

    /* renamed from: g, reason: collision with root package name */
    public final int f243825g;

    /* renamed from: h, reason: collision with root package name */
    public final int f243826h;

    /* renamed from: i, reason: collision with root package name */
    public final float f243827i;

    /* renamed from: m, reason: collision with root package name */
    public final float f243828m;

    /* renamed from: n, reason: collision with root package name */
    public float f243829n;

    /* renamed from: o, reason: collision with root package name */
    public float f243830o;

    /* renamed from: p, reason: collision with root package name */
    public final float f243831p;

    /* renamed from: q, reason: collision with root package name */
    public float f243832q;

    /* renamed from: r, reason: collision with root package name */
    public float f243833r;

    /* renamed from: s, reason: collision with root package name */
    public float f243834s;

    /* renamed from: t, reason: collision with root package name */
    public float f243835t;

    /* renamed from: u, reason: collision with root package name */
    public float f243836u;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.C17663x54eef15d c17663x54eef15d, int i17, int i18) {
        super(c17663x54eef15d);
        this.f243831p = 0.01f;
        this.f243832q = 0.02f;
        this.f243825g = i17;
        this.f243826h = i18;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.C17663x54eef15d.f243624e;
        float random = 0.1f + (((float) java.lang.Math.random()) * 0.79999995f);
        this.f243827i = random;
        this.f243828m = random;
        this.f243830o = (-0.3f) + (((float) java.lang.Math.random()) * 0.20000002f);
        a();
    }

    public final void a() {
        float f17 = this.f243830o;
        if (f17 > 0.0f) {
            this.f243832q += this.f243831p;
        }
        this.f243829n = f17;
        this.f243830o = this.f243832q + f17;
        if (f17 > 1.1f) {
            iz5.a.g(null, this.f243819d != null);
            this.f243819d.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.j(this));
        }
        float f18 = this.f243825g;
        this.f243833r = this.f243827i * f18;
        this.f243834s = this.f243828m * f18;
        float f19 = this.f243829n;
        float f27 = this.f243826h;
        this.f243835t = f19 * f27;
        this.f243836u = this.f243830o * f27;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        float f18 = this.f243833r;
        float f19 = this.f243835t;
        float f27 = this.f243834s;
        if (f18 != f27) {
            f18 += (f27 - f18) * f17;
        }
        float f28 = this.f243836u;
        if (f19 != f28) {
            f19 += (f28 - f19) * f17;
        }
        transformation.getMatrix().setTranslate(f18, f19);
        if (f17 == 1.0f) {
            a();
        }
    }

    @Override // android.view.animation.Animation
    public void initialize(int i17, int i18, int i19, int i27) {
        super.initialize(i17, i18, i19, i27);
        setRepeatCount(-1);
        setDuration(this.f243820e);
    }
}
