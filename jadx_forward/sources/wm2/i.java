package wm2;

/* loaded from: classes14.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f528775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn2.p f528776e;

    public i(android.widget.FrameLayout frameLayout, bn2.p pVar) {
        this.f528775d = frameLayout;
        this.f528776e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f528775d.removeView(this.f528776e.a());
    }
}
