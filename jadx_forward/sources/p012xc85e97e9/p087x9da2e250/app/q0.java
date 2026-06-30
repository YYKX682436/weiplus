package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class q0 extends android.view.animation.AnimationSet implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f92984d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f92985e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92986f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f92987g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f92988h;

    public q0(android.view.animation.Animation animation, android.view.ViewGroup viewGroup, android.view.View view) {
        super(false);
        this.f92988h = true;
        this.f92984d = viewGroup;
        this.f92985e = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j17, android.view.animation.Transformation transformation) {
        this.f92988h = true;
        if (this.f92986f) {
            return !this.f92987g;
        }
        if (!super.getTransformation(j17, transformation)) {
            this.f92986f = true;
            n3.m0.a(this.f92984d, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f92986f;
        android.view.ViewGroup viewGroup = this.f92984d;
        if (z17 || !this.f92988h) {
            viewGroup.endViewTransition(this.f92985e);
            this.f92987g = true;
        } else {
            this.f92988h = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j17, android.view.animation.Transformation transformation, float f17) {
        this.f92988h = true;
        if (this.f92986f) {
            return !this.f92987g;
        }
        if (!super.getTransformation(j17, transformation, f17)) {
            this.f92986f = true;
            n3.m0.a(this.f92984d, this);
        }
        return true;
    }
}
