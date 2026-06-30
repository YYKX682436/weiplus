package tk4;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.ViewManager f501496a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f501497b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.Animator f501498c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f501499d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f501500e;

    /* renamed from: f, reason: collision with root package name */
    public int f501501f;

    /* renamed from: g, reason: collision with root package name */
    public int f501502g;

    /* renamed from: h, reason: collision with root package name */
    public float f501503h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.GestureDetector.SimpleOnGestureListener f501504i = new tk4.s(this);

    public final void a(boolean z17) {
        android.view.View view = this.f501497b;
        if (view != null) {
            if (z17) {
                android.view.ViewManager viewManager = this.f501496a;
                if (viewManager != null) {
                    viewManager.removeView(view);
                }
                this.f501496a = null;
                return;
            }
            android.animation.Animator animator = this.f501498c;
            if (animator != null) {
                animator.cancel();
            }
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, -this.f501501f);
            ofInt.addUpdateListener(new tk4.o(this));
            ofInt.addListener(new tk4.p(view, this));
            ofInt.setDuration(400L);
            ofInt.start();
            this.f501498c = ofInt;
        }
    }
}
