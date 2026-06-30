package androidx.fragment.app;

/* loaded from: classes14.dex */
public class q0 extends android.view.animation.AnimationSet implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f11451d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f11452e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11453f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11454g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11455h;

    public q0(android.view.animation.Animation animation, android.view.ViewGroup viewGroup, android.view.View view) {
        super(false);
        this.f11455h = true;
        this.f11451d = viewGroup;
        this.f11452e = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j17, android.view.animation.Transformation transformation) {
        this.f11455h = true;
        if (this.f11453f) {
            return !this.f11454g;
        }
        if (!super.getTransformation(j17, transformation)) {
            this.f11453f = true;
            n3.m0.a(this.f11451d, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f11453f;
        android.view.ViewGroup viewGroup = this.f11451d;
        if (z17 || !this.f11455h) {
            viewGroup.endViewTransition(this.f11452e);
            this.f11454g = true;
        } else {
            this.f11455h = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j17, android.view.animation.Transformation transformation, float f17) {
        this.f11455h = true;
        if (this.f11453f) {
            return !this.f11454g;
        }
        if (!super.getTransformation(j17, transformation, f17)) {
            this.f11453f = true;
            n3.m0.a(this.f11451d, this);
        }
        return true;
    }
}
