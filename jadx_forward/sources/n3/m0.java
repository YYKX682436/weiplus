package n3;

/* loaded from: classes3.dex */
public final class m0 implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f415900d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewTreeObserver f415901e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f415902f;

    public m0(android.view.View view, java.lang.Runnable runnable) {
        this.f415900d = view;
        this.f415901e = view.getViewTreeObserver();
        this.f415902f = runnable;
    }

    public static n3.m0 a(android.view.View view, java.lang.Runnable runnable) {
        if (view == null) {
            throw new java.lang.NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new java.lang.NullPointerException("runnable == null");
        }
        n3.m0 m0Var = new n3.m0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(m0Var);
        view.addOnAttachStateChangeListener(m0Var);
        return m0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean isAlive = this.f415901e.isAlive();
        android.view.View view = this.f415900d;
        if (isAlive) {
            this.f415901e.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f415902f.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f415901e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        boolean isAlive = this.f415901e.isAlive();
        android.view.View view2 = this.f415900d;
        if (isAlive) {
            this.f415901e.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
