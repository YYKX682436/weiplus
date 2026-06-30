package p012xc85e97e9.p075x2eaf9f.p079xd1075a44;

/* loaded from: classes15.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.OverScroller f92637a;

    public s(android.content.Context context, android.view.animation.Interpolator interpolator) {
        this.f92637a = interpolator != null ? new android.widget.OverScroller(context, interpolator) : new android.widget.OverScroller(context);
    }

    public void a() {
        this.f92637a.abortAnimation();
    }

    public int b() {
        return this.f92637a.getCurrY();
    }

    public boolean c() {
        return this.f92637a.isFinished();
    }

    public void d(int i17, int i18, int i19, int i27, int i28) {
        this.f92637a.startScroll(i17, i18, i19, i27, i28);
    }
}
