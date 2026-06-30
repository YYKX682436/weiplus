package cl5;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public android.view.ViewManager f124529a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f124530b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.ViewGroup f124531c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f124532d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f124533e;

    /* renamed from: f, reason: collision with root package name */
    public int f124534f;

    /* renamed from: g, reason: collision with root package name */
    public int f124535g;

    /* renamed from: h, reason: collision with root package name */
    public float f124536h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.Animator f124537i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.GestureDetector f124538j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.GestureDetector.SimpleOnGestureListener f124539k = new cl5.e(this);

    public void a(boolean z17) {
        android.view.ViewGroup viewGroup;
        android.view.View view = this.f124530b;
        if (view != null) {
            if (z17) {
                android.view.View view2 = this.f124532d;
                if (view2 != null && (viewGroup = this.f124531c) != null) {
                    if (viewGroup != null) {
                        viewGroup.removeView(view2);
                    }
                    this.f124532d = null;
                }
                android.view.ViewManager viewManager = this.f124529a;
                if (viewManager != null) {
                    viewManager.removeView(view);
                }
                this.f124529a = null;
                return;
            }
            android.animation.Animator animator = this.f124537i;
            if (animator != null) {
                animator.cancel();
            }
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, -this.f124534f);
            ofInt.addUpdateListener(new cl5.g(this));
            ofInt.setDuration(200L);
            ofInt.start();
            ofInt.addListener(new cl5.b(view, this));
            ofInt.setDuration(200L);
            ofInt.start();
            this.f124537i = ofInt;
        }
    }

    public final int b(float f17) {
        return this.f124535g + ((int) (f17 - this.f124536h));
    }
}
