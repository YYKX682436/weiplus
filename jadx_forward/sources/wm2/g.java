package wm2;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f528771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn2.p f528772e;

    public g(android.widget.FrameLayout frameLayout, bn2.p pVar) {
        this.f528771d = frameLayout;
        this.f528772e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f528771d.removeView(this.f528772e.a());
    }
}
