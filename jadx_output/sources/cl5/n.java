package cl5;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public android.view.ViewManager f42996a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f42997b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.ViewGroup f42998c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f42999d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f43000e;

    /* renamed from: f, reason: collision with root package name */
    public int f43001f;

    /* renamed from: g, reason: collision with root package name */
    public int f43002g;

    /* renamed from: h, reason: collision with root package name */
    public float f43003h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.Animator f43004i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.GestureDetector f43005j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.GestureDetector.SimpleOnGestureListener f43006k = new cl5.e(this);

    public void a(boolean z17) {
        android.view.ViewGroup viewGroup;
        android.view.View view = this.f42997b;
        if (view != null) {
            if (z17) {
                android.view.View view2 = this.f42999d;
                if (view2 != null && (viewGroup = this.f42998c) != null) {
                    if (viewGroup != null) {
                        viewGroup.removeView(view2);
                    }
                    this.f42999d = null;
                }
                android.view.ViewManager viewManager = this.f42996a;
                if (viewManager != null) {
                    viewManager.removeView(view);
                }
                this.f42996a = null;
                return;
            }
            android.animation.Animator animator = this.f43004i;
            if (animator != null) {
                animator.cancel();
            }
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, -this.f43001f);
            ofInt.addUpdateListener(new cl5.g(this));
            ofInt.setDuration(200L);
            ofInt.start();
            ofInt.addListener(new cl5.b(view, this));
            ofInt.setDuration(200L);
            ofInt.start();
            this.f43004i = ofInt;
        }
    }

    public final int b(float f17) {
        return this.f43002g + ((int) (f17 - this.f43003h));
    }
}
