package androidx.core.widget;

/* loaded from: classes15.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.OverScroller f11104a;

    public s(android.content.Context context, android.view.animation.Interpolator interpolator) {
        this.f11104a = interpolator != null ? new android.widget.OverScroller(context, interpolator) : new android.widget.OverScroller(context);
    }

    public void a() {
        this.f11104a.abortAnimation();
    }

    public int b() {
        return this.f11104a.getCurrY();
    }

    public boolean c() {
        return this.f11104a.isFinished();
    }

    public void d(int i17, int i18, int i19, int i27, int i28) {
        this.f11104a.startScroll(i17, i18, i19, i27, i28);
    }
}
