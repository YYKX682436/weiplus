package nl5;

/* loaded from: classes15.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.Magnifier f419850a;

    /* renamed from: b, reason: collision with root package name */
    public final android.animation.ValueAnimator f419851b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f419852c;

    /* renamed from: d, reason: collision with root package name */
    public float f419853d;

    /* renamed from: e, reason: collision with root package name */
    public float f419854e;

    /* renamed from: f, reason: collision with root package name */
    public float f419855f;

    /* renamed from: g, reason: collision with root package name */
    public float f419856g;

    /* renamed from: h, reason: collision with root package name */
    public float f419857h;

    /* renamed from: i, reason: collision with root package name */
    public float f419858i;

    public l(android.widget.Magnifier mMagnifier) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mMagnifier, "mMagnifier");
        this.f419850a = mMagnifier;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat, "ofFloat(...)");
        this.f419851b = ofFloat;
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addUpdateListener(new nl5.k(this));
    }

    public final void a(float f17, float f18) {
        boolean z17 = false;
        if (this.f419852c) {
            if (!(f18 == this.f419858i)) {
                z17 = true;
            }
        }
        android.animation.ValueAnimator valueAnimator = this.f419851b;
        if (z17) {
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
                this.f419853d = this.f419855f;
                this.f419854e = this.f419856g;
            } else {
                this.f419853d = this.f419857h;
                this.f419854e = this.f419858i;
            }
            valueAnimator.start();
        } else if (!valueAnimator.isRunning()) {
            this.f419850a.show(f17, f18);
        }
        this.f419857h = f17;
        this.f419858i = f18;
        this.f419852c = true;
    }
}
