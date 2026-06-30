package wm2;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f528779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn2.p f528780e;

    public k(android.widget.FrameLayout frameLayout, bn2.p pVar) {
        this.f528779d = frameLayout;
        this.f528780e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f528779d.removeView(this.f528780e.a());
    }
}
